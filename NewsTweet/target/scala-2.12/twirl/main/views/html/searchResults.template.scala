
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template16[Form[Search],Form[Track],Form[Message],String,Integer,List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], messageForm: Form[Message], user: String, bool: Integer, tweets: List[String], popTweets: List[String], recentTweets: List[String], media: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.350*/("""

"""),format.raw/*4.89*/("""  """),format.raw/*4.91*/("""// Declares a horizontal field constructor as default

<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>

"""),_display_(/*10.2*/main("Search Results")/*10.24*/(searchForm)/*10.36*/(user)/*10.42*/(bool)/*10.48*/(personaForm)/*10.61*/(img)/*10.66*/(interestForm)/*10.80*/(personas)/*10.90*/(interests)/*10.101*/(i)/*10.104*/{_display_(Seq[Any](format.raw/*10.105*/("""
  	"""),format.raw/*11.4*/("""<h3>Search Results for """),_display_(/*11.28*/term),format.raw/*11.32*/(""":
      <a href=""""),_display_(/*12.17*/routes/*12.23*/.SearchController.searchAnalytics()),format.raw/*12.58*/("""" class="btn btn-primary" style="float:right;"> Search Analytics </a>
    </h3>
  	  <ul class="nav nav-tabs">
        <li class="nav-item tab_item">
            <a class="nav-link active search_result" onclick="openTab(event, 'recent')">Recent</a>
          </li>
        <li class="nav-item tab_item">
            <a class="nav-link search_result" onclick="openTab(event, 'popular')">Popular</a> 
          </li>
          <li class="nav-item tab_item">
            <a class="nav-link search_result" onclick="openTab(event, 'media')">Media</a>
          </li>
        </ul>

          <div id="recent" class="tweets">
            <div class="card-columns">
              """),_display_(/*28.16*/for(tweet <- recentTweets) yield /*28.42*/{_display_(Seq[Any](format.raw/*28.43*/("""
                """),_display_(/*29.18*/defining(tweet.split("-"))/*29.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*29.60*/("""                 
                  """),format.raw/*30.19*/("""<div class="card">
                    <div id=""""),_display_(/*31.31*/tweetArray(0)),format.raw/*31.44*/("""">
                      <script>
                        rendering(""""),_display_(/*33.37*/tweetArray(0)),format.raw/*33.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*37.94*/tweet),format.raw/*37.99*/("""">
                      Message """),_display_(/*38.32*/tweetArray(1)),format.raw/*38.45*/("""
                    """),format.raw/*39.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*43.48*/tweet),format.raw/*43.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Send Message</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*54.38*/b4/*54.40*/.form(action=routes.SearchController.sendMessage())/*54.91*/{_display_(Seq[Any](format.raw/*54.92*/(""" 

                                            """),_display_(/*56.46*/b4/*56.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*59.60*/("""

                                            """),_display_(/*61.46*/b4/*61.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*64.60*/("""

                                    
                                    """),format.raw/*67.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*72.30*/("""
                              """),format.raw/*73.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*78.18*/("""
              """)))}),format.raw/*79.16*/("""
            """),format.raw/*80.13*/("""</div>
          </div>

          <div id="popular" class="tweets">
            <div class="card-columns">
              """),_display_(/*85.16*/for((tweet) <- popTweets) yield /*85.41*/{_display_(Seq[Any](format.raw/*85.42*/("""
                """),_display_(/*86.18*/defining(tweet.split("-"))/*86.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*86.60*/("""                 
                  """),format.raw/*87.19*/("""<div class="card">
                    <div id=""""),_display_(/*88.31*/tweetArray(0)),format.raw/*88.44*/("""">
                      <script>
                        rendering(""""),_display_(/*90.37*/tweetArray(0)),format.raw/*90.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*94.94*/tweet),format.raw/*94.99*/("""">
                      Message """),_display_(/*95.32*/tweetArray(1)),format.raw/*95.45*/("""
                    """),format.raw/*96.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*100.48*/tweet),format.raw/*100.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Send Message</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*111.38*/b4/*111.40*/.form(action=routes.SearchController.sendMessage())/*111.91*/{_display_(Seq[Any](format.raw/*111.92*/(""" 

                                            """),_display_(/*113.46*/b4/*113.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*116.60*/("""

                                            """),_display_(/*118.46*/b4/*118.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*121.60*/("""

                                    
                                    """),format.raw/*124.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*129.30*/("""
                              """),format.raw/*130.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*135.18*/("""
              """)))}),format.raw/*136.16*/("""
            """),format.raw/*137.13*/("""</div>
          </div>

          <div id="media" class="tweets">
            <div class="card-columns">
              """),_display_(/*142.16*/for(tweet <- media) yield /*142.35*/{_display_(Seq[Any](format.raw/*142.36*/("""
                """),_display_(/*143.18*/defining(tweet.split("-"))/*143.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*143.60*/("""                 
                  """),format.raw/*144.19*/("""<div class="card">
                    <div id=""""),_display_(/*145.31*/tweetArray(0)),format.raw/*145.44*/("""">
                      <script>
                        rendering(""""),_display_(/*147.37*/tweetArray(0)),format.raw/*147.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*151.94*/tweet),format.raw/*151.99*/("""">
                      Message """),_display_(/*152.32*/tweetArray(1)),format.raw/*152.45*/("""
                    """),format.raw/*153.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*157.48*/tweet),format.raw/*157.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Send Message</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*168.38*/b4/*168.40*/.form(action=routes.SearchController.sendMessage())/*168.91*/{_display_(Seq[Any](format.raw/*168.92*/(""" 

                                            """),_display_(/*170.46*/b4/*170.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*173.60*/("""

                                            """),_display_(/*175.46*/b4/*175.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*178.60*/("""

                                    
                                    """),format.raw/*181.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*186.30*/("""
                              """),format.raw/*187.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*192.18*/("""
              """)))}),format.raw/*193.16*/("""
            """),format.raw/*194.13*/("""</div>
          </div>

           """),_display_(/*197.13*/if(bool==1)/*197.24*/{_display_(Seq[Any](format.raw/*197.25*/("""

              """),format.raw/*199.15*/("""<div class="fixed-bottom" id="footer">
                <button type="button" id="track_btn" class="btn btn-primary" data-toggle="modal" data-target="#trackModal">Track Search</button>
              </div>
              

              <!-- Modal -->
              <div class="modal fade" id="trackModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                  <div class="modal-content">
                    <div class="modal-header">
                      <h5 class="modal-title" id="interest-label">Track Search</h5>
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                      </button>
                    </div>
                    <div class="modal-body">
                      <div id="track">
                        """),_display_(/*216.26*/b4/*216.28*/.form(action=routes.SearchController.trackSearch())/*216.79*/{_display_(Seq[Any](format.raw/*216.80*/("""

                            """),_display_(/*218.30*/b4/*218.32*/.text(trackForm("term").copy(value= Option[String](term)),
                              '_label -> "Search Term")),format.raw/*219.56*/("""

                            """),_display_(/*221.30*/b4/*221.32*/.select(
                               trackForm("interest"),
                               helper.options(interests),
                               '_label -> "Interest"
                            )),format.raw/*225.30*/("""

                            """),format.raw/*227.29*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#interest-modal">
                                          create a new interest.
                                        </button>
                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" type="submit">Save changes</button>
                  """)))}),format.raw/*235.20*/("""
                    """),format.raw/*236.21*/("""</div>
                  </div>
                </div>
              </div>

              <div class="modal fade" id="interest-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Add a New Interest</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*252.38*/b4/*252.40*/.horizontal.form(action=routes.InterestController.addInterest(), "col-md-2", "col-md-10")/*252.129*/{ implicit ifc =>_display_(Seq[Any](format.raw/*252.146*/("""

                                        """),_display_(/*254.42*/b4/*254.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*257.56*/("""

                                        """),_display_(/*259.42*/b4/*259.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*263.42*/("""

                                        """),format.raw/*265.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*273.30*/("""
                              """),format.raw/*274.31*/("""</div>
                            </div>
                          </div>
                        </div>

                        <div class="modal fade" id="persona_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="interest-label">Add a New Persona</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>
                              <div class="modal-body">
                                <div id="interest-form">
                                    """),_display_(/*290.38*/b4/*290.40*/.horizontal.form(action=routes.PersonaController.addPersona(), "col-md-2", "col-md-10")/*290.127*/{ implicit ifc =>_display_(Seq[Any](format.raw/*290.144*/("""

                                            """),_display_(/*292.46*/b4/*292.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*295.60*/("""

                                    
                                    """),format.raw/*298.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Save changes</button>
                            """)))}),format.raw/*303.30*/("""
                              """),format.raw/*304.31*/("""</div>
                            </div>
                          </div>
                        </div>

            """)))}),format.raw/*309.14*/("""
""")))}),format.raw/*310.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],messageForm:Form[Message],user:String,bool:Integer,tweets:List[String],popTweets:List[String],recentTweets:List[String],media:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,messageForm,user,bool,tweets,popTweets,recentTweets,media,personaForm,img,interestForm,term,personas,interests,i)

  def f:((Form[Search],Form[Track],Form[Message],String,Integer,List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,messageForm,user,bool,tweets,popTweets,recentTweets,media,personaForm,img,interestForm,term,personas,interests,i) => apply(searchForm,trackForm,messageForm,user,bool,tweets,popTweets,recentTweets,media,personaForm,img,interestForm,term,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 27 00:09:52 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 7c74522ebd26439742899d300a432f74cdf4d619
                  MATRIX: 1132->1|1553->352|1590->369|1622->393|1716->349|1745->456|1774->458|2025->683|2039->689|2101->731|2165->769|2196->791|2217->803|2232->809|2247->815|2269->828|2283->833|2306->847|2325->857|2346->868|2359->871|2399->872|2430->876|2481->900|2506->904|2551->922|2566->928|2622->963|3323->1637|3365->1663|3404->1664|3449->1682|3484->1708|3538->1724|3602->1760|3678->1809|3712->1822|3809->1892|3843->1905|4049->2084|4075->2089|4136->2123|4170->2136|4219->2157|4346->2257|4372->2262|5172->3035|5183->3037|5243->3088|5282->3089|5357->3137|5368->3139|5686->3436|5760->3483|5771->3485|6026->3719|6129->3794|6517->4151|6576->4182|6755->4330|6802->4346|6843->4359|6993->4482|7034->4507|7073->4508|7118->4526|7153->4552|7207->4568|7271->4604|7347->4653|7381->4666|7478->4736|7512->4749|7718->4928|7744->4933|7805->4967|7839->4980|7888->5001|8016->5101|8043->5106|8844->5879|8856->5881|8917->5932|8957->5933|9033->5981|9045->5983|9364->6280|9439->6327|9451->6329|9707->6563|9811->6638|10200->6995|10260->7026|10440->7174|10488->7190|10530->7203|10679->7324|10715->7343|10755->7344|10801->7362|10837->7388|10892->7404|10957->7440|11034->7489|11069->7502|11167->7572|11202->7585|11409->7764|11436->7769|11498->7803|11533->7816|11583->7837|11711->7937|11738->7942|12539->8715|12551->8717|12612->8768|12652->8769|12728->8817|12740->8819|13059->9116|13134->9163|13146->9165|13402->9399|13506->9474|13895->9831|13955->9862|14135->10010|14183->10026|14225->10039|14290->10076|14311->10087|14351->10088|14396->10104|15379->11059|15391->11061|15452->11112|15492->11113|15551->11144|15563->11146|15699->11260|15758->11291|15770->11293|15995->11496|16054->11526|16636->12076|16686->12097|17626->13009|17638->13011|17738->13100|17795->13117|17866->13160|17878->13162|18131->13393|18202->13436|18214->13438|18491->13693|18562->13735|19208->14349|19268->14380|20246->15330|20258->15332|20356->15419|20413->15436|20488->15483|20500->15485|20762->15725|20866->15800|21263->16165|21323->16196|21475->16316|21508->16318
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|63->31|65->33|65->33|69->37|69->37|70->38|70->38|71->39|75->43|75->43|86->54|86->54|86->54|86->54|88->56|88->56|91->59|93->61|93->61|96->64|99->67|104->72|105->73|110->78|111->79|112->80|117->85|117->85|117->85|118->86|118->86|118->86|119->87|120->88|120->88|122->90|122->90|126->94|126->94|127->95|127->95|128->96|132->100|132->100|143->111|143->111|143->111|143->111|145->113|145->113|148->116|150->118|150->118|153->121|156->124|161->129|162->130|167->135|168->136|169->137|174->142|174->142|174->142|175->143|175->143|175->143|176->144|177->145|177->145|179->147|179->147|183->151|183->151|184->152|184->152|185->153|189->157|189->157|200->168|200->168|200->168|200->168|202->170|202->170|205->173|207->175|207->175|210->178|213->181|218->186|219->187|224->192|225->193|226->194|229->197|229->197|229->197|231->199|248->216|248->216|248->216|248->216|250->218|250->218|251->219|253->221|253->221|257->225|259->227|267->235|268->236|284->252|284->252|284->252|284->252|286->254|286->254|289->257|291->259|291->259|295->263|297->265|305->273|306->274|322->290|322->290|322->290|322->290|324->292|324->292|327->295|330->298|335->303|336->304|341->309|342->310
                  -- GENERATED --
              */
          