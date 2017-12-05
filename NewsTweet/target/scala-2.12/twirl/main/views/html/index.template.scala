
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[Long],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], personaID: List[Long]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.175*/("""

"""),format.raw/*3.1*/("""<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("javascripts/render.js")),format.raw/*3.63*/(""""; type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.93*/("""">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

"""),_display_(/*7.2*/main("NewsTweet")/*7.19*/(searchForm)/*7.31*/(user)/*7.37*/(bool)/*7.43*/(personaForm)/*7.56*/(img)/*7.61*/(interestForm)/*7.75*/(personas)/*7.85*/(personaID)/*7.96*/ {_display_(Seq[Any](format.raw/*7.98*/("""
  """),format.raw/*8.3*/("""<div id="categories">
    <table id="category">
      <tr>
        <td>
          <div id="category_info">
            <h1>Check out the latest tweets!</h1>
          </div>
        </td>
        <td>
          <div id="news_category">
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.HomeController.newsCategory),format.raw/*18.57*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="news w3-animate-right" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnh6hIgd5yVOfP4oa72UZiFZmaBMBagZpc9g1vxh2jVNCbqofy">
                <img class="news w3-animate-right" src="https://www.thesun.co.uk/wp-content/uploads/2016/06/eu_referendum_mobile_top.jpg?strip=all&w=750&h=352&crop=1">
                <img class="news w3-animate-right" src="http://blogs.lse.ac.uk/polis/files/2017/01/papers.png">
                <script>
                  var slideIndex = 0;
                  carousel();

                  function carousel() """),format.raw/*27.39*/("""{"""),format.raw/*27.40*/("""
                      """),format.raw/*28.23*/("""var i;
                      var x = document.getElementsByClassName("news");
                      for (i = 0; i < x.length; i++) """),format.raw/*30.54*/("""{"""),format.raw/*30.55*/("""
                        """),format.raw/*31.25*/("""x[i].style.display = "none";
                      """),format.raw/*32.23*/("""}"""),format.raw/*32.24*/("""
                      """),format.raw/*33.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*34.50*/("""{"""),format.raw/*34.51*/("""slideIndex = 1"""),format.raw/*34.65*/("""}"""),format.raw/*34.66*/("""
                      """),format.raw/*35.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel, 2000); // Change image every 2 seconds
                  """),format.raw/*37.19*/("""}"""),format.raw/*37.20*/("""
                """),format.raw/*38.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  News
                </div>
              </div>
            </a>
        	</div>
        </td>
        <td>
          <div id="music_category">
        		<a href=""""),_display_(/*48.21*/routes/*48.27*/.HomeController.musicCategory),format.raw/*48.56*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="music w3-animate-right" src="https://media.theweekendedition.com.au/wp-content/uploads/2015/03/TWE-Brisbane-Live-Music-Week-1100x550-c-center.jpg">
                <img class="music w3-animate-right" src="http://www.harbourside-kitchen.com/wp-content/uploads/2014/07/live-music_guide.jpg">
                <img class="music w3-animate-right" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkrA9-lCdjjXgVvngNyEkG1fGdgxKj2AWaVoGJpgd6HIIAe11m">
                <script>
                  var slideIndex = 0;
                  carousel1();

                  function carousel1() """),format.raw/*57.40*/("""{"""),format.raw/*57.41*/("""
                      """),format.raw/*58.23*/("""var i;
                      var x = document.getElementsByClassName("music");
                      for (i = 0; i < x.length; i++) """),format.raw/*60.54*/("""{"""),format.raw/*60.55*/("""
                        """),format.raw/*61.25*/("""x[i].style.display = "none";
                      """),format.raw/*62.23*/("""}"""),format.raw/*62.24*/("""
                      """),format.raw/*63.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*64.50*/("""{"""),format.raw/*64.51*/("""slideIndex = 1"""),format.raw/*64.65*/("""}"""),format.raw/*64.66*/("""
                      """),format.raw/*65.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel1, 2000); // Change image every 2 seconds
                  """),format.raw/*67.19*/("""}"""),format.raw/*67.20*/("""
                """),format.raw/*68.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Music
                </div>
              </div>
            </a>
        	</div>
        </td>
      </tr>
      <br>
      <tr>
        <td>
          <div id="entertainment_category">
        		<a href=""""),_display_(/*81.21*/routes/*81.27*/.HomeController.entertainmentCategory),format.raw/*81.64*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="entertainment w3-animate-right" src="https://az616578.vo.msecnd.net/files/2017/02/26/636237341865706889-619832852_movies.jpg">
                <img class="entertainment w3-animate-right" src="http://i.dailymail.co.uk/i/pix/2016/02/29/18/31AEE75100000578-3453525-Winners_Leo_enjoyed_a_chat_with_previous_Oscar_winner_Elton_John-a-20_1456771263145.jpg">
                <img class="entertainment w3-animate-right" src="https://www.standard.co.uk/s3fs-public/thumbnails/image/2013/05/13/09/jack-dee.jpg">
                <script>
                  var slideIndex = 0;
                  carousel2();

                  function carousel2() """),format.raw/*90.40*/("""{"""),format.raw/*90.41*/("""
                      """),format.raw/*91.23*/("""var i;
                      var x = document.getElementsByClassName("entertainment");
                      for (i = 0; i < x.length; i++) """),format.raw/*93.54*/("""{"""),format.raw/*93.55*/("""
                        """),format.raw/*94.25*/("""x[i].style.display = "none";
                      """),format.raw/*95.23*/("""}"""),format.raw/*95.24*/("""
                      """),format.raw/*96.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*97.50*/("""{"""),format.raw/*97.51*/("""slideIndex = 1"""),format.raw/*97.65*/("""}"""),format.raw/*97.66*/("""
                      """),format.raw/*98.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel2, 2000); // Change image every 2 seconds
                  """),format.raw/*100.19*/("""}"""),format.raw/*100.20*/("""
                """),format.raw/*101.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Entertainment
                </div>
              </div>
            </a>
          </div>
        </td>
        <td>
        	<div id="tech_category">
        		<a href=""""),_display_(/*111.21*/routes/*111.27*/.HomeController.techCategory),format.raw/*111.55*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="tech w3-animate-right" src="https://static.interestingengineering.com/images/NOVEMBER/sizes/sophia1_resize_md.jpg">
                <img class="tech w3-animate-right" src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Intel_E5200_-1_%284233673443%29.jpg/1024px-Intel_E5200_-1_%284233673443%29.jpg">
                <img class="tech w3-animate-right" src="https://buildmyplays.com/wp-content/uploads/2017/01/SocialMediaNettResults.jpg">
                <script>
                  var slideIndex = 0;
                  carousel3();

                  function carousel3() """),format.raw/*120.40*/("""{"""),format.raw/*120.41*/("""
                      """),format.raw/*121.23*/("""var i;
                      var x = document.getElementsByClassName("tech");
                      for (i = 0; i < x.length; i++) """),format.raw/*123.54*/("""{"""),format.raw/*123.55*/("""
                        """),format.raw/*124.25*/("""x[i].style.display = "none";
                      """),format.raw/*125.23*/("""}"""),format.raw/*125.24*/("""
                      """),format.raw/*126.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*127.50*/("""{"""),format.raw/*127.51*/("""slideIndex = 1"""),format.raw/*127.65*/("""}"""),format.raw/*127.66*/("""
                      """),format.raw/*128.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel3, 2000); // Change image every 2 seconds
                  """),format.raw/*130.19*/("""}"""),format.raw/*130.20*/("""
                """),format.raw/*131.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Tech
                </div>
              </div>
            </a>
        	</div>
        </td>
        <td>
          <div id="sport_category">
        		<a href=""""),_display_(/*141.21*/routes/*141.27*/.HomeController.sportCategory),format.raw/*141.56*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="sport w3-animate-right" src="https://ichef.bbci.co.uk/onesport/cps/480/cpsprodpb/E338/production/_98386185_leicesterandmanchesterunited.jpg">
                <img class="sport w3-animate-right" src="http://www.telegraph.co.uk/content/dam/rugby-union/2017/08/04/TELEMMGLPICT000136082031_trans_NvBQzQNjv4BqBDCnIxthzPLaVuHdTEmpqJRQxFEnemAQdOy_hncTgwo.jpeg?imwidth=480">
                <img class="sport w3-animate-right" src="https://i2-prod.dailyrecord.co.uk/incoming/article1220810.ece/ALTERNATES/s615/Jessica%20Ennis">
                <script>
                  var slideIndex = 0;
                  carousel4();

                  function carousel4() """),format.raw/*150.40*/("""{"""),format.raw/*150.41*/("""
                      """),format.raw/*151.23*/("""var i;
                      var x = document.getElementsByClassName("sport");
                      for (i = 0; i < x.length; i++) """),format.raw/*153.54*/("""{"""),format.raw/*153.55*/("""
                        """),format.raw/*154.25*/("""x[i].style.display = "none";
                      """),format.raw/*155.23*/("""}"""),format.raw/*155.24*/("""
                      """),format.raw/*156.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*157.50*/("""{"""),format.raw/*157.51*/("""slideIndex = 1"""),format.raw/*157.65*/("""}"""),format.raw/*157.66*/("""
                      """),format.raw/*158.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel4, 2000); // Change image every 2 seconds
                  """),format.raw/*160.19*/("""}"""),format.raw/*160.20*/("""
                """),format.raw/*161.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Sport
                </div>
              </div>
            </a>
          </div>
        </td>
      </tr>
    </table>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
  </div>
  
""")))}),format.raw/*193.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],personaID:List[Long]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,personaID)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[Long]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,personaID) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,personaID)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 05 20:40:15 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: ed049b2eff4f438b8212f274ae3a514d5d3739fc
                  MATRIX: 1029->1|1298->174|1326->176|1366->190|1380->196|1442->238|1549->319|1563->325|1624->366|1726->443|1751->460|1771->472|1785->478|1799->484|1820->497|1833->502|1855->516|1873->526|1892->537|1931->539|1960->542|2245->800|2260->806|2309->834|2975->1472|3004->1473|3055->1496|3214->1627|3243->1628|3296->1653|3375->1704|3404->1705|3455->1728|3546->1791|3575->1792|3617->1806|3646->1807|3697->1830|3866->1971|3895->1972|3940->1989|4273->2295|4288->2301|4338->2330|5045->3009|5074->3010|5125->3033|5285->3165|5314->3166|5367->3191|5446->3242|5475->3243|5526->3266|5617->3329|5646->3330|5688->3344|5717->3345|5768->3368|5938->3510|5967->3511|6012->3528|6388->3877|6403->3883|6461->3920|7216->4647|7245->4648|7296->4671|7464->4811|7493->4812|7546->4837|7625->4888|7654->4889|7705->4912|7796->4975|7825->4976|7867->4990|7896->4991|7947->5014|8118->5156|8148->5157|8194->5174|8536->5488|8552->5494|8602->5522|9304->6195|9334->6196|9386->6219|9546->6350|9576->6351|9630->6376|9710->6427|9740->6428|9792->6451|9884->6514|9914->6515|9957->6529|9987->6530|10039->6553|10210->6695|10240->6696|10286->6713|10620->7019|10636->7025|10687->7054|11461->7799|11491->7800|11543->7823|11704->7955|11734->7956|11788->7981|11868->8032|11898->8033|11950->8056|12042->8119|12072->8120|12115->8134|12145->8135|12197->8158|12368->8300|12398->8301|12444->8318|12972->8815
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|50->18|50->18|50->18|59->27|59->27|60->28|62->30|62->30|63->31|64->32|64->32|65->33|66->34|66->34|66->34|66->34|67->35|69->37|69->37|70->38|80->48|80->48|80->48|89->57|89->57|90->58|92->60|92->60|93->61|94->62|94->62|95->63|96->64|96->64|96->64|96->64|97->65|99->67|99->67|100->68|113->81|113->81|113->81|122->90|122->90|123->91|125->93|125->93|126->94|127->95|127->95|128->96|129->97|129->97|129->97|129->97|130->98|132->100|132->100|133->101|143->111|143->111|143->111|152->120|152->120|153->121|155->123|155->123|156->124|157->125|157->125|158->126|159->127|159->127|159->127|159->127|160->128|162->130|162->130|163->131|173->141|173->141|173->141|182->150|182->150|183->151|185->153|185->153|186->154|187->155|187->155|188->156|189->157|189->157|189->157|189->157|190->158|192->160|192->160|193->161|225->193
                  -- GENERATED --
              */
          