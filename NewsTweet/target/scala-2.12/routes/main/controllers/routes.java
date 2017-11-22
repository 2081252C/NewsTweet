
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Tue Nov 21 23:24:32 GMT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTwitterSignInServlet TwitterSignInServlet = new controllers.ReverseTwitterSignInServlet(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTwitterAuth TwitterAuth = new controllers.ReverseTwitterAuth(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTwitterSignInServlet TwitterSignInServlet = new controllers.javascript.ReverseTwitterSignInServlet(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTwitterAuth TwitterAuth = new controllers.javascript.ReverseTwitterAuth(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
