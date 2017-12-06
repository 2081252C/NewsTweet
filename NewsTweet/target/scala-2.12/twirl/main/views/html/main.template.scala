
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[String,Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(interestForm: Form[Interest])(personas: List[String])(interests: List[String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.207*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/favicon.png")),format.raw/*18.104*/("""">
    </head>
    <body>
        <table>
            <tr id="head">
                <th width="15%">
                    <div id="title">
                        <a href="/"> <h1> NewsTweet </h1></a>
                    </div>
                </th>
                <th>
                    <div id="search">
                        """),_display_(/*30.26*/helper/*30.32*/.form(action=routes.SearchController.searchResults())/*30.85*/{_display_(Seq[Any](format.raw/*30.86*/("""

                            """),_display_(/*32.30*/helper/*32.36*/.inputText(searchForm("searchTerm"),
                                'placeholder -> "Search ...",
                                '_label -> null)),format.raw/*34.49*/("""

                         """)))}),format.raw/*36.27*/("""
                    """),format.raw/*37.21*/("""</div>
                </th>
                <th>
                    <div id="user">
                        """),_display_(/*41.26*/if(bool==1)/*41.37*/{_display_(Seq[Any](format.raw/*41.38*/("""
                            """),format.raw/*42.29*/("""<img id="user_pic" src="""),_display_(/*42.53*/img),format.raw/*42.56*/(""" """),format.raw/*42.57*/("""onmouseover="document.getElementById('user_options').style.display = 'block';" onclick="document.getElementById('user_options').style.display = 'none';">
                        """)))}/*43.26*/else/*43.30*/{_display_(Seq[Any](format.raw/*43.31*/(""" 
                            """),format.raw/*44.29*/("""<a href="/twitter/signin"><img src=""""),_display_(/*44.66*/routes/*44.72*/.Assets.versioned("images/twitterlogin.png")),format.raw/*44.116*/("""" width="60%" border="0px" > </a>
                        """)))}),format.raw/*45.26*/("""
                    """),format.raw/*46.21*/("""</div>
                </th>
            </tr>
            """),_display_(/*49.14*/if(personas.isEmpty)/*49.34*/{_display_(Seq[Any](format.raw/*49.35*/("""
            """)))}/*50.14*/else/*50.18*/{_display_(Seq[Any](format.raw/*50.19*/("""
            """),format.raw/*51.13*/("""<tr id="head2">
                <div id="tabs">
                    """),_display_(/*53.22*/if(bool==1 )/*53.34*/{_display_(Seq[Any](format.raw/*53.35*/("""
                        """),_display_(/*54.26*/for(persona <- personas) yield /*54.50*/{_display_(Seq[Any](format.raw/*54.51*/("""
                            """),format.raw/*55.29*/("""<button class="persona" onclick="openCity(event, '"""),_display_(/*55.80*/persona),format.raw/*55.87*/("""')">"""),_display_(/*55.92*/persona),format.raw/*55.99*/("""</button>
                        """)))}),format.raw/*56.26*/("""
                    """)))}),format.raw/*57.22*/("""
                    """),format.raw/*58.21*/("""</div>
            </tr>
            """)))}),format.raw/*60.14*/("""
            """),format.raw/*61.13*/("""<tr>
                <td height=100% valign="top" width=269>
                    <div id="sidebar"  style="margin-top:95px">
                        <h3> Interests </h3>
                        """),_display_(/*65.26*/if(bool==1)/*65.37*/{_display_(Seq[Any](format.raw/*65.38*/("""
                            """),_display_(/*66.30*/if(interests.isEmpty)/*66.51*/{_display_(Seq[Any](format.raw/*66.52*/("""
                                """),format.raw/*67.33*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                            """)))}/*68.30*/else/*68.34*/{_display_(Seq[Any](format.raw/*68.35*/("""
                                """),_display_(/*69.34*/for(persona <- personas) yield /*69.58*/{_display_(Seq[Any](format.raw/*69.59*/("""
                                    """),format.raw/*70.37*/("""<div id=""""),_display_(/*70.47*/persona),format.raw/*70.54*/("""" class="city">
                                        """),_display_(/*71.42*/for(interest <- interests) yield /*71.68*/{_display_(Seq[Any](format.raw/*71.69*/("""
                                            """),_display_(/*72.46*/if(interest contains persona)/*72.75*/{_display_(Seq[Any](format.raw/*72.76*/("""
                                                """),_display_(/*73.50*/interest/*73.58*/.replace(persona,"")),format.raw/*73.78*/("""<br>
                                            """)))}),format.raw/*74.46*/("""
                                        """)))}),format.raw/*75.42*/("""
                                    """),format.raw/*76.37*/("""</div>
                                """)))}),format.raw/*77.34*/("""
                            """)))}),format.raw/*78.30*/("""
                            """),format.raw/*79.29*/("""<button onclick="document.getElementById('interest_form').style.display = 'block'; this.style.display = 'none'">Add Interest</button>
                            <div id="interest_form">
                                """),_display_(/*81.34*/helper/*81.40*/.form(action=routes.InterestController.addInterest())/*81.93*/{_display_(Seq[Any](format.raw/*81.94*/("""

                                    """),_display_(/*83.38*/helper/*83.44*/.inputText(interestForm("interestName"),
                                        'placeholder -> "Interest Name",
                                        '_label -> null,
                                        'size -> 8)),format.raw/*86.52*/("""

                                    """),_display_(/*88.38*/helper/*88.44*/.select(
                                       interestForm("personaName"),
                                       helper.options(personas),
                                       '_label -> null
                                    )),format.raw/*92.38*/("""
                                """)))}),format.raw/*93.34*/("""
                            """),format.raw/*94.29*/("""</div>
                        """)))}/*95.26*/else/*95.30*/{_display_(Seq[Any](format.raw/*95.31*/(""" 
                            """),format.raw/*96.29*/("""Here are some sample interests. Sign in to create your own!
                        """)))}),format.raw/*97.26*/("""
                """),format.raw/*98.17*/("""</div>
                </td>
                <td valign="top">
                    <div id="content"  style="margin-top:95px; z-index: -1">
                    """),format.raw/*103.44*/("""
                    """),_display_(/*104.22*/content),format.raw/*104.29*/("""
                """),format.raw/*105.17*/("""</div>
                </td>
                <td td valign="top">
                    <div id="user_options">
                        <i>"""),_display_(/*109.29*/(user)),format.raw/*109.35*/("""</i>
                        <br> 
                        <button onclick="document.getElementById('persona_form').style.display = 'block'; this.style.display = 'none'">Add Persona</button>
                        <div id="persona_form">
                            """),_display_(/*113.30*/helper/*113.36*/.form(action=routes.PersonaController.addPersona())/*113.87*/{_display_(Seq[Any](format.raw/*113.88*/("""

                                """),_display_(/*115.34*/helper/*115.40*/.inputText(personaForm("personaName"),
                                    'placeholder -> "Persona Name",
                                    '_label -> null,
                                    'size -> 8)),format.raw/*118.48*/("""

                            """)))}),format.raw/*120.30*/("""
                        """),format.raw/*121.25*/("""</div>
                        <a href="/logout"><button> Logout </button></a>
                    </div>
                </td>
        </table>

        <script src=""""),_display_(/*127.23*/routes/*127.29*/.Assets.versioned("javascripts/main.js")),format.raw/*127.69*/("""" type="text/javascript"></script>
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
                  DATE: Wed Dec 06 18:07:18 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 06338319d6cf00723d155cb442c8e2ab35644df7
                  MATRIX: 651->261|1066->278|1367->483|1396->485|1476->590|1512->599|1547->607|1573->612|1662->674|1677->680|1740->721|1908->862|1923->868|1984->907|2345->1241|2360->1247|2422->1300|2461->1301|2519->1332|2534->1338|2702->1485|2761->1513|2810->1534|2948->1645|2968->1656|3007->1657|3064->1686|3115->1710|3139->1713|3168->1714|3366->1893|3379->1897|3418->1898|3476->1928|3540->1965|3555->1971|3621->2015|3711->2074|3760->2095|3847->2155|3876->2175|3915->2176|3948->2190|3961->2194|4000->2195|4041->2208|4137->2277|4158->2289|4197->2290|4250->2316|4290->2340|4329->2341|4386->2370|4464->2421|4492->2428|4524->2433|4552->2440|4618->2475|4671->2497|4720->2518|4789->2556|4830->2569|5052->2764|5072->2775|5111->2776|5168->2806|5198->2827|5237->2828|5298->2861|5434->2978|5447->2982|5486->2983|5547->3017|5587->3041|5626->3042|5691->3079|5728->3089|5756->3096|5840->3153|5882->3179|5921->3180|5994->3226|6032->3255|6071->3256|6148->3306|6165->3314|6206->3334|6287->3384|6360->3426|6425->3463|6496->3503|6557->3533|6614->3562|6861->3782|6876->3788|6938->3841|6977->3842|7043->3881|7058->3887|7301->4109|7367->4148|7382->4154|7637->4388|7702->4422|7759->4451|7810->4483|7823->4487|7862->4488|7920->4518|8036->4603|8081->4620|8270->4882|8320->4904|8349->4911|8395->4928|8561->5066|8589->5072|8885->5340|8901->5346|8962->5397|9002->5398|9065->5433|9081->5439|9310->5646|9373->5677|9427->5702|9623->5870|9639->5876|9701->5916
                  LINES: 24->8|29->9|34->9|36->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|43->18|43->18|43->18|55->30|55->30|55->30|55->30|57->32|57->32|59->34|61->36|62->37|66->41|66->41|66->41|67->42|67->42|67->42|67->42|68->43|68->43|68->43|69->44|69->44|69->44|69->44|70->45|71->46|74->49|74->49|74->49|75->50|75->50|75->50|76->51|78->53|78->53|78->53|79->54|79->54|79->54|80->55|80->55|80->55|80->55|80->55|81->56|82->57|83->58|85->60|86->61|90->65|90->65|90->65|91->66|91->66|91->66|92->67|93->68|93->68|93->68|94->69|94->69|94->69|95->70|95->70|95->70|96->71|96->71|96->71|97->72|97->72|97->72|98->73|98->73|98->73|99->74|100->75|101->76|102->77|103->78|104->79|106->81|106->81|106->81|106->81|108->83|108->83|111->86|113->88|113->88|117->92|118->93|119->94|120->95|120->95|120->95|121->96|122->97|123->98|127->103|128->104|128->104|129->105|133->109|133->109|137->113|137->113|137->113|137->113|139->115|139->115|142->118|144->120|145->121|151->127|151->127|151->127
                  -- GENERATED --
              */
          