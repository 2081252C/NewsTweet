
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

object negativeSentiment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[Form[Search],Form[Message],String,Integer,List[String],List[String],List[String],String,String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

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
    <h3 id="upper">Negative tweets for """),_display_(/*16.41*/term),format.raw/*16.45*/(""":</h3>
  	<div class="tweets">
      <div class="card-columns">
      """),_display_(/*19.8*/for(tweet <- negTweets) yield /*19.31*/{_display_(Seq[Any](format.raw/*19.32*/("""
        """),_display_(/*20.10*/defining(tweet.split("-"))/*20.36*/ { tweetArray =>_display_(Seq[Any](format.raw/*20.52*/(""" 
        """),format.raw/*21.9*/("""<div class="card">
          <div id=""""),_display_(/*22.21*/tweetArray(0)),format.raw/*22.34*/(""""></div>
          <script>
            rendering(""""),_display_(/*24.25*/tweetArray(0)),format.raw/*24.38*/("""");
          </script>
          <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*26.79*/tweet),format.raw/*26.84*/("""">
            Message <span style="color: #E4BC7B">"""),_display_(/*27.51*/tweetArray(1)),format.raw/*27.64*/(""" """),format.raw/*27.65*/("""<i class="icon-envelope-l"></i>
          </a>
        </div>

      <div class="modal fade" id=""""),_display_(/*31.36*/tweet),format.raw/*31.41*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                  """),_display_(/*45.20*/b4/*45.22*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*45.97*/{_display_(Seq[Any](format.raw/*45.98*/(""" 

                          """),_display_(/*47.28*/b4/*47.30*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                              'placeholder -> "Recipient Name",
                              '_label -> "Recipient Name",
                              'size -> 1)),format.raw/*50.42*/("""

                          """),_display_(/*52.28*/b4/*52.30*/.textarea(messageForm("message"),
                            'placeholder -> "Message",
                            '_label -> "Message:",
                            'rows -> 4)),format.raw/*55.40*/("""

                  
                """),format.raw/*58.17*/("""</div>
            </div>
            
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
          """)))}),format.raw/*64.12*/("""
            """),format.raw/*65.13*/("""</div>
          </div>
        </div>
      </div>
    """)))}),format.raw/*69.6*/("""
  """)))}),format.raw/*70.4*/("""
  """),format.raw/*71.3*/("""</div>
</div>
<script>
  var myVar;
  myVar = setTimeout(showPage, 3000);

  function showPage() """),format.raw/*77.23*/("""{"""),format.raw/*77.24*/("""
    """),format.raw/*78.5*/("""document.getElementById("loader").style.display = "none";
    document.getElementById("loader-bg").style.display = "none";
    document.getElementById("page-content").style.display = "block";
  """),format.raw/*81.3*/("""}"""),format.raw/*81.4*/("""
"""),format.raw/*82.1*/("""</script> 
  
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
                  DATE: Thu Mar 01 21:57:54 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/negativeSentiment.scala.html
                  HASH: a7735152265ec8d2bed53c7f00f78929dbf987e1
                  MATRIX: 1075->1|1397->239|1429->263|1523->236|1552->326|1580->328|1776->498|1790->504|1852->546|1982->650|2013->672|2034->684|2049->690|2064->696|2078->701|2097->711|2117->722|2156->723|2186->726|2361->874|2386->878|2483->949|2522->972|2561->973|2598->983|2633->1009|2687->1025|2724->1035|2790->1074|2824->1087|2903->1139|2937->1152|3066->1254|3092->1259|3172->1312|3206->1325|3235->1326|3360->1424|3386->1429|3991->2007|4002->2009|4086->2084|4125->2085|4182->2115|4193->2117|4457->2360|4513->2389|4524->2391|4724->2570|4789->2607|5097->2884|5138->2897|5225->2954|5259->2958|5289->2961|5414->3058|5443->3059|5475->3064|5696->3258|5724->3259|5752->3260|5797->3275
                  LINES: 28->1|32->3|32->3|33->1|35->3|37->5|39->7|39->7|39->7|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|48->16|48->16|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|54->22|56->24|56->24|58->26|58->26|59->27|59->27|59->27|63->31|63->31|77->45|77->45|77->45|77->45|79->47|79->47|82->50|84->52|84->52|87->55|90->58|96->64|97->65|101->69|102->70|103->71|109->77|109->77|110->78|113->81|113->81|114->82|116->84
                  -- GENERATED --
              */
          