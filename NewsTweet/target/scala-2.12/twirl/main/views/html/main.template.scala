
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[Search],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(title: String)(searchForm: Form[Search])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.58*/("""

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
            """),format.raw/*29.13*/("""<a href="/twitter/signin"><img src=""""),_display_(/*29.50*/routes/*29.56*/.Assets.versioned("images/twitterlogin.png")),format.raw/*29.100*/("""" border="2px"> </a>
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

        """),format.raw/*64.32*/("""
        """),_display_(/*65.10*/content),format.raw/*65.17*/("""

        """),format.raw/*67.9*/("""<script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.versioned("javascripts/main.js")),format.raw/*67.69*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(searchForm)(content)

  def f:((String) => (Form[Search]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (searchForm) => (content) => apply(title)(searchForm)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 23 00:04:20 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/main.scala.html
                  HASH: b5cdd9823c34bc7f9cd43d8508ef324aa3ddc232
                  MATRIX: 651->261|988->278|1139->334|1168->336|1248->441|1284->450|1319->458|1345->463|1434->525|1449->531|1512->572|1600->633|1615->639|1676->678|1805->780|1820->786|1882->839|1921->840|1967->859|1982->865|2126->988|2173->1004|2214->1017|2278->1054|2293->1060|2359->1104|3033->1840|3070->1850|3098->1857|3135->1867|3176->1881|3191->1887|3252->1927
                  LINES: 24->8|29->9|34->9|36->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|47->22|47->22|47->22|47->22|49->24|49->24|51->26|53->28|54->29|54->29|54->29|54->29|88->64|89->65|89->65|91->67|91->67|91->67|91->67
                  -- GENERATED --
              */
          