package controllers;

import play.libs.oauth.OAuth;
import play.libs.oauth.OAuth.ConsumerKey;
import play.libs.oauth.OAuth.OAuthCalculator;
import play.libs.oauth.OAuth.RequestToken;
import play.libs.oauth.OAuth.ServiceInfo;
import play.libs.ws.WSClient;
import play.mvc.Controller;
import play.mvc.Result;

import com.google.common.base.Strings;

import javax.inject.Inject;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class Twitter extends Controller {
    static final ConsumerKey KEY = new ConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH","NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");

    private static final ServiceInfo SERVICE_INFO =
        new ServiceInfo("https://api.twitter.com/oauth/request_token",
            "https://api.twitter.com/oauth/access_token",
            "https://api.twitter.com/oauth/authorize",
            KEY);

    private static final OAuth TWITTER = new OAuth(SERVICE_INFO);

    private final WSClient ws;

    @Inject
    public Twitter(WSClient ws) {
        this.ws = ws;
    }

    public CompletionStage<Result> homeTimeline() {
        Optional<RequestToken> sessionTokenPair = getSessionTokenPair();
        if (sessionTokenPair.isPresent()) {
            return ws.url("https://api.twitter.com/1.1/statuses/home_timeline.json")
                    .sign(new OAuthCalculator(Twitter.KEY, sessionTokenPair.get()))
                    .get()
                    .thenApply(result -> ok(result.asJson()));
        }
        return CompletableFuture.completedFuture(redirect(routes.Twitter.auth()));
    }

    public Result auth() {
        String verifier = request().getQueryString("oauth_verifier");
        if (Strings.isNullOrEmpty(verifier)) {
            String url = routes.Twitter.auth().absoluteURL(request());
            RequestToken requestToken = TWITTER.retrieveRequestToken(url);
            saveSessionTokenPair(requestToken);
            return redirect(TWITTER.redirectUrl(requestToken.token));
        } else {
            RequestToken requestToken = getSessionTokenPair().get();
            RequestToken accessToken = TWITTER.retrieveAccessToken(requestToken, verifier);
            saveSessionTokenPair(accessToken);
            return redirect(routes.Twitter.homeTimeline());
        }
    }

    private void saveSessionTokenPair(RequestToken requestToken) {
        session("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n", requestToken.token);
        session("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c", requestToken.secret);
    }

    private Optional<RequestToken> getSessionTokenPair() {
        if (session().containsKey("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")) {
            return Optional.ofNullable(new RequestToken(session("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n"), session("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c")));
        }
        return Optional.empty();
    }

}
