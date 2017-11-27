
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Search],String,Integer,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, tweets: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>

"""),_display_(/*9.2*/main("Search Results")/*9.24*/(searchForm)/*9.36*/(user)/*9.42*/(bool)/*9.48*/ {_display_(Seq[Any](format.raw/*9.50*/("""
  """),format.raw/*10.3*/("""<div id="searchResults">
  	<h3>Search Results:</h3>
  	<p id="list">
  			"""),_display_(/*13.7*/for(tweet <- tweets) yield /*13.27*/{_display_(Seq[Any](format.raw/*13.28*/("""
  				"""),format.raw/*14.7*/("""<p id=""""),_display_(/*14.15*/tweet),format.raw/*14.20*/(""""><br></p>
  				<script>
					rendering(""""),_display_(/*16.18*/tweet),format.raw/*16.23*/("""");
				</script>
  			""")))}),format.raw/*18.7*/("""
  	"""),format.raw/*19.4*/("""</p>
  </div>
""")))}),format.raw/*21.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,tweets:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,tweets)

  def f:((Form[Search],String,Integer,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,tweets) => apply(searchForm,user,bool,tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 27 11:17:32 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 592edfa6aa4b9ac684cefbabacd9cc9b57900a1d
                  MATRIX: 990->1|1140->81|1185->78|1213->97|1240->98|1436->268|1450->274|1512->316|1575->354|1605->376|1625->388|1639->394|1653->400|1692->402|1722->405|1824->481|1860->501|1899->502|1933->509|1968->517|1994->522|2064->565|2090->570|2144->594|2175->598|2220->613
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|42->10|45->13|45->13|45->13|46->14|46->14|46->14|48->16|48->16|50->18|51->19|53->21
                  -- GENERATED --
              */
          