
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

object categories extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Search],String,Integer,Form[Persona],String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, tweets: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.120*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>

"""),_display_(/*9.2*/main("NewsTweet")/*9.19*/(searchForm)/*9.31*/(user)/*9.37*/(bool)/*9.43*/(personaForm)/*9.56*/(img)/*9.61*/{_display_(Seq[Any](format.raw/*9.62*/("""
  """),format.raw/*10.3*/("""<div id="categories">
  	<h3>Categories:</h3>
  	<p>
  		<p id="list">
        """),_display_(/*14.10*/for(tweet <- tweets) yield /*14.30*/{_display_(Seq[Any](format.raw/*14.31*/("""
          """),format.raw/*15.11*/("""<p id=""""),_display_(/*15.19*/tweet),format.raw/*15.24*/(""""><br></p>
          <script>
          rendering(""""),_display_(/*17.23*/tweet),format.raw/*17.28*/("""");
        </script>
        """)))}),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""</p>
  	</p>
  </div>
  
""")))}),format.raw/*24.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,tweets:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,tweets)

  def f:((Form[Search],String,Integer,Form[Persona],String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,tweets) => apply(searchForm,user,bool,personaForm,img,tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 21:35:41 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/categories.scala.html
                  HASH: 3486c85f5bd25fe210c172137994d08ab1b5fdda
                  MATRIX: 1008->1|1199->122|1245->119|1273->138|1300->139|1496->309|1510->315|1572->357|1635->395|1660->412|1680->424|1694->430|1708->436|1729->449|1742->454|1780->455|1810->458|1917->538|1953->558|1992->559|2031->570|2066->578|2092->583|2171->635|2197->640|2259->671|2291->676|2347->702
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|51->19|52->20|56->24
                  -- GENERATED --
              */
          