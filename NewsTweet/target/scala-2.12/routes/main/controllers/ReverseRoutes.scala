
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Tue Nov 21 23:24:32 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseTwitterSignInServlet(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def signIn(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "twitter/signin")
    }
  
    // @LINE:14
    def callBack(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "callback")
    }
  
  }

  // @LINE:11
  class ReverseTwitterAuth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def auth(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "twitter/auth")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
