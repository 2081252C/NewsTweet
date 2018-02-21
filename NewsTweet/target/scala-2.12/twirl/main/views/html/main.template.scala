
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
/*1.2*/import b4.inline.fieldConstructor
/*2.2*/import helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[String,Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(interestForm: Form[Interest])(personas: List[String])(interests: List[String])(i: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.218*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light fixed-top" style="background-color: #5e97f2; height:65px;">
          <div id="title">
                <a href="/"> <h1> NewsTweet </h1></a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>      
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item">
                <div id="search">
                        """),_display_(/*31.26*/b4/*31.28*/.form(action=helper.CSRF(routes.SearchController.searchResults()))/*31.94*/{_display_(Seq[Any](format.raw/*31.95*/("""

                            """),_display_(/*33.30*/b4/*33.32*/.text(searchForm("searchTerm"),
                                'placeholder -> "Search ...",
                                '_label -> null)),format.raw/*35.49*/("""

                            """),_display_(/*37.30*/b4/*37.32*/.radio(searchForm("searchType"), 
                                Seq("User" -> "User", "Hashtag" -> "Hashtag", "Content" -> "Content"), 
                                '_label -> null,
                                'value -> "Content")),format.raw/*40.53*/("""
                         """)))}),format.raw/*41.27*/("""
                """),format.raw/*42.17*/("""</div>
              </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown text-center">
                """),_display_(/*47.18*/if(bool==1)/*47.29*/{_display_(Seq[Any](format.raw/*47.30*/("""
                        """),format.raw/*48.25*/("""<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img id="user_pic" src="""),_display_(/*48.165*/img),format.raw/*48.168*/("""><span class="caret"></span></a>
                    """)))}/*49.22*/else/*49.26*/{_display_(Seq[Any](format.raw/*49.27*/(""" 
                        """),format.raw/*50.25*/("""<a href="/twitter/signin"><img id="login-button" src=""""),_display_(/*50.80*/routes/*50.86*/.Assets.versioned("images/twitterlogin.png")),format.raw/*50.130*/("""" width="120%" border="0px" > </a>
                    """)))}),format.raw/*51.22*/("""
                """),format.raw/*52.17*/("""</a>
              <ul class="dropdown-menu dropdown-menu-center">
                <li><i>"""),_display_(/*54.25*/(user)),format.raw/*54.31*/("""</i></li>
                <li><a href="/logout"> Logout</a></li>
              </ul>
            </li>
          </ul>
          </div>
        </nav>

        <div id="tabs">        
                <button class="persona" id="menu-toggle">
                    <img src=""""),_display_(/*64.32*/routes/*64.38*/.Assets.versioned("images/menu.png")),format.raw/*64.74*/("""" width="18px" border="0px"> </button>
        </div>


        <div id="wrapper" class="toggled">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <br>
                    <li class="sidebar-brand">
                            <h3><b>Interests</b></h3><hr>
                    </li>
              """),_display_(/*76.16*/if(bool==0)/*76.27*/{_display_(Seq[Any](format.raw/*76.28*/("""
                  """),format.raw/*77.19*/("""<p align=center><i>Here are some sample interests. Sign in to create your own!</i><br><hr></p>
                """)))}),format.raw/*78.18*/("""
                """),_display_(/*79.18*/if(interests.isEmpty)/*79.39*/{_display_(Seq[Any](format.raw/*79.40*/("""
                    """),format.raw/*80.21*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                """)))}/*81.18*/else/*81.22*/{_display_(Seq[Any](format.raw/*81.23*/("""
                    """),format.raw/*82.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*83.22*/for(persona <- personas) yield /*83.46*/{_display_(Seq[Any](format.raw/*83.47*/("""
                      """),_display_(/*84.24*/defining(persona.replaceAll(" ",""))/*84.60*/ { personaNoSpace=>_display_(Seq[Any](format.raw/*84.79*/("""
                      """),format.raw/*85.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" href="#"""),_display_(/*86.89*/personaNoSpace),format.raw/*86.103*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b>"""),_display_(/*87.41*/persona),format.raw/*87.48*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*89.35*/personaNoSpace),format.raw/*89.49*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*89.102*/personaNoSpace),format.raw/*89.116*/("""" data-parent="#exampleAccordion">
                        """)))}),format.raw/*90.26*/("""
                            """),_display_(/*91.30*/for(interest <- interests) yield /*91.56*/{_display_(Seq[Any](format.raw/*91.57*/("""
                                """),_display_(/*92.34*/if(interest contains persona)/*92.63*/{_display_(Seq[Any](format.raw/*92.64*/("""
                                    """),format.raw/*93.37*/("""<div class="sidebar-interest">
                                        """),_display_(/*94.42*/defining(interest.replace(" - "+persona,""))/*94.86*/ { n=>_display_(Seq[Any](format.raw/*94.92*/("""
                                        """),format.raw/*95.41*/("""<li><a href=""""),_display_(/*95.55*/routes/*95.61*/.InterestController.showInterest(persona, n)),format.raw/*95.105*/("""">"""),_display_(/*95.108*/n),format.raw/*95.109*/("""</a></li>
                                        """)))}),format.raw/*96.42*/("""
                                        
                                    """),format.raw/*98.37*/("""</div>
                                """)))}),format.raw/*99.34*/("""
                            """)))}),format.raw/*100.30*/("""
                        """),format.raw/*101.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*103.26*/("""
                    """),format.raw/*104.21*/("""</div>
                    """)))}),format.raw/*105.22*/("""
            """),format.raw/*106.13*/("""</ul>
            </div>
            <!-- /#sidebar-wrapper -->

            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <div id="content">
                        """),_display_(/*113.26*/content),format.raw/*113.33*/("""
                    """),format.raw/*114.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*122.49*/("""{"""),format.raw/*122.50*/("""
                """),format.raw/*123.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*129.23*/routes/*129.29*/.Assets.versioned("javascripts/main.js")),format.raw/*129.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*130.24*/routes/*130.30*/.Assets.versioned("javascripts/render.js")),format.raw/*130.72*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String],i:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(user)(bool)(personaForm)(img)(interestForm)(personas)(interests)(i)(content)

  def f:((String) => (Form[Search]) => (String) => (Integer) => (Form[Persona]) => (String) => (Form[Interest]) => (List[String]) => (List[String]) => (String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (user) => (bool) => (personaForm) => (img) => (interestForm) => (personas) => (interests) => (i) => (content) => apply(title)(searchForm)(user)(bool)(personaForm)(img)(interestForm)(personas)(interests)(i)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 21 21:14:48 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 1423d7e7ec35a4f1b65147c1b4bdd7f3d1001613
                  MATRIX: 651->1|692->36|1114->54|1426->270|1454->272|1540->332|1565->337|2093->838|2108->844|2171->885|2268->955|2283->961|2344->1000|3118->1747|3129->1749|3204->1815|3243->1816|3301->1847|3312->1849|3475->1991|3533->2022|3544->2024|3804->2263|3862->2290|3907->2307|4091->2464|4111->2475|4150->2476|4203->2501|4371->2641|4396->2644|4469->2698|4482->2702|4521->2703|4575->2729|4657->2784|4672->2790|4738->2834|4825->2890|4870->2907|4988->2998|5015->3004|5315->3277|5330->3283|5387->3319|5793->3698|5813->3709|5852->3710|5899->3729|6042->3841|6087->3859|6117->3880|6156->3881|6205->3902|6329->4007|6342->4011|6381->4012|6430->4033|6528->4104|6568->4128|6607->4129|6658->4153|6703->4189|6760->4208|6811->4231|6945->4338|6981->4352|7101->4445|7129->4452|7238->4534|7273->4548|7354->4601|7390->4615|7481->4675|7538->4705|7580->4731|7619->4732|7680->4766|7718->4795|7757->4796|7822->4833|7921->4905|7974->4949|8018->4955|8087->4996|8128->5010|8143->5016|8209->5060|8240->5063|8263->5064|8345->5115|8451->5193|8522->5233|8584->5263|8638->5288|8735->5353|8785->5374|8845->5402|8887->5415|9134->5634|9163->5641|9213->5662|9562->5982|9592->5983|9638->6000|9753->6086|9783->6087|10283->6559|10299->6565|10361->6605|10447->6663|10463->6669|10527->6711
                  LINES: 24->1|25->2|30->4|35->4|37->6|40->9|40->9|45->14|45->14|45->14|47->16|47->16|47->16|62->31|62->31|62->31|62->31|64->33|64->33|66->35|68->37|68->37|71->40|72->41|73->42|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|83->52|85->54|85->54|95->64|95->64|95->64|107->76|107->76|107->76|108->77|109->78|110->79|110->79|110->79|111->80|112->81|112->81|112->81|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|117->86|117->86|118->87|118->87|120->89|120->89|120->89|120->89|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|127->96|129->98|130->99|131->100|132->101|134->103|135->104|136->105|137->106|144->113|144->113|145->114|153->122|153->122|154->123|156->125|156->125|160->129|160->129|160->129|161->130|161->130|161->130
                  -- GENERATED --
              */
          