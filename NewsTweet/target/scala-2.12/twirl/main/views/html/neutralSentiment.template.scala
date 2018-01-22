
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

object neutralSentiment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], user: String, bool: Integer, tweets: List[String], posTweets: List[String], negTweets: List[String], neutTweets: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.324*/("""

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>

"""),_display_(/*8.2*/main("Data Analytics")/*8.24*/(searchForm)/*8.36*/(user)/*8.42*/(bool)/*8.48*/(personaForm)/*8.61*/(img)/*8.66*/(interestForm)/*8.80*/(personas)/*8.90*/(interests)/*8.101*/(i)/*8.104*/{_display_(Seq[Any](format.raw/*8.105*/("""
  """),format.raw/*9.3*/("""<div id="Sentiment">
  	<h3>Neutral tweets for """),_display_(/*10.28*/term),format.raw/*10.32*/(""":</h3>
  	<div id="popular" class="tweets">
            <br>
            <div class="card-columns">
              """),_display_(/*14.16*/for((tweet) <- neutTweets) yield /*14.42*/{_display_(Seq[Any](format.raw/*14.43*/("""
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

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],posTweets:List[String],negTweets:List[String],neutTweets:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,posTweets,negTweets,neutTweets,personaForm,img,interestForm,term,personas,interests,i)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,posTweets,negTweets,neutTweets,personaForm,img,interestForm,term,personas,interests,i) => apply(searchForm,trackForm,user,bool,tweets,posTweets,negTweets,neutTweets,personaForm,img,interestForm,term,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 15 10:45:48 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/neutralSentiment.scala.html
                  HASH: c9981d7380cbaf5c4bed16b34d56be4e08ccff85
                  MATRIX: 1121->1|1539->323|1567->325|1763->495|1777->501|1839->543|1968->647|1998->669|2018->681|2032->687|2046->693|2067->706|2080->711|2102->725|2120->735|2140->746|2152->749|2191->750|2220->753|2295->801|2320->805|2462->920|2504->946|2543->947|2588->964|2638->987|2664->992|2759->1060|2785->1065|2861->1110|2904->1125|2975->1166
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|42->10|42->10|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|51->19|52->20|56->24
                  -- GENERATED --
              */
          