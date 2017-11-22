
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/NewsTweet/conf/routes
// @DATE:Tue Nov 21 23:24:32 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:9
  Assets_3: controllers.Assets,
  // @LINE:11
  TwitterAuth_1: controllers.TwitterAuth,
  // @LINE:13
  TwitterSignInServlet_0: controllers.TwitterSignInServlet,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:9
    Assets_3: controllers.Assets,
    // @LINE:11
    TwitterAuth_1: controllers.TwitterAuth,
    // @LINE:13
    TwitterSignInServlet_0: controllers.TwitterSignInServlet
  ) = this(errorHandler, HomeController_2, Assets_3, TwitterAuth_1, TwitterSignInServlet_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_3, TwitterAuth_1, TwitterSignInServlet_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter/auth""", """controllers.TwitterAuth.auth()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter/signin""", """controllers.TwitterSignInServlet.signIn()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """callback""", """controllers.TwitterSignInServlet.callBack()"""),
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
    HomeController_2.index,
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
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
    TwitterAuth_1.auth(),
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
    TwitterSignInServlet_0.signIn(),
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
    TwitterSignInServlet_0.callBack(),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_TwitterAuth_auth2_route(params@_) =>
      call { 
        controllers_TwitterAuth_auth2_invoker.call(TwitterAuth_1.auth())
      }
  
    // @LINE:13
    case controllers_TwitterSignInServlet_signIn3_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_signIn3_invoker.call(TwitterSignInServlet_0.signIn())
      }
  
    // @LINE:14
    case controllers_TwitterSignInServlet_callBack4_route(params@_) =>
      call { 
        controllers_TwitterSignInServlet_callBack4_invoker.call(TwitterSignInServlet_0.callBack())
      }
  }
}
