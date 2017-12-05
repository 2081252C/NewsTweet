
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
/*8.2*/import helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[String,Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[Long],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(interestForm: Form[Interest])(personas: List[String])(personaID: List[Long])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.205*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
        <table>
            <tr>
                <th width="15%">
                    <div id="title">
                        <a href="/"> <h1> NewsTweet </h1></a>
                    </div>
                </th>
                <th>
                    <div id="search">
                        """),_display_(/*29.26*/helper/*29.32*/.form(action=routes.SearchController.searchResults())/*29.85*/{_display_(Seq[Any](format.raw/*29.86*/("""

                            """),_display_(/*31.30*/helper/*31.36*/.inputText(searchForm("searchTerm"),
                                'placeholder -> "Search ...",
                                '_label -> null)),format.raw/*33.49*/("""

                         """)))}),format.raw/*35.27*/("""
                    """),format.raw/*36.21*/("""</div>
                </th>
                <th>
                    <div id="user">
                        """),_display_(/*40.26*/if(bool==1)/*40.37*/{_display_(Seq[Any](format.raw/*40.38*/("""
                            """),format.raw/*41.29*/("""<img id="user_pic" src="""),_display_(/*41.53*/img),format.raw/*41.56*/(""" """),format.raw/*41.57*/("""onmouseover="document.getElementById('user_options').style.display = 'block';" onclick="document.getElementById('user_options').style.display = 'none';">
                        """)))}/*42.26*/else/*42.30*/{_display_(Seq[Any](format.raw/*42.31*/(""" 
                            """),format.raw/*43.29*/("""<a href="/twitter/signin"><img src=""""),_display_(/*43.66*/routes/*43.72*/.Assets.versioned("images/twitterlogin.png")),format.raw/*43.116*/("""" width="60%" border="0px" > </a>
                        """)))}),format.raw/*44.26*/("""
                    """),format.raw/*45.21*/("""</div>
                </th>
            </tr>
            <tr>
                <td height=100% valign="top">
                    <div id="sidebar">
                        <h3> Interests </h3>
                        """),_display_(/*52.26*/if(bool==1)/*52.37*/{_display_(Seq[Any](format.raw/*52.38*/("""
                            """),format.raw/*53.29*/("""<button onclick="document.getElementById('interest_form').style.display = 'block'; this.style.display = 'none'">Add Interest</button>
                            <div id="interest_form">
                                """),_display_(/*55.34*/helper/*55.40*/.form(action=routes.InterestController.addInterest())/*55.93*/{_display_(Seq[Any](format.raw/*55.94*/("""

                                    """),_display_(/*57.38*/helper/*57.44*/.inputText(interestForm("interestName"),
                                        'placeholder -> "Interest Name",
                                        '_label -> null,
                                        'size -> 8)),format.raw/*60.52*/("""

                                    """),_display_(/*62.38*/helper/*62.44*/.select(
                                       interestForm("personaName"),
                                       helper.options(personas),
                                       '_label -> null
                                    )),format.raw/*66.38*/("""
                                """)))}),format.raw/*67.34*/("""
                            """),format.raw/*68.29*/("""</div>
                        """)))}/*69.26*/else/*69.30*/{_display_(Seq[Any](format.raw/*69.31*/(""" 
                            """),format.raw/*70.29*/("""Here are some sample interests. Sign in to create your own!
                        """)))}),format.raw/*71.26*/("""
                    """),format.raw/*72.21*/("""</div>
                </td>
                <td valign="top">
                    """),format.raw/*76.44*/("""
                    """),_display_(/*77.22*/content),format.raw/*77.29*/("""
                """),format.raw/*78.17*/("""</td>
                <td td valign="top">
                    <div id="user_options">
                        <i>"""),_display_(/*81.29*/(user)),format.raw/*81.35*/("""</i>
                        <br> 
                        <button onclick="document.getElementById('persona_form').style.display = 'block'; this.style.display = 'none'">Add Persona</button>
                        <div id="persona_form">
                            """),_display_(/*85.30*/helper/*85.36*/.form(action=routes.PersonaController.addPersona())/*85.87*/{_display_(Seq[Any](format.raw/*85.88*/("""

                                """),_display_(/*87.34*/helper/*87.40*/.inputText(personaForm("personaName"),
                                    'placeholder -> "Persona Name",
                                    '_label -> null,
                                    'size -> 8)),format.raw/*90.48*/("""

                            """)))}),format.raw/*92.30*/("""
                        """),format.raw/*93.25*/("""</div>
                        <a href="/logout"><button> Logout </button></a>
                    </div>
                </td>
        </table>

        <script src=""""),_display_(/*99.23*/routes/*99.29*/.Assets.versioned("javascripts/main.js")),format.raw/*99.69*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],personaID:List[Long],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(user)(bool)(personaForm)(img)(interestForm)(personas)(personaID)(content)

  def f:((String) => (Form[Search]) => (String) => (Integer) => (Form[Persona]) => (String) => (Form[Interest]) => (List[String]) => (List[Long]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (user) => (bool) => (personaForm) => (img) => (interestForm) => (personas) => (personaID) => (content) => apply(title)(searchForm)(user)(bool)(personaForm)(img)(interestForm)(personas)(personaID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 05 20:55:42 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 070bb308a868ef91d626ec807c308c5b38b55da8
                  MATRIX: 651->261|1064->278|1363->481|1392->483|1472->588|1508->597|1543->605|1569->610|1658->672|1673->678|1736->719|1824->780|1839->786|1900->825|2251->1149|2266->1155|2328->1208|2367->1209|2425->1240|2440->1246|2608->1393|2667->1421|2716->1442|2854->1553|2874->1564|2913->1565|2970->1594|3021->1618|3045->1621|3074->1622|3272->1801|3285->1805|3324->1806|3382->1836|3446->1873|3461->1879|3527->1923|3617->1982|3666->2003|3912->2222|3932->2233|3971->2234|4028->2263|4275->2483|4290->2489|4352->2542|4391->2543|4457->2582|4472->2588|4715->2810|4781->2849|4796->2855|5051->3089|5116->3123|5173->3152|5224->3184|5237->3188|5276->3189|5334->3219|5450->3304|5499->3325|5610->3510|5659->3532|5687->3539|5732->3556|5874->3671|5901->3677|6196->3945|6211->3951|6271->4002|6310->4003|6372->4038|6387->4044|6615->4251|6677->4282|6730->4307|6925->4475|6940->4481|7001->4521
                  LINES: 24->8|29->9|34->9|36->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|54->29|54->29|54->29|54->29|56->31|56->31|58->33|60->35|61->36|65->40|65->40|65->40|66->41|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|68->43|69->44|70->45|77->52|77->52|77->52|78->53|80->55|80->55|80->55|80->55|82->57|82->57|85->60|87->62|87->62|91->66|92->67|93->68|94->69|94->69|94->69|95->70|96->71|97->72|100->76|101->77|101->77|102->78|105->81|105->81|109->85|109->85|109->85|109->85|111->87|111->87|114->90|116->92|117->93|123->99|123->99|123->99
                  -- GENERATED --
              */
          