
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

object sport extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],Form[Message],String,Integer,String,List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

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
    <h3 id="upper">Sport:</h3>
  	<div class="card-columns">
      """),_display_(/*19.8*/for(tweet <- tweets) yield /*19.28*/{_display_(Seq[Any](format.raw/*19.29*/("""
        """),_display_(/*20.10*/defining(tweet.split("-"))/*20.36*/ { tweetArray =>_display_(Seq[Any](format.raw/*20.52*/(""" 
        """),format.raw/*21.9*/("""<div class="card">
          <div id=""""),_display_(/*22.21*/tweetArray(0)),format.raw/*22.34*/(""""></div>
          <script>
            rendering(""""),_display_(/*24.25*/tweetArray(0)),format.raw/*24.38*/("""");
          </script>
          """),_display_(/*26.12*/if(bool==1)/*26.23*/{_display_(Seq[Any](format.raw/*26.24*/("""
            """),format.raw/*27.13*/("""<a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*27.81*/tweet),format.raw/*27.86*/("""">
              Message <span style="color: #E4BC7B">"""),_display_(/*28.53*/tweetArray(1)),format.raw/*28.66*/(""" """),format.raw/*28.67*/("""<i class="icon-envelope-l"></i>
            </a>
          """)))}),format.raw/*30.12*/("""
        """),format.raw/*31.9*/("""</div>

      <div class="modal fade" id=""""),_display_(/*33.36*/tweet),format.raw/*33.41*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                  """),_display_(/*47.20*/b4/*47.22*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*47.97*/{_display_(Seq[Any](format.raw/*47.98*/(""" 

                          """),_display_(/*49.28*/b4/*49.30*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                              'placeholder -> "Recipient Name",
                              '_label -> "Recipient Name",
                              'size -> 1)),format.raw/*52.42*/("""

                          """),_display_(/*54.28*/b4/*54.30*/.textarea(messageForm("message"),
                            'placeholder -> "Message",
                            '_label -> "Message:",
                            'rows -> 4)),format.raw/*57.40*/("""

                  
                """),format.raw/*60.17*/("""</div>
            </div>
            
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
          """)))}),format.raw/*66.12*/("""
            """),format.raw/*67.13*/("""</div>
          </div>
        </div>
      </div>
    """)))}),format.raw/*71.6*/("""
  """)))}),format.raw/*72.4*/("""
  """),format.raw/*73.3*/("""</div>


  <script>
    var myVar;
    myVar = setTimeout(showPage, 3000);

    function showPage() """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
      """),format.raw/*81.7*/("""document.getElementById("loader").style.display = "none";
      document.getElementById("loader-bg").style.display = "none";
      document.getElementById("page-content").style.display = "block";
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""
  """),format.raw/*85.3*/("""</script> 
  
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
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/sport.scala.html
                  HASH: 466cbdcc11ffff543d4ad2e7b70f79698c1a2bd1
                  MATRIX: 1029->1|1269->261|1306->171|1338->195|1432->168|1461->258|1489->277|1516->278|1712->448|1726->454|1788->496|1852->534|1878->551|1899->563|1914->569|1929->575|1943->580|1962->590|1982->601|2021->602|2051->605|2253->781|2289->801|2328->802|2365->812|2400->838|2454->854|2491->864|2557->903|2591->916|2670->968|2704->981|2766->1016|2786->1027|2825->1028|2866->1041|2961->1109|2987->1114|3069->1169|3103->1182|3132->1183|3223->1243|3259->1252|3329->1295|3355->1300|3960->1878|3971->1880|4055->1955|4094->1956|4151->1986|4162->1988|4426->2231|4482->2260|4493->2262|4693->2441|4758->2478|5066->2755|5107->2768|5194->2825|5228->2829|5258->2832|5386->2932|5415->2933|5449->2940|5676->3140|5704->3141|5734->3144
                  LINES: 28->1|31->5|33->3|33->3|34->1|36->3|38->6|39->7|41->9|41->9|41->9|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|54->22|56->24|56->24|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|62->30|63->31|65->33|65->33|79->47|79->47|79->47|79->47|81->49|81->49|84->52|86->54|86->54|89->57|92->60|98->66|99->67|103->71|104->72|105->73|112->80|112->80|113->81|116->84|116->84|117->85
                  -- GENERATED --
              */
          