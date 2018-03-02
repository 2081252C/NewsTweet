
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

object entertainment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],Form[Message],String,Integer,String,List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

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

	<h3 id="upper">Entertainment:</h3>
	<div class="card-columns">
      """),_display_(/*20.8*/for(tweet <- tweets) yield /*20.28*/{_display_(Seq[Any](format.raw/*20.29*/("""
        """),_display_(/*21.10*/defining(tweet.split("-"))/*21.36*/ { tweetArray =>_display_(Seq[Any](format.raw/*21.52*/(""" 
        """),format.raw/*22.9*/("""<div class="card">
          <div id=""""),_display_(/*23.21*/tweetArray(0)),format.raw/*23.34*/(""""></div>
          <script>
            rendering(""""),_display_(/*25.25*/tweetArray(0)),format.raw/*25.38*/("""");
          </script>
          """),_display_(/*27.12*/if(bool==1)/*27.23*/{_display_(Seq[Any](format.raw/*27.24*/("""
            """),format.raw/*28.13*/("""<a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*28.81*/tweet),format.raw/*28.86*/("""">
              Message <span style="color: #E4BC7B">"""),_display_(/*29.53*/tweetArray(1)),format.raw/*29.66*/(""" """),format.raw/*29.67*/("""<i class="icon-envelope-l"></i>
            </a>
          """)))}),format.raw/*31.12*/("""
        """),format.raw/*32.9*/("""</div>

      <div class="modal fade" id=""""),_display_(/*34.36*/tweet),format.raw/*34.41*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                  """),_display_(/*48.20*/b4/*48.22*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*48.97*/{_display_(Seq[Any](format.raw/*48.98*/(""" 

                          """),_display_(/*50.28*/b4/*50.30*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                              'placeholder -> "Recipient Name",
                              '_label -> "Recipient Name",
                              'size -> 1)),format.raw/*53.42*/("""

                          """),_display_(/*55.28*/b4/*55.30*/.textarea(messageForm("message"),
                            'placeholder -> "Message",
                            '_label -> "Message:",
                            'rows -> 4)),format.raw/*58.40*/("""

                  
                """),format.raw/*61.17*/("""</div>
            </div>

            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
          """)))}),format.raw/*67.12*/("""
            """),format.raw/*68.13*/("""</div>
          </div>
        </div>
      </div>
    """)))}),format.raw/*72.6*/("""
  """)))}),format.raw/*73.4*/("""
"""),format.raw/*74.1*/("""</div>
 
<script>
  var myVar;
  myVar = setTimeout(showPage, 3000);

  function showPage() """),format.raw/*80.23*/("""{"""),format.raw/*80.24*/("""
    """),format.raw/*81.5*/("""document.getElementById("loader").style.display = "none";
    document.getElementById("loader-bg").style.display = "none";
    document.getElementById("page-content").style.display = "block";
  """),format.raw/*84.3*/("""}"""),format.raw/*84.4*/("""
"""),format.raw/*85.1*/("""</script> 
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
                  DATE: Fri Mar 02 15:46:26 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/entertainment.scala.html
                  HASH: 09394b51ab86e49285a74abb7f65919e3685025e
                  MATRIX: 1037->1|1277->261|1314->171|1346->195|1440->168|1469->258|1497->277|1524->278|1720->448|1734->454|1796->496|1860->534|1886->551|1907->563|1922->569|1937->575|1951->580|1970->590|1990->601|2029->602|2059->605|2265->785|2301->805|2340->806|2377->816|2412->842|2466->858|2503->868|2569->907|2603->920|2682->972|2716->985|2778->1020|2798->1031|2837->1032|2878->1045|2973->1113|2999->1118|3081->1173|3115->1186|3144->1187|3235->1247|3271->1256|3341->1299|3367->1304|3972->1882|3983->1884|4067->1959|4106->1960|4163->1990|4174->1992|4438->2235|4494->2264|4505->2266|4705->2445|4770->2482|5066->2747|5107->2760|5194->2817|5228->2821|5256->2822|5376->2914|5405->2915|5437->2920|5658->3114|5686->3115|5714->3116
                  LINES: 28->1|31->5|33->3|33->3|34->1|36->3|38->6|39->7|41->9|41->9|41->9|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|55->23|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|64->32|66->34|66->34|80->48|80->48|80->48|80->48|82->50|82->50|85->53|87->55|87->55|90->58|93->61|99->67|100->68|104->72|105->73|106->74|112->80|112->80|113->81|116->84|116->84|117->85
                  -- GENERATED --
              */
          