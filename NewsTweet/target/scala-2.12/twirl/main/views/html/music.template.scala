
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

object music extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[Search],String,Integer,Form[Persona],String,List[String],Form[Interest],List[String],List[Long],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, tweets: List[String], interestForm: Form[Interest], personas: List[String], personaID: List[Long]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.197*/(""")

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>

"""),_display_(/*9.2*/main("NewsTweet")/*9.19*/(searchForm)/*9.31*/(user)/*9.37*/(bool)/*9.43*/(personaForm)/*9.56*/(img)/*9.61*/(interestForm)/*9.75*/(personas)/*9.85*/(personaID)/*9.96*/{_display_(Seq[Any](format.raw/*9.97*/("""
  """),format.raw/*10.3*/("""<div id="categories">
  	<h3>Music:</h3>
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
  
""")))}))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,tweets:List[String],interestForm:Form[Interest],personas:List[String],personaID:List[Long]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,tweets,interestForm,personas,personaID)

  def f:((Form[Search],String,Integer,Form[Persona],String,List[String],Form[Interest],List[String],List[Long]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,tweets,interestForm,personas,personaID) => apply(searchForm,user,bool,personaForm,img,tweets,interestForm,personas,personaID)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 05 20:40:15 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/music.scala.html
                  HASH: b73c907583c056d7f75950c40ccdd341f0557d94
                  MATRIX: 1042->1|1310->200|1356->196|1385->216|1412->217|1608->387|1622->393|1684->435|1747->473|1772->490|1792->502|1806->508|1820->514|1841->527|1854->532|1876->546|1894->556|1913->567|1951->568|1981->571|2083->646|2119->666|2158->667|2197->678|2232->686|2258->691|2337->743|2363->748|2425->779|2457->784
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|51->19|52->20
                  -- GENERATED --
              */
          