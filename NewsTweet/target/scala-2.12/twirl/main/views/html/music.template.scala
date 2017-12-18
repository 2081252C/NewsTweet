
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

object music extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[Form[Search],String,Integer,Form[Persona],String,List[String],Form[Interest],List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, tweets: List[String], interestForm: Form[Interest], personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.210*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>

"""),_display_(/*9.2*/main("NewsTweet")/*9.19*/(searchForm)/*9.31*/(user)/*9.37*/(bool)/*9.43*/(personaForm)/*9.56*/(img)/*9.61*/(interestForm)/*9.75*/(personas)/*9.85*/(interests)/*9.96*/(i)/*9.99*/{_display_(Seq[Any](format.raw/*9.100*/("""
  """),format.raw/*10.3*/("""<div id="categories">
  	<h3>Music:</h3>
  	<div class="card-columns">
      """),_display_(/*13.8*/for(tweet <- tweets) yield /*13.28*/{_display_(Seq[Any](format.raw/*13.29*/("""
        """),format.raw/*14.9*/("""<div class="card"  id=""""),_display_(/*14.33*/tweet),format.raw/*14.38*/(""""><br></div>
        <script>
          rendering(""""),_display_(/*16.23*/tweet),format.raw/*16.28*/("""");
        </script>
      """)))}),format.raw/*18.8*/("""
    """),format.raw/*19.5*/("""</div>
  </div>
  
""")))}))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,tweets:List[String],interestForm:Form[Interest],personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,tweets,interestForm,personas,interests,i)

  def f:((Form[Search],String,Integer,Form[Persona],String,List[String],Form[Interest],List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,tweets,interestForm,personas,interests,i) => apply(searchForm,user,bool,personaForm,img,tweets,interestForm,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 22:04:28 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/music.scala.html
                  HASH: bc1c028eec99ed28ac855247bc430242a47220df
                  MATRIX: 1052->1|1333->212|1379->209|1407->228|1434->229|1630->399|1644->405|1706->447|1769->485|1794->502|1814->514|1828->520|1842->526|1863->539|1876->544|1898->558|1916->568|1935->579|1946->582|1985->583|2015->586|2119->664|2155->684|2194->685|2230->694|2281->718|2307->723|2386->775|2412->780|2471->809|2503->814
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|45->13|45->13|45->13|46->14|46->14|46->14|48->16|48->16|50->18|51->19
                  -- GENERATED --
              */
          