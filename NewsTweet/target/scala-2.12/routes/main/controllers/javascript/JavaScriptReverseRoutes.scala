
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Fri Mar 02 16:00:22 GMT 2018

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

  // @LINE:11
  class ReverseTwitterSignInServlet(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def callBack: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterSignInServlet.callBack",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback"})
        }
      """
    )
  
    // @LINE:11
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterSignInServlet.signIn",
      """
        function(uri0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter/signin" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("uri", uri0)])})
        }
      """
    )
  
    // @LINE:25
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TwitterSignInServlet.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def newsCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newsCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
        }
      """
    )
  
    // @LINE:30
    def techCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.techCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tech"})
        }
      """
    )
  
    // @LINE:28
    def entertainmentCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.entertainmentCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entertainment"})
        }
      """
    )
  
    // @LINE:29
    def musicCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.musicCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "music"})
        }
      """
    )
  
    // @LINE:31
    def sportCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sportCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sport"})
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

  // @LINE:14
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def searchResults: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.searchResults",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:16
    def showSentiment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.showSentiment",
      """
        function(sentiment0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/analytics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("sentiment", sentiment0))})
        }
      """
    )
  
    // @LINE:18
    def trackSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.trackSearch",
      """
        function(uri0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "track" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("uri", uri0)])})
        }
      """
    )
  
    // @LINE:20
    def sendMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.sendMessage",
      """
        function(uri0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "send" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("uri", uri0)])})
        }
      """
    )
  
    // @LINE:15
    def searchAnalytics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.searchAnalytics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/analytics"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseInterestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def showInterest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.InterestController.showInterest",
      """
        function(p0,topic1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "interest/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("p", p0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("topic", topic1))})
        }
      """
    )
  
  }


}
