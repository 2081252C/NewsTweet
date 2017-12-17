
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Thu Dec 14 13:25:44 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

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
  
    // @LINE:24
    def logOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
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

  
    // @LINE:26
    def newsCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/news")
    }
  
    // @LINE:29
    def techCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/tech")
    }
  
    // @LINE:27
    def entertainmentCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/entertainment")
    }
  
    // @LINE:28
    def musicCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/music")
    }
  
    // @LINE:30
    def sportCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/sport")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def searchResults(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
  }

  // @LINE:19
  class ReversePersonaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addPersona(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpersona")
    }
  
  }

  // @LINE:17
  class ReverseTrackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def trackSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "track")
    }
  
  }

  // @LINE:20
  class ReverseInterestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def showInterest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "interest")
    }
  
    // @LINE:20
    def addInterest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addinterest")
    }
  
  }


}
