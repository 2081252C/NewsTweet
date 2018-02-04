
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
              """),_display_(/*82.16*/if(bool==0)/*82.27*/{_display_(Seq[Any](format.raw/*82.28*/("""
                  """),format.raw/*83.19*/("""<p align=center><i>Here are some sample interests. Sign in to create your own!</i><br><hr></p>
                """)))}),format.raw/*84.18*/("""
                """),_display_(/*85.18*/if(interests.isEmpty)/*85.39*/{_display_(Seq[Any](format.raw/*85.40*/("""
                    """),format.raw/*86.21*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                """)))}/*87.18*/else/*87.22*/{_display_(Seq[Any](format.raw/*87.23*/("""
                    """),format.raw/*88.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*89.22*/for(persona <- personas) yield /*89.46*/{_display_(Seq[Any](format.raw/*89.47*/("""
                      """),format.raw/*90.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" href="#"""),_display_(/*91.89*/persona),format.raw/*91.96*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b>"""),_display_(/*92.41*/persona),format.raw/*92.48*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*94.35*/persona),format.raw/*94.42*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*94.95*/persona),format.raw/*94.102*/("""" data-parent="#exampleAccordion">
                            """),_display_(/*95.30*/for(interest <- interests) yield /*95.56*/{_display_(Seq[Any](format.raw/*95.57*/("""
                                """),_display_(/*96.34*/if(interest contains persona)/*96.63*/{_display_(Seq[Any](format.raw/*96.64*/("""
                                    """),format.raw/*97.37*/("""<div class="sidebar-interest">
                                        """),_display_(/*98.42*/defining(interest.replace(" - "+persona,""))/*98.86*/ { n=>_display_(Seq[Any](format.raw/*98.92*/("""
                                        """),format.raw/*99.41*/("""<li><a href=""""),_display_(/*99.55*/routes/*99.61*/.InterestController.showInterest(n)),format.raw/*99.96*/("""">"""),_display_(/*99.99*/n),format.raw/*99.100*/("""</a></li>
                                        """)))}),format.raw/*100.42*/("""
                                        
                                    """),format.raw/*102.37*/("""</div>
                                """)))}),format.raw/*103.34*/("""
                            """)))}),format.raw/*104.30*/("""
                        """),format.raw/*105.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*107.26*/("""
                    """),format.raw/*108.21*/("""</div>
                    """)))}),format.raw/*109.22*/("""
                """),_display_(/*110.18*/if(bool==1)/*110.29*/{_display_(Seq[Any](format.raw/*110.30*/("""
                  """),format.raw/*111.19*/("""<!-- Button trigger modal -->
                  <button type="button" id="add_interest" class="btn btn-primary centred" data-toggle="modal" data-target="#exampleModal">
                    Add Interest
                  </button>
                """)))}),format.raw/*115.18*/("""
            """),format.raw/*116.13*/("""</ul>
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
                                    """),_display_(/*136.38*/b4/*136.40*/.horizontal.form(action=helper.CSRF(routes.InterestController.addInterest()), "col-md-2", "col-md-10")/*136.142*/{ implicit ifc =>_display_(Seq[Any](format.raw/*136.159*/("""

                                        """),_display_(/*138.42*/b4/*138.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*141.56*/("""

                                        """),_display_(/*143.42*/b4/*143.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*147.42*/("""

                                        """),format.raw/*149.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*157.30*/("""
                              """),format.raw/*158.31*/("""</div>
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
                                    """),_display_(/*175.38*/b4/*175.40*/.horizontal.form(action=helper.CSRF(routes.PersonaController.addPersona()), "col-md-2", "col-md-10")/*175.140*/{ implicit ifc =>_display_(Seq[Any](format.raw/*175.157*/("""

                                            """),_display_(/*177.46*/b4/*177.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*180.60*/("""

                                    
                                    """),format.raw/*183.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*188.30*/("""
                              """),format.raw/*189.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        """),_display_(/*193.26*/content),format.raw/*193.33*/("""
                    """),format.raw/*194.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*202.49*/("""{"""),format.raw/*202.50*/("""
                """),format.raw/*203.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*205.13*/("""}"""),format.raw/*205.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*209.23*/routes/*209.29*/.Assets.versioned("javascripts/main.js")),format.raw/*209.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*210.24*/routes/*210.30*/.Assets.versioned("javascripts/render.js")),format.raw/*210.72*/("""" type="text/javascript"></script>
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
                  DATE: Sun Feb 04 21:32:43 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: f9b2665af4b413a37da78bbedf22bd337478ef0f
                  MATRIX: 651->261|692->296|1115->314|1428->530|1457->532|1544->592|1570->597|2009->1009|2024->1015|2087->1056|2260->1202|2275->1208|2336->1247|3110->1994|3121->1996|3196->2062|3235->2063|3293->2094|3304->2096|3467->2238|3525->2269|3536->2271|3796->2510|3854->2537|3899->2554|4083->2711|4103->2722|4142->2723|4195->2748|4363->2888|4388->2891|4461->2945|4474->2949|4513->2950|4567->2976|4649->3031|4664->3037|4730->3081|4817->3137|4862->3154|4980->3245|5007->3251|5307->3524|5322->3530|5379->3566|5785->3945|5805->3956|5844->3957|5891->3976|6034->4088|6079->4106|6109->4127|6148->4128|6197->4149|6321->4254|6334->4258|6373->4259|6422->4280|6520->4351|6560->4375|6599->4376|6650->4399|6784->4506|6812->4513|6932->4606|6960->4613|7069->4695|7097->4702|7177->4755|7206->4762|7297->4826|7339->4852|7378->4853|7439->4887|7477->4916|7516->4917|7581->4954|7680->5026|7733->5070|7777->5076|7846->5117|7887->5131|7902->5137|7958->5172|7988->5175|8011->5176|8094->5227|8201->5305|8273->5345|8335->5375|8389->5400|8486->5465|8536->5486|8596->5514|8642->5532|8663->5543|8703->5544|8751->5563|9030->5810|9072->5823|10177->6900|10189->6902|10302->7004|10359->7021|10430->7064|10442->7066|10695->7297|10766->7340|10778->7342|11055->7597|11126->7639|11772->8253|11832->8284|12849->9273|12861->9275|12972->9375|13029->9392|13104->9439|13116->9441|13378->9681|13482->9756|13860->10102|13920->10133|14079->10264|14108->10271|14158->10292|14507->10612|14537->10613|14583->10630|14698->10716|14728->10717|15228->11189|15244->11195|15306->11235|15392->11293|15408->11299|15472->11341
                  LINES: 24->8|25->9|30->11|35->11|37->13|40->16|40->16|44->20|44->20|44->20|46->22|46->22|46->22|61->37|61->37|61->37|61->37|63->39|63->39|65->41|67->43|67->43|70->46|71->47|72->48|77->53|77->53|77->53|78->54|78->54|78->54|79->55|79->55|79->55|80->56|80->56|80->56|80->56|81->57|82->58|84->60|84->60|94->70|94->70|94->70|106->82|106->82|106->82|107->83|108->84|109->85|109->85|109->85|110->86|111->87|111->87|111->87|112->88|113->89|113->89|113->89|114->90|115->91|115->91|116->92|116->92|118->94|118->94|118->94|118->94|119->95|119->95|119->95|120->96|120->96|120->96|121->97|122->98|122->98|122->98|123->99|123->99|123->99|123->99|123->99|123->99|124->100|126->102|127->103|128->104|129->105|131->107|132->108|133->109|134->110|134->110|134->110|135->111|139->115|140->116|160->136|160->136|160->136|160->136|162->138|162->138|165->141|167->143|167->143|171->147|173->149|181->157|182->158|199->175|199->175|199->175|199->175|201->177|201->177|204->180|207->183|212->188|213->189|217->193|217->193|218->194|226->202|226->202|227->203|229->205|229->205|233->209|233->209|233->209|234->210|234->210|234->210
                  -- GENERATED --
              */
          