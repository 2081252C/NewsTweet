
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Fri Mar 02 16:00:22 GMT 2018

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

  // @LINE:11
  class ReverseTwitterSignInServlet(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def callBack(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "callback")
    }
  
    // @LINE:11
    def signIn(uri:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "twitter/signin" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("uri", uri)))))
    }
  
    // @LINE:25
    def logOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def newsCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:30
    def techCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tech")
    }
  
    // @LINE:28
    def entertainmentCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entertainment")
    }
  
    // @LINE:29
    def musicCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "music")
    }
  
    // @LINE:31
    def sportCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sport")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def searchResults(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:16
    def showSentiment(sentiment:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/analytics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sentiment", sentiment)))
    }
  
    // @LINE:18
    def trackSearch(uri:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "track" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("uri", uri)))))
    }
  
    // @LINE:20
    def sendMessage(uri:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "send" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("uri", uri)))))
    }
  
    // @LINE:15
    def searchAnalytics(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/analytics")
    }
  
  }

  // @LINE:22
  class ReverseInterestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def showInterest(p:String, topic:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "interest/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("p", p)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("topic", topic)))
    }
  
  }


}
