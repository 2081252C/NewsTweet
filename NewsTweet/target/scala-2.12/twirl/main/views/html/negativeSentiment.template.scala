
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

object negativeSentiment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

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
  	<h3>Negative tweets for """),_display_(/*10.29*/term),format.raw/*10.33*/(""":</h3>
  	<div class="tweets">
            <div class="card-columns">
              """),_display_(/*13.16*/for((tweet) <- negTweets) yield /*13.41*/{_display_(Seq[Any](format.raw/*13.42*/("""
                """),format.raw/*14.17*/("""<div class="card" id=""""),_display_(/*14.40*/tweet),format.raw/*14.45*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*16.31*/tweet),format.raw/*16.36*/("""");
                </script>
              """)))}),format.raw/*18.16*/("""
              """),format.raw/*19.15*/("""</div>
          </div>
      </div>
  
""")))}),format.raw/*23.2*/("""

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
                  DATE: Wed Jan 31 22:12:45 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/negativeSentiment.scala.html
                  HASH: f0a50097ab7bf149045098ea28e4e6a6450867c5
                  MATRIX: 1122->1|1540->323|1568->325|1764->495|1778->501|1840->543|1969->647|1999->669|2019->681|2033->687|2047->693|2068->706|2081->711|2103->725|2121->735|2141->746|2153->749|2192->750|2221->753|2297->802|2322->806|2434->891|2475->916|2514->917|2559->934|2609->957|2635->962|2730->1030|2756->1035|2832->1080|2875->1095|2946->1136
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|42->10|42->10|45->13|45->13|45->13|46->14|46->14|46->14|48->16|48->16|50->18|51->19|55->23
                  -- GENERATED --
              */
          