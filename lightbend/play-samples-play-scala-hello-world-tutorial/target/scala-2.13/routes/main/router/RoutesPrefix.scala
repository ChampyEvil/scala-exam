// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/champyevil/train/scala-exam/lightbend/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Tue Jul 30 17:21:22 ICT 2019


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
