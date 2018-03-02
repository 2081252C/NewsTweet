
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Fri Mar 02 16:00:22 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  Assets_4: controllers.Assets,
  // @LINE:11
  TwitterSignInServlet_3: controllers.TwitterSignInServlet,
  // @LINE:14
  SearchController_0: controllers.SearchController,
  // @LINE:22
  InterestController_2: controllers.InterestController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    Assets_4: controllers.Assets,
    // @LINE:11
    TwitterSignInServlet_3: controllers.TwitterSignInServlet,
    // @LINE:14
    SearchController_0: controllers.SearchController,
    // @LINE:22
    InterestController_2: controllers.InterestController
  ) = this(errorHandler, HomeController_1, Assets_4, TwitterSignInServlet_3, SearchController_0, InterestController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_4, TwitterSignInServlet_3, SearchController_0, InterestController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter/signin""", """controllers.TwitterSignInServlet.signIn(uri:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """callback""", """controllers.TwitterSignInServlet.callBack()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.searchResults()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/analytics""", """controllers.SearchController.searchAnalytics()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/analytics/""" + "$" + """sentiment<[^/]+>""", """controllers.SearchController.showSentiment(sentiment:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """track""", """controllers.SearchController.trackSearch(uri:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """send""", """controllers.SearchController.sendMessage(uri:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interest/""" + "$" + """p<[^/]+>/""" + "$" + """topic<[^/]+>""", """controllers.InterestController.showInterest(p:String, topic:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.TwitterSignInServlet.logOut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """news""", """controllers.HomeController.newsCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entertainment""", """controllers.HomeController.entertainmentCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """music""", """controllers.HomeController.musicCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tech""", """controllers.HomeController.techCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sport""", """controllers.HomeController.sportCategory()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TwitterSignInServlet_signIn2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("twitter/signin")))
  )
  private[this] lazy val controllers_TwitterSignInServlet_signIn2_invoker = createInvoker(
    TwitterSignInServlet_3.signIn(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TwitterSignInServlet",
      "signIn",
      Seq(classOf[String]),
      "GET",
      this.prefix + """twitter/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_TwitterSignInServlet_callBack3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("callback")))
  )
  private[this] lazy val controllers_TwitterSignInServlet_callBack3_invoker = createInvoker(
    TwitterSignInServlet_3.callBack(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TwitterSignInServlet",
      "callBack",
      Nil,
      "GET",
      this.prefix + """callback""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SearchController_searchResults4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_searchResults4_invoker = createInvoker(
    SearchController_0.searchResults(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "searchResults",
      Nil,
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SearchController_searchAnalytics5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/analytics")))
  )
  private[this] lazy val controllers_SearchController_searchAnalytics5_invoker = createInvoker(
    SearchController_0.searchAnalytics(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "searchAnalytics",
      Nil,
      "GET",
      this.prefix + """search/analytics""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SearchController_showSentiment6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/analytics/"), DynamicPart("sentiment", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SearchController_showSentiment6_invoker = createInvoker(
    SearchController_0.showSentiment(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "showSentiment",
      Seq(classOf[String]),
      "GET",
      this.prefix + """search/analytics/""" + "$" + """sentiment<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SearchController_trackSearch7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("track")))
  )
  private[this] lazy val controllers_SearchController_trackSearch7_invoker = createInvoker(
    SearchController_0.trackSearch(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "trackSearch",
      Seq(classOf[String]),
      "POST",
      this.prefix + """track""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_SearchController_sendMessage8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("send")))
  )
  private[this] lazy val controllers_SearchController_sendMessage8_invoker = createInvoker(
    SearchController_0.sendMessage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "sendMessage",
      Seq(classOf[String]),
      "POST",
      this.prefix + """send""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_InterestController_showInterest9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interest/"), DynamicPart("p", """[^/]+""",true), StaticPart("/"), DynamicPart("topic", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InterestController_showInterest9_invoker = createInvoker(
    InterestController_2.showInterest(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InterestController",
      "showInterest",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """interest/""" + "$" + """p<[^/]+>/""" + "$" + """topic<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_TwitterSignInServlet_logOut10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_TwitterSignInServlet_logOut10_invoker = createInvoker(
    TwitterSignInServlet_3.logOut(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TwitterSignInServlet",
      "logOut",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_newsCategory11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("news")))
  )
  private[this] lazy val controllers_HomeController_newsCategory11_invoker = createInvoker(
    HomeController_1.newsCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsCategory",
      Nil,
      "GET",
      this.prefix + """news""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_entertainmentCategory12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entertainment")))
  )
  private[this] lazy val controllers_HomeController_entertainmentCategory12_invoker = createInvoker(
    HomeController_1.entertainmentCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "entertainmentCategory",
      Nil,
      "GET",
      this.prefix + """entertainment""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_musicCategory13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("music")))
  )
  private[this] lazy val controllers_HomeController_musicCategory13_invoker = createInvoker(
    HomeController_1.musicCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "musicCategory",
      Nil,
      "GET",
      this.prefix + """music""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_techCategory14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tech")))
  )
  private[this] lazy val controllers_HomeController_techCategory14_invoker = createInvoker(
    HomeController_1.techCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "techCategory",
      Nil,
      "GET",
      this.prefix + """tech""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_sportCategory15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sport")))
  )
  private[this] lazy val controllers_HomeController_sportCategory15_invoker = createInvoker(
    HomeController_1.sportCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sportCategory",
      Nil,
      "GET",
      this.prefix + """sport""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_TwitterSignInServlet_signIn2_route(params@_) =>
      call(params.fromQuery[String]("uri", None)) { (uri) =>
        controllers_TwitterSignInServlet_signIn2_invoker.call(TwitterSignInServlet_3.signIn(uri))
      }
  
    // @LINE:12
    case controllers_TwitterSignInServlet_callBack3_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_callBack3_invoker.call(TwitterSignInServlet_3.callBack())
      }
  
    // @LINE:14
    case controllers_SearchController_searchResults4_route(params@_) =>
      call { 
        controllers_SearchController_searchResults4_invoker.call(SearchController_0.searchResults())
      }
  
    // @LINE:15
    case controllers_SearchController_searchAnalytics5_route(params@_) =>
      call { 
        controllers_SearchController_searchAnalytics5_invoker.call(SearchController_0.searchAnalytics())
      }
  
    // @LINE:16
    case controllers_SearchController_showSentiment6_route(params@_) =>
      call(params.fromPath[String]("sentiment", None)) { (sentiment) =>
        controllers_SearchController_showSentiment6_invoker.call(SearchController_0.showSentiment(sentiment))
      }
  
    // @LINE:18
    case controllers_SearchController_trackSearch7_route(params@_) =>
      call(params.fromQuery[String]("uri", None)) { (uri) =>
        controllers_SearchController_trackSearch7_invoker.call(SearchController_0.trackSearch(uri))
      }
  
    // @LINE:20
    case controllers_SearchController_sendMessage8_route(params@_) =>
      call(params.fromQuery[String]("uri", None)) { (uri) =>
        controllers_SearchController_sendMessage8_invoker.call(SearchController_0.sendMessage(uri))
      }
  
    // @LINE:22
    case controllers_InterestController_showInterest9_route(params@_) =>
      call(params.fromPath[String]("p", None), params.fromPath[String]("topic", None)) { (p, topic) =>
        controllers_InterestController_showInterest9_invoker.call(InterestController_2.showInterest(p, topic))
      }
  
    // @LINE:25
    case controllers_TwitterSignInServlet_logOut10_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_logOut10_invoker.call(TwitterSignInServlet_3.logOut())
      }
  
    // @LINE:27
    case controllers_HomeController_newsCategory11_route(params@_) =>
      call { 
        controllers_HomeController_newsCategory11_invoker.call(HomeController_1.newsCategory())
      }
  
    // @LINE:28
    case controllers_HomeController_entertainmentCategory12_route(params@_) =>
      call { 
        controllers_HomeController_entertainmentCategory12_invoker.call(HomeController_1.entertainmentCategory())
      }
  
    // @LINE:29
    case controllers_HomeController_musicCategory13_route(params@_) =>
      call { 
        controllers_HomeController_musicCategory13_invoker.call(HomeController_1.musicCategory())
      }
  
    // @LINE:30
    case controllers_HomeController_techCategory14_route(params@_) =>
      call { 
        controllers_HomeController_techCategory14_invoker.call(HomeController_1.techCategory())
      }
  
    // @LINE:31
    case controllers_HomeController_sportCategory15_route(params@_) =>
      call { 
        controllers_HomeController_sportCategory15_invoker.call(HomeController_1.sportCategory())
      }
  }
}
