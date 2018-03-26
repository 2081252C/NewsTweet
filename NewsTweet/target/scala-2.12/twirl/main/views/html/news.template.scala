
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

object news extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],Form[Message],String,Integer,String,List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], messageForm: Form[Message], user: String, bool: Integer, img: String, personas: List[String], interests: List[String], tweets: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._

implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.169*/("""

"""),format.raw/*3.89*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("javascripts/render.js")),format.raw/*9.63*/(""""; type="text/javascript"></script>

"""),_display_(/*11.2*/main("NewsTweet")/*11.19*/(searchForm)/*11.31*/(user)/*11.37*/(bool)/*11.43*/(img)/*11.48*/(personas)/*11.58*/(interests)/*11.69*/{_display_(Seq[Any](format.raw/*11.70*/("""
  """),format.raw/*12.3*/("""<div id="loader-bg">
      <div id="loader"></div>
  </div>

  <div id="page-content" style="display:none">
    <div id="header">
      <h3 id="upper">News:</h3>
    </div>
  	<div class="card-columns">
      """),_display_(/*21.8*/for(tweet <- tweets) yield /*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
        """),_display_(/*22.10*/defining(tweet.split("-"))/*22.36*/ { tweetArray =>_display_(Seq[Any](format.raw/*22.52*/(""" 
        """),format.raw/*23.9*/("""<div class="card">
          <div id=""""),_display_(/*24.21*/tweetArray(0)),format.raw/*24.34*/(""""></div>
          <script>
            rendering(""""),_display_(/*26.25*/tweetArray(0)),format.raw/*26.38*/("""");
          </script>
          """),_display_(/*28.12*/if(bool==1)/*28.23*/{_display_(Seq[Any](format.raw/*28.24*/("""
            """),format.raw/*29.13*/("""<a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*29.81*/tweet),format.raw/*29.86*/("""">
              Message <span style="color: #E4BC7B">"""),_display_(/*30.53*/tweetArray(1)),format.raw/*30.66*/(""" """),format.raw/*30.67*/("""<i class="icon-envelope-l"></i>
            </a>
          """)))}),format.raw/*32.12*/("""
        """),format.raw/*33.9*/("""</div>

      <div class="modal fade" id=""""),_display_(/*35.36*/tweet),format.raw/*35.41*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="interest-label">Send Message</h5>

              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>

            </div>

            <div class="modal-body">
              <div id="interest-form">
                  """),_display_(/*49.20*/b4/*49.22*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*49.97*/{_display_(Seq[Any](format.raw/*49.98*/(""" 

                          """),_display_(/*51.28*/b4/*51.30*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                              'placeholder -> "Recipient Name",
                              '_label -> "Recipient Name",
                              'size -> 1)),format.raw/*54.42*/("""

                          """),_display_(/*56.28*/b4/*56.30*/.textarea(messageForm("message"),
                            'placeholder -> "Message",
                            '_label -> "Message:",
                            'rows -> 4)),format.raw/*59.40*/("""

                  
                """),format.raw/*62.17*/("""</div>
            </div>
            
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
          """)))}),format.raw/*68.12*/("""
            """),format.raw/*69.13*/("""</div>
          </div>
        </div>
      </div>
    """)))}),format.raw/*73.6*/("""
  """)))}),format.raw/*74.4*/("""
  """),format.raw/*75.3*/("""</div>

  <script>
  var myVar;
  myVar = setTimeout(showPage, 3000);

  function showPage() """),format.raw/*81.23*/("""{"""),format.raw/*81.24*/("""
    """),format.raw/*82.5*/("""document.getElementById("loader").style.display = "none";
    document.getElementById("loader-bg").style.display = "none";
    document.getElementById("page-content").style.display = "block";
  """),format.raw/*85.3*/("""}"""),format.raw/*85.4*/("""
"""),format.raw/*86.1*/("""</script> 
  
""")))}))
      }
    }
  }

  def render(searchForm:Form[Search],messageForm:Form[Message],user:String,bool:Integer,img:String,personas:List[String],interests:List[String],tweets:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,messageForm,user,bool,img,personas,interests,tweets)

  def f:((Form[Search],Form[Message],String,Integer,String,List[String],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,messageForm,user,bool,img,personas,interests,tweets) => apply(searchForm,messageForm,user,bool,img,personas,interests,tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 18 11:12:11 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/news.scala.html
                  HASH: 2320f6e1b92d564bfe83e6457854cfb51b203dc5
                  MATRIX: 1028->1|1268->261|1305->171|1337->195|1431->168|1460->258|1488->277|1515->278|1711->448|1725->454|1787->496|1851->534|1877->551|1898->563|1913->569|1928->575|1942->580|1961->590|1981->601|2020->602|2050->605|2286->815|2322->835|2361->836|2398->846|2433->872|2487->888|2524->898|2590->937|2624->950|2703->1002|2737->1015|2799->1050|2819->1061|2858->1062|2899->1075|2994->1143|3020->1148|3102->1203|3136->1216|3165->1217|3256->1277|3292->1286|3362->1329|3388->1334|3993->1912|4004->1914|4088->1989|4127->1990|4184->2020|4195->2022|4459->2265|4515->2294|4526->2296|4726->2475|4791->2512|5099->2789|5140->2802|5227->2859|5261->2863|5291->2866|5412->2959|5441->2960|5473->2965|5694->3159|5722->3160|5750->3161
                  LINES: 28->1|31->5|33->3|33->3|34->1|36->3|38->6|39->7|41->9|41->9|41->9|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|56->24|58->26|58->26|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|64->32|65->33|67->35|67->35|81->49|81->49|81->49|81->49|83->51|83->51|86->54|88->56|88->56|91->59|94->62|100->68|101->69|105->73|106->74|107->75|113->81|113->81|114->82|117->85|117->85|118->86
                  -- GENERATED --
              */
          