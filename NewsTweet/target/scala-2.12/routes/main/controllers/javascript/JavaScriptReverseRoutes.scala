
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Fri Jan 26 14:57:53 GMT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseTwitterSignInServlet(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterSignInServlet.signIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter/signin"})
        }
      """
    )
  
    // @LINE:14
    def callBack: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterSignInServlet.callBack",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback"})
        }
      """
    )
  
    // @LINE:29
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterSignInServlet.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseTwitterAuth(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def auth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterAuth.auth",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter/auth"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def newsCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newsCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/news"})
        }
      """
    )
  
    // @LINE:34
    def techCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.techCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/tech"})
        }
      """
    )
  
    // @LINE:32
    def entertainmentCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.entertainmentCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/entertainment"})
        }
      """
    )
  
    // @LINE:33
    def musicCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.musicCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/music"})
        }
      """
    )
  
    // @LINE:35
    def sportCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sportCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/sport"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def sendMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.sendMessage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "send"})
        }
      """
    )
  
    // @LINE:16
    def searchResults: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.searchResults",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:18
    def showSentiment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.showSentiment",
      """
        function(sentiment0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/analytics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("sentiment", sentiment0))})
        }
      """
    )
  
    // @LINE:20
    def trackSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.trackSearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "track"})
        }
      """
    )
  
    // @LINE:17
    def searchAnalytics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.searchAnalytics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/analytics"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReversePersonaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def addPersona: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonaController.addPersona",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpersona"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseInterestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def addInterest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.InterestController.addInterest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addinterest"})
        }
      """
    )
  
    // @LINE:26
    def showInterest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.InterestController.showInterest",
      """
        function(topic0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "interest/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("topic", topic0))})
        }
      """
    )
  
  }


}
