
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Form[Search],String,Integer,Form[Persona],String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(personaForm: Form[Persona])(img: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.128*/("""

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
                    </div>
                </td>
                <td valign="top">
                    """),format.raw/*56.44*/("""
                    """),_display_(/*57.22*/content),format.raw/*57.29*/("""
                """),format.raw/*58.17*/("""</td>
                <td td valign="top">
                    <div id="user_options">
                        <i>"""),_display_(/*61.29*/(user)),format.raw/*61.35*/("""</i>
                        <br> 
                        <button onclick="document.getElementById('persona_form').style.display = 'block'; this.style.display = 'none'">Add Persona</button>
                        <div id="persona_form">
                            """),_display_(/*65.30*/helper/*65.36*/.form(action=routes.PersonaController.addPersona())/*65.87*/{_display_(Seq[Any](format.raw/*65.88*/("""

                                """),_display_(/*67.34*/helper/*67.40*/.inputText(personaForm("personaName"),
                                    'placeholder -> "Persona Name",
                                    '_label -> null,
                                    'size -> 8)),format.raw/*70.48*/("""

                            """)))}),format.raw/*72.30*/("""
                        """),format.raw/*73.25*/("""</div>
                        <a href="/logout"><button> Logout </button></a>
                    </div>
                </td>
        </table>

        <script src=""""),_display_(/*79.23*/routes/*79.29*/.Assets.versioned("javascripts/main.js")),format.raw/*79.69*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(user)(bool)(personaForm)(img)(content)

  def f:((String) => (Form[Search]) => (String) => (Integer) => (Form[Persona]) => (String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (user) => (bool) => (personaForm) => (img) => (content) => apply(title)(searchForm)(user)(bool)(personaForm)(img)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 30 02:00:50 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: b45d487c0277500b832e9fb25bc7a7990f895555
                  MATRIX: 651->261|1024->278|1246->404|1275->406|1355->511|1391->520|1426->528|1452->533|1541->595|1556->601|1619->642|1707->703|1722->709|1783->748|2134->1072|2149->1078|2211->1131|2250->1132|2308->1163|2323->1169|2491->1316|2550->1344|2599->1365|2737->1476|2757->1487|2796->1488|2853->1517|2904->1541|2928->1544|2957->1545|3155->1724|3168->1728|3207->1729|3265->1759|3329->1796|3344->1802|3410->1846|3500->1905|3549->1926|3874->2325|3923->2347|3951->2354|3996->2371|4138->2486|4165->2492|4460->2760|4475->2766|4535->2817|4574->2818|4636->2853|4651->2859|4879->3066|4941->3097|4994->3122|5189->3290|5204->3296|5265->3336
                  LINES: 24->8|29->9|34->9|36->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|54->29|54->29|54->29|54->29|56->31|56->31|58->33|60->35|61->36|65->40|65->40|65->40|66->41|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|68->43|69->44|70->45|80->56|81->57|81->57|82->58|85->61|85->61|89->65|89->65|89->65|89->65|91->67|91->67|94->70|96->72|97->73|103->79|103->79|103->79
                  -- GENERATED --
              */
          