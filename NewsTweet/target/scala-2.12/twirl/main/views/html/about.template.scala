
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("About Page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<h1>About</h1>
  <p> This is an example of a <b> Play Java Application</b>.</p>
  <p> <a href="/twitter/auth">Login with Twitter</a> </p>
  <p> <a href="/">Home</a> </p>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 31 23:13:33 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/HelloWorld/app/views/about.scala.html
                  HASH: 4c74fe688d9bf11964d93a69c6f8697aeeb97f67
                  MATRIX: 941->1|1037->3|1065->6|1091->24|1130->26|1159->29|1359->200
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|40->8
                  -- GENERATED --
              */
          