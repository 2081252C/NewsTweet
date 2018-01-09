
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

object dataAnalytics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template16[Form[Search],Form[Track],String,Integer,List[String],List[String],Double,List[String],Double,Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], user: String, bool: Integer, tweets: List[String], posTweets: List[String], posSize: Double, negTweets: List[String], negSize: Double, personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.332*/("""

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>

"""),_display_(/*8.2*/main("Data Analytics")/*8.24*/(searchForm)/*8.36*/(user)/*8.42*/(bool)/*8.48*/(personaForm)/*8.61*/(img)/*8.66*/(interestForm)/*8.80*/(personas)/*8.90*/(interests)/*8.101*/(i)/*8.104*/{_display_(Seq[Any](format.raw/*8.105*/("""
  """),format.raw/*9.3*/("""<div id="Search Analytics">
  	<h3>Data Analytics:</h3>
  	"""),_display_(/*11.5*/posSize),format.raw/*11.12*/("""
  		"""),_display_(/*12.6*/negSize),format.raw/*12.13*/("""
  	"""),format.raw/*13.4*/("""<div id="container" style="width:100%; height:400px;">
  		<script>

			Highcharts.chart('container', """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
			    """),format.raw/*17.8*/("""chart: """),format.raw/*17.15*/("""{"""),format.raw/*17.16*/("""
			        """),format.raw/*18.12*/("""plotBackgroundColor: null,
			        plotBorderWidth: null,
			        plotShadow: false,
			        type: 'pie'
			    """),format.raw/*22.8*/("""}"""),format.raw/*22.9*/(""",
			    title: """),format.raw/*23.15*/("""{"""),format.raw/*23.16*/("""
			        """),format.raw/*24.12*/("""text: 'Sentiment'
			    """),format.raw/*25.8*/("""}"""),format.raw/*25.9*/(""",
			    tooltip: """),format.raw/*26.17*/("""{"""),format.raw/*26.18*/("""
			        """),format.raw/*27.12*/("""pointFormat: '"""),format.raw/*27.26*/("""{"""),format.raw/*27.27*/("""series.name"""),format.raw/*27.38*/("""}"""),format.raw/*27.39*/(""": <b>"""),format.raw/*27.44*/("""{"""),format.raw/*27.45*/("""point.percentage:.1f"""),format.raw/*27.65*/("""}"""),format.raw/*27.66*/("""%</b>'
			    """),format.raw/*28.8*/("""}"""),format.raw/*28.9*/(""",
			    plotOptions: """),format.raw/*29.21*/("""{"""),format.raw/*29.22*/("""
			        """),format.raw/*30.12*/("""pie: """),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
			            """),format.raw/*31.16*/("""allowPointSelect: true,
			            cursor: 'pointer',
			            point: """),format.raw/*33.23*/("""{"""),format.raw/*33.24*/("""
			                """),format.raw/*34.20*/("""events: """),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
			                    """),format.raw/*35.24*/("""click: function () """),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
			                        """),format.raw/*36.28*/("""location.href = window.location.href + '/' +
			                            this.options.key;
			                    """),format.raw/*38.24*/("""}"""),format.raw/*38.25*/("""
			                """),format.raw/*39.20*/("""}"""),format.raw/*39.21*/("""
			            """),format.raw/*40.16*/("""}"""),format.raw/*40.17*/(""",

			            dataLabels: """),format.raw/*42.28*/("""{"""),format.raw/*42.29*/("""
			                """),format.raw/*43.20*/("""enabled: true,
			                format: '<b>"""),format.raw/*44.32*/("""{"""),format.raw/*44.33*/("""point.name"""),format.raw/*44.43*/("""}"""),format.raw/*44.44*/("""</b>: """),format.raw/*44.50*/("""{"""),format.raw/*44.51*/("""point.percentage:.1f"""),format.raw/*44.71*/("""}"""),format.raw/*44.72*/(""" """),format.raw/*44.73*/("""%',
			                style: """),format.raw/*45.27*/("""{"""),format.raw/*45.28*/("""
			                    """),format.raw/*46.24*/("""color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
			                """),format.raw/*47.20*/("""}"""),format.raw/*47.21*/("""
			            """),format.raw/*48.16*/("""}"""),format.raw/*48.17*/("""
			        """),format.raw/*49.12*/("""}"""),format.raw/*49.13*/("""
			    """),format.raw/*50.8*/("""}"""),format.raw/*50.9*/(""",

			    series: ["""),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
			        """),format.raw/*53.12*/("""name: 'Sentiment',
			        colorByPoint: true,
			        data: ["""),format.raw/*55.19*/("""{"""),format.raw/*55.20*/("""
			            """),format.raw/*56.16*/("""name: 'Positive',
			            y: """),_display_(/*57.20*/posSize),format.raw/*57.27*/(""",
			            key: 'positive',
			        """),format.raw/*59.12*/("""}"""),format.raw/*59.13*/(""", """),format.raw/*59.15*/("""{"""),format.raw/*59.16*/("""
			            """),format.raw/*60.16*/("""name: 'Negative',
			            y: """),_display_(/*61.20*/negSize),format.raw/*61.27*/(""",
			            key: 'negative',
			        """),format.raw/*63.12*/("""}"""),format.raw/*63.13*/("""]
			    """),format.raw/*64.8*/("""}"""),format.raw/*64.9*/("""]
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/(""");
  		</script>
  	</div>
  
""")))}),format.raw/*69.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],posTweets:List[String],posSize:Double,negTweets:List[String],negSize:Double,personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,personaForm,img,interestForm,term,personas,interests,i)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],Double,List[String],Double,Form[Persona],String,Form[Interest],String,List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,personaForm,img,interestForm,term,personas,interests,i) => apply(searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,personaForm,img,interestForm,term,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 09 08:19:32 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: ce6fce404cafae9f1079b6ed3f2b026e1d558e33
                  MATRIX: 1119->1|1545->331|1573->333|1769->503|1783->509|1845->551|1974->655|2004->677|2024->689|2038->695|2052->701|2073->714|2086->719|2108->733|2126->743|2146->754|2158->757|2197->758|2226->761|2312->821|2340->828|2372->834|2400->841|2431->845|2561->947|2590->948|2625->956|2660->963|2689->964|2729->976|2877->1097|2905->1098|2949->1114|2978->1115|3018->1127|3070->1152|3098->1153|3144->1171|3173->1172|3213->1184|3255->1198|3284->1199|3323->1210|3352->1211|3385->1216|3414->1217|3462->1237|3491->1238|3532->1252|3560->1253|3610->1275|3639->1276|3679->1288|3712->1293|3741->1294|3785->1310|3893->1390|3922->1391|3970->1411|4006->1419|4035->1420|4087->1444|4134->1463|4163->1464|4219->1492|4364->1609|4393->1610|4441->1630|4470->1631|4514->1647|4543->1648|4601->1678|4630->1679|4678->1699|4752->1745|4781->1746|4819->1756|4848->1757|4882->1763|4911->1764|4959->1784|4988->1785|5017->1786|5075->1816|5104->1817|5156->1841|5278->1935|5307->1936|5351->1952|5380->1953|5420->1965|5449->1966|5484->1974|5512->1975|5559->1994|5588->1995|5628->2007|5724->2075|5753->2076|5797->2092|5861->2129|5889->2136|5962->2181|5991->2182|6021->2184|6050->2185|6094->2201|6158->2238|6186->2245|6259->2290|6288->2291|6324->2300|6352->2301|6384->2306|6412->2307|6473->2338
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|43->11|43->11|44->12|44->12|45->13|48->16|48->16|49->17|49->17|49->17|50->18|54->22|54->22|55->23|55->23|56->24|57->25|57->25|58->26|58->26|59->27|59->27|59->27|59->27|59->27|59->27|59->27|59->27|59->27|60->28|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|70->38|70->38|71->39|71->39|72->40|72->40|74->42|74->42|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|78->46|79->47|79->47|80->48|80->48|81->49|81->49|82->50|82->50|84->52|84->52|85->53|87->55|87->55|88->56|89->57|89->57|91->59|91->59|91->59|91->59|92->60|93->61|93->61|95->63|95->63|96->64|96->64|97->65|97->65|101->69
                  -- GENERATED --
              */
          