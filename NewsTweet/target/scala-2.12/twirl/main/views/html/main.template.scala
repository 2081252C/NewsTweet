
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
        <link href=""""),_display_(/*14.22*/routes/*14.28*/.Assets.versioned("stylesheets/NiceAdmin/css/main.css")),format.raw/*14.83*/("""" rel="stylesheet"/>
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
                          <li><a href=""""),_display_(/*73.41*/controllers/*73.52*/.routes.TwitterSignInServlet.logOut()),format.raw/*73.89*/(""""> Logout</a></li>
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
                  """),format.raw/*96.19*/("""<li class="sidebar-brand"><i>Here is a sample interest - sign in to create your own!</i></li>
                """)))}),format.raw/*97.18*/("""
                """),_display_(/*98.18*/if(interests.isEmpty)/*98.39*/{_display_(Seq[Any](format.raw/*98.40*/("""
                    """),format.raw/*99.21*/("""<li class="sidebar-brand">Looks like you don't have any interests yet! <br> Track a search to add one.</li>
                """)))}/*100.18*/else/*100.22*/{_display_(Seq[Any](format.raw/*100.23*/("""
                    """),format.raw/*101.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*102.22*/for(persona <- personas) yield /*102.46*/{_display_(Seq[Any](format.raw/*102.47*/("""
                      """),_display_(/*103.24*/defining(persona.replaceAll(" ",""))/*103.60*/ { personaNoSpace=>_display_(Seq[Any](format.raw/*103.79*/("""
                      """),format.raw/*104.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" id="persona"""),_display_(/*105.93*/personaNoSpace),format.raw/*105.107*/("""" href="#"""),_display_(/*105.117*/personaNoSpace),format.raw/*105.131*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b><i class="icon_folder"></i> """),_display_(/*106.69*/persona),format.raw/*106.76*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*108.35*/personaNoSpace),format.raw/*108.49*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*108.102*/personaNoSpace),format.raw/*108.116*/("""" data-parent="#exampleAccordion">
                        """)))}),format.raw/*109.26*/("""
                            """),_display_(/*110.30*/for(interest <- interests) yield /*110.56*/{_display_(Seq[Any](format.raw/*110.57*/("""
                                """),_display_(/*111.34*/if(interest contains persona)/*111.63*/{_display_(Seq[Any](format.raw/*111.64*/("""
                                    """),format.raw/*112.37*/("""<div class="sidebar-interest">
                                        """),_display_(/*113.42*/defining(interest.replace(" - "+persona,""))/*113.86*/ { n=>_display_(Seq[Any](format.raw/*113.92*/("""
                                        """),format.raw/*114.41*/("""<li><a href=""""),_display_(/*114.55*/routes/*114.61*/.InterestController.showInterest(persona, n)),format.raw/*114.105*/("""" id=""""),_display_(/*114.112*/n),format.raw/*114.113*/(""""><i class="icon_document_alt"></i> """),_display_(/*114.150*/n),format.raw/*114.151*/("""</a></li>
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
                  DATE: Thu Mar 22 19:57:26 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: d51d0ac5b8afecf96856e59245da6f049e2a5bf6
                  MATRIX: 651->1|692->37|1077->55|1320->202|1348->204|1435->264|1461->269|1675->456|1690->462|1766->517|1863->587|1878->593|1955->649|2056->723|2071->729|2158->795|2509->1119|2524->1125|2615->1195|2685->1238|2700->1244|2788->1311|2858->1354|2873->1360|2961->1427|3066->1505|3081->1511|3144->1552|3314->1695|3329->1701|3390->1740|4055->2378|4066->2380|4141->2446|4180->2447|4234->2474|4245->2476|4400->2610|4454->2637|4465->2639|4713->2866|4767->2889|4814->2908|5160->3227|5180->3238|5219->3239|5270->3262|5438->3402|5463->3405|5493->3406|5696->3582|5723->3588|5804->3642|5824->3653|5882->3690|5967->3756|5980->3760|6019->3761|6071->3785|6108->3795|6128->3806|6197->3854|6256->3885|6272->3891|6338->3935|6422->3988|6486->4024|7007->4518|7027->4529|7066->4530|7113->4549|7255->4660|7300->4678|7330->4699|7369->4700|7418->4721|7563->4846|7577->4850|7617->4851|7667->4872|7766->4943|7807->4967|7847->4968|7899->4992|7945->5028|8003->5047|8055->5070|8194->5181|8231->5195|8270->5205|8307->5219|8456->5340|8485->5347|8595->5429|8631->5443|8713->5496|8750->5510|8842->5570|8900->5600|8943->5626|8983->5627|9045->5661|9084->5690|9124->5691|9190->5728|9290->5800|9344->5844|9389->5850|9459->5891|9501->5905|9517->5911|9584->5955|9620->5962|9644->5963|9710->6000|9734->6001|9817->6052|9924->6130|9996->6170|10058->6200|10112->6225|10209->6290|10259->6311|10319->6339|10361->6352|10608->6571|10637->6578|10687->6599|11075->6958|11105->6959|11151->6976|11266->7062|11296->7063|11367->7106|11383->7112|11445->7152|11531->7210|11547->7216|11611->7258|11696->7315|11712->7321|11793->7380|11878->7437|11894->7443|11968->7495|12053->7552|12069->7558|12144->7611
                  LINES: 24->1|25->3|30->5|35->5|37->7|40->10|40->10|44->14|44->14|44->14|46->16|46->16|46->16|48->18|48->18|48->18|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|57->27|57->27|57->27|76->46|76->46|76->46|76->46|78->48|78->48|80->50|82->52|82->52|85->55|86->56|87->57|98->68|98->68|98->68|99->69|99->69|99->69|99->69|102->72|102->72|103->73|103->73|103->73|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|106->76|106->76|107->77|109->79|125->95|125->95|125->95|126->96|127->97|128->98|128->98|128->98|129->99|130->100|130->100|130->100|131->101|132->102|132->102|132->102|133->103|133->103|133->103|134->104|135->105|135->105|135->105|135->105|136->106|136->106|138->108|138->108|138->108|138->108|139->109|140->110|140->110|140->110|141->111|141->111|141->111|142->112|143->113|143->113|143->113|144->114|144->114|144->114|144->114|144->114|144->114|144->114|144->114|145->115|147->117|148->118|149->119|150->120|152->122|153->123|154->124|155->125|162->132|162->132|163->133|173->143|173->143|174->144|176->146|176->146|178->148|178->148|178->148|179->149|179->149|179->149|180->150|180->150|180->150|181->151|181->151|181->151|182->152|182->152|182->152
                  -- GENERATED --
              */
          