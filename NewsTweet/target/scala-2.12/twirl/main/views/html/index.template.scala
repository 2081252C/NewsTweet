
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Search],String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("NewsTweet")/*3.19*/(searchForm)/*3.31*/(user)/*3.37*/(bool)/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""
  """),format.raw/*4.3*/("""<div id="categories">
  	<h3>Categories:</h3>
  	<p>
  	</p>
  </div>
  
""")))}),format.raw/*10.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool)

  def f:((Form[Search],String,Integer) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool) => apply(searchForm,user,bool)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 15:36:28 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: 14534c275595ef4af40b7dc274a1d413c72c7650
                  MATRIX: 969->1|1119->56|1147->59|1172->76|1192->88|1206->94|1220->100|1259->102|1288->105|1392->179
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|36->4|42->10
                  -- GENERATED --
              */
          