
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

object interest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], interests: List[String], tweets: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.210*/("""

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>

"""),_display_(/*7.2*/main("Interest")/*7.18*/(searchForm)/*7.30*/(user)/*7.36*/(bool)/*7.42*/(personaForm)/*7.55*/(img)/*7.60*/(interestForm)/*7.74*/(personas)/*7.84*/(interests)/*7.95*/(i)/*7.98*/{_display_(Seq[Any](format.raw/*7.99*/("""
  	"""),format.raw/*8.4*/("""<h3>"""),_display_(/*8.9*/i),format.raw/*8.10*/("""</h3>
  	<div class="card-columns">
      """),_display_(/*10.8*/for(tweet <- tweets) yield /*10.28*/{_display_(Seq[Any](format.raw/*10.29*/("""
        """),format.raw/*11.9*/("""<div class="card"  id=""""),_display_(/*11.33*/tweet),format.raw/*11.38*/(""""><br></div>
        <script>
          rendering(""""),_display_(/*13.23*/tweet),format.raw/*13.28*/("""");
        </script>
      """)))}),format.raw/*15.8*/("""
    """),format.raw/*16.5*/("""</div>
""")))}),format.raw/*17.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String],tweets:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,tweets,i)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,interests,tweets,i) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,tweets,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 22:34:16 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: c28f9a4b681be9c33423c27881ad383a0a283aea
                  MATRIX: 1055->1|1359->209|1387->211|1583->381|1597->387|1659->429|1722->467|1746->483|1766->495|1780->501|1794->507|1815->520|1828->525|1850->539|1868->549|1887->560|1898->563|1936->564|1966->568|1996->573|2017->574|2086->617|2122->637|2161->638|2197->647|2248->671|2274->676|2353->728|2379->733|2438->762|2470->767|2508->775
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|45->13|45->13|47->15|48->16|49->17
                  -- GENERATED --
              */
          