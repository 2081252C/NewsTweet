
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template14[Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], user: String, bool: Integer, tweets: List[String], popTweets: List[String], recentTweets: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.301*/("""

"""),format.raw/*4.89*/("""  """),format.raw/*4.91*/("""// Declares a horizontal field constructor as default

<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>

"""),_display_(/*10.2*/main("Search Results")/*10.24*/(searchForm)/*10.36*/(user)/*10.42*/(bool)/*10.48*/(personaForm)/*10.61*/(img)/*10.66*/(interestForm)/*10.80*/(personas)/*10.90*/(interests)/*10.101*/(i)/*10.104*/{_display_(Seq[Any](format.raw/*10.105*/("""
  	"""),format.raw/*11.4*/("""<h3>Search Results for """),_display_(/*11.28*/term),format.raw/*11.32*/(""":
      <a href=""""),_display_(/*12.17*/routes/*12.23*/.SearchController.searchAnalytics()),format.raw/*12.58*/("""" class="btn btn-primary" style="float:right;"> Search Analytics </a>
    </h3>
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
              """),_display_(/*25.16*/for((tweet) <- popTweets) yield /*25.41*/{_display_(Seq[Any](format.raw/*25.42*/("""
                """),format.raw/*26.17*/("""<div class="card" id=""""),_display_(/*26.40*/tweet),format.raw/*26.45*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*28.31*/tweet),format.raw/*28.36*/("""");
                </script>
              """)))}),format.raw/*30.16*/("""
              """),format.raw/*31.15*/("""</div>
          </div>
      
          <div id="recent" class="tweets">
            <br>
            <div class="card-columns">
              """),_display_(/*37.16*/for(tweet <- recentTweets) yield /*37.42*/{_display_(Seq[Any](format.raw/*37.43*/("""
                """),format.raw/*38.17*/("""<div class="card"  id=""""),_display_(/*38.41*/tweet),format.raw/*38.46*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*40.31*/tweet),format.raw/*40.36*/("""");
                </script>
              """)))}),format.raw/*42.16*/("""
            """),format.raw/*43.13*/("""</div>
          </div>

          <div class="fixed-bottom" id="footer">
            <button type="button" id="track_btn" class="btn btn-primary" data-toggle="modal" data-target="#trackModal">Track Search</button>
          </div>
          

          <!-- Modal -->
          <div class="modal fade" id="trackModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title" id="interest-label">Track Search</h5>
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <div class="modal-body">
                  <div id="track">
                    """),_display_(/*63.22*/b4/*63.24*/.form(action=routes.TrackController.trackSearch())/*63.74*/{_display_(Seq[Any](format.raw/*63.75*/("""

                        """),_display_(/*65.26*/b4/*65.28*/.text(trackForm("term").copy(value= Option[String](term)),
                          '_label -> "Search Term")),format.raw/*66.52*/("""

                        """),_display_(/*68.26*/b4/*68.28*/.select(
                           trackForm("interest"),
                           helper.options(interests),
                           '_label -> "Interest"
                        )),format.raw/*72.26*/("""
                """),format.raw/*73.17*/("""</div>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                  <button class="btn btn-primary" type="submit">Save changes</button>
              """)))}),format.raw/*78.16*/("""
                """),format.raw/*79.17*/("""</div>
              </div>
            </div>
          </div>
""")))}),format.raw/*83.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],popTweets:List[String],recentTweets:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests,i)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests,i) => apply(searchForm,trackForm,user,bool,tweets,popTweets,recentTweets,personaForm,img,interestForm,term,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 05 15:25:46 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: af4479a3c815b96d62212ed8dcb6f887416d539b
                  MATRIX: 1105->1|1477->303|1514->320|1546->344|1640->300|1669->407|1698->409|1949->634|1963->640|2025->682|2089->720|2120->742|2141->754|2156->760|2171->766|2193->779|2207->784|2230->798|2249->808|2270->819|2283->822|2323->823|2354->827|2405->851|2430->855|2475->873|2490->879|2546->914|3119->1460|3160->1485|3199->1486|3244->1503|3294->1526|3320->1531|3415->1599|3441->1604|3517->1649|3560->1664|3732->1809|3774->1835|3813->1836|3858->1853|3909->1877|3935->1882|4030->1950|4056->1955|4132->2000|4173->2013|5126->2939|5137->2941|5196->2991|5235->2992|5289->3019|5300->3021|5431->3131|5485->3158|5496->3160|5704->3347|5749->3364|6056->3640|6101->3657|6196->3722
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|62->30|63->31|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|74->42|75->43|95->63|95->63|95->63|95->63|97->65|97->65|98->66|100->68|100->68|104->72|105->73|110->78|111->79|115->83
                  -- GENERATED --
              */
          