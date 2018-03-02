
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

object neutralSentiment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[Form[Search],Form[Message],String,Integer,List[String],List[String],List[String],String,String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], messageForm: Form[Message], user: String, bool: Integer, posTweets: List[String], negTweets: List[String], neutTweets: List[String], img: String, term: String, personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.237*/("""

"""),format.raw/*3.89*/("""

"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>

"""),_display_(/*10.2*/main("Data Analytics")/*10.24*/(searchForm)/*10.36*/(user)/*10.42*/(bool)/*10.48*/(img)/*10.53*/(personas)/*10.63*/(interests)/*10.74*/{_display_(Seq[Any](format.raw/*10.75*/("""
  """),format.raw/*11.3*/("""<div id="loader-bg">
      <div id="loader"></div>
  </div>

  <div id="page-content" style="display:none">

    <h3 id="upper">Neutral tweets for """),_display_(/*17.40*/term),format.raw/*17.44*/(""":</h3>
  	<div class="tweets">  
      <div class="card-columns">
      """),_display_(/*20.8*/for(tweet <- neutTweets) yield /*20.32*/{_display_(Seq[Any](format.raw/*20.33*/("""
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

  function showPage() """),format.raw/*78.23*/("""{"""),format.raw/*78.24*/("""
    """),format.raw/*79.5*/("""document.getElementById("loader").style.display = "none";
    document.getElementById("loader-bg").style.display = "none";
    document.getElementById("page-content").style.display = "block";
  """),format.raw/*82.3*/("""}"""),format.raw/*82.4*/("""
"""),format.raw/*83.1*/("""</script>   
""")))}),format.raw/*84.2*/("""

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
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/neutralSentiment.scala.html
                  HASH: eb9f29dd9e22f6044158f82b9044a32367897002
                  MATRIX: 1074->1|1396->239|1428->263|1522->236|1551->326|1579->328|1775->498|1789->504|1851->546|1981->650|2012->672|2033->684|2048->690|2063->696|2077->701|2096->711|2116->722|2155->723|2185->726|2360->874|2385->878|2484->951|2524->975|2563->976|2600->986|2635->1012|2689->1028|2726->1038|2792->1077|2826->1090|2905->1142|2939->1155|3068->1257|3094->1262|3174->1315|3208->1328|3237->1329|3362->1427|3388->1432|3993->2010|4004->2012|4088->2087|4127->2088|4184->2118|4195->2120|4459->2363|4515->2392|4526->2394|4726->2573|4791->2610|5099->2887|5140->2900|5227->2957|5261->2961|5291->2964|5416->3061|5445->3062|5477->3067|5698->3261|5726->3262|5754->3263|5798->3277
                  LINES: 28->1|32->3|32->3|33->1|35->3|37->5|39->7|39->7|39->7|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|49->17|49->17|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|55->23|57->25|57->25|59->27|59->27|60->28|60->28|60->28|64->32|64->32|78->46|78->46|78->46|78->46|80->48|80->48|83->51|85->53|85->53|88->56|91->59|97->65|98->66|102->70|103->71|104->72|110->78|110->78|111->79|114->82|114->82|115->83|116->84
                  -- GENERATED --
              */
          