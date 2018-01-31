
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

object interest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template14[Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],List[String],String,List[String],List[String],List[String],Form[Message],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, personaForm: Form[Persona], img: String, interestForm: Form[Interest], personas: List[String], interests: List[String], track: List[String], i: String, terms: List[String], allTweets: List[String], values: List[String], messageForm: Form[Message]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.305*/("""

"""),format.raw/*4.89*/("""  """),format.raw/*4.91*/("""// Declares a horizontal field constructor as default

<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>

"""),_display_(/*10.2*/main("Interest")/*10.18*/(searchForm)/*10.30*/(user)/*10.36*/(bool)/*10.42*/(personaForm)/*10.55*/(img)/*10.60*/(interestForm)/*10.74*/(personas)/*10.84*/(interests)/*10.95*/(i)/*10.98*/{_display_(Seq[Any](format.raw/*10.99*/("""
  	"""),format.raw/*11.4*/("""<h3>Tracked Searches for """),_display_(/*11.30*/i),format.raw/*11.31*/("""</h3>

  	<div id="carousel-centre" class="tweets">
  		<ul class="nav nav-tabs carlist" id="carouselButtons">
		    <li class="active car" data-target="#carouselExampleControls" data-slide-to="0">
		        <a class="nav-link active carousel-btn" id="cb" data-toggle="tab" href="#">All</a>
		    </li>
		    """),_display_(/*18.8*/for((v, index) <- values.zipWithIndex) yield /*18.46*/{_display_(Seq[Any](format.raw/*18.47*/("""
				"""),format.raw/*19.5*/("""<li class="car" data-target="#carouselExampleControls" data-slide-to=""""),_display_(/*19.76*/{index+1}),format.raw/*19.85*/("""">
					<a class="nav-link carousel-btn" data-toggle="tab" href="#">"""),_display_(/*20.67*/v),format.raw/*20.68*/(""" """),format.raw/*20.69*/("""</a>
				</li>
	    	""")))}),format.raw/*22.8*/("""
		"""),format.raw/*23.3*/("""</ul>

	<br>
  	<div id="carouselExampleControls" class="carousel slide tweets" data-interval="false">
	  <div class="carousel-inner" role="listbox">

	    <div class="carousel-item active">
	    	<div id="all">
			  				<div id="accordion" role="tablist" aria-multiselectable="true">

							 <div class="card">
							    <div class="card-header" role="tab" id="daily">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#today" aria-expanded="true" aria-controls="today">
							          Today
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="today" class="collapse" role="tabpanel" aria-labelledby="today">
				  				<div class="card-columns">
				  					"""),_display_(/*45.13*/for(tweet <- track) yield /*45.32*/{_display_(Seq[Any](format.raw/*45.33*/("""
							      	"""),_display_(/*46.16*/defining(tweet.split("-"))/*46.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*46.58*/(""" 
								      	
								      		"""),_display_(/*48.18*/if(tweetArray(3)=="today")/*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""
										        """),format.raw/*49.19*/("""<div class="card">
										        	<div id=""""),_display_(/*50.30*/tweetArray(1)),format.raw/*50.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*52.34*/tweetArray(1)),format.raw/*52.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*54.96*/tweetArray(1)),format.raw/*54.109*/("""">
								                      Message """),_display_(/*55.40*/tweetArray(2)),format.raw/*55.53*/("""
								                    """),format.raw/*56.29*/("""</button>
								                </div>

										    """)))}),format.raw/*59.16*/(""" 
										    """),format.raw/*60.15*/("""<div class="modal fade" id="all"""),_display_(/*60.47*/tweetArray(1)),format.raw/*60.60*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*71.44*/b4/*71.46*/.form(action=routes.SearchController.sendMessage())/*71.97*/{_display_(Seq[Any](format.raw/*71.98*/(""" 

						                                            """),_display_(/*73.52*/b4/*73.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*76.66*/("""

						                                            """),_display_(/*78.52*/b4/*78.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*81.66*/("""

						                                    
						                                    """),format.raw/*84.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*89.36*/("""
						                              """),format.raw/*90.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										     
								    	
								    """)))}),format.raw/*96.14*/("""
							      """)))}),format.raw/*97.15*/("""
								"""),format.raw/*98.9*/("""</div>
							</div>

							 <div class="card">
							    <div class="card-header" role="tab" id="weekly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#week" aria-expanded="true" aria-controls="week">
							          Past Week
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="week" class="collapse" role="tabpanel" aria-labelledby="week">
					  			<div class="card-columns">
								    """),_display_(/*113.14*/for(tweet <- track) yield /*113.33*/{_display_(Seq[Any](format.raw/*113.34*/("""
								      	"""),_display_(/*114.17*/defining(tweet.split("-"))/*114.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*114.59*/(""" 
									      	
									      		"""),_display_(/*116.19*/if(tweetArray(3)=="week")/*116.44*/{_display_(Seq[Any](format.raw/*116.45*/("""
											        """),format.raw/*117.20*/("""<div class="card">
										        	<div id=""""),_display_(/*118.30*/tweetArray(1)),format.raw/*118.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*120.34*/tweetArray(1)),format.raw/*120.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*122.96*/tweetArray(1)),format.raw/*122.109*/("""">
								                      Message """),_display_(/*123.40*/tweetArray(2)),format.raw/*123.53*/("""
								                    """),format.raw/*124.29*/("""</button>
								                </div>
											    """)))}),format.raw/*126.17*/("""
											    """),format.raw/*127.16*/("""<div class="modal fade" id="all"""),_display_(/*127.48*/tweetArray(1)),format.raw/*127.61*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*138.44*/b4/*138.46*/.form(action=routes.SearchController.sendMessage())/*138.97*/{_display_(Seq[Any](format.raw/*138.98*/(""" 

						                                            """),_display_(/*140.52*/b4/*140.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*143.66*/("""

						                                            """),_display_(/*145.52*/b4/*145.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*148.66*/("""

						                                    
						                                    """),format.raw/*151.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*156.36*/("""
						                              """),format.raw/*157.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										     
									    	""")))}),format.raw/*162.16*/("""
									    
								    """)))}),format.raw/*164.14*/("""
								"""),format.raw/*165.9*/("""</div>
							</div>


							<div class="card">
							    <div class="card-header" role="tab" id="monthly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#month" aria-expanded="true" aria-controls="month">
							          Past Month
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="month" class="collapse" role="tabpanel" aria-labelledby="month">
				  				<div class="card-columns">
							      """),_display_(/*181.15*/for(tweet <- track) yield /*181.34*/{_display_(Seq[Any](format.raw/*181.35*/("""
							      	"""),_display_(/*182.16*/defining(tweet.split("-"))/*182.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*182.58*/(""" 
								   		"""),_display_(/*183.15*/if(tweetArray(3)=="month")/*183.41*/{_display_(Seq[Any](format.raw/*183.42*/("""
										        """),format.raw/*184.19*/("""<div class="card">
										        	<div id=""""),_display_(/*185.30*/tweetArray(1)),format.raw/*185.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*187.34*/tweetArray(1)),format.raw/*187.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*189.96*/tweetArray(1)),format.raw/*189.109*/("""">
								                      Message """),_display_(/*190.40*/tweetArray(2)),format.raw/*190.53*/("""
								                    """),format.raw/*191.29*/("""</button>
								                </div>
										    """)))}),format.raw/*193.16*/("""
				  						"""),format.raw/*194.13*/("""<div class="modal fade" id="all"""),_display_(/*194.45*/tweetArray(1)),format.raw/*194.58*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*205.44*/b4/*205.46*/.form(action=routes.SearchController.sendMessage())/*205.97*/{_display_(Seq[Any](format.raw/*205.98*/(""" 

						                                            """),_display_(/*207.52*/b4/*207.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*210.66*/("""

						                                            """),_display_(/*212.52*/b4/*212.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*215.66*/("""

						                                    
						                                    """),format.raw/*218.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*223.36*/("""
						                              """),format.raw/*224.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										   
								    	
								    """)))}),format.raw/*230.14*/("""
							      """)))}),format.raw/*231.15*/("""
								"""),format.raw/*232.9*/("""</div>
							</div>

							<div class="card">
							    <div class="card-header" role="tab" id="old">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#older" aria-expanded="true" aria-controls="older">
							          Older
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="older" class="collapse" role="tabpanel" aria-labelledby="older">
				  				<div class="card-columns">
							      """),_display_(/*247.15*/for(tweet <- track) yield /*247.34*/{_display_(Seq[Any](format.raw/*247.35*/("""
							      	"""),_display_(/*248.16*/defining(tweet.split("-"))/*248.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*248.58*/(""" 
								      		"""),_display_(/*249.18*/if(tweetArray(3)=="older")/*249.44*/{_display_(Seq[Any](format.raw/*249.45*/("""
										        """),format.raw/*250.19*/("""<div class="card">
										        	<div id=""""),_display_(/*251.30*/tweetArray(1)),format.raw/*251.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*253.34*/tweetArray(1)),format.raw/*253.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*255.96*/tweetArray(1)),format.raw/*255.109*/("""">
								                      Message """),_display_(/*256.40*/tweetArray(2)),format.raw/*256.53*/("""
								                    """),format.raw/*257.29*/("""</button>
								                </div>

								                <div class="modal fade" id="all"""),_display_(/*260.57*/tweetArray(1)),format.raw/*260.70*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*271.44*/b4/*271.46*/.form(action=routes.SearchController.sendMessage())/*271.97*/{_display_(Seq[Any](format.raw/*271.98*/(""" 

						                                            """),_display_(/*273.52*/b4/*273.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*276.66*/("""

						                                            """),_display_(/*278.52*/b4/*278.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*281.66*/("""

						                                    
						                                    """),format.raw/*284.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*289.36*/("""
						                              """),format.raw/*290.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*294.16*/("""
										    
								    	
								    """)))}),format.raw/*297.14*/("""
							      """)))}),format.raw/*298.15*/("""
								"""),format.raw/*299.9*/("""</div>
							</div>

						</div>
					
  				
	    </div>
	</div>

	    """),_display_(/*308.7*/for(term <- terms) yield /*308.25*/{_display_(Seq[Any](format.raw/*308.26*/("""
	  		"""),_display_(/*309.7*/if(term contains i)/*309.26*/{_display_(Seq[Any](format.raw/*309.27*/("""
	  			"""),_display_(/*310.8*/defining(term.replace(" "+i,""))/*310.40*/ { tweetTerm=>_display_(Seq[Any](format.raw/*310.54*/("""
	  				"""),_display_(/*311.9*/defining(tweetTerm.replace(" ","-"))/*311.45*/ { id=>_display_(Seq[Any](format.raw/*311.52*/("""
			  			"""),format.raw/*312.9*/("""<div class="carousel-item">
			  				<div id="accordion" role="tablist" aria-multiselectable="true">

							 <div class="card">
							    <div class="card-header" role="tab" id="daily">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#today"""),_display_(/*318.80*/id),format.raw/*318.82*/("""" aria-expanded="true" aria-controls="today"""),_display_(/*318.126*/id),format.raw/*318.128*/("""">
							          Today
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="today"""),_display_(/*325.23*/id),format.raw/*325.25*/("""" class="collapse" role="tabpanel" aria-labelledby="today"""),_display_(/*325.83*/id),format.raw/*325.85*/("""">
				  				<div class="card-columns">
							      """),_display_(/*327.15*/for(tweet <- track) yield /*327.34*/{_display_(Seq[Any](format.raw/*327.35*/("""
							      	"""),_display_(/*328.16*/defining(tweet.split("-"))/*328.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*328.58*/(""" 
								      	"""),_display_(/*329.17*/if(tweetArray(0)==tweetTerm)/*329.45*/{_display_(Seq[Any](format.raw/*329.46*/("""
								      		"""),_display_(/*330.18*/if(tweetArray(3)=="today")/*330.44*/{_display_(Seq[Any](format.raw/*330.45*/("""
										        """),format.raw/*331.19*/("""<div class="card">
										        	<div id=""""),_display_(/*332.30*/tweetArray(1)),format.raw/*332.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*334.34*/tweetArray(1)),format.raw/*334.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*336.93*/tweet),format.raw/*336.98*/("""">
								                      Message """),_display_(/*337.40*/tweetArray(2)),format.raw/*337.53*/("""
								                    """),format.raw/*338.29*/("""</button>
								                </div>

										    """)))}),format.raw/*341.16*/("""


								                """),format.raw/*344.25*/("""<div class="modal fade" id=""""),_display_(/*344.54*/tweet),format.raw/*344.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*355.44*/b4/*355.46*/.form(action=routes.SearchController.sendMessage())/*355.97*/{_display_(Seq[Any](format.raw/*355.98*/(""" 

						                                            """),_display_(/*357.52*/b4/*357.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*360.66*/("""

						                                            """),_display_(/*362.52*/b4/*362.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*365.66*/("""

						                                    
						                                    """),format.raw/*368.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*373.36*/("""
						                              """),format.raw/*374.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    
								    	""")))}),format.raw/*379.15*/("""
								    """)))}),format.raw/*380.14*/("""
							      """)))}),format.raw/*381.15*/("""
								"""),format.raw/*382.9*/("""</div>
							</div>

							 <div class="card">
							    <div class="card-header" role="tab" id="weekly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#week"""),_display_(/*388.79*/id),format.raw/*388.81*/("""" aria-expanded="true" aria-controls="week"""),_display_(/*388.124*/id),format.raw/*388.126*/("""">
							          Past Week
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="week"""),_display_(/*395.22*/id),format.raw/*395.24*/("""" class="collapse" role="tabpanel" aria-labelledby="week"""),_display_(/*395.81*/id),format.raw/*395.83*/("""">
					  			<div class="card-columns">
								      """),_display_(/*397.16*/for(tweet <- track) yield /*397.35*/{_display_(Seq[Any](format.raw/*397.36*/("""
								      	"""),_display_(/*398.17*/defining(tweet.split("-"))/*398.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*398.59*/(""" 
									      	"""),_display_(/*399.18*/if(tweetArray(0)==tweetTerm)/*399.46*/{_display_(Seq[Any](format.raw/*399.47*/("""
									      		"""),_display_(/*400.19*/if(tweetArray(3)=="week")/*400.44*/{_display_(Seq[Any](format.raw/*400.45*/("""
											        """),format.raw/*401.20*/("""<div class="card">
										        	<div id=""""),_display_(/*402.30*/tweetArray(1)),format.raw/*402.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*404.34*/tweetArray(1)),format.raw/*404.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*406.93*/tweet),format.raw/*406.98*/("""">
								                      Message """),_display_(/*407.40*/tweetArray(2)),format.raw/*407.53*/("""
								                    """),format.raw/*408.29*/("""</button>
								                </div>

												<div class="modal fade" id=""""),_display_(/*411.42*/tweet),format.raw/*411.47*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*422.44*/b4/*422.46*/.form(action=routes.SearchController.sendMessage())/*422.97*/{_display_(Seq[Any](format.raw/*422.98*/(""" 

						                                            """),_display_(/*424.52*/b4/*424.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*427.66*/("""

						                                            """),_display_(/*429.52*/b4/*429.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*432.66*/("""

						                                    
						                                    """),format.raw/*435.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*440.36*/("""
						                              """),format.raw/*441.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>

											    """)))}),format.raw/*446.17*/("""
											    
									    	""")))}),format.raw/*448.16*/("""
									    """)))}),format.raw/*449.15*/("""
								      """)))}),format.raw/*450.16*/("""
								"""),format.raw/*451.9*/("""</div>
							</div>


							<div class="card">
							    <div class="card-header" role="tab" id="monthly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#month"""),_display_(/*458.80*/id),format.raw/*458.82*/("""" aria-expanded="true" aria-controls="month"""),_display_(/*458.126*/id),format.raw/*458.128*/("""">
							          Past Month
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="month"""),_display_(/*465.23*/id),format.raw/*465.25*/("""" class="collapse" role="tabpanel" aria-labelledby="month"""),_display_(/*465.83*/id),format.raw/*465.85*/("""">
				  				<div class="card-columns">
							      """),_display_(/*467.15*/for(tweet <- track) yield /*467.34*/{_display_(Seq[Any](format.raw/*467.35*/("""
							      	"""),_display_(/*468.16*/defining(tweet.split("-"))/*468.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*468.58*/(""" 
								      	"""),_display_(/*469.17*/if(tweetArray(0)==tweetTerm)/*469.45*/{_display_(Seq[Any](format.raw/*469.46*/("""
								      		"""),_display_(/*470.18*/if(tweetArray(3)=="month")/*470.44*/{_display_(Seq[Any](format.raw/*470.45*/("""
										        """),format.raw/*471.19*/("""<div class="card">
										        	<div id=""""),_display_(/*472.30*/tweetArray(1)),format.raw/*472.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*474.34*/tweetArray(1)),format.raw/*474.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*476.93*/tweet),format.raw/*476.98*/("""">
								                      Message """),_display_(/*477.40*/tweetArray(2)),format.raw/*477.53*/("""
								                    """),format.raw/*478.29*/("""</button>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*481.54*/tweet),format.raw/*481.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*492.44*/b4/*492.46*/.form(action=routes.SearchController.sendMessage())/*492.97*/{_display_(Seq[Any](format.raw/*492.98*/(""" 

						                                            """),_display_(/*494.52*/b4/*494.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*497.66*/("""

						                                            """),_display_(/*499.52*/b4/*499.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*502.66*/("""

						                                    
						                                    """),format.raw/*505.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*510.36*/("""
						                              """),format.raw/*511.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*515.16*/("""
										    
								    	""")))}),format.raw/*517.15*/("""
								    """)))}),format.raw/*518.14*/("""
							      """)))}),format.raw/*519.15*/("""
								"""),format.raw/*520.9*/("""</div>
							</div>

							<div class="card">
							    <div class="card-header" role="tab" id="old">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#older"""),_display_(/*526.80*/id),format.raw/*526.82*/("""" aria-expanded="true" aria-controls="older"""),_display_(/*526.126*/id),format.raw/*526.128*/("""">
							          Older
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="older"""),_display_(/*533.23*/id),format.raw/*533.25*/("""" class="collapse" role="tabpanel" aria-labelledby="older"""),_display_(/*533.83*/id),format.raw/*533.85*/("""">
				  				<div class="card-columns">
							      """),_display_(/*535.15*/for(tweet <- track) yield /*535.34*/{_display_(Seq[Any](format.raw/*535.35*/("""
							      	"""),_display_(/*536.16*/defining(tweet.split("-"))/*536.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*536.58*/(""" 
								      	"""),_display_(/*537.17*/if(tweetArray(0)==tweetTerm)/*537.45*/{_display_(Seq[Any](format.raw/*537.46*/("""
								      		"""),_display_(/*538.18*/if(tweetArray(3)=="older")/*538.44*/{_display_(Seq[Any](format.raw/*538.45*/("""
										        """),format.raw/*539.19*/("""<div class="card">
										        	<div id=""""),_display_(/*540.30*/tweetArray(1)),format.raw/*540.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*542.34*/tweetArray(1)),format.raw/*542.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*544.93*/tweet),format.raw/*544.98*/("""">
								                      Message """),_display_(/*545.40*/tweetArray(2)),format.raw/*545.53*/("""
								                    """),format.raw/*546.29*/("""</button>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*549.54*/tweet),format.raw/*549.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*560.44*/b4/*560.46*/.form(action=routes.SearchController.sendMessage())/*560.97*/{_display_(Seq[Any](format.raw/*560.98*/(""" 

						                                            """),_display_(/*562.52*/b4/*562.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*565.66*/("""

						                                            """),_display_(/*567.52*/b4/*567.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*570.66*/("""

						                                    
						                                    """),format.raw/*573.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*578.36*/("""
						                              """),format.raw/*579.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*583.16*/("""
										    
								    	""")))}),format.raw/*585.15*/("""
								    """)))}),format.raw/*586.14*/("""
							      """)))}),format.raw/*587.15*/("""
								"""),format.raw/*588.9*/("""</div>
							</div>

						</div>
					</div>
				
                    """)))}),format.raw/*594.22*/("""

				""")))}),format.raw/*596.6*/("""
	  		""")))}),format.raw/*597.7*/("""
	  	""")))}),format.raw/*598.6*/("""
	  """),format.raw/*599.4*/("""</div>
	</div>
</div>

""")))}),format.raw/*603.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,personaForm:Form[Persona],img:String,interestForm:Form[Interest],personas:List[String],interests:List[String],track:List[String],i:String,terms:List[String],allTweets:List[String],values:List[String],messageForm:Form[Message]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,track,i,terms,allTweets,values,messageForm)

  def f:((Form[Search],String,Integer,Form[Persona],String,Form[Interest],List[String],List[String],List[String],String,List[String],List[String],List[String],Form[Message]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,personaForm,img,interestForm,personas,interests,track,i,terms,allTweets,values,messageForm) => apply(searchForm,user,bool,personaForm,img,interestForm,personas,interests,track,i,terms,allTweets,values,messageForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 31 12:02:43 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: 3434e27d7d42238991a92257db0100acdd97494a
                  MATRIX: 1108->1|1484->307|1521->324|1553->348|1647->304|1676->411|1705->413|1956->638|1970->644|2032->686|2096->724|2121->740|2142->752|2157->758|2172->764|2194->777|2208->782|2231->796|2250->806|2270->817|2282->820|2321->821|2352->825|2405->851|2427->852|2763->1162|2817->1200|2856->1201|2888->1206|2986->1277|3016->1286|3112->1355|3134->1356|3163->1357|3215->1379|3245->1382|4024->2134|4059->2153|4098->2154|4141->2170|4176->2196|4230->2212|4292->2247|4327->2273|4366->2274|4413->2293|4488->2341|4522->2354|4620->2425|4654->2438|4810->2567|4845->2580|4914->2622|4948->2635|5005->2664|5093->2721|5137->2737|5196->2769|5230->2782|6096->3621|6107->3623|6167->3674|6206->3675|6287->3729|6298->3731|6634->4046|6714->4099|6725->4101|6998->4353|7113->4440|7531->4827|7596->4864|7794->5031|7840->5046|7876->5055|8394->5545|8430->5564|8470->5565|8515->5582|8551->5608|8606->5624|8671->5661|8706->5686|8746->5687|8795->5707|8871->5755|8906->5768|9005->5839|9040->5852|9197->5981|9233->5994|9303->6036|9338->6049|9396->6078|9485->6135|9530->6151|9590->6183|9625->6196|10492->7035|10504->7037|10565->7088|10605->7089|10687->7143|10699->7145|11036->7460|11117->7513|11129->7515|11403->7767|11519->7854|11938->8241|12004->8278|12191->8433|12251->8461|12288->8470|12813->8967|12849->8986|12889->8987|12933->9003|12969->9029|13024->9045|13068->9061|13104->9087|13144->9088|13192->9107|13268->9155|13303->9168|13402->9239|13437->9252|13594->9381|13630->9394|13700->9436|13735->9449|13793->9478|13881->9534|13923->9547|13983->9579|14018->9592|14885->10431|14897->10433|14958->10484|14998->10485|15080->10539|15092->10541|15429->10856|15510->10909|15522->10911|15796->11163|15912->11250|16331->11637|16397->11674|16594->11839|16641->11854|16678->11863|17193->12350|17229->12369|17269->12370|17313->12386|17349->12412|17404->12428|17451->12447|17487->12473|17527->12474|17575->12493|17651->12541|17686->12554|17785->12625|17820->12638|17977->12767|18013->12780|18083->12822|18118->12835|18176->12864|18302->12962|18337->12975|19204->13814|19216->13816|19277->13867|19317->13868|19399->13922|19411->13924|19748->14239|19829->14292|19841->14294|20115->14546|20231->14633|20650->15020|20716->15057|20887->15196|20962->15239|21009->15254|21046->15263|21148->15338|21183->15356|21223->15357|21257->15364|21286->15383|21326->15384|21361->15392|21403->15424|21456->15438|21492->15447|21538->15483|21584->15490|21621->15499|21947->15797|21971->15799|22044->15843|22069->15845|22217->15965|22241->15967|22327->16025|22351->16027|22433->16081|22469->16100|22509->16101|22553->16117|22589->16143|22644->16159|22690->16177|22728->16205|22768->16206|22814->16224|22850->16250|22890->16251|22938->16270|23014->16318|23049->16331|23147->16401|23182->16414|23335->16539|23362->16544|23432->16586|23467->16599|23525->16628|23614->16685|23670->16712|23727->16741|23754->16746|24621->17585|24633->17587|24694->17638|24734->17639|24816->17693|24828->17695|25165->18010|25246->18063|25258->18065|25532->18317|25648->18404|26067->18791|26133->18828|26318->18981|26364->18995|26411->19010|26448->19019|26694->19237|26718->19239|26790->19282|26815->19284|26966->19407|26990->19409|27075->19466|27099->19468|27182->19523|27218->19542|27258->19543|27303->19560|27339->19586|27394->19602|27441->19621|27479->19649|27519->19650|27566->19669|27601->19694|27641->19695|27690->19715|27766->19763|27801->19776|27899->19846|27934->19859|28087->19984|28114->19989|28184->20031|28219->20044|28277->20073|28388->20156|28415->20161|29282->21000|29294->21002|29355->21053|29395->21054|29477->21108|29489->21110|29826->21425|29907->21478|29919->21480|30193->21732|30309->21819|30728->22206|30794->22243|30967->22384|31031->22416|31078->22431|31126->22447|31163->22456|31411->22676|31435->22678|31508->22722|31533->22724|31686->22849|31710->22851|31796->22909|31820->22911|31902->22965|31938->22984|31978->22985|32022->23001|32058->23027|32113->23043|32159->23061|32197->23089|32237->23090|32283->23108|32319->23134|32359->23135|32407->23154|32483->23202|32518->23215|32616->23285|32651->23298|32804->23423|32831->23428|32901->23470|32936->23483|32994->23512|33117->23607|33144->23612|34011->24451|34023->24453|34084->24504|34124->24505|34206->24559|34218->24561|34555->24876|34636->24929|34648->24931|34922->25183|35038->25270|35457->25657|35523->25694|35694->25833|35756->25863|35802->25877|35849->25892|35886->25901|36129->26116|36153->26118|36226->26162|36251->26164|36399->26284|36423->26286|36509->26344|36533->26346|36615->26400|36651->26419|36691->26420|36735->26436|36771->26462|36826->26478|36872->26496|36910->26524|36950->26525|36996->26543|37032->26569|37072->26570|37120->26589|37196->26637|37231->26650|37329->26720|37364->26733|37517->26858|37544->26863|37614->26905|37649->26918|37707->26947|37830->27042|37857->27047|38724->27886|38736->27888|38797->27939|38837->27940|38919->27994|38931->27996|39268->28311|39349->28364|39361->28366|39635->28618|39751->28705|40170->29092|40236->29129|40407->29268|40469->29298|40515->29312|40562->29327|40599->29336|40704->29409|40742->29416|40780->29423|40817->29429|40849->29433|40904->29457
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|55->23|77->45|77->45|77->45|78->46|78->46|78->46|80->48|80->48|80->48|81->49|82->50|82->50|84->52|84->52|86->54|86->54|87->55|87->55|88->56|91->59|92->60|92->60|92->60|103->71|103->71|103->71|103->71|105->73|105->73|108->76|110->78|110->78|113->81|116->84|121->89|122->90|128->96|129->97|130->98|145->113|145->113|145->113|146->114|146->114|146->114|148->116|148->116|148->116|149->117|150->118|150->118|152->120|152->120|154->122|154->122|155->123|155->123|156->124|158->126|159->127|159->127|159->127|170->138|170->138|170->138|170->138|172->140|172->140|175->143|177->145|177->145|180->148|183->151|188->156|189->157|194->162|196->164|197->165|213->181|213->181|213->181|214->182|214->182|214->182|215->183|215->183|215->183|216->184|217->185|217->185|219->187|219->187|221->189|221->189|222->190|222->190|223->191|225->193|226->194|226->194|226->194|237->205|237->205|237->205|237->205|239->207|239->207|242->210|244->212|244->212|247->215|250->218|255->223|256->224|262->230|263->231|264->232|279->247|279->247|279->247|280->248|280->248|280->248|281->249|281->249|281->249|282->250|283->251|283->251|285->253|285->253|287->255|287->255|288->256|288->256|289->257|292->260|292->260|303->271|303->271|303->271|303->271|305->273|305->273|308->276|310->278|310->278|313->281|316->284|321->289|322->290|326->294|329->297|330->298|331->299|340->308|340->308|340->308|341->309|341->309|341->309|342->310|342->310|342->310|343->311|343->311|343->311|344->312|350->318|350->318|350->318|350->318|357->325|357->325|357->325|357->325|359->327|359->327|359->327|360->328|360->328|360->328|361->329|361->329|361->329|362->330|362->330|362->330|363->331|364->332|364->332|366->334|366->334|368->336|368->336|369->337|369->337|370->338|373->341|376->344|376->344|376->344|387->355|387->355|387->355|387->355|389->357|389->357|392->360|394->362|394->362|397->365|400->368|405->373|406->374|411->379|412->380|413->381|414->382|420->388|420->388|420->388|420->388|427->395|427->395|427->395|427->395|429->397|429->397|429->397|430->398|430->398|430->398|431->399|431->399|431->399|432->400|432->400|432->400|433->401|434->402|434->402|436->404|436->404|438->406|438->406|439->407|439->407|440->408|443->411|443->411|454->422|454->422|454->422|454->422|456->424|456->424|459->427|461->429|461->429|464->432|467->435|472->440|473->441|478->446|480->448|481->449|482->450|483->451|490->458|490->458|490->458|490->458|497->465|497->465|497->465|497->465|499->467|499->467|499->467|500->468|500->468|500->468|501->469|501->469|501->469|502->470|502->470|502->470|503->471|504->472|504->472|506->474|506->474|508->476|508->476|509->477|509->477|510->478|513->481|513->481|524->492|524->492|524->492|524->492|526->494|526->494|529->497|531->499|531->499|534->502|537->505|542->510|543->511|547->515|549->517|550->518|551->519|552->520|558->526|558->526|558->526|558->526|565->533|565->533|565->533|565->533|567->535|567->535|567->535|568->536|568->536|568->536|569->537|569->537|569->537|570->538|570->538|570->538|571->539|572->540|572->540|574->542|574->542|576->544|576->544|577->545|577->545|578->546|581->549|581->549|592->560|592->560|592->560|592->560|594->562|594->562|597->565|599->567|599->567|602->570|605->573|610->578|611->579|615->583|617->585|618->586|619->587|620->588|626->594|628->596|629->597|630->598|631->599|635->603
                  -- GENERATED --
              */
          