
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[Form[Search],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, tweets: List[String], popTweets: List[String], recentTweets: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.266*/("""

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
          """),format.raw/*31.11*/("""</div>
      
          <div id="recent" class="tweets" style="width:50%">
            """),_display_(/*34.14*/for(tweet <- recentTweets) yield /*34.40*/{_display_(Seq[Any](format.raw/*34.41*/("""
              """),format.raw/*35.15*/("""<p id=""""),_display_(/*35.23*/tweet),format.raw/*35.28*/(""""><br></p>
              <script>
              rendering(""""),_display_(/*37.27*/tweet),format.raw/*37.32*/("""");
            </script>
            """)))}),format.raw/*39.14*/("""
          """),format.raw/*40.11*/("""</div>
        </td>
      </tr>
    </table>
""")))}),format.raw/*44.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,tweets:List[String],popTweets:List[String],recentTweets:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests)

  def f:((Form[Search],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests) => apply(searchForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 04:41:04 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 39969cc268c60548b08bcc38aa0095986b36a91f
                  MATRIX: 1086->1|1423->268|1469->265|1497->284|1524->285|1720->455|1734->461|1796->503|1859->541|1889->563|1909->575|1923->581|1937->587|1958->600|1971->605|1993->619|2011->629|2031->640|2071->642|2102->646|2153->670|2178->674|2767->1236|2806->1259|2845->1260|2888->1275|2923->1283|2949->1288|3036->1348|3062->1353|3132->1392|3171->1403|3286->1491|3328->1517|3367->1518|3410->1533|3445->1541|3471->1546|3558->1606|3584->1611|3654->1650|3693->1661|3770->1708
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|62->30|63->31|66->34|66->34|66->34|67->35|67->35|67->35|69->37|69->37|71->39|72->40|76->44
                  -- GENERATED --
              */
          