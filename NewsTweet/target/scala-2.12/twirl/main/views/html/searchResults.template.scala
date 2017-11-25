
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Search],String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("Search Results")/*3.24*/(searchForm)/*3.36*/(user)/*3.42*/(bool)/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
  """),format.raw/*4.3*/("""<div id="searchResults">
  	<h3>Search Results:</h3>
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
                  DATE: Fri Nov 24 15:49:09 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: fe802c5e1092bd7cc714f1173080f6ac82d08259
                  MATRIX: 977->1|1127->56|1155->59|1185->81|1205->93|1219->99|1233->105|1272->107|1301->110|1412->191
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|36->4|42->10
                  -- GENERATED --
              */
          