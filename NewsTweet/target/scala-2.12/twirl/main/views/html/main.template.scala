
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
                                '_label -> null,
                                'value -> "Content")),format.raw/*45.53*/("""
                         """)))}),format.raw/*46.27*/("""
                """),format.raw/*47.17*/("""</div>
              </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown text-center">
                """),_display_(/*52.18*/if(bool==1)/*52.29*/{_display_(Seq[Any](format.raw/*52.30*/("""
                        """),format.raw/*53.25*/("""<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img id="user_pic" src="""),_display_(/*53.165*/img),format.raw/*53.168*/("""><span class="caret"></span></a>
                    """)))}/*54.22*/else/*54.26*/{_display_(Seq[Any](format.raw/*54.27*/(""" 
                        """),format.raw/*55.25*/("""<a href="/twitter/signin"><img id="login-button" src=""""),_display_(/*55.80*/routes/*55.86*/.Assets.versioned("images/twitterlogin.png")),format.raw/*55.130*/("""" width="120%" border="0px" > </a>
                    """)))}),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""</a>
              <ul class="dropdown-menu dropdown-menu-center">
                <li><i>"""),_display_(/*59.25*/(user)),format.raw/*59.31*/("""</i></li>
                <li><a href="/logout"> Logout</a></li>
              </ul>
            </li>
          </ul>
          </div>
        </nav>

        <div id="tabs">        
                <button class="persona" id="menu-toggle">
                    <img src=""""),_display_(/*69.32*/routes/*69.38*/.Assets.versioned("images/menu.png")),format.raw/*69.74*/("""" width="18px" border="0px"> </button>
        </div>


        <div id="wrapper">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <br>
                    <li class="sidebar-brand">
                            <h3><b>Interests</b></h3><hr>
                    </li>
              """),_display_(/*81.16*/if(bool==1)/*81.27*/{_display_(Seq[Any](format.raw/*81.28*/("""
                """),_display_(/*82.18*/if(interests.isEmpty)/*82.39*/{_display_(Seq[Any](format.raw/*82.40*/("""
                    """),format.raw/*83.21*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                """)))}/*84.18*/else/*84.22*/{_display_(Seq[Any](format.raw/*84.23*/("""
                    """),format.raw/*85.21*/("""<div id="exampleAccordion" data-children=".item">
                    """),_display_(/*86.22*/for(persona <- personas) yield /*86.46*/{_display_(Seq[Any](format.raw/*86.47*/("""
                      """),format.raw/*87.23*/("""<div class="item">
                            <li class="sidebar-brand"><a data-toggle="collapse" href="#"""),_display_(/*88.89*/persona),format.raw/*88.96*/("""" aria-expanded="false" aria-controls="collapseOne">
                                <h5><b>"""),_display_(/*89.41*/persona),format.raw/*89.48*/("""</b></h5>
                            </a></li>
                        <div id=""""),_display_(/*91.35*/persona),format.raw/*91.42*/("""" class="collapse" role="tabpanel" aria-labelledby=""""),_display_(/*91.95*/persona),format.raw/*91.102*/("""" data-parent="#exampleAccordion">
                            """),_display_(/*92.30*/for(interest <- interests) yield /*92.56*/{_display_(Seq[Any](format.raw/*92.57*/("""
                                """),_display_(/*93.34*/if(interest contains persona)/*93.63*/{_display_(Seq[Any](format.raw/*93.64*/("""
                                    """),format.raw/*94.37*/("""<div class="sidebar-interest">
                                        """),_display_(/*95.42*/defining(interest.replace(" - "+persona,""))/*95.86*/ { n=>_display_(Seq[Any](format.raw/*95.92*/("""
                                        """),format.raw/*96.41*/("""<li><a href=""""),_display_(/*96.55*/routes/*96.61*/.InterestController.showInterest(n)),format.raw/*96.96*/("""">"""),_display_(/*96.99*/n),format.raw/*96.100*/("""</a></li>
                                        """)))}),format.raw/*97.42*/("""
                                        
                                    """),format.raw/*99.37*/("""</div>
                                """)))}),format.raw/*100.34*/("""
                            """)))}),format.raw/*101.30*/("""
                        """),format.raw/*102.25*/("""</div><hr>
                      </div>
                        """)))}),format.raw/*104.26*/("""
                    """),format.raw/*105.21*/("""</div>
                    """)))}),format.raw/*106.22*/("""
                """),format.raw/*107.17*/("""<!-- Button trigger modal -->
                <button type="button" id="add_interest" class="btn btn-primary centred" data-toggle="modal" data-target="#exampleModal">
                  Add Interest
                </button>
                """)))}/*111.18*/else/*111.22*/{_display_(Seq[Any](format.raw/*111.23*/(""" 
                    """),format.raw/*112.21*/("""Here are some sample interests. Sign in to create your own!
                """)))}),format.raw/*113.18*/("""
            """),format.raw/*114.13*/("""</ul>
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
                                    """),_display_(/*134.38*/b4/*134.40*/.horizontal.form(action=routes.InterestController.addInterest(), "col-md-2", "col-md-10")/*134.129*/{ implicit ifc =>_display_(Seq[Any](format.raw/*134.146*/("""

                                        """),_display_(/*136.42*/b4/*136.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*139.56*/("""

                                        """),_display_(/*141.42*/b4/*141.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*145.42*/("""

                                        """),format.raw/*147.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*155.30*/("""
                              """),format.raw/*156.31*/("""</div>
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
                                    """),_display_(/*173.38*/b4/*173.40*/.horizontal.form(action=routes.PersonaController.addPersona(), "col-md-2", "col-md-10")/*173.127*/{ implicit ifc =>_display_(Seq[Any](format.raw/*173.144*/("""

                                            """),_display_(/*175.46*/b4/*175.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*178.60*/("""

                                    
                                    """),format.raw/*181.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*186.30*/("""
                              """),format.raw/*187.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        """),_display_(/*191.26*/content),format.raw/*191.33*/("""
                    """),format.raw/*192.21*/("""</div>
                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>
            $("#menu-toggle").click(function(e) """),format.raw/*200.49*/("""{"""),format.raw/*200.50*/("""
                """),format.raw/*201.17*/("""e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            """),format.raw/*203.13*/("""}"""),format.raw/*203.14*/(""");
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*207.23*/routes/*207.29*/.Assets.versioned("javascripts/main.js")),format.raw/*207.69*/("""" type="text/javascript"></script>
         <script src=""""),_display_(/*208.24*/routes/*208.30*/.Assets.versioned("javascripts/render.js")),format.raw/*208.72*/("""" type="text/javascript"></script>
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
                  DATE: Tue Jan 23 20:29:57 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 1af2e9e663a4915e9a2f56b702cc43ab3c5be76d
                  MATRIX: 651->261|1092->297|1405->513|1434->515|1521->575|1547->580|1986->992|2001->998|2064->1039|2237->1185|2252->1191|2313->1230|3087->1977|3098->1979|3160->2032|3199->2033|3257->2064|3268->2066|3431->2208|3489->2239|3500->2241|3760->2480|3818->2507|3863->2524|4047->2681|4067->2692|4106->2693|4159->2718|4327->2858|4352->2861|4425->2915|4438->2919|4477->2920|4531->2946|4613->3001|4628->3007|4694->3051|4781->3107|4826->3124|4944->3215|4971->3221|5271->3494|5286->3500|5343->3536|5733->3899|5753->3910|5792->3911|5837->3929|5867->3950|5906->3951|5955->3972|6079->4077|6092->4081|6131->4082|6180->4103|6278->4174|6318->4198|6357->4199|6408->4222|6542->4329|6570->4336|6690->4429|6718->4436|6827->4518|6855->4525|6935->4578|6964->4585|7055->4649|7097->4675|7136->4676|7197->4710|7235->4739|7274->4740|7339->4777|7438->4849|7491->4893|7535->4899|7604->4940|7645->4954|7660->4960|7716->4995|7746->4998|7769->4999|7851->5050|7957->5128|8029->5168|8091->5198|8145->5223|8242->5288|8292->5309|8352->5337|8398->5354|8659->5595|8673->5599|8713->5600|8764->5622|8873->5699|8915->5712|10020->6789|10032->6791|10132->6880|10189->6897|10260->6940|10272->6942|10525->7173|10596->7216|10608->7218|10885->7473|10956->7515|11602->8129|11662->8160|12679->9149|12691->9151|12789->9238|12846->9255|12921->9302|12933->9304|13195->9544|13299->9619|13677->9965|13737->9996|13896->10127|13925->10134|13975->10155|14324->10475|14354->10476|14400->10493|14515->10579|14545->10580|15045->11052|15061->11058|15123->11098|15209->11156|15225->11162|15289->11204
                  LINES: 24->8|29->10|34->10|36->12|39->15|39->15|43->19|43->19|43->19|45->21|45->21|45->21|60->36|60->36|60->36|60->36|62->38|62->38|64->40|66->42|66->42|69->45|70->46|71->47|76->52|76->52|76->52|77->53|77->53|77->53|78->54|78->54|78->54|79->55|79->55|79->55|79->55|80->56|81->57|83->59|83->59|93->69|93->69|93->69|105->81|105->81|105->81|106->82|106->82|106->82|107->83|108->84|108->84|108->84|109->85|110->86|110->86|110->86|111->87|112->88|112->88|113->89|113->89|115->91|115->91|115->91|115->91|116->92|116->92|116->92|117->93|117->93|117->93|118->94|119->95|119->95|119->95|120->96|120->96|120->96|120->96|120->96|120->96|121->97|123->99|124->100|125->101|126->102|128->104|129->105|130->106|131->107|135->111|135->111|135->111|136->112|137->113|138->114|158->134|158->134|158->134|158->134|160->136|160->136|163->139|165->141|165->141|169->145|171->147|179->155|180->156|197->173|197->173|197->173|197->173|199->175|199->175|202->178|205->181|210->186|211->187|215->191|215->191|216->192|224->200|224->200|225->201|227->203|227->203|231->207|231->207|231->207|232->208|232->208|232->208
                  -- GENERATED --
              */
          