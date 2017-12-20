
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Wed Dec 20 10:02:39 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:9
  Assets_6: controllers.Assets,
  // @LINE:11
  TwitterAuth_2: controllers.TwitterAuth,
  // @LINE:13
  TwitterSignInServlet_5: controllers.TwitterSignInServlet,
  // @LINE:16
  SearchController_1: controllers.SearchController,
  // @LINE:17
  TrackController_0: controllers.TrackController,
  // @LINE:19
  PersonaController_7: controllers.PersonaController,
  // @LINE:20
  InterestController_4: controllers.InterestController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:9
    Assets_6: controllers.Assets,
    // @LINE:11
    TwitterAuth_2: controllers.TwitterAuth,
    // @LINE:13
    TwitterSignInServlet_5: controllers.TwitterSignInServlet,
    // @LINE:16
    SearchController_1: controllers.SearchController,
    // @LINE:17
    TrackController_0: controllers.TrackController,
    // @LINE:19
    PersonaController_7: controllers.PersonaController,
    // @LINE:20
    InterestController_4: controllers.InterestController
  ) = this(errorHandler, HomeController_3, Assets_6, TwitterAuth_2, TwitterSignInServlet_5, SearchController_1, TrackController_0, PersonaController_7, InterestController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, Assets_6, TwitterAuth_2, TwitterSignInServlet_5, SearchController_1, TrackController_0, PersonaController_7, InterestController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter/auth""", """controllers.TwitterAuth.auth()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter/signin""", """controllers.TwitterSignInServlet.signIn()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """callback""", """controllers.TwitterSignInServlet.callBack()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.searchResults()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """track""", """controllers.TrackController.trackSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpersona""", """controllers.PersonaController.addPersona()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addinterest""", """controllers.InterestController.addInterest()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interest/""" + "$" + """topic<[^/]+>""", """controllers.InterestController.showInterest(topic:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.TwitterSignInServlet.logOut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/news""", """controllers.HomeController.newsCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/entertainment""", """controllers.HomeController.entertainmentCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/music""", """controllers.HomeController.musicCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/tech""", """controllers.HomeController.techCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/sport""", """controllers.HomeController.sportCategory()"""),
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
    HomeController_3.index(),
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
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_TwitterAuth_auth2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("twitter/auth")))
  )
  private[this] lazy val controllers_TwitterAuth_auth2_invoker = createInvoker(
    TwitterAuth_2.auth(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TwitterAuth",
      "auth",
      Nil,
      "GET",
      this.prefix + """twitter/auth""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TwitterSignInServlet_signIn3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("twitter/signin")))
  )
  private[this] lazy val controllers_TwitterSignInServlet_signIn3_invoker = createInvoker(
    TwitterSignInServlet_5.signIn(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TwitterSignInServlet",
      "signIn",
      Nil,
      "GET",
      this.prefix + """twitter/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TwitterSignInServlet_callBack4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("callback")))
  )
  private[this] lazy val controllers_TwitterSignInServlet_callBack4_invoker = createInvoker(
    TwitterSignInServlet_5.callBack(),
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

  // @LINE:16
  private[this] lazy val controllers_SearchController_searchResults5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_searchResults5_invoker = createInvoker(
    SearchController_1.searchResults(),
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

  // @LINE:17
  private[this] lazy val controllers_TrackController_trackSearch6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("track")))
  )
  private[this] lazy val controllers_TrackController_trackSearch6_invoker = createInvoker(
    TrackController_0.trackSearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrackController",
      "trackSearch",
      Nil,
      "GET",
      this.prefix + """track""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PersonaController_addPersona7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpersona")))
  )
  private[this] lazy val controllers_PersonaController_addPersona7_invoker = createInvoker(
    PersonaController_7.addPersona(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonaController",
      "addPersona",
      Nil,
      "GET",
      this.prefix + """addpersona""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_InterestController_addInterest8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addinterest")))
  )
  private[this] lazy val controllers_InterestController_addInterest8_invoker = createInvoker(
    InterestController_4.addInterest(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InterestController",
      "addInterest",
      Nil,
      "GET",
      this.prefix + """addinterest""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_InterestController_showInterest9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interest/"), DynamicPart("topic", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InterestController_showInterest9_invoker = createInvoker(
    InterestController_4.showInterest(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InterestController",
      "showInterest",
      Seq(classOf[String]),
      "GET",
      this.prefix + """interest/""" + "$" + """topic<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_TwitterSignInServlet_logOut10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_TwitterSignInServlet_logOut10_invoker = createInvoker(
    TwitterSignInServlet_5.logOut(),
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

  // @LINE:26
  private[this] lazy val controllers_HomeController_newsCategory11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/news")))
  )
  private[this] lazy val controllers_HomeController_newsCategory11_invoker = createInvoker(
    HomeController_3.newsCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsCategory",
      Nil,
      "GET",
      this.prefix + """category/news""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_entertainmentCategory12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/entertainment")))
  )
  private[this] lazy val controllers_HomeController_entertainmentCategory12_invoker = createInvoker(
    HomeController_3.entertainmentCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "entertainmentCategory",
      Nil,
      "GET",
      this.prefix + """category/entertainment""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_musicCategory13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/music")))
  )
  private[this] lazy val controllers_HomeController_musicCategory13_invoker = createInvoker(
    HomeController_3.musicCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "musicCategory",
      Nil,
      "GET",
      this.prefix + """category/music""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_techCategory14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/tech")))
  )
  private[this] lazy val controllers_HomeController_techCategory14_invoker = createInvoker(
    HomeController_3.techCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "techCategory",
      Nil,
      "GET",
      this.prefix + """category/tech""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_sportCategory15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/sport")))
  )
  private[this] lazy val controllers_HomeController_sportCategory15_invoker = createInvoker(
    HomeController_3.sportCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sportCategory",
      Nil,
      "GET",
      this.prefix + """category/sport""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_TwitterAuth_auth2_route(params@_) =>
      call { 
        controllers_TwitterAuth_auth2_invoker.call(TwitterAuth_2.auth())
      }
  
    // @LINE:13
    case controllers_TwitterSignInServlet_signIn3_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_signIn3_invoker.call(TwitterSignInServlet_5.signIn())
      }
  
    // @LINE:14
    case controllers_TwitterSignInServlet_callBack4_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_callBack4_invoker.call(TwitterSignInServlet_5.callBack())
      }
  
    // @LINE:16
    case controllers_SearchController_searchResults5_route(params@_) =>
      call { 
        controllers_SearchController_searchResults5_invoker.call(SearchController_1.searchResults())
      }
  
    // @LINE:17
    case controllers_TrackController_trackSearch6_route(params@_) =>
      call { 
        controllers_TrackController_trackSearch6_invoker.call(TrackController_0.trackSearch())
      }
  
    // @LINE:19
    case controllers_PersonaController_addPersona7_route(params@_) =>
      call { 
        controllers_PersonaController_addPersona7_invoker.call(PersonaController_7.addPersona())
      }
  
    // @LINE:20
    case controllers_InterestController_addInterest8_route(params@_) =>
      call { 
        controllers_InterestController_addInterest8_invoker.call(InterestController_4.addInterest())
      }
  
    // @LINE:21
    case controllers_InterestController_showInterest9_route(params@_) =>
      call(params.fromPath[String]("topic", None)) { (topic) =>
        controllers_InterestController_showInterest9_invoker.call(InterestController_4.showInterest(topic))
      }
  
    // @LINE:24
    case controllers_TwitterSignInServlet_logOut10_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_logOut10_invoker.call(TwitterSignInServlet_5.logOut())
      }
  
    // @LINE:26
    case controllers_HomeController_newsCategory11_route(params@_) =>
      call { 
        controllers_HomeController_newsCategory11_invoker.call(HomeController_3.newsCategory())
      }
  
    // @LINE:27
    case controllers_HomeController_entertainmentCategory12_route(params@_) =>
      call { 
        controllers_HomeController_entertainmentCategory12_invoker.call(HomeController_3.entertainmentCategory())
      }
  
    // @LINE:28
    case controllers_HomeController_musicCategory13_route(params@_) =>
      call { 
        controllers_HomeController_musicCategory13_invoker.call(HomeController_3.musicCategory())
      }
  
    // @LINE:29
    case controllers_HomeController_techCategory14_route(params@_) =>
      call { 
        controllers_HomeController_techCategory14_invoker.call(HomeController_3.techCategory())
      }
  
    // @LINE:30
    case controllers_HomeController_sportCategory15_route(params@_) =>
      call { 
        controllers_HomeController_sportCategory15_invoker.call(HomeController_3.sportCategory())
      }
  }
}
