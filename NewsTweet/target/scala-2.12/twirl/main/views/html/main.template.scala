
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[String,Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(interestForm: Form[Interest])(personas: List[String])(interests: List[String])(i: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.218*/("""

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
                                        """),_display_(/*94.42*/defining(interest.replace(" "+persona,""))/*94.84*/ { n=>_display_(Seq[Any](format.raw/*94.90*/("""
                                        """),format.raw/*95.41*/("""<li><a href=""""),_display_(/*95.55*/routes/*95.61*/.InterestController.showInterest(n)),format.raw/*95.96*/("""">"""),_display_(/*95.99*/n),format.raw/*95.100*/("""</a></li>
                                        """)))}),format.raw/*96.42*/("""
                                        
                                    """),format.raw/*98.37*/("""</div>
                                """)))}),format.raw/*99.34*/("""
                            """)))}),format.raw/*100.30*/("""
                        """),format.raw/*101.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*103.26*/("""
                    """),format.raw/*104.21*/("""</div>
                    """)))}),format.raw/*105.22*/("""
                """),format.raw/*106.17*/("""<!-- Button trigger modal -->
                <button type="button" id="add_interest" class="btn btn-primary centred" data-toggle="modal" data-target="#exampleModal">
                  Add Interest
                </button>
                """)))}/*110.18*/else/*110.22*/{_display_(Seq[Any](format.raw/*110.23*/(""" 
                    """),format.raw/*111.21*/("""Here are some sample interests. Sign in to create your own!
                """)))}),format.raw/*112.18*/("""
            """),format.raw/*113.13*/("""</ul>
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
                                    """),_display_(/*133.38*/b4/*133.40*/.horizontal.form(action=routes.InterestController.addInterest(), "col-md-2", "col-md-10")/*133.129*/{ implicit ifc =>_display_(Seq[Any](format.raw/*133.146*/("""

                                        """),_display_(/*135.42*/b4/*135.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*138.56*/("""

                                        """),_display_(/*140.42*/b4/*140.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*144.42*/("""

                                        """),format.raw/*146.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*154.30*/("""
                              """),format.raw/*155.31*/("""</div>
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
                                    """),_display_(/*172.38*/b4/*172.40*/.horizontal.form(action=routes.PersonaController.addPersona(), "col-md-2", "col-md-10")/*172.127*/{ implicit ifc =>_display_(Seq[Any](format.raw/*172.144*/("""

                                            """),_display_(/*174.46*/b4/*174.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*177.60*/("""

                                    
                                    """),format.raw/*180.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*185.30*/("""
                              """),format.raw/*186.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        """),_display_(/*190.26*/content),format.raw/*190.33*/("""
                    """),format.raw/*191.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*199.49*/("""{"""),format.raw/*199.50*/("""
                """),format.raw/*200.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*202.13*/("""}"""),format.raw/*202.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*206.23*/routes/*206.29*/.Assets.versioned("javascripts/main.js")),format.raw/*206.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*207.24*/routes/*207.30*/.Assets.versioned("javascripts/render.js")),format.raw/*207.72*/("""" type="text/javascript"></script>
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
                  DATE: Mon Dec 18 22:49:49 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: d1cf2c8f210aa78e93d5b6cf5b1a2a52a0c95bd0
                  MATRIX: 651->261|1092->297|1405->513|1434->515|1521->575|1547->580|1986->992|2001->998|2064->1039|2237->1185|2252->1191|2313->1230|3087->1977|3098->1979|3160->2032|3199->2033|3257->2064|3268->2066|3431->2208|3489->2239|3500->2241|3707->2427|3765->2454|3810->2471|3994->2628|4014->2639|4053->2640|4106->2665|4274->2805|4299->2808|4372->2862|4385->2866|4424->2867|4478->2893|4542->2930|4557->2936|4623->2980|4709->3035|4754->3052|4872->3143|4899->3149|5199->3422|5214->3428|5271->3464|5661->3827|5681->3838|5720->3839|5765->3857|5795->3878|5834->3879|5883->3900|6007->4005|6020->4009|6059->4010|6108->4031|6206->4102|6246->4126|6285->4127|6336->4150|6470->4257|6498->4264|6618->4357|6646->4364|6755->4446|6783->4453|6863->4506|6892->4513|6983->4577|7025->4603|7064->4604|7125->4638|7163->4667|7202->4668|7267->4705|7366->4777|7417->4819|7461->4825|7530->4866|7571->4880|7586->4886|7642->4921|7672->4924|7695->4925|7777->4976|7883->5054|7954->5094|8016->5124|8070->5149|8167->5214|8217->5235|8277->5263|8323->5280|8584->5521|8598->5525|8638->5526|8689->5548|8798->5625|8840->5638|9945->6715|9957->6717|10057->6806|10114->6823|10185->6866|10197->6868|10450->7099|10521->7142|10533->7144|10810->7399|10881->7441|11527->8055|11587->8086|12604->9075|12616->9077|12714->9164|12771->9181|12846->9228|12858->9230|13120->9470|13224->9545|13602->9891|13662->9922|13821->10053|13850->10060|13900->10081|14249->10401|14279->10402|14325->10419|14440->10505|14470->10506|14970->10978|14986->10984|15048->11024|15134->11082|15150->11088|15214->11130
                  LINES: 24->8|29->10|34->10|36->12|39->15|39->15|43->19|43->19|43->19|45->21|45->21|45->21|60->36|60->36|60->36|60->36|62->38|62->38|64->40|66->42|66->42|68->44|69->45|70->46|75->51|75->51|75->51|76->52|76->52|76->52|77->53|77->53|77->53|78->54|78->54|78->54|78->54|79->55|80->56|82->58|82->58|92->68|92->68|92->68|104->80|104->80|104->80|105->81|105->81|105->81|106->82|107->83|107->83|107->83|108->84|109->85|109->85|109->85|110->86|111->87|111->87|112->88|112->88|114->90|114->90|114->90|114->90|115->91|115->91|115->91|116->92|116->92|116->92|117->93|118->94|118->94|118->94|119->95|119->95|119->95|119->95|119->95|119->95|120->96|122->98|123->99|124->100|125->101|127->103|128->104|129->105|130->106|134->110|134->110|134->110|135->111|136->112|137->113|157->133|157->133|157->133|157->133|159->135|159->135|162->138|164->140|164->140|168->144|170->146|178->154|179->155|196->172|196->172|196->172|196->172|198->174|198->174|201->177|204->180|209->185|210->186|214->190|214->190|215->191|223->199|223->199|224->200|226->202|226->202|230->206|230->206|230->206|231->207|231->207|231->207
                  -- GENERATED --
              */
          