package controllers;

/*
Copyright (c) 2007-2009, Yusuke Yamamoto
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of the Yusuke Yamamoto nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY Yusuke Yamamoto ``AS IS'' AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL Yusuke Yamamoto BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
import play.mvc.*;
import play.*; 
import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;
import twitter4j.auth.AccessToken;
import models.TwitterUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class TwitterSignInServlet extends Controller {
    private static final long serialVersionUID = -6205814293093350242L;
    private Twitter twitter = new TwitterFactory().getInstance();
    public boolean set = false;
    public RequestToken requestToken = null;
    public AccessToken accessToken = null;
    String url = "";

    public void setOAuth(boolean b){
        this.set = b;
    }

    public Result signIn(String uri) throws IOException {
        url = "http://"+request().host()+uri;
        StringBuffer callbackURL = new StringBuffer(url);
        if(!set){
            twitter.setOAuthConsumer("AfZgXUsXP3v9F3DYIMVx2q7KH", "NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");
            setOAuth(true);
        }
        try {
            if(requestToken == null){
                int index = callbackURL.lastIndexOf("/");
                callbackURL.replace(index, callbackURL.length(), "").append("/callback");
                requestToken = twitter.getOAuthRequestToken(callbackURL.toString());
            }
            return redirect(requestToken.getAuthenticationURL());
        } catch (TwitterException e) {
            return ok("bad auth");            
        }
    }

    public Result callBack() throws  IOException {
        try {
            String verifier = request().getQueryString("oauth_verifier");
            accessToken = twitter.getOAuthAccessToken(requestToken, verifier);
            User user = twitter.showUser(twitter.getScreenName());
            long userId = user.getId(); // user Id
            TwitterUser t = TwitterUser.find.byId(userId);
            session("id", Long.toString(userId));
            session("access", accessToken.toString());
            if (t==null) {
                String userName = user.getScreenName(); // user name
                String image = user.getProfileImageURL();
                String acessTokenString = accessToken.toString();
                TwitterUser tUser = new TwitterUser(userId, userName, image, accessToken.getToken(), accessToken.getTokenSecret());
                tUser.save();
                requestToken = null;
            }
            else{
                t.setImg(user.getProfileImageURL());
                t.setUsername(user.getScreenName());
                t.update();
            }
        } catch (TwitterException e) {
            return ok("bad callback");
        }
        return redirect(url);
   }

   public Result logOut(){
        session().clear();
        if(!set){
            twitter.setOAuthConsumer("AfZgXUsXP3v9F3DYIMVx2q7KH", "NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");
            setOAuth(true);
        }
        twitter.setOAuthAccessToken(null);
        this.requestToken=null;
        return redirect(controllers.routes.HomeController.index());
    }
}