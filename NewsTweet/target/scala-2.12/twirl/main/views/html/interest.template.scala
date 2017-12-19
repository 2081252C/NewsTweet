
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

object interest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],List[String],String,List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], interests: List[String], tweets: List[String], i: String, terms: List[String], allTweets: List[String], values: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.278*/("""

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>

"""),_display_(/*7.2*/main("Interest")/*7.18*/(searchForm)/*7.30*/(user)/*7.36*/(bool)/*7.42*/(personaForm)/*7.55*/(img)/*7.60*/(interestForm)/*7.74*/(personas)/*7.84*/(interests)/*7.95*/(i)/*7.98*/{_display_(Seq[Any](format.raw/*7.99*/("""
  	"""),format.raw/*8.4*/("""<h3>Tracked Searches for """),_display_(/*8.30*/i),format.raw/*8.31*/("""</h3>

  	<div id="carousel-centre" class="tweets">
  		<ul class="nav nav-tabs carlist" id="carouselButtons">
		    <li class="active car" data-target="#carouselExampleControls" data-slide-to="0">
		        <a class="nav-link active carousel-btn" id="cb" data-toggle="tab" href="#">All</a>
		    </li>
		    """),_display_(/*15.8*/for((v, index) <- values.zipWithIndex) yield /*15.46*/{_display_(Seq[Any](format.raw/*15.47*/("""
				"""),format.raw/*16.5*/("""<li class="car" data-target="#carouselExampleControls" data-slide-to=""""),_display_(/*16.76*/{index+1}),format.raw/*16.85*/("""">
					<a class="nav-link carousel-btn" data-toggle="tab" href="#">"""),_display_(/*17.67*/v),format.raw/*17.68*/(""" """),format.raw/*17.69*/("""</a>
				</li>
	    	""")))}),format.raw/*19.8*/("""
		"""),format.raw/*20.3*/("""</ul>

	<br>
  	<div id="carouselExampleControls" class="carousel slide tweets" data-interval="false">
	  <div class="carousel-inner" role="listbox">

	    <div class="carousel-item active">
  			<div class="card-columns">
		  	"""),_display_(/*28.7*/for(t <- allTweets) yield /*28.26*/{_display_(Seq[Any](format.raw/*28.27*/("""
				"""),format.raw/*29.5*/("""<div class="all">
			        <div class="card"  id=""""),_display_(/*30.36*/t),format.raw/*30.37*/(""" """),format.raw/*30.38*/(""""><br></div>
			        <script>
			          rendering(""""),_display_(/*32.26*/t),format.raw/*32.27*/(""" """),format.raw/*32.28*/("""");
			        </script>
				</div>
		  	""")))}),format.raw/*35.7*/("""
	    """),format.raw/*36.6*/("""</div>
	</div>

	    """),_display_(/*39.7*/for(term <- terms) yield /*39.25*/{_display_(Seq[Any](format.raw/*39.26*/("""
	  		"""),_display_(/*40.7*/if(term contains i)/*40.26*/{_display_(Seq[Any](format.raw/*40.27*/("""
	  			"""),_display_(/*41.8*/defining(term.replace(" "+i,""))/*41.40*/ { tweetTerm=>_display_(Seq[Any](format.raw/*41.54*/("""
		  			"""),format.raw/*42.8*/("""<div class="carousel-item">
		  				<div class="card-columns">
					      """),_display_(/*44.13*/for(tweet <- tweets) yield /*44.33*/{_display_(Seq[Any](format.raw/*44.34*/("""
					      	"""),_display_(/*45.14*/if(tweet contains tweetTerm)/*45.42*/{_display_(Seq[Any](format.raw/*45.43*/("""
					      		"""),_display_(/*46.15*/defining(tweet.replace(tweetTerm+"%",""))/*46.56*/ { tweetID=>_display_(Seq[Any](format.raw/*46.68*/("""
							        """),format.raw/*47.16*/("""<div class="card"  id=""""),_display_(/*47.40*/tweetID),format.raw/*47.47*/(""""><br></div>
							        <script>
							          rendering(""""),_display_(/*49.30*/tweetID),format.raw/*49.37*/("""");
							        </script>
							    """)))}),format.raw/*51.13*/("""
					    	""")))}),format.raw/*52.12*/("""
					      """)))}),format.raw/*53.13*/("""
					"""),format.raw/*54.6*/("""</div>
				</div>
				""")))}),format.raw/*56.6*/("""
	  		""")))}),format.raw/*57.7*/("""
	  	""")))}),format.raw/*58.6*/("""
	  """),format.raw/*59.4*/("""</div>

	  <a class="carousel-control-prev" data-slide="prev" href="#whatIsCarousel">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="sr-only">Previous</span>
	  </a>
	  <a class="carousel-control-next" data-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="sr-only">Next</span>
	  </a>
	</div>
</div>

""")))}),format.raw/*72.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String],tweets:List[String],i:String,terms:List[String],allTweets:List[String],values:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,tweets,i,terms,allTweets,values)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],List[String],String,List[String],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,interests,tweets,i,terms,allTweets,values) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,tweets,i,terms,allTweets,values)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 19:59:07 GMT 2017
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: c1754c7f97a00318f10317c7231d5ad3c85405dd
                  MATRIX: 1094->1|1466->277|1494->279|1690->449|1704->455|1766->497|1829->535|1853->551|1873->563|1887->569|1901->575|1922->588|1935->593|1957->607|1975->617|1994->628|2005->631|2043->632|2073->636|2125->662|2146->663|2482->973|2536->1011|2575->1012|2607->1017|2705->1088|2735->1097|2831->1166|2853->1167|2882->1168|2934->1190|2964->1193|3219->1422|3254->1441|3293->1442|3325->1447|3405->1500|3427->1501|3456->1502|3541->1560|3563->1561|3592->1562|3664->1604|3697->1610|3745->1632|3779->1650|3818->1651|3851->1658|3879->1677|3918->1678|3952->1686|3993->1718|4045->1732|4080->1740|4182->1815|4218->1835|4257->1836|4298->1850|4335->1878|4374->1879|4416->1894|4466->1935|4516->1947|4560->1963|4611->1987|4639->1994|4732->2060|4760->2067|4832->2108|4875->2120|4919->2133|4952->2139|5005->2162|5042->2169|5078->2175|5109->2179|5541->2581
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|51->19|52->20|60->28|60->28|60->28|61->29|62->30|62->30|62->30|64->32|64->32|64->32|67->35|68->36|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|83->51|84->52|85->53|86->54|88->56|89->57|90->58|91->59|104->72
                  -- GENERATED --
              */
          