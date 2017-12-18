
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.177*/("""

"""),format.raw/*3.1*/("""<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("javascripts/render.js")),format.raw/*3.63*/(""""; type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.93*/("""">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

"""),_display_(/*7.2*/main("NewsTweet")/*7.19*/(searchForm)/*7.31*/(user)/*7.37*/(bool)/*7.43*/(personaForm)/*7.56*/(img)/*7.61*/(interestForm)/*7.75*/(personas)/*7.85*/(interests)/*7.96*/ {_display_(Seq[Any](format.raw/*7.98*/("""
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

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,interests) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 14:03:26 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: 2dc207864adbefd28134d387c1120b41f84d516f
                  MATRIX: 1031->1|1302->176|1330->178|1370->192|1384->198|1446->240|1553->321|1567->327|1628->368|1730->445|1755->462|1775->474|1789->480|1803->486|1824->499|1837->504|1859->518|1877->528|1896->539|1935->541|1964->544|3428->1980|3457->1981|3504->2000|3655->2123|3684->2124|3733->2145|3808->2192|3837->2193|3884->2212|3971->2271|4000->2272|4042->2286|4071->2287|4118->2306|4279->2439|4308->2440|4349->2453|4500->2577|4515->2583|4564->2611|5413->3432|5442->3433|5491->3454|5647->3582|5676->3583|5727->3606|5804->3655|5833->3656|5882->3677|5971->3738|6000->3739|6042->3753|6071->3754|6120->3775|6286->3913|6315->3914|6360->3931|6515->4059|6530->4065|6580->4094|7554->5040|7583->5041|7632->5062|7796->5198|7825->5199|7876->5222|7953->5271|7982->5272|8031->5293|8120->5354|8149->5355|8191->5369|8220->5370|8269->5391|8435->5529|8464->5530|8507->5545|8663->5673|8679->5679|8738->5716|9596->6545|9626->6546|9676->6567|9832->6694|9862->6695|9914->6718|9992->6767|10022->6768|10072->6789|10162->6850|10192->6851|10235->6865|10265->6866|10315->6887|10482->7025|10512->7026|10556->7041|10712->7169|10728->7175|10778->7203|11699->8095|11729->8096|11779->8117|11936->8245|11966->8246|12018->8269|12096->8318|12126->8319|12176->8340|12266->8401|12296->8402|12339->8416|12369->8417|12419->8438|12586->8576|12616->8577|12660->8592|12816->8720|12832->8726|12883->8755|13036->8877
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|62->30|62->30|63->31|65->33|65->33|66->34|67->35|67->35|68->36|69->37|69->37|69->37|69->37|70->38|72->40|72->40|73->41|75->43|75->43|75->43|88->56|88->56|89->57|91->59|91->59|92->60|93->61|93->61|94->62|95->63|95->63|95->63|95->63|96->64|98->66|98->66|99->67|101->69|101->69|101->69|119->87|119->87|120->88|122->90|122->90|123->91|124->92|124->92|125->93|126->94|126->94|126->94|126->94|127->95|129->97|129->97|130->98|132->100|132->100|132->100|146->114|146->114|147->115|149->117|149->117|150->118|151->119|151->119|152->120|153->121|153->121|153->121|153->121|154->122|156->124|156->124|157->125|159->127|159->127|159->127|173->141|173->141|174->142|176->144|176->144|177->145|178->146|178->146|179->147|180->148|180->148|180->148|180->148|181->149|183->151|183->151|184->152|186->154|186->154|186->154|194->162
                  -- GENERATED --
              */
          