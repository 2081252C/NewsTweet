
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.188*/("""

"""),format.raw/*3.1*/("""<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("javascripts/render.js")),format.raw/*3.63*/(""""; type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.93*/("""">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

"""),_display_(/*7.2*/main("NewsTweet")/*7.19*/(searchForm)/*7.31*/(user)/*7.37*/(bool)/*7.43*/(personaForm)/*7.56*/(img)/*7.61*/(interestForm)/*7.75*/(personas)/*7.85*/(interests)/*7.96*/(i)/*7.99*/ {_display_(Seq[Any](format.raw/*7.101*/("""
  """),format.raw/*8.3*/("""<div id="categories">
    <div class="container" id="category-container">
      <div class="row" id="row-categories">
        <div class="col-sm-4">
          <div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem; height: 100%">
            <div class="card-body">
              <h4 class="card-title" id="category-title">Welcome to NewsTweet</h4>
              <h6 class="card-subtitle mb-2 text-muted">An easy way to follow topics on Twitter.</h6>
              <p class="card-text" id="category-text">NewsTweet allows you to track Twitter searches. Search above to get started!<br><br>
              Or, click on a category to see some recent tweets!</p>
            </div>
          </div>
        </div>
        <div class="col-sm-4">
          <div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem;">
            <img class="news w3-animate-right" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnh6hIgd5yVOfP4oa72UZiFZmaBMBagZpc9g1vxh2jVNCbqofy">
            <img class="news w3-animate-right" src="https://www.thesun.co.uk/wp-content/uploads/2016/06/eu_referendum_mobile_top.jpg?strip=all&w=750&h=352&crop=1">
            <img class="news w3-animate-right" src="http://blogs.lse.ac.uk/polis/files/2017/01/papers.png">
            <script>
              var slideIndex = 0;
              carousel();

              function carousel() """),format.raw/*30.35*/("""{"""),format.raw/*30.36*/("""
                  """),format.raw/*31.19*/("""var i;
                  var x = document.getElementsByClassName("news");
                  for (i = 0; i < x.length; i++) """),format.raw/*33.50*/("""{"""),format.raw/*33.51*/("""
                    """),format.raw/*34.21*/("""x[i].style.display = "none";
                  """),format.raw/*35.19*/("""}"""),format.raw/*35.20*/("""
                  """),format.raw/*36.19*/("""slideIndex++;
                  if (slideIndex > x.length) """),format.raw/*37.46*/("""{"""),format.raw/*37.47*/("""slideIndex = 1"""),format.raw/*37.61*/("""}"""),format.raw/*37.62*/("""
                  """),format.raw/*38.19*/("""x[slideIndex-1].style.display = "block";
                  setTimeout(carousel, 2000); // Change image every 2 seconds
              """),format.raw/*40.15*/("""}"""),format.raw/*40.16*/("""
            """),format.raw/*41.13*/("""</script>
            <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.HomeController.newsCategory),format.raw/*43.61*/("""" id="category-btn">News</a>
            </div>
          </div>
        </div>
        <div class="col-sm-4">
        		<div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem;">
              <img class="music w3-animate-right" src="https://media.theweekendedition.com.au/wp-content/uploads/2015/03/TWE-Brisbane-Live-Music-Week-1100x550-c-center.jpg">
              <img class="music w3-animate-right" src="http://www.harbourside-kitchen.com/wp-content/uploads/2014/07/live-music_guide.jpg">
              <img class="music w3-animate-right" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkrA9-lCdjjXgVvngNyEkG1fGdgxKj2AWaVoGJpgd6HIIAe11m">
              <script>
                var slideIndex = 0;
                carousel1();

                function carousel1() """),format.raw/*56.38*/("""{"""),format.raw/*56.39*/("""
                    """),format.raw/*57.21*/("""var i;
                    var x = document.getElementsByClassName("music");
                    for (i = 0; i < x.length; i++) """),format.raw/*59.52*/("""{"""),format.raw/*59.53*/("""
                      """),format.raw/*60.23*/("""x[i].style.display = "none";
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""
                    """),format.raw/*62.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*63.48*/("""{"""),format.raw/*63.49*/("""slideIndex = 1"""),format.raw/*63.63*/("""}"""),format.raw/*63.64*/("""
                    """),format.raw/*64.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel1, 2000); // Change image every 2 seconds
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""
                """),format.raw/*67.17*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*69.29*/routes/*69.35*/.HomeController.musicCategory),format.raw/*69.64*/("""" id="category-btn">Music</a>
              </div>
            </div>
          </div>
      </div>

      <br>

      <div class="row" id="row-categories">
        <div class="col-sm-4">
        		<div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem;">
              <img class="entertainment w3-animate-right" src="https://az616578.vo.msecnd.net/files/2017/02/26/636237341865706889-619832852_movies.jpg">
              <img class="entertainment w3-animate-right" src="http://i.dailymail.co.uk/i/pix/2016/02/29/18/31AEE75100000578-3453525-Winners_Leo_enjoyed_a_chat_with_previous_Oscar_winner_Elton_John-a-20_1456771263145.jpg">
              <img class="entertainment w3-animate-right" src="https://www.standard.co.uk/s3fs-public/thumbnails/image/2013/05/13/09/jack-dee.jpg">
              <script>
                var slideIndex = 0;
                carousel2();

                function carousel2() """),format.raw/*87.38*/("""{"""),format.raw/*87.39*/("""
                    """),format.raw/*88.21*/("""var i;
                    var x = document.getElementsByClassName("entertainment");
                    for (i = 0; i < x.length; i++) """),format.raw/*90.52*/("""{"""),format.raw/*90.53*/("""
                      """),format.raw/*91.23*/("""x[i].style.display = "none";
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/("""
                    """),format.raw/*93.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*94.48*/("""{"""),format.raw/*94.49*/("""slideIndex = 1"""),format.raw/*94.63*/("""}"""),format.raw/*94.64*/("""
                    """),format.raw/*95.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel2, 2000); // Change image every 2 seconds
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
              """),format.raw/*98.15*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*100.29*/routes/*100.35*/.HomeController.entertainmentCategory),format.raw/*100.72*/("""" id="category-btn">Entertainment</a>
              </div>
            </div>
        </div>

        <div class="col-sm-4">
        		<div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem;">
              <img class="tech w3-animate-right" src="https://static.interestingengineering.com/images/NOVEMBER/sizes/sophia1_resize_md.jpg">
              <img class="tech w3-animate-right" src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Intel_E5200_-1_%284233673443%29.jpg/1024px-Intel_E5200_-1_%284233673443%29.jpg">
              <img class="tech w3-animate-right" src="https://buildmyplays.com/wp-content/uploads/2017/01/SocialMediaNettResults.jpg">
              <script>
                var slideIndex = 0;
                carousel3();

                function carousel3() """),format.raw/*114.38*/("""{"""),format.raw/*114.39*/("""
                    """),format.raw/*115.21*/("""var i;
                    var x = document.getElementsByClassName("tech");
                    for (i = 0; i < x.length; i++) """),format.raw/*117.52*/("""{"""),format.raw/*117.53*/("""
                      """),format.raw/*118.23*/("""x[i].style.display = "none";
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/("""
                    """),format.raw/*120.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*121.48*/("""{"""),format.raw/*121.49*/("""slideIndex = 1"""),format.raw/*121.63*/("""}"""),format.raw/*121.64*/("""
                    """),format.raw/*122.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel3, 2000); // Change image every 2 seconds
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
              """),format.raw/*125.15*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*127.29*/routes/*127.35*/.HomeController.techCategory),format.raw/*127.63*/("""" id="category-btn">Tech</a>
              </div>
            </div>
        </div>

        <div class="col-sm-4">
        		<div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem;">
              <img class="sport w3-animate-right" src="https://ichef.bbci.co.uk/onesport/cps/480/cpsprodpb/E338/production/_98386185_leicesterandmanchesterunited.jpg">
              <img class="sport w3-animate-right" src="http://www.telegraph.co.uk/content/dam/rugby-union/2017/08/04/TELEMMGLPICT000136082031_trans_NvBQzQNjv4BqBDCnIxthzPLaVuHdTEmpqJRQxFEnemAQdOy_hncTgwo.jpeg?imwidth=480">
              <img class="sport w3-animate-right" src="https://i2-prod.dailyrecord.co.uk/incoming/article1220810.ece/ALTERNATES/s615/Jessica%20Ennis">
              <script>
                var slideIndex = 0;
                carousel4();

                function carousel4() """),format.raw/*141.38*/("""{"""),format.raw/*141.39*/("""
                    """),format.raw/*142.21*/("""var i;
                    var x = document.getElementsByClassName("sport");
                    for (i = 0; i < x.length; i++) """),format.raw/*144.52*/("""{"""),format.raw/*144.53*/("""
                      """),format.raw/*145.23*/("""x[i].style.display = "none";
                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/("""
                    """),format.raw/*147.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*148.48*/("""{"""),format.raw/*148.49*/("""slideIndex = 1"""),format.raw/*148.63*/("""}"""),format.raw/*148.64*/("""
                    """),format.raw/*149.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel4, 2000); // Change image every 2 seconds
                """),format.raw/*151.17*/("""}"""),format.raw/*151.18*/("""
              """),format.raw/*152.15*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*154.29*/routes/*154.35*/.HomeController.sportCategory),format.raw/*154.64*/("""" id="category-btn">Sport</a>
              </div>
            </div>
        </div>
      </div>
    </div>
  </div>
  
""")))}),format.raw/*162.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,i)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,interests,i) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 22:05:21 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: d8602395b9ac6c754240d938a919172de65f875d
                  MATRIX: 1038->1|1320->187|1348->189|1388->203|1402->209|1464->251|1571->332|1585->338|1646->379|1748->456|1773->473|1793->485|1807->491|1821->497|1842->510|1855->515|1877->529|1895->539|1914->550|1925->553|1965->555|1994->558|3458->1994|3487->1995|3534->2014|3685->2137|3714->2138|3763->2159|3838->2206|3867->2207|3914->2226|4001->2285|4030->2286|4072->2300|4101->2301|4148->2320|4309->2453|4338->2454|4379->2467|4530->2591|4545->2597|4594->2625|5443->3446|5472->3447|5521->3468|5677->3596|5706->3597|5757->3620|5834->3669|5863->3670|5912->3691|6001->3752|6030->3753|6072->3767|6101->3768|6150->3789|6316->3927|6345->3928|6390->3945|6545->4073|6560->4079|6610->4108|7584->5054|7613->5055|7662->5076|7826->5212|7855->5213|7906->5236|7983->5285|8012->5286|8061->5307|8150->5368|8179->5369|8221->5383|8250->5384|8299->5405|8465->5543|8494->5544|8537->5559|8693->5687|8709->5693|8768->5730|9626->6559|9656->6560|9706->6581|9862->6708|9892->6709|9944->6732|10022->6781|10052->6782|10102->6803|10192->6864|10222->6865|10265->6879|10295->6880|10345->6901|10512->7039|10542->7040|10586->7055|10742->7183|10758->7189|10808->7217|11729->8109|11759->8110|11809->8131|11966->8259|11996->8260|12048->8283|12126->8332|12156->8333|12206->8354|12296->8415|12326->8416|12369->8430|12399->8431|12449->8452|12616->8590|12646->8591|12690->8606|12846->8734|12862->8740|12913->8769|13066->8891
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|62->30|62->30|63->31|65->33|65->33|66->34|67->35|67->35|68->36|69->37|69->37|69->37|69->37|70->38|72->40|72->40|73->41|75->43|75->43|75->43|88->56|88->56|89->57|91->59|91->59|92->60|93->61|93->61|94->62|95->63|95->63|95->63|95->63|96->64|98->66|98->66|99->67|101->69|101->69|101->69|119->87|119->87|120->88|122->90|122->90|123->91|124->92|124->92|125->93|126->94|126->94|126->94|126->94|127->95|129->97|129->97|130->98|132->100|132->100|132->100|146->114|146->114|147->115|149->117|149->117|150->118|151->119|151->119|152->120|153->121|153->121|153->121|153->121|154->122|156->124|156->124|157->125|159->127|159->127|159->127|173->141|173->141|174->142|176->144|176->144|177->145|178->146|178->146|179->147|180->148|180->148|180->148|180->148|181->149|183->151|183->151|184->152|186->154|186->154|186->154|194->162
                  -- GENERATED --
              */
          