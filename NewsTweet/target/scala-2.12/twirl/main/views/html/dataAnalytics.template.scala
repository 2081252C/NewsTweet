
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

object dataAnalytics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[Long],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], personaID: List[Long]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.175*/("""

"""),_display_(/*3.2*/main("Data Analytics")/*3.24*/(searchForm)/*3.36*/(user)/*3.42*/(bool)/*3.48*/(personaForm)/*3.61*/(img)/*3.66*/(interestForm)/*3.80*/(personas)/*3.90*/(personaID)/*3.101*/{_display_(Seq[Any](format.raw/*3.102*/("""
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

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],personaID:List[Long]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,personaID)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[Long]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,personaID) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,personaID)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 05 20:40:16 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: a0f6f1f897efc6df301f13ee5b86c94361d121ea
                  MATRIX: 1037->1|1306->174|1334->177|1364->199|1384->211|1398->217|1412->223|1433->236|1446->241|1468->255|1486->265|1506->276|1545->277|1574->280|1688->364
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|36->4|42->10
                  -- GENERATED --
              */
          