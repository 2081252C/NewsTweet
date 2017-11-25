
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Form[Search],String,Integer,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(title: String)(searchForm: Form[Search])(user: String)(bool: Integer)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.87*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
        <div class="header">
            <h1> NewsTweet </h1> 
            """),_display_(/*22.14*/helper/*22.20*/.form(action=routes.SearchController.searchResults())/*22.73*/{_display_(Seq[Any](format.raw/*22.74*/("""

                """),_display_(/*24.18*/helper/*24.24*/.inputText(searchForm("searchTerm"),
                    'placeholder -> "Search ...",
                    '_label -> null)),format.raw/*26.37*/("""

             """)))}),format.raw/*28.15*/("""
             """),format.raw/*29.14*/("""<div class="user">
            """),_display_(/*30.14*/if(bool==1)/*30.25*/{_display_(Seq[Any](format.raw/*30.26*/("""
                """),format.raw/*31.17*/("""hello """),_display_(/*31.24*/(user)),format.raw/*31.30*/("""
                """),format.raw/*32.17*/("""<br> <a href="/logout">Logout</a>
            """)))}/*33.14*/else/*33.18*/{_display_(Seq[Any](format.raw/*33.19*/(""" 
            """),format.raw/*34.13*/("""<a href="/twitter/signin"><img src=""""),_display_(/*34.50*/routes/*34.56*/.Assets.versioned("images/twitterlogin.png")),format.raw/*34.100*/("""" border="2px"> </a>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</div>
            <br>
            <br>
        </div>
        <div class="sidebar">
            <h3> Interests </h3><br>
            <p> Interests appear here.</p>
            <!-- Placeholder  -->
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
        </div>

        """),format.raw/*71.32*/("""
        """),_display_(/*72.10*/content),format.raw/*72.17*/("""

        """),format.raw/*74.9*/("""<script src=""""),_display_(/*74.23*/routes/*74.29*/.Assets.versioned("javascripts/main.js")),format.raw/*74.69*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],user:String,bool:Integer,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(user)(bool)(content)

  def f:((String) => (Form[Search]) => (String) => (Integer) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (user) => (bool) => (content) => apply(title)(searchForm)(user)(bool)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 23:51:00 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: 7782a62efeb389109b8ae671480c18d607ada7e8
                  MATRIX: 651->261|1003->278|1183->363|1212->365|1292->470|1328->479|1363->487|1389->492|1478->554|1493->560|1556->601|1644->662|1659->668|1720->707|1849->809|1864->815|1926->868|1965->869|2011->888|2026->894|2170->1017|2217->1033|2259->1047|2318->1079|2338->1090|2377->1091|2422->1108|2456->1115|2483->1121|2528->1138|2594->1185|2607->1189|2646->1190|2688->1204|2752->1241|2767->1247|2833->1291|2898->1325|2939->1338|3599->2060|3636->2070|3664->2077|3701->2087|3742->2101|3757->2107|3818->2147
                  LINES: 24->8|29->9|34->9|36->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|47->22|47->22|47->22|47->22|49->24|49->24|51->26|53->28|54->29|55->30|55->30|55->30|56->31|56->31|56->31|57->32|58->33|58->33|58->33|59->34|59->34|59->34|59->34|60->35|61->36|95->71|96->72|96->72|98->74|98->74|98->74|98->74
                  -- GENERATED --
              */
          