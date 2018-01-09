
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

object negativeSentiment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template14[Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], user: String, bool: Integer, tweets: List[String], posTweets: List[String], negTweets: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.298*/("""

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>

"""),_display_(/*8.2*/main("Data Analytics")/*8.24*/(searchForm)/*8.36*/(user)/*8.42*/(bool)/*8.48*/(personaForm)/*8.61*/(img)/*8.66*/(interestForm)/*8.80*/(personas)/*8.90*/(interests)/*8.101*/(i)/*8.104*/{_display_(Seq[Any](format.raw/*8.105*/("""
  """),format.raw/*9.3*/("""<div id="Sentiment">
  	<h3>Negative tweets for """),_display_(/*10.29*/term),format.raw/*10.33*/(""":</h3>
  	<div id="popular" class="tweets">
            <br>
            <div class="card-columns">
              """),_display_(/*14.16*/for((tweet) <- negTweets) yield /*14.41*/{_display_(Seq[Any](format.raw/*14.42*/("""
                """),format.raw/*15.17*/("""<div class="card" id=""""),_display_(/*15.40*/tweet),format.raw/*15.45*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*17.31*/tweet),format.raw/*17.36*/("""");
                </script>
              """)))}),format.raw/*19.16*/("""
              """),format.raw/*20.15*/("""</div>
          </div>
      </div>
  
""")))}),format.raw/*24.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],posTweets:List[String],negTweets:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,posTweets,negTweets,personaForm,img,interestForm,term,personas,interests,i)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,posTweets,negTweets,personaForm,img,interestForm,term,personas,interests,i) => apply(searchForm,trackForm,user,bool,tweets,posTweets,negTweets,personaForm,img,interestForm,term,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 09 08:16:28 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/negativeSentiment.scala.html
                  HASH: 7b8648b5fbbb5ca8a5c27bec4de03564ff41adbd
                  MATRIX: 1109->1|1501->297|1529->299|1725->469|1739->475|1801->517|1930->621|1960->643|1980->655|1994->661|2008->667|2029->680|2042->685|2064->699|2082->709|2102->720|2114->723|2153->724|2182->727|2258->776|2283->780|2425->895|2466->920|2505->921|2550->938|2600->961|2626->966|2721->1034|2747->1039|2823->1084|2866->1099|2937->1140
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|42->10|42->10|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|51->19|52->20|56->24
                  -- GENERATED --
              */
          