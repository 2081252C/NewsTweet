
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

object dataAnalytics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Search],String,Integer,Form[Persona],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.98*/("""

"""),_display_(/*3.2*/main("Data Analytics")/*3.24*/(searchForm)/*3.36*/(user)/*3.42*/(bool)/*3.48*/(personaForm)/*3.61*/(img: String)/*3.74*/{_display_(Seq[Any](format.raw/*3.75*/("""
  """),format.raw/*4.3*/("""<div id="Search Analytics">
  	<h3>Data Analytics:</h3>
  	<p>
  	</p>
  </div>
  
""")))}),format.raw/*10.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img)

  def f:((Form[Search],String,Integer,Form[Persona],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img) => apply(searchForm,user,bool,personaForm,img)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 30 00:10:16 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: 71f36be940ed05b79cc154a282c45b744e99cfdd
                  MATRIX: 998->1|1189->97|1217->100|1247->122|1267->134|1281->140|1295->146|1316->159|1337->172|1375->173|1404->176|1518->260
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|36->4|42->10
                  -- GENERATED --
              */
          