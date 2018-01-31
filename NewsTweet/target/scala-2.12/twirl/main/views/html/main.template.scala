
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
/*9.2*/import helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[String,Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(interestForm: Form[Interest])(personas: List[String])(interests: List[String])(i: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.218*/("""

"""),format.raw/*13.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*20.101*/("""">
        <!--link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"-->
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
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
                        """),_display_(/*37.26*/b4/*37.28*/.form(action=helper.CSRF(routes.SearchController.searchResults()))/*37.94*/{_display_(Seq[Any](format.raw/*37.95*/("""

                            """),_display_(/*39.30*/b4/*39.32*/.text(searchForm("searchTerm"),
                                'placeholder -> "Search ...",
                                '_label -> null)),format.raw/*41.49*/("""

                            """),_display_(/*43.30*/b4/*43.32*/.radio(searchForm("searchType"), 
                                Seq("User" -> "User", "Hashtag" -> "Hashtag", "Content" -> "Content"), 
                                '_label -> null,
                                'value -> "Content")),format.raw/*46.53*/("""
                         """)))}),format.raw/*47.27*/("""
                """),format.raw/*48.17*/("""</div>
              </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown text-center">
                """),_display_(/*53.18*/if(bool==1)/*53.29*/{_display_(Seq[Any](format.raw/*53.30*/("""
                        """),format.raw/*54.25*/("""<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img id="user_pic" src="""),_display_(/*54.165*/img),format.raw/*54.168*/("""><span class="caret"></span></a>
                    """)))}/*55.22*/else/*55.26*/{_display_(Seq[Any](format.raw/*55.27*/(""" 
                        """),format.raw/*56.25*/("""<a href="/twitter/signin"><img id="login-button" src=""""),_display_(/*56.80*/routes/*56.86*/.Assets.versioned("images/twitterlogin.png")),format.raw/*56.130*/("""" width="120%" border="0px" > </a>
                    """)))}),format.raw/*57.22*/("""
                """),format.raw/*58.17*/("""</a>
              <ul class="dropdown-menu dropdown-menu-center">
                <li><i>"""),_display_(/*60.25*/(user)),format.raw/*60.31*/("""</i></li>
                <li><a href="/logout"> Logout</a></li>
              </ul>
            </li>
          </ul>
          </div>
        </nav>

        <div id="tabs">        
                <button class="persona" id="menu-toggle">
                    <img src=""""),_display_(/*70.32*/routes/*70.38*/.Assets.versioned("images/menu.png")),format.raw/*70.74*/("""" width="18px" border="0px"> </button>
        </div>


        <div id="wrapper" class="toggled">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <br>
                    <li class="sidebar-brand">
                            <h3><b>Interests</b></h3><hr>
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
                                        """),_display_(/*96.42*/defining(interest.replace(" - "+persona,""))/*96.86*/ { n=>_display_(Seq[Any](format.raw/*96.92*/("""
                                        """),format.raw/*97.41*/("""<li><a href=""""),_display_(/*97.55*/routes/*97.61*/.InterestController.showInterest(n)),format.raw/*97.96*/("""">"""),_display_(/*97.99*/n),format.raw/*97.100*/("""</a></li>
                                        """)))}),format.raw/*98.42*/("""
                                        
                                    """),format.raw/*100.37*/("""</div>
                                """)))}),format.raw/*101.34*/("""
                            """)))}),format.raw/*102.30*/("""
                        """),format.raw/*103.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*105.26*/("""
                    """),format.raw/*106.21*/("""</div>
                    """)))}),format.raw/*107.22*/("""
                """),format.raw/*108.17*/("""<!-- Button trigger modal -->
                <button type="button" id="add_interest" class="btn btn-primary centred" data-toggle="modal" data-target="#exampleModal">
                  Add Interest
                </button>
                """)))}/*112.18*/else/*112.22*/{_display_(Seq[Any](format.raw/*112.23*/(""" 
                    """),format.raw/*113.21*/("""Here are some sample interests. Sign in to create your own!
                """)))}),format.raw/*114.18*/("""
            """),format.raw/*115.13*/("""</ul>
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
                                    """),_display_(/*135.38*/b4/*135.40*/.horizontal.form(action=helper.CSRF(routes.InterestController.addInterest()), "col-md-2", "col-md-10")/*135.142*/{ implicit ifc =>_display_(Seq[Any](format.raw/*135.159*/("""

                                        """),_display_(/*137.42*/b4/*137.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*140.56*/("""

                                        """),_display_(/*142.42*/b4/*142.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*146.42*/("""

                                        """),format.raw/*148.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*156.30*/("""
                              """),format.raw/*157.31*/("""</div>
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
                                    """),_display_(/*174.38*/b4/*174.40*/.horizontal.form(action=helper.CSRF(routes.PersonaController.addPersona()), "col-md-2", "col-md-10")/*174.140*/{ implicit ifc =>_display_(Seq[Any](format.raw/*174.157*/("""

                                            """),_display_(/*176.46*/b4/*176.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*179.60*/("""

                                    
                                    """),format.raw/*182.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*187.30*/("""
                              """),format.raw/*188.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        """),_display_(/*192.26*/content),format.raw/*192.33*/("""
                    """),format.raw/*193.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*201.49*/("""{"""),format.raw/*201.50*/("""
                """),format.raw/*202.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*208.23*/routes/*208.29*/.Assets.versioned("javascripts/main.js")),format.raw/*208.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*209.24*/routes/*209.30*/.Assets.versioned("javascripts/render.js")),format.raw/*209.72*/("""" type="text/javascript"></script>
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
                  DATE: Mon Jan 29 18:25:47 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 8b8ba1d7360cacd112691cb37a58b277f709ad3f
                  MATRIX: 651->261|692->296|1115->314|1428->530|1457->532|1544->592|1570->597|2009->1009|2024->1015|2087->1056|2260->1202|2275->1208|2336->1247|3110->1994|3121->1996|3196->2062|3235->2063|3293->2094|3304->2096|3467->2238|3525->2269|3536->2271|3796->2510|3854->2537|3899->2554|4083->2711|4103->2722|4142->2723|4195->2748|4363->2888|4388->2891|4461->2945|4474->2949|4513->2950|4567->2976|4649->3031|4664->3037|4730->3081|4817->3137|4862->3154|4980->3245|5007->3251|5307->3524|5322->3530|5379->3566|5785->3945|5805->3956|5844->3957|5889->3975|5919->3996|5958->3997|6007->4018|6131->4123|6144->4127|6183->4128|6232->4149|6330->4220|6370->4244|6409->4245|6460->4268|6594->4375|6622->4382|6742->4475|6770->4482|6879->4564|6907->4571|6987->4624|7016->4631|7107->4695|7149->4721|7188->4722|7249->4756|7287->4785|7326->4786|7391->4823|7490->4895|7543->4939|7587->4945|7656->4986|7697->5000|7712->5006|7768->5041|7798->5044|7821->5045|7903->5096|8010->5174|8082->5214|8144->5244|8198->5269|8295->5334|8345->5355|8405->5383|8451->5400|8712->5641|8726->5645|8766->5646|8817->5668|8926->5745|8968->5758|10073->6835|10085->6837|10198->6939|10255->6956|10326->6999|10338->7001|10591->7232|10662->7275|10674->7277|10951->7532|11022->7574|11668->8188|11728->8219|12745->9208|12757->9210|12868->9310|12925->9327|13000->9374|13012->9376|13274->9616|13378->9691|13756->10037|13816->10068|13975->10199|14004->10206|14054->10227|14403->10547|14433->10548|14479->10565|14594->10651|14624->10652|15124->11124|15140->11130|15202->11170|15288->11228|15304->11234|15368->11276
                  LINES: 24->8|25->9|30->11|35->11|37->13|40->16|40->16|44->20|44->20|44->20|46->22|46->22|46->22|61->37|61->37|61->37|61->37|63->39|63->39|65->41|67->43|67->43|70->46|71->47|72->48|77->53|77->53|77->53|78->54|78->54|78->54|79->55|79->55|79->55|80->56|80->56|80->56|80->56|81->57|82->58|84->60|84->60|94->70|94->70|94->70|106->82|106->82|106->82|107->83|107->83|107->83|108->84|109->85|109->85|109->85|110->86|111->87|111->87|111->87|112->88|113->89|113->89|114->90|114->90|116->92|116->92|116->92|116->92|117->93|117->93|117->93|118->94|118->94|118->94|119->95|120->96|120->96|120->96|121->97|121->97|121->97|121->97|121->97|121->97|122->98|124->100|125->101|126->102|127->103|129->105|130->106|131->107|132->108|136->112|136->112|136->112|137->113|138->114|139->115|159->135|159->135|159->135|159->135|161->137|161->137|164->140|166->142|166->142|170->146|172->148|180->156|181->157|198->174|198->174|198->174|198->174|200->176|200->176|203->179|206->182|211->187|212->188|216->192|216->192|217->193|225->201|225->201|226->202|228->204|228->204|232->208|232->208|232->208|233->209|233->209|233->209
                  -- GENERATED --
              */
          