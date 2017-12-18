
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

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.290*/("""

"""),format.raw/*4.89*/("""  """),format.raw/*4.91*/("""// Declares a horizontal field constructor as default

<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>

"""),_display_(/*10.2*/main("Search Results")/*10.24*/(searchForm)/*10.36*/(user)/*10.42*/(bool)/*10.48*/(personaForm)/*10.61*/(img)/*10.66*/(interestForm)/*10.80*/(personas)/*10.90*/(interests)/*10.101*/ {_display_(Seq[Any](format.raw/*10.103*/("""
  	"""),format.raw/*11.4*/("""<h3>Search Results for """),_display_(/*11.28*/term),format.raw/*11.32*/(""":</h3>
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
              """),_display_(/*23.16*/for((tweet) <- popTweets) yield /*23.41*/{_display_(Seq[Any](format.raw/*23.42*/("""
                """),format.raw/*24.17*/("""<div class="card" id=""""),_display_(/*24.40*/tweet),format.raw/*24.45*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*26.31*/tweet),format.raw/*26.36*/("""");
                </script>
              """)))}),format.raw/*28.16*/("""
              """),format.raw/*29.15*/("""</div>
          </div>
      
          <div id="recent" class="tweets">
            <br>
            <div class="card-columns">
              """),_display_(/*35.16*/for(tweet <- recentTweets) yield /*35.42*/{_display_(Seq[Any](format.raw/*35.43*/("""
                """),format.raw/*36.17*/("""<div class="card"  id=""""),_display_(/*36.41*/tweet),format.raw/*36.46*/(""""><br></div>
                <script>
                  rendering(""""),_display_(/*38.31*/tweet),format.raw/*38.36*/("""");
                </script>
              """)))}),format.raw/*40.16*/("""
            """),format.raw/*41.13*/("""</div>
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
                    """),_display_(/*61.22*/b4/*61.24*/.form(action=routes.TrackController.trackSearch())/*61.74*/{_display_(Seq[Any](format.raw/*61.75*/("""

                        """),_display_(/*63.26*/b4/*63.28*/.text(trackForm("term").copy(value= Option[String](term)),
                          '_label -> "Search Term")),format.raw/*64.52*/("""

                        """),_display_(/*66.26*/b4/*66.28*/.select(
                           trackForm("interest"),
                           helper.options(interests),
                           '_label -> "Interest"
                        )),format.raw/*70.26*/("""
                """),format.raw/*71.17*/("""</div>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                  <button class="btn btn-primary" type="submit">Save changes</button>
              """)))}),format.raw/*76.16*/("""
                """),format.raw/*77.17*/("""</div>
              </div>
            </div>
          </div>
""")))}),format.raw/*81.2*/("""

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
                  DATE: Mon Dec 18 17:14:56 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 732b1c925e74bd579e56bfd7c037595394517ad3
                  MATRIX: 1098->1|1459->292|1496->309|1528->333|1622->289|1651->396|1680->398|1931->623|1945->629|2007->671|2071->709|2102->731|2123->743|2138->749|2153->755|2175->768|2189->773|2212->787|2231->797|2252->808|2293->810|2324->814|2375->838|2400->842|2900->1315|2941->1340|2980->1341|3025->1358|3075->1381|3101->1386|3196->1454|3222->1459|3298->1504|3341->1519|3513->1664|3555->1690|3594->1691|3639->1708|3690->1732|3716->1737|3811->1805|3837->1810|3913->1855|3954->1868|4907->2794|4918->2796|4977->2846|5016->2847|5070->2874|5081->2876|5212->2986|5266->3013|5277->3015|5485->3202|5530->3219|5837->3495|5882->3512|5977->3577
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|55->23|55->23|55->23|56->24|56->24|56->24|58->26|58->26|60->28|61->29|67->35|67->35|67->35|68->36|68->36|68->36|70->38|70->38|72->40|73->41|93->61|93->61|93->61|93->61|95->63|95->63|96->64|98->66|98->66|102->70|103->71|108->76|109->77|113->81
                  -- GENERATED --
              */
          