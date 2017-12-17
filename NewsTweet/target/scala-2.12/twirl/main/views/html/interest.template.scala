
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

object interest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.177*/("""

"""),_display_(/*3.2*/main("Data Analytics")/*3.24*/(searchForm)/*3.36*/(user)/*3.42*/(bool)/*3.48*/(personaForm)/*3.61*/(img)/*3.66*/(interestForm)/*3.80*/(personas)/*3.90*/(interests)/*3.101*/{_display_(Seq[Any](format.raw/*3.102*/("""
  	"""),format.raw/*4.4*/("""<h3>Interest:</h3>
  
""")))}),format.raw/*6.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,interests) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 14 13:25:45 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: 2905fe223f84c70fde2cb53015e9c24ead7c04f5
                  MATRIX: 1034->1|1305->176|1333->179|1363->201|1383->213|1397->219|1411->225|1432->238|1445->243|1467->257|1485->267|1505->278|1544->279|1574->283|1626->306
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|35->3|36->4|38->6
                  -- GENERATED --
              */
          