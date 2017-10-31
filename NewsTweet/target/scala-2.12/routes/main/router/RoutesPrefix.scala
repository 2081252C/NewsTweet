
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/NewsTweet/HelloWorld/conf/routes
// @DATE:Tue Oct 31 23:13:33 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
