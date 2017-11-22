package controllers;

import play.libs.oauth.OAuth;
import play.libs.oauth.OAuth.ConsumerKey;
import play.libs.oauth.OAuth.OAuthCalculator;
import play.libs.oauth.OAuth.RequestToken;
import play.libs.oauth.OAuth.ServiceInfo;
import play.libs.ws.WSClient;

import play.mvc.*;
import play.*; 
import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import models.TwitterUser;

import com.google.common.base.Strings;

import javax.inject.Inject;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class TwitterAuth extends Controller {
    static final ConsumerKey KEY = new ConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH", "NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");

    private static final ServiceInfo SERVICE_INFO =
        new ServiceInfo("https://api.twitter.com/oauth/request_token",
            "https://api.twitter.com/oauth/access_token",
            "https://api.twitter.com/oauth/authorize",
            KEY);

    private static final OAuth TWITTER = new OAuth(SERVICE_INFO);

    private final WSClient ws;

    @Inject
    public TwitterAuth(WSClient ws) {
        this.ws = ws;
    }

    public CompletionStage<Result> homeTimeline() {
        Optional<RequestToken> sessionTokenPair = getSessionTokenPair();
        if (sessionTokenPair.isPresent()) {
            return ws.url("localhost:9000")
                    .sign(new OAuthCalculator(TwitterAuth.KEY, sessionTokenPair.get()))
                    .get()
                    .thenApply(result -> ok(result.asJson()));
        }
        return CompletableFuture.completedFuture(redirect(routes.TwitterAuth.auth()));
    }

    public Result auth() {
        String verifier = request().getQueryString("oauth_verifier");
        if (Strings.isNullOrEmpty(verifier)) {
            System.out.println("Hello ");
            String url = routes.TwitterAuth.auth().absoluteURL(request());
            RequestToken requestToken = TWITTER.retrieveRequestToken(url);
            saveSessionTokenPair(requestToken);
            return redirect(TWITTER.redirectUrl(requestToken.token));
        } else {
            RequestToken requestToken = getSessionTokenPair().get();
            RequestToken accessToken = TWITTER.retrieveAccessToken(requestToken, verifier);
            saveSessionTokenPair(accessToken);

            /*try{Twitter twitter = new TwitterFactory().getInstance();
                twitter.setOAuthConsumer("AfZgXUsXP3v9F3DYIMVx2q7KH", "NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");
                User user = twitter.showUser(twitter.getScreenName());
                long userId = user.getId();// user Id
                String userName = user.getName(); // user name
                String acessTokenString = accessToken.toString();
                TwitterUser test = new TwitterUser(2L, "carly", "access");
                test.save();
                TwitterUser tUser = new TwitterUser(userId, userName, accessToken.toString());
                tUser.save();}
            catch (TwitterException e){

            }*/

            return redirect("/");
        }
    }

    private void saveSessionTokenPair(RequestToken requestToken) {
        session("token", requestToken.token);
        session("secret", requestToken.secret);
    }

    private Optional<RequestToken> getSessionTokenPair() {
        if (session().containsKey("token")) {
            return Optional.ofNullable(new RequestToken(session("token"), session("secret")));
        }
        return Optional.empty();
    }

}