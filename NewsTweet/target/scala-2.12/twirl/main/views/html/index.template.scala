
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
            Check out the latest tweets!
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
              <a href=""""),_display_(/*49.25*/routes/*49.31*/.HomeController.newsCategory),format.raw/*49.59*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="music w3-animate-right" src="https://media.theweekendedition.com.au/wp-content/uploads/2015/03/TWE-Brisbane-Live-Music-Week-1100x550-c-center.jpg">
                <img class="music w3-animate-right" src="http://www.harbourside-kitchen.com/wp-content/uploads/2014/07/live-music_guide.jpg">
                <img class="music w3-animate-right" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkrA9-lCdjjXgVvngNyEkG1fGdgxKj2AWaVoGJpgd6HIIAe11m">
                <script>
                  var slideIndex = 0;
                  carousel1();

                  function carousel1() """),format.raw/*58.40*/("""{"""),format.raw/*58.41*/("""
                      """),format.raw/*59.23*/("""var i;
                      var x = document.getElementsByClassName("music");
                      for (i = 0; i < x.length; i++) """),format.raw/*61.54*/("""{"""),format.raw/*61.55*/("""
                        """),format.raw/*62.25*/("""x[i].style.display = "none";
                      """),format.raw/*63.23*/("""}"""),format.raw/*63.24*/("""
                      """),format.raw/*64.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*65.50*/("""{"""),format.raw/*65.51*/("""slideIndex = 1"""),format.raw/*65.65*/("""}"""),format.raw/*65.66*/("""
                      """),format.raw/*66.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel1, 2000); // Change image every 2 seconds
                  """),format.raw/*68.19*/("""}"""),format.raw/*68.20*/("""
                """),format.raw/*69.17*/("""</script>
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
        		<a href=""""),_display_(/*82.21*/routes/*82.27*/.HomeController.entertainmentCategory),format.raw/*82.64*/("""">
              <a href=""""),_display_(/*83.25*/routes/*83.31*/.HomeController.newsCategory),format.raw/*83.59*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="entertainment w3-animate-right" src="https://az616578.vo.msecnd.net/files/2017/02/26/636237341865706889-619832852_movies.jpg">
                <img class="entertainment w3-animate-right" src="http://i.dailymail.co.uk/i/pix/2016/02/29/18/31AEE75100000578-3453525-Winners_Leo_enjoyed_a_chat_with_previous_Oscar_winner_Elton_John-a-20_1456771263145.jpg">
                <img class="entertainment w3-animate-right" src="https://www.standard.co.uk/s3fs-public/thumbnails/image/2013/05/13/09/jack-dee.jpg">
                <script>
                  var slideIndex = 0;
                  carousel2();

                  function carousel2() """),format.raw/*92.40*/("""{"""),format.raw/*92.41*/("""
                      """),format.raw/*93.23*/("""var i;
                      var x = document.getElementsByClassName("entertainment");
                      for (i = 0; i < x.length; i++) """),format.raw/*95.54*/("""{"""),format.raw/*95.55*/("""
                        """),format.raw/*96.25*/("""x[i].style.display = "none";
                      """),format.raw/*97.23*/("""}"""),format.raw/*97.24*/("""
                      """),format.raw/*98.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*99.50*/("""{"""),format.raw/*99.51*/("""slideIndex = 1"""),format.raw/*99.65*/("""}"""),format.raw/*99.66*/("""
                      """),format.raw/*100.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel2, 2000); // Change image every 2 seconds
                  """),format.raw/*102.19*/("""}"""),format.raw/*102.20*/("""
                """),format.raw/*103.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Entertainment
                </div>
              </div>
            </a>
          </div>
        </td>
        <td>
        	<div id="tech_category">
        		<a href=""""),_display_(/*113.21*/routes/*113.27*/.HomeController.techCategory),format.raw/*113.55*/("""">
              <a href=""""),_display_(/*114.25*/routes/*114.31*/.HomeController.newsCategory),format.raw/*114.59*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="tech w3-animate-right" src="https://static.interestingengineering.com/images/NOVEMBER/sizes/sophia1_resize_md.jpg">
                <img class="tech w3-animate-right" src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Intel_E5200_-1_%284233673443%29.jpg/1024px-Intel_E5200_-1_%284233673443%29.jpg">
                <img class="tech w3-animate-right" src="https://buildmyplays.com/wp-content/uploads/2017/01/SocialMediaNettResults.jpg">
                <script>
                  var slideIndex = 0;
                  carousel3();

                  function carousel3() """),format.raw/*123.40*/("""{"""),format.raw/*123.41*/("""
                      """),format.raw/*124.23*/("""var i;
                      var x = document.getElementsByClassName("tech");
                      for (i = 0; i < x.length; i++) """),format.raw/*126.54*/("""{"""),format.raw/*126.55*/("""
                        """),format.raw/*127.25*/("""x[i].style.display = "none";
                      """),format.raw/*128.23*/("""}"""),format.raw/*128.24*/("""
                      """),format.raw/*129.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*130.50*/("""{"""),format.raw/*130.51*/("""slideIndex = 1"""),format.raw/*130.65*/("""}"""),format.raw/*130.66*/("""
                      """),format.raw/*131.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel3, 2000); // Change image every 2 seconds
                  """),format.raw/*133.19*/("""}"""),format.raw/*133.20*/("""
                """),format.raw/*134.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Tech
                </div>
              </div>
            </a>
        	</div>
        </td>
        <td>
          <div id="gaming_category">
        		<a href=""""),_display_(/*144.21*/routes/*144.27*/.HomeController.gamingCategory),format.raw/*144.57*/("""">
              <a href=""""),_display_(/*145.25*/routes/*145.31*/.HomeController.newsCategory),format.raw/*145.59*/("""">
              <div  class="w3-display-container mySlides" >
                <img class="gaming w3-animate-right" src="https://www.artsprofessional.co.uk/sites/artsprofessional.co.uk/files/styles/551_by_350_feature/public/video_game.jpg?itok=PSM93NW8">
                <img class="gaming w3-animate-right" src="http://www.audioholics.com/editorials/xbox-one-x-the-downside-of-the-innovation-bell-curve/image">
                <img class="gaming w3-animate-right" src="https://i.ytimg.com/vi/lUSV44_KtXk/maxresdefault.jpg">
                <script>
                  var slideIndex = 0;
                  carousel4();

                  function carousel4() """),format.raw/*154.40*/("""{"""),format.raw/*154.41*/("""
                      """),format.raw/*155.23*/("""var i;
                      var x = document.getElementsByClassName("gaming");
                      for (i = 0; i < x.length; i++) """),format.raw/*157.54*/("""{"""),format.raw/*157.55*/("""
                        """),format.raw/*158.25*/("""x[i].style.display = "none";
                      """),format.raw/*159.23*/("""}"""),format.raw/*159.24*/("""
                      """),format.raw/*160.23*/("""slideIndex++;
                      if (slideIndex > x.length) """),format.raw/*161.50*/("""{"""),format.raw/*161.51*/("""slideIndex = 1"""),format.raw/*161.65*/("""}"""),format.raw/*161.66*/("""
                      """),format.raw/*162.23*/("""x[slideIndex-1].style.display = "block";
                      setTimeout(carousel4, 2000); // Change image every 2 seconds
                  """),format.raw/*164.19*/("""}"""),format.raw/*164.20*/("""
                """),format.raw/*165.17*/("""</script>
                <div class="w3-display-bottomright w3-container w3-padding-16 w3-black w3-opacity" id="caption">
                  Gaming
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
  
""")))}),format.raw/*197.2*/("""

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
                  DATE: Sun Dec 03 10:32:48 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: 4305d7b86621560e2f3b7c543bddc26e53d679c6
                  MATRIX: 990->1|1181->97|1209->99|1249->113|1263->119|1325->161|1432->242|1446->248|1507->289|1609->366|1634->383|1654->395|1668->401|1682->407|1703->420|1724->433|1763->435|1792->438|2068->687|2083->693|2132->721|2798->1359|2827->1360|2878->1383|3037->1514|3066->1515|3119->1540|3198->1591|3227->1592|3278->1615|3369->1678|3398->1679|3440->1693|3469->1694|3520->1717|3689->1858|3718->1859|3763->1876|4096->2182|4111->2188|4161->2217|4215->2244|4230->2250|4279->2278|4986->2957|5015->2958|5066->2981|5226->3113|5255->3114|5308->3139|5387->3190|5416->3191|5467->3214|5558->3277|5587->3278|5629->3292|5658->3293|5709->3316|5879->3458|5908->3459|5953->3476|6329->3825|6344->3831|6402->3868|6456->3895|6471->3901|6520->3929|7275->4656|7304->4657|7355->4680|7523->4820|7552->4821|7605->4846|7684->4897|7713->4898|7764->4921|7855->4984|7884->4985|7926->4999|7955->5000|8007->5023|8178->5165|8208->5166|8254->5183|8596->5497|8612->5503|8662->5531|8717->5558|8733->5564|8783->5592|9485->6265|9515->6266|9567->6289|9727->6420|9757->6421|9811->6446|9891->6497|9921->6498|9973->6521|10065->6584|10095->6585|10138->6599|10168->6600|10220->6623|10391->6765|10421->6766|10467->6783|10802->7090|10818->7096|10870->7126|10925->7153|10941->7159|10991->7187|11679->7846|11709->7847|11761->7870|11923->8003|11953->8004|12007->8029|12087->8080|12117->8081|12169->8104|12261->8167|12291->8168|12334->8182|12364->8183|12416->8206|12587->8348|12617->8349|12663->8366|13192->8864
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|50->18|50->18|50->18|59->27|59->27|60->28|62->30|62->30|63->31|64->32|64->32|65->33|66->34|66->34|66->34|66->34|67->35|69->37|69->37|70->38|80->48|80->48|80->48|81->49|81->49|81->49|90->58|90->58|91->59|93->61|93->61|94->62|95->63|95->63|96->64|97->65|97->65|97->65|97->65|98->66|100->68|100->68|101->69|114->82|114->82|114->82|115->83|115->83|115->83|124->92|124->92|125->93|127->95|127->95|128->96|129->97|129->97|130->98|131->99|131->99|131->99|131->99|132->100|134->102|134->102|135->103|145->113|145->113|145->113|146->114|146->114|146->114|155->123|155->123|156->124|158->126|158->126|159->127|160->128|160->128|161->129|162->130|162->130|162->130|162->130|163->131|165->133|165->133|166->134|176->144|176->144|176->144|177->145|177->145|177->145|186->154|186->154|187->155|189->157|189->157|190->158|191->159|191->159|192->160|193->161|193->161|193->161|193->161|194->162|196->164|196->164|197->165|229->197
                  -- GENERATED --
              */
          