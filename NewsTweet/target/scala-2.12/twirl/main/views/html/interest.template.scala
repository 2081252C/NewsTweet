
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
						                                    """),_display_(/*71.44*/b4/*71.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*71.110*/{_display_(Seq[Any](format.raw/*71.111*/(""" 

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
						                                    """),_display_(/*138.44*/b4/*138.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*138.110*/{_display_(Seq[Any](format.raw/*138.111*/(""" 

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
						                                    """),_display_(/*205.44*/b4/*205.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*205.110*/{_display_(Seq[Any](format.raw/*205.111*/(""" 

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
						                                    """),_display_(/*271.44*/b4/*271.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*271.110*/{_display_(Seq[Any](format.raw/*271.111*/(""" 

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
						                                    """),_display_(/*355.44*/b4/*355.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*355.110*/{_display_(Seq[Any](format.raw/*355.111*/(""" 
						                                            """),_display_(/*356.52*/b4/*356.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*359.66*/("""

						                                            """),_display_(/*361.52*/b4/*361.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*364.66*/("""

						                                    
						                                    """),format.raw/*367.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*372.36*/("""
						                              """),format.raw/*373.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    
								    	""")))}),format.raw/*378.15*/("""
								    """)))}),format.raw/*379.14*/("""
							      """)))}),format.raw/*380.15*/("""
								"""),format.raw/*381.9*/("""</div>
							</div>

							 <div class="card">
							    <div class="card-header" role="tab" id="weekly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#week"""),_display_(/*387.79*/id),format.raw/*387.81*/("""" aria-expanded="true" aria-controls="week"""),_display_(/*387.124*/id),format.raw/*387.126*/("""">
							          Past Week
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="week"""),_display_(/*394.22*/id),format.raw/*394.24*/("""" class="collapse" role="tabpanel" aria-labelledby="week"""),_display_(/*394.81*/id),format.raw/*394.83*/("""">
					  			<div class="card-columns">
								      """),_display_(/*396.16*/for(tweet <- track) yield /*396.35*/{_display_(Seq[Any](format.raw/*396.36*/("""
								      	"""),_display_(/*397.17*/defining(tweet.split("-"))/*397.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*397.59*/(""" 
									      	"""),_display_(/*398.18*/if(tweetArray(0)==tweetTerm)/*398.46*/{_display_(Seq[Any](format.raw/*398.47*/("""
									      		"""),_display_(/*399.19*/if(tweetArray(3)=="week")/*399.44*/{_display_(Seq[Any](format.raw/*399.45*/("""
											        """),format.raw/*400.20*/("""<div class="card">
										        	<div id=""""),_display_(/*401.30*/tweetArray(1)),format.raw/*401.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*403.34*/tweetArray(1)),format.raw/*403.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*405.93*/tweet),format.raw/*405.98*/("""">
								                      Message """),_display_(/*406.40*/tweetArray(2)),format.raw/*406.53*/("""
								                    """),format.raw/*407.29*/("""</button>
								                </div>

												<div class="modal fade" id=""""),_display_(/*410.42*/tweet),format.raw/*410.47*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*421.44*/b4/*421.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*421.110*/{_display_(Seq[Any](format.raw/*421.111*/(""" 

						                                            """),_display_(/*423.52*/b4/*423.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*426.66*/("""

						                                            """),_display_(/*428.52*/b4/*428.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*431.66*/("""

						                                    
						                                    """),format.raw/*434.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*439.36*/("""
						                              """),format.raw/*440.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>

											    """)))}),format.raw/*445.17*/("""
											    
									    	""")))}),format.raw/*447.16*/("""
									    """)))}),format.raw/*448.15*/("""
								      """)))}),format.raw/*449.16*/("""
								"""),format.raw/*450.9*/("""</div>
							</div>


							<div class="card">
							    <div class="card-header" role="tab" id="monthly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#month"""),_display_(/*457.80*/id),format.raw/*457.82*/("""" aria-expanded="true" aria-controls="month"""),_display_(/*457.126*/id),format.raw/*457.128*/("""">
							          Past Month
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="month"""),_display_(/*464.23*/id),format.raw/*464.25*/("""" class="collapse" role="tabpanel" aria-labelledby="month"""),_display_(/*464.83*/id),format.raw/*464.85*/("""">
				  				<div class="card-columns">
							      """),_display_(/*466.15*/for(tweet <- track) yield /*466.34*/{_display_(Seq[Any](format.raw/*466.35*/("""
							      	"""),_display_(/*467.16*/defining(tweet.split("-"))/*467.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*467.58*/(""" 
								      	"""),_display_(/*468.17*/if(tweetArray(0)==tweetTerm)/*468.45*/{_display_(Seq[Any](format.raw/*468.46*/("""
								      		"""),_display_(/*469.18*/if(tweetArray(3)=="month")/*469.44*/{_display_(Seq[Any](format.raw/*469.45*/("""
										        """),format.raw/*470.19*/("""<div class="card">
										        	<div id=""""),_display_(/*471.30*/tweetArray(1)),format.raw/*471.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*473.34*/tweetArray(1)),format.raw/*473.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*475.93*/tweet),format.raw/*475.98*/("""">
								                      Message """),_display_(/*476.40*/tweetArray(2)),format.raw/*476.53*/("""
								                    """),format.raw/*477.29*/("""</button>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*480.54*/tweet),format.raw/*480.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*491.44*/b4/*491.46*/.form(action=routes.SearchController.sendMessage())/*491.97*/{_display_(Seq[Any](format.raw/*491.98*/(""" 

						                                            """),_display_(/*493.52*/b4/*493.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*496.66*/("""

						                                            """),_display_(/*498.52*/b4/*498.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*501.66*/("""


						                                    
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
						                                    """),_display_(/*560.44*/b4/*560.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*560.110*/{_display_(Seq[Any](format.raw/*560.111*/(""" 

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
                  DATE: Fri Feb 02 10:24:46 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: b94bd03095c8d39c3eaf4fa6d2718423a5917155
                  MATRIX: 1108->1|1484->307|1521->324|1553->348|1647->304|1676->411|1705->413|1956->638|1970->644|2032->686|2096->724|2121->740|2142->752|2157->758|2172->764|2194->777|2208->782|2231->796|2250->806|2270->817|2282->820|2321->821|2352->825|2405->851|2427->852|2763->1162|2817->1200|2856->1201|2888->1206|2986->1277|3016->1286|3112->1355|3134->1356|3163->1357|3215->1379|3245->1382|4024->2134|4059->2153|4098->2154|4141->2170|4176->2196|4230->2212|4292->2247|4327->2273|4366->2274|4413->2293|4488->2341|4522->2354|4620->2425|4654->2438|4810->2567|4845->2580|4914->2622|4948->2635|5005->2664|5093->2721|5137->2737|5196->2769|5230->2782|6096->3621|6107->3623|6181->3687|6221->3688|6302->3742|6313->3744|6649->4059|6729->4112|6740->4114|7013->4366|7128->4453|7546->4840|7611->4877|7809->5044|7855->5059|7891->5068|8409->5558|8445->5577|8485->5578|8530->5595|8566->5621|8621->5637|8686->5674|8721->5699|8761->5700|8810->5720|8886->5768|8921->5781|9020->5852|9055->5865|9212->5994|9248->6007|9318->6049|9353->6062|9411->6091|9500->6148|9545->6164|9605->6196|9640->6209|10507->7048|10519->7050|10594->7114|10635->7115|10717->7169|10729->7171|11066->7486|11147->7539|11159->7541|11433->7793|11549->7880|11968->8267|12034->8304|12221->8459|12281->8487|12318->8496|12843->8993|12879->9012|12919->9013|12963->9029|12999->9055|13054->9071|13098->9087|13134->9113|13174->9114|13222->9133|13298->9181|13333->9194|13432->9265|13467->9278|13624->9407|13660->9420|13730->9462|13765->9475|13823->9504|13911->9560|13953->9573|14013->9605|14048->9618|14915->10457|14927->10459|15002->10523|15043->10524|15125->10578|15137->10580|15474->10895|15555->10948|15567->10950|15841->11202|15957->11289|16376->11676|16442->11713|16639->11878|16686->11893|16723->11902|17238->12389|17274->12408|17314->12409|17358->12425|17394->12451|17449->12467|17496->12486|17532->12512|17572->12513|17620->12532|17696->12580|17731->12593|17830->12664|17865->12677|18022->12806|18058->12819|18128->12861|18163->12874|18221->12903|18347->13001|18382->13014|19249->13853|19261->13855|19336->13919|19377->13920|19459->13974|19471->13976|19808->14291|19889->14344|19901->14346|20175->14598|20291->14685|20710->15072|20776->15109|20947->15248|21022->15291|21069->15306|21106->15315|21208->15390|21243->15408|21283->15409|21317->15416|21346->15435|21386->15436|21421->15444|21463->15476|21516->15490|21552->15499|21598->15535|21644->15542|21681->15551|22007->15849|22031->15851|22104->15895|22129->15897|22277->16017|22301->16019|22387->16077|22411->16079|22493->16133|22529->16152|22569->16153|22613->16169|22649->16195|22704->16211|22750->16229|22788->16257|22828->16258|22874->16276|22910->16302|22950->16303|22998->16322|23074->16370|23109->16383|23207->16453|23242->16466|23395->16591|23422->16596|23492->16638|23527->16651|23585->16680|23674->16737|23730->16764|23787->16793|23814->16798|24681->17637|24693->17639|24768->17703|24809->17704|24890->17757|24902->17759|25239->18074|25320->18127|25332->18129|25606->18381|25722->18468|26141->18855|26207->18892|26392->19045|26438->19059|26485->19074|26522->19083|26768->19301|26792->19303|26864->19346|26889->19348|27040->19471|27064->19473|27149->19530|27173->19532|27256->19587|27292->19606|27332->19607|27377->19624|27413->19650|27468->19666|27515->19685|27553->19713|27593->19714|27640->19733|27675->19758|27715->19759|27764->19779|27840->19827|27875->19840|27973->19910|28008->19923|28161->20048|28188->20053|28258->20095|28293->20108|28351->20137|28462->20220|28489->20225|29356->21064|29368->21066|29443->21130|29484->21131|29566->21185|29578->21187|29915->21502|29996->21555|30008->21557|30282->21809|30398->21896|30817->22283|30883->22320|31056->22461|31120->22493|31167->22508|31215->22524|31252->22533|31500->22753|31524->22755|31597->22799|31622->22801|31775->22926|31799->22928|31885->22986|31909->22988|31991->23042|32027->23061|32067->23062|32111->23078|32147->23104|32202->23120|32248->23138|32286->23166|32326->23167|32372->23185|32408->23211|32448->23212|32496->23231|32572->23279|32607->23292|32705->23362|32740->23375|32893->23500|32920->23505|32990->23547|33025->23560|33083->23589|33206->23684|33233->23689|34100->24528|34112->24530|34173->24581|34213->24582|34295->24636|34307->24638|34644->24953|34725->25006|34737->25008|35011->25260|35128->25348|35547->25735|35613->25772|35784->25911|35846->25941|35892->25955|35939->25970|35976->25979|36219->26194|36243->26196|36316->26240|36341->26242|36489->26362|36513->26364|36599->26422|36623->26424|36705->26478|36741->26497|36781->26498|36825->26514|36861->26540|36916->26556|36962->26574|37000->26602|37040->26603|37086->26621|37122->26647|37162->26648|37210->26667|37286->26715|37321->26728|37419->26798|37454->26811|37607->26936|37634->26941|37704->26983|37739->26996|37797->27025|37920->27120|37947->27125|38814->27964|38826->27966|38901->28030|38942->28031|39024->28085|39036->28087|39373->28402|39454->28455|39466->28457|39740->28709|39856->28796|40275->29183|40341->29220|40512->29359|40574->29389|40620->29403|40667->29418|40704->29427|40809->29500|40847->29507|40885->29514|40922->29520|40954->29524|41009->29548
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|55->23|77->45|77->45|77->45|78->46|78->46|78->46|80->48|80->48|80->48|81->49|82->50|82->50|84->52|84->52|86->54|86->54|87->55|87->55|88->56|91->59|92->60|92->60|92->60|103->71|103->71|103->71|103->71|105->73|105->73|108->76|110->78|110->78|113->81|116->84|121->89|122->90|128->96|129->97|130->98|145->113|145->113|145->113|146->114|146->114|146->114|148->116|148->116|148->116|149->117|150->118|150->118|152->120|152->120|154->122|154->122|155->123|155->123|156->124|158->126|159->127|159->127|159->127|170->138|170->138|170->138|170->138|172->140|172->140|175->143|177->145|177->145|180->148|183->151|188->156|189->157|194->162|196->164|197->165|213->181|213->181|213->181|214->182|214->182|214->182|215->183|215->183|215->183|216->184|217->185|217->185|219->187|219->187|221->189|221->189|222->190|222->190|223->191|225->193|226->194|226->194|226->194|237->205|237->205|237->205|237->205|239->207|239->207|242->210|244->212|244->212|247->215|250->218|255->223|256->224|262->230|263->231|264->232|279->247|279->247|279->247|280->248|280->248|280->248|281->249|281->249|281->249|282->250|283->251|283->251|285->253|285->253|287->255|287->255|288->256|288->256|289->257|292->260|292->260|303->271|303->271|303->271|303->271|305->273|305->273|308->276|310->278|310->278|313->281|316->284|321->289|322->290|326->294|329->297|330->298|331->299|340->308|340->308|340->308|341->309|341->309|341->309|342->310|342->310|342->310|343->311|343->311|343->311|344->312|350->318|350->318|350->318|350->318|357->325|357->325|357->325|357->325|359->327|359->327|359->327|360->328|360->328|360->328|361->329|361->329|361->329|362->330|362->330|362->330|363->331|364->332|364->332|366->334|366->334|368->336|368->336|369->337|369->337|370->338|373->341|376->344|376->344|376->344|387->355|387->355|387->355|387->355|388->356|388->356|391->359|393->361|393->361|396->364|399->367|404->372|405->373|410->378|411->379|412->380|413->381|419->387|419->387|419->387|419->387|426->394|426->394|426->394|426->394|428->396|428->396|428->396|429->397|429->397|429->397|430->398|430->398|430->398|431->399|431->399|431->399|432->400|433->401|433->401|435->403|435->403|437->405|437->405|438->406|438->406|439->407|442->410|442->410|453->421|453->421|453->421|453->421|455->423|455->423|458->426|460->428|460->428|463->431|466->434|471->439|472->440|477->445|479->447|480->448|481->449|482->450|489->457|489->457|489->457|489->457|496->464|496->464|496->464|496->464|498->466|498->466|498->466|499->467|499->467|499->467|500->468|500->468|500->468|501->469|501->469|501->469|502->470|503->471|503->471|505->473|505->473|507->475|507->475|508->476|508->476|509->477|512->480|512->480|523->491|523->491|523->491|523->491|525->493|525->493|528->496|530->498|530->498|533->501|537->505|542->510|543->511|547->515|549->517|550->518|551->519|552->520|558->526|558->526|558->526|558->526|565->533|565->533|565->533|565->533|567->535|567->535|567->535|568->536|568->536|568->536|569->537|569->537|569->537|570->538|570->538|570->538|571->539|572->540|572->540|574->542|574->542|576->544|576->544|577->545|577->545|578->546|581->549|581->549|592->560|592->560|592->560|592->560|594->562|594->562|597->565|599->567|599->567|602->570|605->573|610->578|611->579|615->583|617->585|618->586|619->587|620->588|626->594|628->596|629->597|630->598|631->599|635->603
                  -- GENERATED --
              */
          