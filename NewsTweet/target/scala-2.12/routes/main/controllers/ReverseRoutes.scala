
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Tue Jan 09 08:15:17 GMT 2018

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
  
    // @LINE:27
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

  
    // @LINE:29
    def newsCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/news")
    }
  
    // @LINE:32
    def techCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/tech")
    }
  
    // @LINE:30
    def entertainmentCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/entertainment")
    }
  
    // @LINE:31
    def musicCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/music")
    }
  
    // @LINE:33
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
  
    // @LINE:18
    def showSentiment(sentiment:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/analytics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sentiment", sentiment)))
    }
  
    // @LINE:17
    def searchAnalytics(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/analytics")
    }
  
  }

  // @LINE:22
  class ReversePersonaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def addPersona(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpersona")
    }
  
  }

  // @LINE:20
  class ReverseTrackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def trackSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "track")
    }
  
  }

  // @LINE:23
  class ReverseInterestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def addInterest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addinterest")
    }
  
    // @LINE:24
    def showInterest(topic:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "interest/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("topic", topic)))
    }
  
  }


}
