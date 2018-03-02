
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

object positiveSentiment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[Form[Search],Form[Message],String,Integer,List[String],List[String],List[String],String,String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], messageForm: Form[Message], user: String, bool: Integer, posTweets: List[String], negTweets: List[String], neutTweets: List[String], img: String, term: String, personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.237*/("""


"""),format.raw/*4.89*/("""

"""),format.raw/*6.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>

"""),_display_(/*11.2*/main("Data Analytics")/*11.24*/(searchForm)/*11.36*/(user)/*11.42*/(bool)/*11.48*/(img)/*11.53*/(personas)/*11.63*/(interests)/*11.74*/{_display_(Seq[Any](format.raw/*11.75*/("""
  """),format.raw/*12.3*/("""<div id="loader-bg">
      <div id="loader"></div>
  </div>

  <div id="page-content" style="display:none">
    <h3 id="upper">Positive tweets for """"),_display_(/*17.42*/term),format.raw/*17.46*/("""":</h3>
    <div class="tweets">
  	<div class="card-columns">
      """),_display_(/*20.8*/for(tweet <- posTweets) yield /*20.31*/{_display_(Seq[Any](format.raw/*20.32*/("""
        """),_display_(/*21.10*/defining(tweet.split("-"))/*21.36*/ { tweetArray =>_display_(Seq[Any](format.raw/*21.52*/(""" 
        """),format.raw/*22.9*/("""<div class="card">
          <div id=""""),_display_(/*23.21*/tweetArray(0)),format.raw/*23.34*/(""""></div>
          <script>
            rendering(""""),_display_(/*25.25*/tweetArray(0)),format.raw/*25.38*/("""");
          </script>
          <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*27.79*/tweet),format.raw/*27.84*/("""">
            Message <span style="color: #E4BC7B">"""),_display_(/*28.51*/tweetArray(1)),format.raw/*28.64*/(""" """),format.raw/*28.65*/("""<i class="icon-envelope-l"></i>
          </a>
        </div>

      <div class="modal fade" id=""""),_display_(/*32.36*/tweet),format.raw/*32.41*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                  """),_display_(/*46.20*/b4/*46.22*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*46.97*/{_display_(Seq[Any](format.raw/*46.98*/(""" 

                          """),_display_(/*48.28*/b4/*48.30*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                              'placeholder -> "Recipient Name",
                              '_label -> "Recipient Name",
                              'size -> 1)),format.raw/*51.42*/("""

                          """),_display_(/*53.28*/b4/*53.30*/.textarea(messageForm("message"),
                            'placeholder -> "Message",
                            '_label -> "Message:",
                            'rows -> 4)),format.raw/*56.40*/("""

                  
                """),format.raw/*59.17*/("""</div>
            </div>
            
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
          """)))}),format.raw/*65.12*/("""
            """),format.raw/*66.13*/("""</div>
          </div>
        </div>
      </div>
    """)))}),format.raw/*70.6*/("""
  """)))}),format.raw/*71.4*/("""
  """),format.raw/*72.3*/("""</div>
</div>
  
  <script>
  var myVar;
  myVar = setTimeout(showPage, 3000);

  function showPage() """),format.raw/*79.23*/("""{"""),format.raw/*79.24*/("""
    """),format.raw/*80.5*/("""document.getElementById("loader").style.display = "none";
    document.getElementById("loader-bg").style.display = "none";
    document.getElementById("page-content").style.display = "block";
  """),format.raw/*83.3*/("""}"""),format.raw/*83.4*/("""
"""),format.raw/*84.1*/("""</script> 
""")))}),format.raw/*85.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],messageForm:Form[Message],user:String,bool:Integer,posTweets:List[String],negTweets:List[String],neutTweets:List[String],img:String,term:String,personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,messageForm,user,bool,posTweets,negTweets,neutTweets,img,term,personas,interests)

  def f:((Form[Search],Form[Message],String,Integer,List[String],List[String],List[String],String,String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,messageForm,user,bool,posTweets,negTweets,neutTweets,img,term,personas,interests) => apply(searchForm,messageForm,user,bool,posTweets,negTweets,neutTweets,img,term,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 01 21:57:55 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/positiveSentiment.scala.html
                  HASH: 9ccca1f2f6e353f0c2e863215ceab9e055a53a35
                  MATRIX: 1075->1|1397->240|1429->264|1523->236|1553->327|1581->329|1777->499|1791->505|1853->547|1983->651|2014->673|2035->685|2050->691|2065->697|2079->702|2098->712|2118->723|2157->724|2187->727|2363->876|2388->880|2484->950|2523->973|2562->974|2599->984|2634->1010|2688->1026|2725->1036|2791->1075|2825->1088|2904->1140|2938->1153|3067->1255|3093->1260|3173->1313|3207->1326|3236->1327|3361->1425|3387->1430|3992->2008|4003->2010|4087->2085|4126->2086|4183->2116|4194->2118|4458->2361|4514->2390|4525->2392|4725->2571|4790->2608|5098->2885|5139->2898|5226->2955|5260->2959|5290->2962|5420->3064|5449->3065|5481->3070|5702->3264|5730->3265|5758->3266|5800->3278
                  LINES: 28->1|32->4|32->4|33->1|36->4|38->6|40->8|40->8|40->8|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|49->17|49->17|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|55->23|57->25|57->25|59->27|59->27|60->28|60->28|60->28|64->32|64->32|78->46|78->46|78->46|78->46|80->48|80->48|83->51|85->53|85->53|88->56|91->59|97->65|98->66|102->70|103->71|104->72|111->79|111->79|112->80|115->83|115->83|116->84|117->85
                  -- GENERATED --
              */
          