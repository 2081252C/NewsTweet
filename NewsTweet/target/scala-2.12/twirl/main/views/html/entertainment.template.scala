
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

object entertainment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[Search],String,Integer,Form[Persona],String,List[String],Form[Interest],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, tweets: List[String], interestForm: Form[Interest], personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.199*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>

"""),_display_(/*9.2*/main("NewsTweet")/*9.19*/(searchForm)/*9.31*/(user)/*9.37*/(bool)/*9.43*/(personaForm)/*9.56*/(img)/*9.61*/(interestForm)/*9.75*/(personas)/*9.85*/(interests)/*9.96*/{_display_(Seq[Any](format.raw/*9.97*/("""
  """),format.raw/*10.3*/("""<div id="categories">
  	<h3>Entertainment:</h3>
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

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,tweets:List[String],interestForm:Form[Interest],personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,tweets,interestForm,personas,interests)

  def f:((Form[Search],String,Integer,Form[Persona],String,List[String],Form[Interest],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,tweets,interestForm,personas,interests) => apply(searchForm,user,bool,personaForm,img,tweets,interestForm,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 06 16:38:03 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/entertainment.scala.html
                  HASH: 48902f9236e6c8c6f6a0bac179a9b20a36d72edd
                  MATRIX: 1052->1|1322->201|1368->198|1396->217|1423->218|1619->388|1633->394|1695->436|1758->474|1783->491|1803->503|1817->509|1831->515|1852->528|1865->533|1887->547|1905->557|1924->568|1962->569|1992->572|2102->655|2138->675|2177->676|2216->687|2251->695|2277->700|2356->752|2382->757|2444->788|2476->793
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|51->19|52->20
                  -- GENERATED --
              */
          