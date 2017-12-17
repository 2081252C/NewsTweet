
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

object radioFieldConstructorTemplate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<label class="radio-inline" for=""""),_display_(/*3.35*/elements/*3.43*/.id),format.raw/*3.46*/("""">"""),_display_(/*3.49*/elements/*3.57*/.label),format.raw/*3.63*/("""</label>
<div class="input">
    """),_display_(/*5.6*/elements/*5.14*/.input),format.raw/*5.20*/("""
"""),format.raw/*6.1*/("""</div>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 13:23:12 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/radioFieldConstructorTemplate.scala.html
                  HASH: ef8384207d97298bae25c20af2aa4de5f55010b3
                  MATRIX: 986->1|1113->33|1141->35|1201->69|1217->77|1240->80|1269->83|1285->91|1311->97|1370->131|1386->139|1412->145|1439->146
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6
                  -- GENERATED --
              */
          