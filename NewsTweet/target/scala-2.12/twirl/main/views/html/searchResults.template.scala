
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], user: String, bool: Integer, tweets: List[String], popTweets: List[String], recentTweets: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.290*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>

"""),_display_(/*9.2*/main("Search Results")/*9.24*/(searchForm)/*9.36*/(user)/*9.42*/(bool)/*9.48*/(personaForm)/*9.61*/(img)/*9.66*/(interestForm)/*9.80*/(personas)/*9.90*/(interests)/*9.101*/ {_display_(Seq[Any](format.raw/*9.103*/("""
  	"""),format.raw/*10.4*/("""<h3>Search Results for """),_display_(/*10.28*/term),format.raw/*10.32*/(""":</h3>
  	  <ul class="nav nav-tabs">
        <li class="nav-item tab_item">
            <a class="nav-link active search_result" onclick="openTab(event, 'popular')">Popular</a> 
          </li>
          <li class="nav-item tab_item">
            <a class="nav-link search_result" onclick="openTab(event, 'recent')">Recent</a>
          </li>
        </ul>
          <div id="popular" class="tweets">
            <br>
            <div class="card-columns">
              """),_display_(/*22.16*/for((tweet) <- popTweets) yield /*22.41*/{_display_(Seq[Any](format.raw/*22.42*/("""
                """),format.raw/*23.17*/("""<div class="card" id=""""),_display_(/*23.40*/tweet),format.raw/*23.45*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*25.31*/tweet),format.raw/*25.36*/("""");
                </script>
              """)))}),format.raw/*27.16*/("""
              """),format.raw/*28.15*/("""</div>

           <button onclick="document.getElementById('track').style.display = 'block'; this.style.display = 'none'">Track Search</button>
                            <div id="track">
                                """),_display_(/*32.34*/helper/*32.40*/.form(action=routes.TrackController.trackSearch())/*32.90*/{_display_(Seq[Any](format.raw/*32.91*/("""

                                    """),_display_(/*34.38*/helper/*34.44*/.inputText(trackForm("term"),
                                      'value -> term)),format.raw/*35.54*/("""

                                    """),_display_(/*37.38*/helper/*37.44*/.select(
                                       trackForm("interest"),
                                       helper.options(interests),
                                       '_label -> null
                                    )),format.raw/*41.38*/("""
                                """)))}),format.raw/*42.34*/("""
                            """),format.raw/*43.29*/("""</div>
          </div>
      
          <div id="recent" class="tweets">
            <br>
            <div class="card-columns">
              """),_display_(/*49.16*/for(tweet <- recentTweets) yield /*49.42*/{_display_(Seq[Any](format.raw/*49.43*/("""
                """),format.raw/*50.17*/("""<div class="card"  id=""""),_display_(/*50.41*/tweet),format.raw/*50.46*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*52.31*/tweet),format.raw/*52.36*/("""");
                </script>
              """)))}),format.raw/*54.16*/("""
            """),format.raw/*55.13*/("""</div>
            <button onclick="document.getElementById('track').style.display = 'block'; this.style.display = 'none'">Track Search</button>
              <div id="track">
                  """),_display_(/*58.20*/helper/*58.26*/.form(action=routes.TrackController.trackSearch())/*58.76*/{_display_(Seq[Any](format.raw/*58.77*/("""

                      """),_display_(/*60.24*/helper/*60.30*/.inputText(trackForm("term"),
                        'value -> term)),format.raw/*61.40*/("""

                      """),_display_(/*63.24*/helper/*63.30*/.select(
                         trackForm("interest"),
                         helper.options(interests),
                         '_label -> null
                      )),format.raw/*67.24*/("""
                  """)))}),format.raw/*68.20*/("""
              """),format.raw/*69.15*/("""</div>
          </div>
""")))}),format.raw/*71.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],popTweets:List[String],recentTweets:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests) => apply(searchForm,trackForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 16:28:09 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 83436eb74d99d172f2ee38ce2be697d705e99373
                  MATRIX: 1098->1|1459->292|1505->289|1533->308|1560->309|1756->479|1770->485|1832->527|1895->565|1925->587|1945->599|1959->605|1973->611|1994->624|2007->629|2029->643|2047->653|2067->664|2107->666|2138->670|2189->694|2214->698|2714->1171|2755->1196|2794->1197|2839->1214|2889->1237|2915->1242|3010->1310|3036->1315|3112->1360|3155->1375|3405->1598|3420->1604|3479->1654|3518->1655|3584->1694|3599->1700|3703->1783|3769->1822|3784->1828|4034->2057|4099->2091|4156->2120|4328->2265|4370->2291|4409->2292|4454->2309|4505->2333|4531->2338|4626->2406|4652->2411|4728->2456|4769->2469|4991->2664|5006->2670|5065->2720|5104->2721|5156->2746|5171->2752|5261->2821|5313->2846|5328->2852|5522->3025|5573->3045|5616->3060|5671->3085
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|59->27|60->28|64->32|64->32|64->32|64->32|66->34|66->34|67->35|69->37|69->37|73->41|74->42|75->43|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|86->54|87->55|90->58|90->58|90->58|90->58|92->60|92->60|93->61|95->63|95->63|99->67|100->68|101->69|103->71
                  -- GENERATED --
              */
          