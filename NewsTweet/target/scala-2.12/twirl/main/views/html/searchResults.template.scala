
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
    <table style="width:820px;">
  	  <tr>
        <div id="search_tabs">
          <th style="width:410px;">
            <button class="search_result" onclick="openTab(event, 'popular')" style="width:400;">Popular</button> 
          </th>
          <th style="width:410px;">
            <button class="search_result" onclick="openTab(event, 'recent')" style="width:400;">Recent</button>
          </th>
        </div>
      </tr>
      <tr>
        <td colspan="2">
          <div id="popular" class="tweets" style="width:50%; left:300px">
            """),_display_(/*25.14*/for(tweet <- popTweets) yield /*25.37*/{_display_(Seq[Any](format.raw/*25.38*/("""
              """),format.raw/*26.15*/("""<p id=""""),_display_(/*26.23*/tweet),format.raw/*26.28*/(""""><br></p>
              <script>
              rendering(""""),_display_(/*28.27*/tweet),format.raw/*28.32*/("""");
            </script>
            """)))}),format.raw/*30.14*/("""
           """),format.raw/*31.12*/("""<button onclick="document.getElementById('track').style.display = 'block'; this.style.display = 'none'">Track Search</button>
                            <div id="track">
                                """),_display_(/*33.34*/helper/*33.40*/.form(action=routes.TrackController.trackSearch())/*33.90*/{_display_(Seq[Any](format.raw/*33.91*/("""

                                    """),_display_(/*35.38*/inputText(trackForm("term").copy(value= Option[String]("@term")))),format.raw/*35.103*/("""

                                    """),_display_(/*37.38*/helper/*37.44*/.select(
                                       trackForm("interest"),
                                       helper.options(interests),
                                       '_label -> null
                                    )),format.raw/*41.38*/("""
                                """)))}),format.raw/*42.34*/("""
                            """),format.raw/*43.29*/("""</div>
          </div>
      
          <div id="recent" class="tweets" style="width:50%">
            """),_display_(/*47.14*/for(tweet <- recentTweets) yield /*47.40*/{_display_(Seq[Any](format.raw/*47.41*/("""
              """),format.raw/*48.15*/("""<p id=""""),_display_(/*48.23*/tweet),format.raw/*48.28*/(""""><br></p>
              <script>
              rendering(""""),_display_(/*50.27*/tweet),format.raw/*50.32*/("""");
            </script>
            """)))}),format.raw/*52.14*/("""
            """),format.raw/*53.13*/("""<button onclick="document.getElementById('track').style.display = 'block'; this.style.display = 'none'">Track Search</button>
                            <div id="track">
                                """),_display_(/*55.34*/helper/*55.40*/.form(action=routes.TrackController.trackSearch())/*55.90*/{_display_(Seq[Any](format.raw/*55.91*/("""

                                    """),_display_(/*57.38*/inputText(trackForm("term").copy(value= Option[String]("@term")))),format.raw/*57.103*/("""

                                    """),_display_(/*59.38*/helper/*59.44*/.select(
                                       trackForm("interest"),
                                       helper.options(interests),
                                       '_label -> null
                                    )),format.raw/*63.38*/("""
                                """)))}),format.raw/*64.34*/("""
                            """),format.raw/*65.29*/("""</div>
          </div>
        </td>
      </tr>
    </table>
""")))}),format.raw/*70.2*/("""

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
                  DATE: Wed Dec 13 23:40:59 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 6e3204eced9b9bbfd68481e2b9fcf05b381357af
                  MATRIX: 1098->1|1459->292|1505->289|1533->308|1560->309|1756->479|1770->485|1832->527|1895->565|1925->587|1945->599|1959->605|1973->611|1994->624|2007->629|2029->643|2047->653|2067->664|2107->666|2138->670|2189->694|2214->698|2803->1260|2842->1283|2881->1284|2924->1299|2959->1307|2985->1312|3072->1372|3098->1377|3168->1416|3208->1428|3439->1632|3454->1638|3513->1688|3552->1689|3618->1728|3705->1793|3771->1832|3786->1838|4036->2067|4101->2101|4158->2130|4290->2235|4332->2261|4371->2262|4414->2277|4449->2285|4475->2290|4562->2350|4588->2355|4658->2394|4699->2407|4930->2611|4945->2617|5004->2667|5043->2668|5109->2707|5196->2772|5262->2811|5277->2817|5527->3046|5592->3080|5649->3109|5743->3173
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|62->30|63->31|65->33|65->33|65->33|65->33|67->35|67->35|69->37|69->37|73->41|74->42|75->43|79->47|79->47|79->47|80->48|80->48|80->48|82->50|82->50|84->52|85->53|87->55|87->55|87->55|87->55|89->57|89->57|91->59|91->59|95->63|96->64|97->65|102->70
                  -- GENERATED --
              */
          