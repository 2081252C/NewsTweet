
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
/*8.2*/import b4.inline.fieldConstructor

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[String,Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(interestForm: Form[Interest])(personas: List[String])(interests: List[String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.207*/("""

"""),format.raw/*12.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*19.101*/("""">
        <!--link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"-->
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*21.59*/routes/*21.65*/.Assets.versioned("images/favicon.png")),format.raw/*21.104*/("""">
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
                        """),_display_(/*36.26*/b4/*36.28*/.form(action=routes.SearchController.searchResults())/*36.81*/{_display_(Seq[Any](format.raw/*36.82*/("""

                            """),_display_(/*38.30*/b4/*38.32*/.text(searchForm("searchTerm"),
                                'placeholder -> "Search ...",
                                '_label -> null)),format.raw/*40.49*/("""

                            """),_display_(/*42.30*/b4/*42.32*/.radio(searchForm("searchType"), 
                                Seq("User" -> "User", "Hashtag" -> "Hashtag", "Content" -> "Content"), 
                                '_label -> null)),format.raw/*44.49*/("""
                         """)))}),format.raw/*45.27*/("""
                """),format.raw/*46.17*/("""</div>
              </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown text-center">
                """),_display_(/*51.18*/if(bool==1)/*51.29*/{_display_(Seq[Any](format.raw/*51.30*/("""
                        """),format.raw/*52.25*/("""<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img id="user_pic" src="""),_display_(/*52.165*/img),format.raw/*52.168*/("""><span class="caret"></span></a>
                    """)))}/*53.22*/else/*53.26*/{_display_(Seq[Any](format.raw/*53.27*/(""" 
                        """),format.raw/*54.25*/("""<a href="/twitter/signin"><img src=""""),_display_(/*54.62*/routes/*54.68*/.Assets.versioned("images/twitterlogin.png")),format.raw/*54.112*/("""" width="60%" border="0px" > </a>
                    """)))}),format.raw/*55.22*/("""
                """),format.raw/*56.17*/("""</a>
              <ul class="dropdown-menu dropdown-menu-center">
                <li><i>"""),_display_(/*58.25*/(user)),format.raw/*58.31*/("""</i></li>
                <li><a href="/logout"> Logout</a></li>
              </ul>
            </li>
          </ul>
          </div>
        </nav>

        <div id="tabs">        
                <button class="persona" id="menu-toggle">
                    <img src=""""),_display_(/*68.32*/routes/*68.38*/.Assets.versioned("images/menu.png")),format.raw/*68.74*/("""" width="18px" border="0px"> </button>
        </div>


        <div id="wrapper">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <br>
                    <li class="sidebar-brand">
                        <a href="#">
                            <h3><b>Interests</b></h3><hr>
                        </a>
                    </li>
              """),_display_(/*82.16*/if(bool==1)/*82.27*/{_display_(Seq[Any](format.raw/*82.28*/("""
                """),_display_(/*83.18*/if(interests.isEmpty)/*83.39*/{_display_(Seq[Any](format.raw/*83.40*/("""
                    """),format.raw/*84.21*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                """)))}/*85.18*/else/*85.22*/{_display_(Seq[Any](format.raw/*85.23*/("""
                    """),format.raw/*86.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*87.22*/for(persona <- personas) yield /*87.46*/{_display_(Seq[Any](format.raw/*87.47*/("""
                      """),format.raw/*88.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" href="#"""),_display_(/*89.89*/persona),format.raw/*89.96*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b>"""),_display_(/*90.41*/persona),format.raw/*90.48*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*92.35*/persona),format.raw/*92.42*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*92.95*/persona),format.raw/*92.102*/("""" data-parent="#exampleAccordion">
                            """),_display_(/*93.30*/for(interest <- interests) yield /*93.56*/{_display_(Seq[Any](format.raw/*93.57*/("""
                                """),_display_(/*94.34*/if(interest contains persona)/*94.63*/{_display_(Seq[Any](format.raw/*94.64*/("""
                                    """),format.raw/*95.37*/("""<div class="sidebar-interest">
                                        <li><a href=""""),_display_(/*96.55*/routes/*96.61*/.InterestController.showInterest),format.raw/*96.93*/("""">"""),_display_(/*96.96*/interest/*96.104*/.replace(persona,"")),format.raw/*96.124*/("""</a></li>
                                    </div>
                                """)))}),format.raw/*98.34*/("""
                            """)))}),format.raw/*99.30*/("""
                        """),format.raw/*100.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*102.26*/("""
                    """),format.raw/*103.21*/("""</div>
                    """)))}),format.raw/*104.22*/("""
                """),format.raw/*105.17*/("""<!-- Button trigger modal -->
                <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                  Add Interest
                </button>
                """)))}/*109.18*/else/*109.22*/{_display_(Seq[Any](format.raw/*109.23*/(""" 
                    """),format.raw/*110.21*/("""Here are some sample interests. Sign in to create your own!
                """)))}),format.raw/*111.18*/("""
            """),format.raw/*112.13*/("""</ul>
            </div>
            <!-- /#sidebar-wrapper -->

            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <div id="content">

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Add a New Interest</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*132.38*/b4/*132.40*/.horizontal.form(action=routes.InterestController.addInterest(), "col-md-2", "col-md-10")/*132.129*/{ implicit ifc =>_display_(Seq[Any](format.raw/*132.146*/("""

                                        """),_display_(/*134.42*/b4/*134.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*137.56*/("""

                                        """),_display_(/*139.42*/b4/*139.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*143.42*/("""

                                        """),format.raw/*145.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*153.30*/("""
                              """),format.raw/*154.31*/("""</div>
                            </div>
                          </div>
                        </div>

                        <!-- Modal -->
                        <div class="modal fade" id="persona_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Add a New Persona</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*171.38*/b4/*171.40*/.horizontal.form(action=routes.PersonaController.addPersona(), "col-md-2", "col-md-10")/*171.127*/{ implicit ifc =>_display_(Seq[Any](format.raw/*171.144*/("""

                                            """),_display_(/*173.46*/b4/*173.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*176.60*/("""

                                    
                                    """),format.raw/*179.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*184.30*/("""
                              """),format.raw/*185.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        """),_display_(/*189.26*/content),format.raw/*189.33*/("""
                    """),format.raw/*190.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*198.49*/("""{"""),format.raw/*198.50*/("""
                """),format.raw/*199.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*201.13*/("""}"""),format.raw/*201.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*205.23*/routes/*205.29*/.Assets.versioned("javascripts/main.js")),format.raw/*205.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*206.24*/routes/*206.30*/.Assets.versioned("javascripts/render.js")),format.raw/*206.72*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(user)(bool)(personaForm)(img)(interestForm)(personas)(interests)(content)

  def f:((String) => (Form[Search]) => (String) => (Integer) => (Form[Persona]) => (String) => (Form[Interest]) => (List[String]) => (List[String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (user) => (bool) => (personaForm) => (img) => (interestForm) => (personas) => (interests) => (content) => apply(title)(searchForm)(user)(bool)(personaForm)(img)(interestForm)(personas)(interests)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 17 03:36:15 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: fdb30585583052dacaed3a03f803b371971b8b9f
                  MATRIX: 651->261|1085->297|1387->502|1416->504|1503->564|1529->569|1968->981|1983->987|2046->1028|2219->1174|2234->1180|2295->1219|3069->1966|3080->1968|3142->2021|3181->2022|3239->2053|3250->2055|3413->2197|3471->2228|3482->2230|3689->2416|3747->2443|3792->2460|3976->2617|3996->2628|4035->2629|4088->2654|4256->2794|4281->2797|4354->2851|4367->2855|4406->2856|4460->2882|4524->2919|4539->2925|4605->2969|4691->3024|4736->3041|4854->3132|4881->3138|5181->3411|5196->3417|5253->3453|5709->3882|5729->3893|5768->3894|5813->3912|5843->3933|5882->3934|5931->3955|6055->4060|6068->4064|6107->4065|6156->4086|6254->4157|6294->4181|6333->4182|6384->4205|6518->4312|6546->4319|6666->4412|6694->4419|6803->4501|6831->4508|6911->4561|6940->4568|7031->4632|7073->4658|7112->4659|7173->4693|7211->4722|7250->4723|7315->4760|7427->4845|7442->4851|7495->4883|7525->4886|7543->4894|7585->4914|7702->5000|7763->5030|7817->5055|7914->5120|7964->5141|8024->5169|8070->5186|8323->5419|8337->5423|8377->5424|8428->5446|8537->5523|8579->5536|9684->6613|9696->6615|9796->6704|9853->6721|9924->6764|9936->6766|10189->6997|10260->7040|10272->7042|10549->7297|10620->7339|11266->7953|11326->7984|12343->8973|12355->8975|12453->9062|12510->9079|12585->9126|12597->9128|12859->9368|12963->9443|13341->9789|13401->9820|13560->9951|13589->9958|13639->9979|13988->10299|14018->10300|14064->10317|14179->10403|14209->10404|14709->10876|14725->10882|14787->10922|14873->10980|14889->10986|14953->11028
                  LINES: 24->8|29->10|34->10|36->12|39->15|39->15|43->19|43->19|43->19|45->21|45->21|45->21|60->36|60->36|60->36|60->36|62->38|62->38|64->40|66->42|66->42|68->44|69->45|70->46|75->51|75->51|75->51|76->52|76->52|76->52|77->53|77->53|77->53|78->54|78->54|78->54|78->54|79->55|80->56|82->58|82->58|92->68|92->68|92->68|106->82|106->82|106->82|107->83|107->83|107->83|108->84|109->85|109->85|109->85|110->86|111->87|111->87|111->87|112->88|113->89|113->89|114->90|114->90|116->92|116->92|116->92|116->92|117->93|117->93|117->93|118->94|118->94|118->94|119->95|120->96|120->96|120->96|120->96|120->96|120->96|122->98|123->99|124->100|126->102|127->103|128->104|129->105|133->109|133->109|133->109|134->110|135->111|136->112|156->132|156->132|156->132|156->132|158->134|158->134|161->137|163->139|163->139|167->143|169->145|177->153|178->154|195->171|195->171|195->171|195->171|197->173|197->173|200->176|203->179|208->184|209->185|213->189|213->189|214->190|222->198|222->198|223->199|225->201|225->201|229->205|229->205|229->205|230->206|230->206|230->206
                  -- GENERATED --
              */
          