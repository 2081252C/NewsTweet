
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
/*3.2*/import helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,Form[Search],String,Integer,String,List[String],List[String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(img: String)(personas: List[String])(interests: List[String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.149*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Custom styles -->
        <link href=""""),_display_(/*14.22*/routes/*14.28*/.Assets.versioned("stylesheets/NiceAdmin/css/bootstrap.min.css")),format.raw/*14.92*/("""" rel="stylesheet"/>
        <!--external css-->
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("stylesheets/NiceAdmin/css/style.css")),format.raw/*16.84*/("""" rel="stylesheet">
        <!-- bootstrap theme -->
        <link href=""""),_display_(/*18.22*/routes/*18.28*/.Assets.versioned("stylesheets/NiceAdmin/css/bootstrap-theme.css")),format.raw/*18.94*/("""" rel="stylesheet"/>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <!-- font icon -->
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.versioned("stylesheets/NiceAdmin/css/elegant-icons-style.css")),format.raw/*22.98*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*23.22*/routes/*23.28*/.Assets.versioned("stylesheets/NiceAdmin/css/font-awesome.min.css")),format.raw/*23.95*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*24.22*/routes/*24.28*/.Assets.versioned("stylesheets/NiceAdmin/css/style-responsive.css")),format.raw/*24.95*/("""" rel="stylesheet" />
        <!--link rel="stylesheet" media="screen" href=""""),_display_(/*25.57*/routes/*25.63*/.Assets.versioned("stylesheets/main.css")),format.raw/*25.104*/(""""-->
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*27.59*/routes/*27.65*/.Assets.versioned("images/favicon.png")),format.raw/*27.104*/("""">
    </head>
    <body>
      <section id="container" class="">
        <!--header start-->
          <header class="header dark-bg">
            <div class="toggle-nav nav">
              <div id="menu-toggle"><a href="#"><i class="icon_menu"></i></a></div>
            </div>

            <!--logo start-->
            <a href="/" class="logo nav"> News<span class="lite">Tweet</span> </a>
            <!--logo end-->

            <div class="nav search-row" id="top_menu">
              <!--  search form start -->
              <ul class="nav top-menu">
                <li>
                  <div id="search">
                    """),_display_(/*46.22*/b4/*46.24*/.form(action=helper.CSRF(routes.SearchController.searchResults()))/*46.90*/{_display_(Seq[Any](format.raw/*46.91*/("""

                        """),_display_(/*48.26*/b4/*48.28*/.text(searchForm("searchTerm"),
                            'placeholder -> "Search ...",
                            '_label -> null)),format.raw/*50.45*/("""

                        """),_display_(/*52.26*/b4/*52.28*/.radio(searchForm("searchType"), 
                            Seq("User" -> "User", "Hashtag" -> "Hashtag", "Content" -> "Content"), 
                            '_label -> null,
                            'value -> "Content")),format.raw/*55.49*/("""
                     """)))}),format.raw/*56.23*/("""
                  """),format.raw/*57.19*/("""</div>
                </li>
              </ul>
              <!--  search form end -->
            </div>

            <div class="top-nav notification-row">
              <ul class="nav pull-right top-menu">

                <!-- user login dropdown start-->
                <li class="dropdown">
                  """),_display_(/*68.20*/if(bool==1)/*68.31*/{_display_(Seq[Any](format.raw/*68.32*/("""
                      """),format.raw/*69.23*/("""<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img id="user-pic" src="""),_display_(/*69.163*/img),format.raw/*69.166*/(""" """),format.raw/*69.167*/("""class="nav"></a>
                      <ul class="dropdown-menu extended logout">
                        <div class="log-arrow-up"></div>
                          <li><a><i>"""),_display_(/*72.38*/(user)),format.raw/*72.44*/("""</i></a></li>
                          <li><a href="/logout"> Logout</a></li>
                      </ul>
                  """)))}/*75.20*/else/*75.24*/{_display_(Seq[Any](format.raw/*75.25*/(""" 
                      """),format.raw/*76.23*/("""<a href=""""),_display_(/*76.33*/controllers/*76.44*/.routes.TwitterSignInServlet.signIn(request.uri)),format.raw/*76.92*/(""""><img id="login-button" src=""""),_display_(/*76.123*/routes/*76.129*/.Assets.versioned("images/twitterlogin.png")),format.raw/*76.173*/("""" width="60%" border="0px" > </a>
                  """)))}),format.raw/*77.20*/("""
                  
                """),format.raw/*79.17*/("""</li>
                <!-- user login dropdown end -->
              </ul>
            </div>
          </header>
        <!--header end-->

        <!--sidebar start-->
        <div id="wrapper" class="toggled">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <br>
                    <li class="sidebar-brand">
                            <a class="small">Interests</a>
                    </li>
              """),_display_(/*95.16*/if(bool==0)/*95.27*/{_display_(Seq[Any](format.raw/*95.28*/("""
                  """),format.raw/*96.19*/("""<li class="sidebar-brand"><i>Here are some sample interests. Sign in to create your own!</i></li>
                """)))}),format.raw/*97.18*/("""
                """),_display_(/*98.18*/if(interests.isEmpty)/*98.39*/{_display_(Seq[Any](format.raw/*98.40*/("""
                    """),format.raw/*99.21*/("""<li class="sidebar-brand">Looks like you don't have any interests yet! <br> Track a search to add one.</li>
                """)))}/*100.18*/else/*100.22*/{_display_(Seq[Any](format.raw/*100.23*/("""
                    """),format.raw/*101.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*102.22*/for(persona <- personas) yield /*102.46*/{_display_(Seq[Any](format.raw/*102.47*/("""
                      """),_display_(/*103.24*/defining(persona.replaceAll(" ",""))/*103.60*/ { personaNoSpace=>_display_(Seq[Any](format.raw/*103.79*/("""
                      """),format.raw/*104.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" href="#"""),_display_(/*105.89*/personaNoSpace),format.raw/*105.103*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b><i class="icon_folder"></i> """),_display_(/*106.69*/persona),format.raw/*106.76*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*108.35*/personaNoSpace),format.raw/*108.49*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*108.102*/personaNoSpace),format.raw/*108.116*/("""" data-parent="#exampleAccordion">
                        """)))}),format.raw/*109.26*/("""
                            """),_display_(/*110.30*/for(interest <- interests) yield /*110.56*/{_display_(Seq[Any](format.raw/*110.57*/("""
                                """),_display_(/*111.34*/if(interest contains persona)/*111.63*/{_display_(Seq[Any](format.raw/*111.64*/("""
                                    """),format.raw/*112.37*/("""<div class="sidebar-interest">
                                        """),_display_(/*113.42*/defining(interest.replace(" - "+persona,""))/*113.86*/ { n=>_display_(Seq[Any](format.raw/*113.92*/("""
                                        """),format.raw/*114.41*/("""<li><a href=""""),_display_(/*114.55*/routes/*114.61*/.InterestController.showInterest(persona, n)),format.raw/*114.105*/(""""><i class="icon_document_alt"></i> """),_display_(/*114.142*/n),format.raw/*114.143*/("""</a></li>
                                        """)))}),format.raw/*115.42*/("""
                                        
                                    """),format.raw/*117.37*/("""</div>
                                """)))}),format.raw/*118.34*/("""
                            """)))}),format.raw/*119.30*/("""
                        """),format.raw/*120.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*122.26*/("""
                    """),format.raw/*123.21*/("""</div>
                    """)))}),format.raw/*124.22*/("""
            """),format.raw/*125.13*/("""</ul>
            </div>
            <!-- /#sidebar-wrapper -->

            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <div id="content">
                        """),_display_(/*132.26*/content),format.raw/*132.33*/("""
                    """),format.raw/*133.21*/("""</div>
                </div>
            </div>
          </div>
      </section>

        <!--/div-->

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*143.49*/("""{"""),format.raw/*143.50*/("""
                """),format.raw/*144.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/(""");
        </script>
        <script src=""""),_display_(/*148.23*/routes/*148.29*/.Assets.versioned("javascripts/main.js")),format.raw/*148.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*149.24*/routes/*149.30*/.Assets.versioned("javascripts/render.js")),format.raw/*149.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*150.23*/routes/*150.29*/.Assets.versioned("javascripts/NiceAdmin/bootstrap.min.js")),format.raw/*150.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*151.23*/routes/*151.29*/.Assets.versioned("javascripts/NiceAdmin/jquery.js")),format.raw/*151.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*152.23*/routes/*152.29*/.Assets.versioned("javascripts/NiceAdmin/scripts.js")),format.raw/*152.82*/("""" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],user:String,bool:Integer,img:String,personas:List[String],interests:List[String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(user)(bool)(img)(personas)(interests)(content)

  def f:((String) => (Form[Search]) => (String) => (Integer) => (String) => (List[String]) => (List[String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (user) => (bool) => (img) => (personas) => (interests) => (content) => apply(title)(searchForm)(user)(bool)(img)(personas)(interests)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 02 15:53:28 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 41d3facad30054cb04784b43ac2178858cad74d6
                  MATRIX: 651->1|692->37|1077->55|1320->202|1348->204|1435->264|1461->269|1675->456|1690->462|1775->526|1872->596|1887->602|1964->658|2065->732|2080->738|2167->804|2518->1128|2533->1134|2624->1204|2694->1247|2709->1253|2797->1320|2867->1363|2882->1369|2970->1436|3075->1514|3090->1520|3153->1561|3323->1704|3338->1710|3399->1749|4064->2387|4075->2389|4150->2455|4189->2456|4243->2483|4254->2485|4409->2619|4463->2646|4474->2648|4722->2875|4776->2898|4823->2917|5169->3236|5189->3247|5228->3248|5279->3271|5447->3411|5472->3414|5502->3415|5705->3591|5732->3597|5877->3723|5890->3727|5929->3728|5981->3752|6018->3762|6038->3773|6107->3821|6166->3852|6182->3858|6248->3902|6332->3955|6396->3991|6917->4485|6937->4496|6976->4497|7023->4516|7169->4631|7214->4649|7244->4670|7283->4671|7332->4692|7477->4817|7491->4821|7531->4822|7581->4843|7680->4914|7721->4938|7761->4939|7813->4963|7859->4999|7917->5018|7969->5041|8104->5148|8141->5162|8290->5283|8319->5290|8429->5372|8465->5386|8547->5439|8584->5453|8676->5513|8734->5543|8777->5569|8817->5570|8879->5604|8918->5633|8958->5634|9024->5671|9124->5743|9178->5787|9223->5793|9293->5834|9335->5848|9351->5854|9418->5898|9484->5935|9508->5936|9591->5987|9698->6065|9770->6105|9832->6135|9886->6160|9983->6225|10033->6246|10093->6274|10135->6287|10382->6506|10411->6513|10461->6534|10849->6893|10879->6894|10925->6911|11040->6997|11070->6998|11141->7041|11157->7047|11219->7087|11305->7145|11321->7151|11385->7193|11470->7250|11486->7256|11567->7315|11652->7372|11668->7378|11742->7430|11827->7487|11843->7493|11918->7546
                  LINES: 24->1|25->3|30->5|35->5|37->7|40->10|40->10|44->14|44->14|44->14|46->16|46->16|46->16|48->18|48->18|48->18|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|57->27|57->27|57->27|76->46|76->46|76->46|76->46|78->48|78->48|80->50|82->52|82->52|85->55|86->56|87->57|98->68|98->68|98->68|99->69|99->69|99->69|99->69|102->72|102->72|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|106->76|106->76|107->77|109->79|125->95|125->95|125->95|126->96|127->97|128->98|128->98|128->98|129->99|130->100|130->100|130->100|131->101|132->102|132->102|132->102|133->103|133->103|133->103|134->104|135->105|135->105|136->106|136->106|138->108|138->108|138->108|138->108|139->109|140->110|140->110|140->110|141->111|141->111|141->111|142->112|143->113|143->113|143->113|144->114|144->114|144->114|144->114|144->114|144->114|145->115|147->117|148->118|149->119|150->120|152->122|153->123|154->124|155->125|162->132|162->132|163->133|173->143|173->143|174->144|176->146|176->146|178->148|178->148|178->148|179->149|179->149|179->149|180->150|180->150|180->150|181->151|181->151|181->151|182->152|182->152|182->152
                  -- GENERATED --
              */
          