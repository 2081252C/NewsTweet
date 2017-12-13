
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

                            """),_display_(/*36.30*/helper/*36.36*/.inputRadioGroup(searchForm("searchType"), 
                                Seq("User" -> "User", "Hashtag" -> "Hashtag", "Content" -> "Content"), 
                                '_label -> null)),format.raw/*38.49*/("""
                         """)))}),format.raw/*39.27*/("""
                    """),format.raw/*40.21*/("""</div>
                </th>
                <th>
                    <div id="user">
                        """),_display_(/*44.26*/if(bool==1)/*44.37*/{_display_(Seq[Any](format.raw/*44.38*/("""
                            """),format.raw/*45.29*/("""<img id="user_pic" src="""),_display_(/*45.53*/img),format.raw/*45.56*/(""" """),format.raw/*45.57*/("""onmouseover="document.getElementById('user_options').style.display = 'block';" onclick="document.getElementById('user_options').style.display = 'none';">
                        """)))}/*46.26*/else/*46.30*/{_display_(Seq[Any](format.raw/*46.31*/(""" 
                            """),format.raw/*47.29*/("""<a href="/twitter/signin"><img src=""""),_display_(/*47.66*/routes/*47.72*/.Assets.versioned("images/twitterlogin.png")),format.raw/*47.116*/("""" width="60%" border="0px" > </a>
                        """)))}),format.raw/*48.26*/("""
                    """),format.raw/*49.21*/("""</div>
                </th>
            </tr>
            """),_display_(/*52.14*/if(personas.isEmpty)/*52.34*/{_display_(Seq[Any](format.raw/*52.35*/("""
            """)))}/*53.14*/else/*53.18*/{_display_(Seq[Any](format.raw/*53.19*/("""
            """),format.raw/*54.13*/("""<tr id="head2">
                <div id="tabs">
                    """),_display_(/*56.22*/if(bool==1 )/*56.34*/{_display_(Seq[Any](format.raw/*56.35*/("""
                        """),_display_(/*57.26*/for(persona <- personas) yield /*57.50*/{_display_(Seq[Any](format.raw/*57.51*/("""
                            """),format.raw/*58.29*/("""<button class="persona" onclick="openCity(event, '"""),_display_(/*58.80*/persona),format.raw/*58.87*/("""')">"""),_display_(/*58.92*/persona),format.raw/*58.99*/("""</button>
                        """)))}),format.raw/*59.26*/("""
                    """)))}),format.raw/*60.22*/("""
                    """),format.raw/*61.21*/("""</div>
            </tr>
            """)))}),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""<tr>
                <td height=100% valign="top" width=269>
                    <div id="sidebar"  style="margin-top:95px">
                        <h3> Interests </h3>
                        """),_display_(/*68.26*/if(bool==1)/*68.37*/{_display_(Seq[Any](format.raw/*68.38*/("""
                            """),_display_(/*69.30*/if(interests.isEmpty)/*69.51*/{_display_(Seq[Any](format.raw/*69.52*/("""
                                """),format.raw/*70.33*/("""Looks like you don't have any interests yet!<br><br> Would you like to add one?<br><br>
                            """)))}/*71.30*/else/*71.34*/{_display_(Seq[Any](format.raw/*71.35*/("""
                                """),_display_(/*72.34*/for(persona <- personas) yield /*72.58*/{_display_(Seq[Any](format.raw/*72.59*/("""
                                    """),format.raw/*73.37*/("""<div id=""""),_display_(/*73.47*/persona),format.raw/*73.54*/("""" class="city">
                                        """),_display_(/*74.42*/for(interest <- interests) yield /*74.68*/{_display_(Seq[Any](format.raw/*74.69*/("""
                                            """),_display_(/*75.46*/if(interest contains persona)/*75.75*/{_display_(Seq[Any](format.raw/*75.76*/("""
                                                """),_display_(/*76.50*/interest/*76.58*/.replace(persona,"")),format.raw/*76.78*/("""<br>
                                            """)))}),format.raw/*77.46*/("""
                                        """)))}),format.raw/*78.42*/("""
                                    """),format.raw/*79.37*/("""</div>
                                """)))}),format.raw/*80.34*/("""
                            """)))}),format.raw/*81.30*/("""
                            """),format.raw/*82.29*/("""<button onclick="document.getElementById('interest_form').style.display = 'block'; this.style.display = 'none'">Add Interest</button>
                            <div id="interest_form">
                                """),_display_(/*84.34*/helper/*84.40*/.form(action=routes.InterestController.addInterest())/*84.93*/{_display_(Seq[Any](format.raw/*84.94*/("""

                                    """),_display_(/*86.38*/helper/*86.44*/.inputText(interestForm("interestName"),
                                        'placeholder -> "Interest Name",
                                        '_label -> null,
                                        'size -> 8)),format.raw/*89.52*/("""

                                    """),_display_(/*91.38*/helper/*91.44*/.select(
                                       interestForm("personaName"),
                                       helper.options(personas),
                                       '_label -> null
                                    )),format.raw/*95.38*/("""
                                """)))}),format.raw/*96.34*/("""
                            """),format.raw/*97.29*/("""</div>
                        """)))}/*98.26*/else/*98.30*/{_display_(Seq[Any](format.raw/*98.31*/(""" 
                            """),format.raw/*99.29*/("""Here are some sample interests. Sign in to create your own!
                        """)))}),format.raw/*100.26*/("""
                """),format.raw/*101.17*/("""</div>
                </td>
                <td valign="top">
                    <div id="content"  style="margin-top:110px; z-index: -1">
                    """),format.raw/*106.44*/("""
                    """),_display_(/*107.22*/content),format.raw/*107.29*/("""
                """),format.raw/*108.17*/("""</div>
                </td>
                <td td valign="top">
                    <div id="user_options">
                        <i>"""),_display_(/*112.29*/(user)),format.raw/*112.35*/("""</i>
                        <br> 
                        <button onclick="document.getElementById('persona_form').style.display = 'block'; this.style.display = 'none'">Add Persona</button>
                        <div id="persona_form">
                            """),_display_(/*116.30*/helper/*116.36*/.form(action=routes.PersonaController.addPersona())/*116.87*/{_display_(Seq[Any](format.raw/*116.88*/("""

                                """),_display_(/*118.34*/helper/*118.40*/.inputText(personaForm("personaName"),
                                    'placeholder -> "Persona Name",
                                    '_label -> null,
                                    'size -> 8)),format.raw/*121.48*/("""

                            """)))}),format.raw/*123.30*/("""
                        """),format.raw/*124.25*/("""</div>
                        <a href="/logout"><button> Logout </button></a>
                    </div>
                </td>
        </table>

        <script src=""""),_display_(/*130.23*/routes/*130.29*/.Assets.versioned("javascripts/main.js")),format.raw/*130.69*/("""" type="text/javascript"></script>
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
                  DATE: Wed Dec 13 04:34:45 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: b1db466eb9a897f22989687cbe94d2fa13ce244e
                  MATRIX: 651->261|1066->278|1367->483|1396->485|1476->590|1512->599|1547->607|1573->612|1662->674|1677->680|1740->721|1908->862|1923->868|1984->907|2345->1241|2360->1247|2422->1300|2461->1301|2519->1332|2534->1338|2702->1485|2760->1516|2775->1522|2992->1718|3050->1745|3099->1766|3237->1877|3257->1888|3296->1889|3353->1918|3404->1942|3428->1945|3457->1946|3655->2125|3668->2129|3707->2130|3765->2160|3829->2197|3844->2203|3910->2247|4000->2306|4049->2327|4136->2387|4165->2407|4204->2408|4237->2422|4250->2426|4289->2427|4330->2440|4426->2509|4447->2521|4486->2522|4539->2548|4579->2572|4618->2573|4675->2602|4753->2653|4781->2660|4813->2665|4841->2672|4907->2707|4960->2729|5009->2750|5078->2788|5119->2801|5341->2996|5361->3007|5400->3008|5457->3038|5487->3059|5526->3060|5587->3093|5723->3210|5736->3214|5775->3215|5836->3249|5876->3273|5915->3274|5980->3311|6017->3321|6045->3328|6129->3385|6171->3411|6210->3412|6283->3458|6321->3487|6360->3488|6437->3538|6454->3546|6495->3566|6576->3616|6649->3658|6714->3695|6785->3735|6846->3765|6903->3794|7150->4014|7165->4020|7227->4073|7266->4074|7332->4113|7347->4119|7590->4341|7656->4380|7671->4386|7926->4620|7991->4654|8048->4683|8099->4715|8112->4719|8151->4720|8209->4750|8326->4835|8372->4852|8562->5115|8612->5137|8641->5144|8687->5161|8853->5299|8881->5305|9177->5573|9193->5579|9254->5630|9294->5631|9357->5666|9373->5672|9602->5879|9665->5910|9719->5935|9915->6103|9931->6109|9993->6149
                  LINES: 24->8|29->9|34->9|36->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|43->18|43->18|43->18|55->30|55->30|55->30|55->30|57->32|57->32|59->34|61->36|61->36|63->38|64->39|65->40|69->44|69->44|69->44|70->45|70->45|70->45|70->45|71->46|71->46|71->46|72->47|72->47|72->47|72->47|73->48|74->49|77->52|77->52|77->52|78->53|78->53|78->53|79->54|81->56|81->56|81->56|82->57|82->57|82->57|83->58|83->58|83->58|83->58|83->58|84->59|85->60|86->61|88->63|89->64|93->68|93->68|93->68|94->69|94->69|94->69|95->70|96->71|96->71|96->71|97->72|97->72|97->72|98->73|98->73|98->73|99->74|99->74|99->74|100->75|100->75|100->75|101->76|101->76|101->76|102->77|103->78|104->79|105->80|106->81|107->82|109->84|109->84|109->84|109->84|111->86|111->86|114->89|116->91|116->91|120->95|121->96|122->97|123->98|123->98|123->98|124->99|125->100|126->101|130->106|131->107|131->107|132->108|136->112|136->112|140->116|140->116|140->116|140->116|142->118|142->118|145->121|147->123|148->124|154->130|154->130|154->130
                  -- GENERATED --
              */
          