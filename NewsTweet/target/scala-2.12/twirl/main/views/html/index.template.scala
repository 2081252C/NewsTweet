
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Search],String,Integer,Form[Persona],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.98*/("""

"""),format.raw/*3.1*/("""<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("javascripts/render.js")),format.raw/*3.63*/(""""; type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.93*/("""">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

"""),_display_(/*7.2*/main("NewsTweet")/*7.19*/(searchForm)/*7.31*/(user)/*7.37*/(bool)/*7.43*/(personaForm)/*7.56*/(img: String)/*7.69*/ {_display_(Seq[Any](format.raw/*7.71*/("""
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

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img)

  def f:((Form[Search],String,Integer,Form[Persona],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img) => apply(searchForm,user,bool,personaForm,img)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:30:32 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: dc7bfb484a27f968a9f50a8f8520ad69b8a0fd74
                  MATRIX: 990->1|1181->97|1209->99|1249->113|1263->119|1325->161|1432->242|1446->248|1507->289|1609->366|1634->383|1654->395|1668->401|1682->407|1703->420|1724->433|1763->435|1792->438|2077->696|2092->702|2141->730|2807->1368|2836->1369|2887->1392|3046->1523|3075->1524|3128->1549|3207->1600|3236->1601|3287->1624|3378->1687|3407->1688|3449->1702|3478->1703|3529->1726|3698->1867|3727->1868|3772->1885|4105->2191|4120->2197|4170->2226|4877->2905|4906->2906|4957->2929|5117->3061|5146->3062|5199->3087|5278->3138|5307->3139|5358->3162|5449->3225|5478->3226|5520->3240|5549->3241|5600->3264|5770->3406|5799->3407|5844->3424|6220->3773|6235->3779|6293->3816|7048->4543|7077->4544|7128->4567|7296->4707|7325->4708|7378->4733|7457->4784|7486->4785|7537->4808|7628->4871|7657->4872|7699->4886|7728->4887|7779->4910|7950->5052|7980->5053|8026->5070|8368->5384|8384->5390|8434->5418|9136->6091|9166->6092|9218->6115|9378->6246|9408->6247|9462->6272|9542->6323|9572->6324|9624->6347|9716->6410|9746->6411|9789->6425|9819->6426|9871->6449|10042->6591|10072->6592|10118->6609|10452->6915|10468->6921|10519->6950|11293->7695|11323->7696|11375->7719|11536->7851|11566->7852|11620->7877|11700->7928|11730->7929|11782->7952|11874->8015|11904->8016|11947->8030|11977->8031|12029->8054|12200->8196|12230->8197|12276->8214|12804->8711
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|50->18|50->18|50->18|59->27|59->27|60->28|62->30|62->30|63->31|64->32|64->32|65->33|66->34|66->34|66->34|66->34|67->35|69->37|69->37|70->38|80->48|80->48|80->48|89->57|89->57|90->58|92->60|92->60|93->61|94->62|94->62|95->63|96->64|96->64|96->64|96->64|97->65|99->67|99->67|100->68|113->81|113->81|113->81|122->90|122->90|123->91|125->93|125->93|126->94|127->95|127->95|128->96|129->97|129->97|129->97|129->97|130->98|132->100|132->100|133->101|143->111|143->111|143->111|152->120|152->120|153->121|155->123|155->123|156->124|157->125|157->125|158->126|159->127|159->127|159->127|159->127|160->128|162->130|162->130|163->131|173->141|173->141|173->141|182->150|182->150|183->151|185->153|185->153|186->154|187->155|187->155|188->156|189->157|189->157|189->157|189->157|190->158|192->160|192->160|193->161|225->193
                  -- GENERATED --
              */
          