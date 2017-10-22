
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carly/Documents/Project/HelloWorld/conf/routes
// @DATE:Sun Oct 22 15:50:41 BST 2017


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
