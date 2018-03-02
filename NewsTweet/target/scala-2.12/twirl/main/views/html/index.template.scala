
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Search],String,Integer,String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, img: String, personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),format.raw/*3.1*/("""<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("javascripts/render.js")),format.raw/*3.63*/(""""; type="text/javascript"></script>

"""),_display_(/*5.2*/main("NewsTweet")/*5.19*/(searchForm)/*5.31*/(user)/*5.37*/(bool)/*5.43*/(img)/*5.48*/(personas)/*5.58*/(interests)/*5.69*/ {_display_(Seq[Any](format.raw/*5.71*/("""
  """),format.raw/*6.3*/("""<div id="categories">
    <div id="category-container">
      <div class="row" id="top-categories">
        
        <div class="col-sm-4">
          <div class="card card-inverse" style="background-color: #333; border-color: #333; width: 20rem; height: 100%">
            <div class="card-body" id="intro-card">
              <h4 class="card-title" id="category-title">Welcome to <a class="small">News<span class="lite">Tweet</span></a></h4>
              <h6 class="card-subtitle mb-2 text-muted" id="orange">Track topics on <span class="lite">Twitter</span></h6>
                <p class="card-text" id="category-text">
              """),_display_(/*16.16*/if(bool==1)/*16.27*/{_display_(Seq[Any](format.raw/*16.28*/("""
                """),format.raw/*17.17*/("""<a class="smaller">News<span class="lite">Tweet</span></a> allows you to track Twitter searches. Search above to get started!<br><br>
                Or, click on a category to see some recent tweets!</p>
              """)))}/*19.17*/else/*19.21*/{_display_(Seq[Any](format.raw/*19.22*/("""
                 """),format.raw/*20.18*/("""<a class="smaller">News<span class="lite">Tweet</span></a> allows you to search for tweets and save the results of multiple searches collectively as an interest. You can search tweets using the bar above, or log in with Twitter to start saving search results.
                 <br><br>
                 <a href=""""),_display_(/*22.28*/controllers/*22.39*/.routes.TwitterSignInServlet.signIn(request.uri)),format.raw/*22.87*/(""""><img id="login-card" src=""""),_display_(/*22.116*/routes/*22.122*/.Assets.versioned("images/twitterlogin.png")),format.raw/*22.166*/(""""> </a>
              """)))}),format.raw/*23.16*/("""
            """),format.raw/*24.13*/("""</div>
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

      <div class="row" id="bottom-categories">
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

  def render(searchForm:Form[Search],user:String,bool:Integer,img:String,personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,img,personas,interests)

  def f:((Form[Search],String,Integer,String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,img,personas,interests) => apply(searchForm,user,bool,img,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 02 15:53:28 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/index.scala.html
                  HASH: c6ab6f5f589978cd9e3c798f5f0473a64aec4c17
                  MATRIX: 1002->1|1215->118|1243->120|1283->134|1297->140|1359->182|1422->220|1447->237|1467->249|1481->255|1495->261|1508->266|1526->276|1545->287|1584->289|1613->292|2278->930|2298->941|2337->942|2382->959|2621->1180|2634->1184|2673->1185|2719->1203|3059->1516|3079->1527|3148->1575|3205->1604|3221->1610|3287->1654|3341->1677|3382->1690|4140->2420|4169->2421|4216->2440|4367->2563|4396->2564|4445->2585|4520->2632|4549->2633|4596->2652|4683->2711|4712->2712|4754->2726|4783->2727|4830->2746|4991->2879|5020->2880|5061->2893|5212->3017|5227->3023|5276->3051|6125->3872|6154->3873|6203->3894|6359->4022|6388->4023|6439->4046|6516->4095|6545->4096|6594->4117|6683->4178|6712->4179|6754->4193|6783->4194|6832->4215|6998->4353|7027->4354|7072->4371|7227->4499|7242->4505|7292->4534|8270->5484|8299->5485|8348->5506|8512->5642|8541->5643|8592->5666|8669->5715|8698->5716|8748->5737|8838->5798|8868->5799|8911->5813|8941->5814|8991->5835|9158->5973|9188->5974|9232->5989|9388->6117|9404->6123|9463->6160|10321->6989|10351->6990|10401->7011|10557->7138|10587->7139|10639->7162|10717->7211|10747->7212|10797->7233|10887->7294|10917->7295|10960->7309|10990->7310|11040->7331|11207->7469|11237->7470|11281->7485|11437->7613|11453->7619|11503->7647|12424->8539|12454->8540|12504->8561|12661->8689|12691->8690|12743->8713|12821->8762|12851->8763|12901->8784|12991->8845|13021->8846|13064->8860|13094->8861|13144->8882|13311->9020|13341->9021|13385->9036|13541->9164|13557->9170|13608->9199|13761->9321
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|48->16|48->16|48->16|49->17|51->19|51->19|51->19|52->20|54->22|54->22|54->22|54->22|54->22|54->22|55->23|56->24|69->37|69->37|70->38|72->40|72->40|73->41|74->42|74->42|75->43|76->44|76->44|76->44|76->44|77->45|79->47|79->47|80->48|82->50|82->50|82->50|95->63|95->63|96->64|98->66|98->66|99->67|100->68|100->68|101->69|102->70|102->70|102->70|102->70|103->71|105->73|105->73|106->74|108->76|108->76|108->76|126->94|126->94|127->95|129->97|129->97|130->98|131->99|131->99|132->100|133->101|133->101|133->101|133->101|134->102|136->104|136->104|137->105|139->107|139->107|139->107|153->121|153->121|154->122|156->124|156->124|157->125|158->126|158->126|159->127|160->128|160->128|160->128|160->128|161->129|163->131|163->131|164->132|166->134|166->134|166->134|180->148|180->148|181->149|183->151|183->151|184->152|185->153|185->153|186->154|187->155|187->155|187->155|187->155|188->156|190->158|190->158|191->159|193->161|193->161|193->161|201->169
                  -- GENERATED --
              */
          