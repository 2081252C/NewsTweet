
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Fri Mar 02 16:00:22 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTwitterSignInServlet TwitterSignInServlet = new controllers.ReverseTwitterSignInServlet(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSearchController SearchController = new controllers.ReverseSearchController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseInterestController InterestController = new controllers.ReverseInterestController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTwitterSignInServlet TwitterSignInServlet = new controllers.javascript.ReverseTwitterSignInServlet(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSearchController SearchController = new controllers.javascript.ReverseSearchController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseInterestController InterestController = new controllers.javascript.ReverseInterestController(RoutesPrefix.byNamePrefix());
  }

}
