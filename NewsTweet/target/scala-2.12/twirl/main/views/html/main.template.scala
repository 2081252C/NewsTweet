
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
                            <h3><b>Interests</b></h3><hr>
                    </li>
              """),_display_(/*80.16*/if(bool==1)/*80.27*/{_display_(Seq[Any](format.raw/*80.28*/("""
                """),_display_(/*81.18*/if(interests.isEmpty)/*81.39*/{_display_(Seq[Any](format.raw/*81.40*/("""
                    """),format.raw/*82.21*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                """)))}/*83.18*/else/*83.22*/{_display_(Seq[Any](format.raw/*83.23*/("""
                    """),format.raw/*84.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*85.22*/for(persona <- personas) yield /*85.46*/{_display_(Seq[Any](format.raw/*85.47*/("""
                      """),format.raw/*86.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" href="#"""),_display_(/*87.89*/persona),format.raw/*87.96*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b>"""),_display_(/*88.41*/persona),format.raw/*88.48*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*90.35*/persona),format.raw/*90.42*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*90.95*/persona),format.raw/*90.102*/("""" data-parent="#exampleAccordion">
                            """),_display_(/*91.30*/for(interest <- interests) yield /*91.56*/{_display_(Seq[Any](format.raw/*91.57*/("""
                                """),_display_(/*92.34*/if(interest contains persona)/*92.63*/{_display_(Seq[Any](format.raw/*92.64*/("""
                                    """),format.raw/*93.37*/("""<div class="sidebar-interest">
                                        <li><a href=""""),_display_(/*94.55*/routes/*94.61*/.InterestController.showInterest),format.raw/*94.93*/("""">"""),_display_(/*94.96*/interest/*94.104*/.replace(persona,"")),format.raw/*94.124*/("""</a></li>
                                    </div>
                                """)))}),format.raw/*96.34*/("""
                            """)))}),format.raw/*97.30*/("""
                        """),format.raw/*98.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*100.26*/("""
                    """),format.raw/*101.21*/("""</div>
                    """)))}),format.raw/*102.22*/("""
                """),format.raw/*103.17*/("""<!-- Button trigger modal -->
                <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                  Add Interest
                </button>
                """)))}/*107.18*/else/*107.22*/{_display_(Seq[Any](format.raw/*107.23*/(""" 
                    """),format.raw/*108.21*/("""Here are some sample interests. Sign in to create your own!
                """)))}),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""</ul>
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
                                    """),_display_(/*130.38*/b4/*130.40*/.horizontal.form(action=routes.InterestController.addInterest(), "col-md-2", "col-md-10")/*130.129*/{ implicit ifc =>_display_(Seq[Any](format.raw/*130.146*/("""

                                        """),_display_(/*132.42*/b4/*132.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*135.56*/("""

                                        """),_display_(/*137.42*/b4/*137.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*141.42*/("""

                                        """),format.raw/*143.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*151.30*/("""
                              """),format.raw/*152.31*/("""</div>
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
                                    """),_display_(/*169.38*/b4/*169.40*/.horizontal.form(action=routes.PersonaController.addPersona(), "col-md-2", "col-md-10")/*169.127*/{ implicit ifc =>_display_(Seq[Any](format.raw/*169.144*/("""

                                            """),_display_(/*171.46*/b4/*171.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*174.60*/("""

                                    
                                    """),format.raw/*177.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*182.30*/("""
                              """),format.raw/*183.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        """),_display_(/*187.26*/content),format.raw/*187.33*/("""
                    """),format.raw/*188.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*196.49*/("""{"""),format.raw/*196.50*/("""
                """),format.raw/*197.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*199.13*/("""}"""),format.raw/*199.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*203.23*/routes/*203.29*/.Assets.versioned("javascripts/main.js")),format.raw/*203.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*204.24*/routes/*204.30*/.Assets.versioned("javascripts/render.js")),format.raw/*204.72*/("""" type="text/javascript"></script>
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
                  DATE: Mon Dec 18 16:31:22 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 48807327e2f62194df86e1fc94e700e7650bfbc6
                  MATRIX: 651->261|1085->297|1387->502|1416->504|1503->564|1529->569|1968->981|1983->987|2046->1028|2219->1174|2234->1180|2295->1219|3069->1966|3080->1968|3142->2021|3181->2022|3239->2053|3250->2055|3413->2197|3471->2228|3482->2230|3689->2416|3747->2443|3792->2460|3976->2617|3996->2628|4035->2629|4088->2654|4256->2794|4281->2797|4354->2851|4367->2855|4406->2856|4460->2882|4524->2919|4539->2925|4605->2969|4691->3024|4736->3041|4854->3132|4881->3138|5181->3411|5196->3417|5253->3453|5643->3816|5663->3827|5702->3828|5747->3846|5777->3867|5816->3868|5865->3889|5989->3994|6002->3998|6041->3999|6090->4020|6188->4091|6228->4115|6267->4116|6318->4139|6452->4246|6480->4253|6600->4346|6628->4353|6737->4435|6765->4442|6845->4495|6874->4502|6965->4566|7007->4592|7046->4593|7107->4627|7145->4656|7184->4657|7249->4694|7361->4779|7376->4785|7429->4817|7459->4820|7477->4828|7519->4848|7636->4934|7697->4964|7750->4989|7847->5054|7897->5075|7957->5103|8003->5120|8256->5353|8270->5357|8310->5358|8361->5380|8470->5457|8512->5470|9617->6547|9629->6549|9729->6638|9786->6655|9857->6698|9869->6700|10122->6931|10193->6974|10205->6976|10482->7231|10553->7273|11199->7887|11259->7918|12276->8907|12288->8909|12386->8996|12443->9013|12518->9060|12530->9062|12792->9302|12896->9377|13274->9723|13334->9754|13493->9885|13522->9892|13572->9913|13921->10233|13951->10234|13997->10251|14112->10337|14142->10338|14642->10810|14658->10816|14720->10856|14806->10914|14822->10920|14886->10962
                  LINES: 24->8|29->10|34->10|36->12|39->15|39->15|43->19|43->19|43->19|45->21|45->21|45->21|60->36|60->36|60->36|60->36|62->38|62->38|64->40|66->42|66->42|68->44|69->45|70->46|75->51|75->51|75->51|76->52|76->52|76->52|77->53|77->53|77->53|78->54|78->54|78->54|78->54|79->55|80->56|82->58|82->58|92->68|92->68|92->68|104->80|104->80|104->80|105->81|105->81|105->81|106->82|107->83|107->83|107->83|108->84|109->85|109->85|109->85|110->86|111->87|111->87|112->88|112->88|114->90|114->90|114->90|114->90|115->91|115->91|115->91|116->92|116->92|116->92|117->93|118->94|118->94|118->94|118->94|118->94|118->94|120->96|121->97|122->98|124->100|125->101|126->102|127->103|131->107|131->107|131->107|132->108|133->109|134->110|154->130|154->130|154->130|154->130|156->132|156->132|159->135|161->137|161->137|165->141|167->143|175->151|176->152|193->169|193->169|193->169|193->169|195->171|195->171|198->174|201->177|206->182|207->183|211->187|211->187|212->188|220->196|220->196|221->197|223->199|223->199|227->203|227->203|227->203|228->204|228->204|228->204
                  -- GENERATED --
              */
          