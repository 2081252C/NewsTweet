
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
            <div class="card-body" id="intro-card">
              <h4 class="card-title" id="category-title">Welcome to NewsTweet</h4>
              <h6 class="card-subtitle mb-2 text-muted">An easy way to follow topics on Twitter.</h6>
                <p class="card-text" id="category-text">
              """),_display_(/*17.16*/if(bool==1)/*17.27*/{_display_(Seq[Any](format.raw/*17.28*/("""
                """),format.raw/*18.17*/("""NewsTweet allows you to track Twitter searches. Search above to get started!<br><br>
                Or, click on a category to see some recent tweets!</p>
              """)))}/*20.17*/else/*20.22*/{_display_(Seq[Any](format.raw/*20.23*/("""
                 """),format.raw/*21.18*/("""NewsTweet is a platform which allows you to search for tweets and save the results of multiple searches collectively as an interest. You can search tweets using the bar above, or log in with Twitter to create an Interest to start saving search results.
                 <br><br>
                 <a href="/twitter/signin"><img id="login-card" src=""""),_display_(/*23.71*/routes/*23.77*/.Assets.versioned("images/twitterlogin.png")),format.raw/*23.121*/(""""> </a><p>
              """)))}),format.raw/*24.16*/("""
            """),format.raw/*25.13*/("""</div>
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

              function carousel() """),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""
                  """),format.raw/*38.19*/("""var i;
                  var x = document.getElementsByClassName("news");
                  for (i = 0; i < x.length; i++) """),format.raw/*40.50*/("""{"""),format.raw/*40.51*/("""
                    """),format.raw/*41.21*/("""x[i].style.display = "none";
                  """),format.raw/*42.19*/("""}"""),format.raw/*42.20*/("""
                  """),format.raw/*43.19*/("""slideIndex++;
                  if (slideIndex > x.length) """),format.raw/*44.46*/("""{"""),format.raw/*44.47*/("""slideIndex = 1"""),format.raw/*44.61*/("""}"""),format.raw/*44.62*/("""
                  """),format.raw/*45.19*/("""x[slideIndex-1].style.display = "block";
                  setTimeout(carousel, 2000); // Change image every 2 seconds
              """),format.raw/*47.15*/("""}"""),format.raw/*47.16*/("""
            """),format.raw/*48.13*/("""</script>
            <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                <a href=""""),_display_(/*50.27*/routes/*50.33*/.HomeController.newsCategory),format.raw/*50.61*/("""" id="category-btn">News</a>
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

                function carousel1() """),format.raw/*63.38*/("""{"""),format.raw/*63.39*/("""
                    """),format.raw/*64.21*/("""var i;
                    var x = document.getElementsByClassName("music");
                    for (i = 0; i < x.length; i++) """),format.raw/*66.52*/("""{"""),format.raw/*66.53*/("""
                      """),format.raw/*67.23*/("""x[i].style.display = "none";
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/("""
                    """),format.raw/*69.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*70.48*/("""{"""),format.raw/*70.49*/("""slideIndex = 1"""),format.raw/*70.63*/("""}"""),format.raw/*70.64*/("""
                    """),format.raw/*71.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel1, 2000); // Change image every 2 seconds
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""
                """),format.raw/*74.17*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*76.29*/routes/*76.35*/.HomeController.musicCategory),format.raw/*76.64*/("""" id="category-btn">Music</a>
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

                function carousel2() """),format.raw/*94.38*/("""{"""),format.raw/*94.39*/("""
                    """),format.raw/*95.21*/("""var i;
                    var x = document.getElementsByClassName("entertainment");
                    for (i = 0; i < x.length; i++) """),format.raw/*97.52*/("""{"""),format.raw/*97.53*/("""
                      """),format.raw/*98.23*/("""x[i].style.display = "none";
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/("""
                    """),format.raw/*100.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*101.48*/("""{"""),format.raw/*101.49*/("""slideIndex = 1"""),format.raw/*101.63*/("""}"""),format.raw/*101.64*/("""
                    """),format.raw/*102.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel2, 2000); // Change image every 2 seconds
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/("""
              """),format.raw/*105.15*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*107.29*/routes/*107.35*/.HomeController.entertainmentCategory),format.raw/*107.72*/("""" id="category-btn">Entertainment</a>
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

                function carousel3() """),format.raw/*121.38*/("""{"""),format.raw/*121.39*/("""
                    """),format.raw/*122.21*/("""var i;
                    var x = document.getElementsByClassName("tech");
                    for (i = 0; i < x.length; i++) """),format.raw/*124.52*/("""{"""),format.raw/*124.53*/("""
                      """),format.raw/*125.23*/("""x[i].style.display = "none";
                    """),format.raw/*126.21*/("""}"""),format.raw/*126.22*/("""
                    """),format.raw/*127.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*128.48*/("""{"""),format.raw/*128.49*/("""slideIndex = 1"""),format.raw/*128.63*/("""}"""),format.raw/*128.64*/("""
                    """),format.raw/*129.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel3, 2000); // Change image every 2 seconds
                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/("""
              """),format.raw/*132.15*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*134.29*/routes/*134.35*/.HomeController.techCategory),format.raw/*134.63*/("""" id="category-btn">Tech</a>
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

                function carousel4() """),format.raw/*148.38*/("""{"""),format.raw/*148.39*/("""
                    """),format.raw/*149.21*/("""var i;
                    var x = document.getElementsByClassName("sport");
                    for (i = 0; i < x.length; i++) """),format.raw/*151.52*/("""{"""),format.raw/*151.53*/("""
                      """),format.raw/*152.23*/("""x[i].style.display = "none";
                    """),format.raw/*153.21*/("""}"""),format.raw/*153.22*/("""
                    """),format.raw/*154.21*/("""slideIndex++;
                    if (slideIndex > x.length) """),format.raw/*155.48*/("""{"""),format.raw/*155.49*/("""slideIndex = 1"""),format.raw/*155.63*/("""}"""),format.raw/*155.64*/("""
                    """),format.raw/*156.21*/("""x[slideIndex-1].style.display = "block";
                    setTimeout(carousel4, 2000); // Change image every 2 seconds
                """),format.raw/*158.17*/("""}"""),format.raw/*158.18*/("""
              """),format.raw/*159.15*/("""</script>
              <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                  <a href=""""),_display_(/*161.29*/routes/*161.35*/.HomeController.sportCategory),format.raw/*161.64*/("""" id="category-btn">Sport</a>
              </div>
            </div>
        </div>
      </div>
    </div>
  </div>
  
""")))}),format.raw/*169.2*/("""

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
                  DATE: Sun Feb 04 18:47:21 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: 6ec739f81972da4b55e0443cd0217d04958d4197
                  MATRIX: 1038->1|1320->187|1348->189|1388->203|1402->209|1464->251|1571->332|1585->338|1646->379|1748->456|1773->473|1793->485|1807->491|1821->497|1842->510|1855->515|1877->529|1895->539|1914->550|1925->553|1965->555|1994->558|2600->1137|2620->1148|2659->1149|2704->1166|2894->1338|2907->1343|2946->1344|2992->1362|3368->1711|3383->1717|3449->1761|3506->1787|3547->1800|4300->2525|4329->2526|4376->2545|4527->2668|4556->2669|4605->2690|4680->2737|4709->2738|4756->2757|4843->2816|4872->2817|4914->2831|4943->2832|4990->2851|5151->2984|5180->2985|5221->2998|5372->3122|5387->3128|5436->3156|6285->3977|6314->3978|6363->3999|6519->4127|6548->4128|6599->4151|6676->4200|6705->4201|6754->4222|6843->4283|6872->4284|6914->4298|6943->4299|6992->4320|7158->4458|7187->4459|7232->4476|7387->4604|7402->4610|7452->4639|8426->5585|8455->5586|8504->5607|8668->5743|8697->5744|8748->5767|8825->5816|8854->5817|8904->5838|8994->5899|9024->5900|9067->5914|9097->5915|9147->5936|9314->6074|9344->6075|9388->6090|9544->6218|9560->6224|9619->6261|10477->7090|10507->7091|10557->7112|10713->7239|10743->7240|10795->7263|10873->7312|10903->7313|10953->7334|11043->7395|11073->7396|11116->7410|11146->7411|11196->7432|11363->7570|11393->7571|11437->7586|11593->7714|11609->7720|11659->7748|12580->8640|12610->8641|12660->8662|12817->8790|12847->8791|12899->8814|12977->8863|13007->8864|13057->8885|13147->8946|13177->8947|13220->8961|13250->8962|13300->8983|13467->9121|13497->9122|13541->9137|13697->9265|13713->9271|13764->9300|13917->9422
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|49->17|49->17|49->17|50->18|52->20|52->20|52->20|53->21|55->23|55->23|55->23|56->24|57->25|69->37|69->37|70->38|72->40|72->40|73->41|74->42|74->42|75->43|76->44|76->44|76->44|76->44|77->45|79->47|79->47|80->48|82->50|82->50|82->50|95->63|95->63|96->64|98->66|98->66|99->67|100->68|100->68|101->69|102->70|102->70|102->70|102->70|103->71|105->73|105->73|106->74|108->76|108->76|108->76|126->94|126->94|127->95|129->97|129->97|130->98|131->99|131->99|132->100|133->101|133->101|133->101|133->101|134->102|136->104|136->104|137->105|139->107|139->107|139->107|153->121|153->121|154->122|156->124|156->124|157->125|158->126|158->126|159->127|160->128|160->128|160->128|160->128|161->129|163->131|163->131|164->132|166->134|166->134|166->134|180->148|180->148|181->149|183->151|183->151|184->152|185->153|185->153|186->154|187->155|187->155|187->155|187->155|188->156|190->158|190->158|191->159|193->161|193->161|193->161|201->169
                  -- GENERATED --
              */
          