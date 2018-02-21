
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
  	"""),format.raw/*11.4*/("""<h3>Tracked Searches for "<b>"""),_display_(/*11.34*/i),format.raw/*11.35*/("""</b>"</h3>

  	<div id="loader"></div>

    <div id="page-content" style="display:none">

  	<div id="carousel-centre" class="tweets">
  		<ul class="nav nav-tabs carlist" id="carouselButtons">
		    <li class="active car" data-target="#carouselExampleControls" data-slide-to="0">
		        <a class="nav-link active carousel-btn" id="cb" data-toggle="tab" href="#">All</a>
		    </li>
		    """),_display_(/*22.8*/for((v, index) <- values.zipWithIndex) yield /*22.46*/{_display_(Seq[Any](format.raw/*22.47*/("""
				"""),format.raw/*23.5*/("""<li class="car" data-target="#carouselExampleControls" data-slide-to=""""),_display_(/*23.76*/{index+1}),format.raw/*23.85*/("""">
					<a class="nav-link carousel-btn" data-toggle="tab" href="#">"""),_display_(/*24.67*/v),format.raw/*24.68*/(""" """),format.raw/*24.69*/("""</a>
				</li>
	    	""")))}),format.raw/*26.8*/("""
		"""),format.raw/*27.3*/("""</ul>

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
								<div id="no-today" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="today-cards">
				  					"""),_display_(/*50.13*/for(tweet <- track) yield /*50.32*/{_display_(Seq[Any](format.raw/*50.33*/("""
							      	"""),_display_(/*51.16*/defining(tweet.split("-"))/*51.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*51.58*/(""" 
								      	
								      		"""),_display_(/*53.18*/if(tweetArray(3)=="today")/*53.44*/{_display_(Seq[Any](format.raw/*53.45*/("""
										        """),format.raw/*54.19*/("""<div class="card">
										        	<div id=""""),_display_(/*55.30*/tweetArray(1)),format.raw/*55.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*57.34*/tweetArray(1)),format.raw/*57.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*59.96*/tweetArray(1)),format.raw/*59.109*/("""">
								                      Message """),_display_(/*60.40*/tweetArray(2)),format.raw/*60.53*/("""
								                    """),format.raw/*61.29*/("""</button>
								                </div>

										    
										    <div class="modal fade" id="all"""),_display_(/*65.47*/tweetArray(1)),format.raw/*65.60*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*76.44*/b4/*76.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*76.110*/{_display_(Seq[Any](format.raw/*76.111*/(""" 

						                                            """),_display_(/*78.52*/b4/*78.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*81.66*/("""

						                                            """),_display_(/*83.52*/b4/*83.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*86.66*/("""

						                                    
						                                    """),format.raw/*89.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*94.36*/("""
						                              """),format.raw/*95.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										     
								    	
								    """)))}),format.raw/*101.14*/("""
							      """)))}),format.raw/*102.15*/("""
							  """)))}),format.raw/*103.11*/("""
								"""),format.raw/*104.9*/("""</div>
								<script>displayNoTweetsMessage("today-cards", "no-today")</script>
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
								<div id="no-weeks" style="display:none;"> No tweets to show. </div>
					  			<div class="card-columns" id="week-cards">
								    """),_display_(/*121.14*/for(tweet <- track) yield /*121.33*/{_display_(Seq[Any](format.raw/*121.34*/("""
								      	"""),_display_(/*122.17*/defining(tweet.split("-"))/*122.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*122.59*/(""" 
									      	
									      		"""),_display_(/*124.19*/if(tweetArray(3)=="week")/*124.44*/{_display_(Seq[Any](format.raw/*124.45*/("""
											        """),format.raw/*125.20*/("""<div class="card">
										        	<div id=""""),_display_(/*126.30*/tweetArray(1)),format.raw/*126.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*128.34*/tweetArray(1)),format.raw/*128.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*130.96*/tweetArray(1)),format.raw/*130.109*/("""">
								                      Message """),_display_(/*131.40*/tweetArray(2)),format.raw/*131.53*/("""
								                    """),format.raw/*132.29*/("""</button>
								                </div>
											    """)))}),format.raw/*134.17*/("""
											    """),format.raw/*135.16*/("""<div class="modal fade" id="all"""),_display_(/*135.48*/tweetArray(1)),format.raw/*135.61*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*146.44*/b4/*146.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*146.110*/{_display_(Seq[Any](format.raw/*146.111*/(""" 

						                                            """),_display_(/*148.52*/b4/*148.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*151.66*/("""

						                                            """),_display_(/*153.52*/b4/*153.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*156.66*/("""

						                                    
						                                    """),format.raw/*159.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*164.36*/("""
						                              """),format.raw/*165.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										     
									    	""")))}),format.raw/*170.16*/("""
									    
								    """)))}),format.raw/*172.14*/("""
								    """),format.raw/*173.13*/("""<script>displayNoTweetsMessage("week-cards", "no-weeks")</script>
								</div>
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
								<div id="no-months" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="month-cards">
							      """),_display_(/*191.15*/for(tweet <- track) yield /*191.34*/{_display_(Seq[Any](format.raw/*191.35*/("""
							      	"""),_display_(/*192.16*/defining(tweet.split("-"))/*192.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*192.58*/(""" 
								   		"""),_display_(/*193.15*/if(tweetArray(3)=="month")/*193.41*/{_display_(Seq[Any](format.raw/*193.42*/("""
										        """),format.raw/*194.19*/("""<div class="card">
										        	<div id=""""),_display_(/*195.30*/tweetArray(1)),format.raw/*195.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*197.34*/tweetArray(1)),format.raw/*197.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*199.96*/tweetArray(1)),format.raw/*199.109*/("""">
								                      Message """),_display_(/*200.40*/tweetArray(2)),format.raw/*200.53*/("""
								                    """),format.raw/*201.29*/("""</button>
								                </div>
										    """)))}),format.raw/*203.16*/("""
				  						"""),format.raw/*204.13*/("""<div class="modal fade" id="all"""),_display_(/*204.45*/tweetArray(1)),format.raw/*204.58*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*215.44*/b4/*215.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*215.110*/{_display_(Seq[Any](format.raw/*215.111*/(""" 

						                                            """),_display_(/*217.52*/b4/*217.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*220.66*/("""

						                                            """),_display_(/*222.52*/b4/*222.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*225.66*/("""

						                                    
						                                    """),format.raw/*228.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*233.36*/("""
						                              """),format.raw/*234.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										   
								    	
								    """)))}),format.raw/*240.14*/("""
							      """)))}),format.raw/*241.15*/("""
							      """),format.raw/*242.14*/("""<script>displayNoTweetsMessage("month-cards", "no-months")</script>
								</div>
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
								<div id="no-older" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="older-cards">
							      """),_display_(/*259.15*/for(tweet <- track) yield /*259.34*/{_display_(Seq[Any](format.raw/*259.35*/("""
							      	"""),_display_(/*260.16*/defining(tweet.split("-"))/*260.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*260.58*/(""" 
								      		"""),_display_(/*261.18*/if(tweetArray(3)=="older")/*261.44*/{_display_(Seq[Any](format.raw/*261.45*/("""
										        """),format.raw/*262.19*/("""<div class="card">
										        	<div id=""""),_display_(/*263.30*/tweetArray(1)),format.raw/*263.43*/("""a"></div>
											        <script>
											          rendering(""""),_display_(/*265.34*/tweetArray(1)),format.raw/*265.47*/("""a");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*267.96*/tweetArray(1)),format.raw/*267.109*/("""">
								                      Message """),_display_(/*268.40*/tweetArray(2)),format.raw/*268.53*/("""
								                    """),format.raw/*269.29*/("""</button>
								                </div>

								                <div class="modal fade" id="all"""),_display_(/*272.57*/tweetArray(1)),format.raw/*272.70*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*283.44*/b4/*283.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*283.110*/{_display_(Seq[Any](format.raw/*283.111*/(""" 

						                                            """),_display_(/*285.52*/b4/*285.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*288.66*/("""

						                                            """),_display_(/*290.52*/b4/*290.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*293.66*/("""

						                                    
						                                    """),format.raw/*296.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*301.36*/("""
						                              """),format.raw/*302.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*306.16*/("""
										    
								    	
								    """)))}),format.raw/*309.14*/("""
							      """)))}),format.raw/*310.15*/("""
								"""),format.raw/*311.9*/("""</div>
								<script>displayNoTweetsMessage("older-cards", "no-older")</script>
							</div>

						</div>
					
  				
	    </div>
	</div>

	    """),_display_(/*321.7*/for(term <- terms) yield /*321.25*/{_display_(Seq[Any](format.raw/*321.26*/("""
	  		"""),_display_(/*322.7*/if(term contains i)/*322.26*/{_display_(Seq[Any](format.raw/*322.27*/("""
	  			"""),_display_(/*323.8*/defining(term.replace("-"+i,""))/*323.40*/ { tweetTerm=>_display_(Seq[Any](format.raw/*323.54*/("""
	  				"""),_display_(/*324.9*/defining(tweetTerm.replaceAll(" ","-"))/*324.48*/ { id=>_display_(Seq[Any](format.raw/*324.55*/("""
			  			"""),format.raw/*325.9*/("""<div class="carousel-item">
			  				<div id="accordion" role="tablist" aria-multiselectable="true">

							 <div class="card">
							    <div class="card-header" role="tab" id="daily">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#today"""),_display_(/*331.80*/id),format.raw/*331.82*/("""" aria-expanded="true" aria-controls="today"""),_display_(/*331.126*/id),format.raw/*331.128*/("""">
							          Today
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="today"""),_display_(/*338.23*/id),format.raw/*338.25*/("""" class="collapse" role="tabpanel" aria-labelledby="today"""),_display_(/*338.83*/id),format.raw/*338.85*/("""">
								<div id="no-today"""),_display_(/*339.27*/id),format.raw/*339.29*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="today"""),_display_(/*340.47*/id),format.raw/*340.49*/("""-cards">
							      """),_display_(/*341.15*/for(tweet <- track) yield /*341.34*/{_display_(Seq[Any](format.raw/*341.35*/("""
							      	"""),_display_(/*342.16*/defining(tweet.split("-"))/*342.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*342.58*/(""" 
								      	"""),_display_(/*343.17*/if(tweetArray(0)==tweetTerm)/*343.45*/{_display_(Seq[Any](format.raw/*343.46*/("""
								      		"""),_display_(/*344.18*/if(tweetArray(3)=="today")/*344.44*/{_display_(Seq[Any](format.raw/*344.45*/("""
										        """),format.raw/*345.19*/("""<div class="card">
										        	<div id=""""),_display_(/*346.30*/tweetArray(1)),format.raw/*346.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*348.34*/tweetArray(1)),format.raw/*348.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*350.93*/tweet),format.raw/*350.98*/("""">
								                      Message """),_display_(/*351.40*/tweetArray(2)),format.raw/*351.53*/("""
								                    """),format.raw/*352.29*/("""</button>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*355.54*/tweet),format.raw/*355.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*366.44*/b4/*366.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*366.110*/{_display_(Seq[Any](format.raw/*366.111*/(""" 
						                                            """),_display_(/*367.52*/b4/*367.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*370.66*/("""

						                                            """),_display_(/*372.52*/b4/*372.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*375.66*/("""

						                                    
						                                    """),format.raw/*378.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*383.36*/("""
						                              """),format.raw/*384.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
						                    """)))}),format.raw/*388.28*/("""
										    
								    	""")))}),format.raw/*390.15*/("""
								    """)))}),format.raw/*391.14*/("""
							      """)))}),format.raw/*392.15*/("""
							      
								"""),format.raw/*394.9*/("""</div>
								<script>displayNoTweetsMessage("today"""),_display_(/*395.47*/id),format.raw/*395.49*/("""-cards", "no-today"""),_display_(/*395.68*/id),format.raw/*395.70*/("""")</script>
							</div>

							 <div class="card">
							    <div class="card-header" role="tab" id="weekly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#week"""),_display_(/*401.79*/id),format.raw/*401.81*/("""" aria-expanded="true" aria-controls="week"""),_display_(/*401.124*/id),format.raw/*401.126*/("""">
							          Past Week
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="week"""),_display_(/*408.22*/id),format.raw/*408.24*/("""" class="collapse" role="tabpanel" aria-labelledby="week"""),_display_(/*408.81*/id),format.raw/*408.83*/("""">
								<div id="no-weeks"""),_display_(/*409.27*/id),format.raw/*409.29*/("""" style="display:none;"> No tweets to show. </div>
					  			<div class="card-columns" id="week"""),_display_(/*410.46*/id),format.raw/*410.48*/("""-cards">
								      """),_display_(/*411.16*/for(tweet <- track) yield /*411.35*/{_display_(Seq[Any](format.raw/*411.36*/("""
								      	"""),_display_(/*412.17*/defining(tweet.split("-"))/*412.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*412.59*/(""" 
									      	"""),_display_(/*413.18*/if(tweetArray(0)==tweetTerm)/*413.46*/{_display_(Seq[Any](format.raw/*413.47*/("""
									      		"""),_display_(/*414.19*/if(tweetArray(3)=="week")/*414.44*/{_display_(Seq[Any](format.raw/*414.45*/("""
											        """),format.raw/*415.20*/("""<div class="card">
										        	<div id=""""),_display_(/*416.30*/tweetArray(1)),format.raw/*416.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*418.34*/tweetArray(1)),format.raw/*418.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*420.93*/tweet),format.raw/*420.98*/("""">
								                      Message """),_display_(/*421.40*/tweetArray(2)),format.raw/*421.53*/("""
								                    """),format.raw/*422.29*/("""</button>
								                </div>

												<div class="modal fade" id=""""),_display_(/*425.42*/tweet),format.raw/*425.47*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*436.44*/b4/*436.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*436.110*/{_display_(Seq[Any](format.raw/*436.111*/(""" 

						                                            """),_display_(/*438.52*/b4/*438.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*441.66*/("""

						                                            """),_display_(/*443.52*/b4/*443.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*446.66*/("""

						                                    
						                                    """),format.raw/*449.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*454.36*/("""
						                              """),format.raw/*455.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>

											    """)))}),format.raw/*460.17*/("""
											    
									    	""")))}),format.raw/*462.16*/("""
									    """)))}),format.raw/*463.15*/("""
								      """)))}),format.raw/*464.16*/("""
								      
								"""),format.raw/*466.9*/("""</div>
								<script>displayNoTweetsMessage("week"""),_display_(/*467.46*/id),format.raw/*467.48*/("""-cards", "no-weeks"""),_display_(/*467.67*/id),format.raw/*467.69*/("""")</script>
							</div>


							<div class="card">
							    <div class="card-header" role="tab" id="monthly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#month"""),_display_(/*474.80*/id),format.raw/*474.82*/("""" aria-expanded="true" aria-controls="month"""),_display_(/*474.126*/id),format.raw/*474.128*/("""">
							          Past Month
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="month"""),_display_(/*481.23*/id),format.raw/*481.25*/("""" class="collapse" role="tabpanel" aria-labelledby="month"""),_display_(/*481.83*/id),format.raw/*481.85*/("""">
								<div id="no-months"""),_display_(/*482.28*/id),format.raw/*482.30*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="month"""),_display_(/*483.47*/id),format.raw/*483.49*/("""-cards">
							      """),_display_(/*484.15*/for(tweet <- track) yield /*484.34*/{_display_(Seq[Any](format.raw/*484.35*/("""
							      	"""),_display_(/*485.16*/defining(tweet.split("-"))/*485.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*485.58*/(""" 
								      	"""),_display_(/*486.17*/if(tweetArray(0)==tweetTerm)/*486.45*/{_display_(Seq[Any](format.raw/*486.46*/("""
								      		"""),_display_(/*487.18*/if(tweetArray(3)=="month")/*487.44*/{_display_(Seq[Any](format.raw/*487.45*/("""
										        """),format.raw/*488.19*/("""<div class="card">
										        	<div id=""""),_display_(/*489.30*/tweetArray(1)),format.raw/*489.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*491.34*/tweetArray(1)),format.raw/*491.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*493.93*/tweet),format.raw/*493.98*/("""">
								                      Message """),_display_(/*494.40*/tweetArray(2)),format.raw/*494.53*/("""
								                    """),format.raw/*495.29*/("""</button>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*498.54*/tweet),format.raw/*498.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*509.44*/b4/*509.46*/.form(action=routes.SearchController.sendMessage())/*509.97*/{_display_(Seq[Any](format.raw/*509.98*/(""" 

						                                            """),_display_(/*511.52*/b4/*511.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*514.66*/("""

						                                            """),_display_(/*516.52*/b4/*516.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*519.66*/("""


						                                    
						                                    """),format.raw/*523.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*528.36*/("""
						                              """),format.raw/*529.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*533.16*/("""
										    
								    	""")))}),format.raw/*535.15*/("""
								    """)))}),format.raw/*536.14*/("""
							      """)))}),format.raw/*537.15*/("""
							      
								"""),format.raw/*539.9*/("""</div>
								<script>displayNoTweetsMessage("month"""),_display_(/*540.47*/id),format.raw/*540.49*/("""-cards", "no-months"""),_display_(/*540.69*/id),format.raw/*540.71*/("""")</script>
							</div>

							<div class="card">
							    <div class="card-header" role="tab" id="old">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#older"""),_display_(/*546.80*/id),format.raw/*546.82*/("""" aria-expanded="true" aria-controls="older"""),_display_(/*546.126*/id),format.raw/*546.128*/("""">
							          Older
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="older"""),_display_(/*553.23*/id),format.raw/*553.25*/("""" class="collapse" role="tabpanel" aria-labelledby="older"""),_display_(/*553.83*/id),format.raw/*553.85*/("""">
								<div id="no-older"""),_display_(/*554.27*/id),format.raw/*554.29*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="older"""),_display_(/*555.47*/id),format.raw/*555.49*/("""-cards">
							      """),_display_(/*556.15*/for(tweet <- track) yield /*556.34*/{_display_(Seq[Any](format.raw/*556.35*/("""
							      	"""),_display_(/*557.16*/defining(tweet.split("-"))/*557.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*557.58*/(""" 
								      	"""),_display_(/*558.17*/if(tweetArray(0)==tweetTerm)/*558.45*/{_display_(Seq[Any](format.raw/*558.46*/("""
								      		"""),_display_(/*559.18*/if(tweetArray(3)=="older")/*559.44*/{_display_(Seq[Any](format.raw/*559.45*/("""
										        """),format.raw/*560.19*/("""<div class="card">
										        	<div id=""""),_display_(/*561.30*/tweetArray(1)),format.raw/*561.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*563.34*/tweetArray(1)),format.raw/*563.47*/("""");
											        </script>
											        <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*565.93*/tweet),format.raw/*565.98*/("""">
								                      Message """),_display_(/*566.40*/tweetArray(2)),format.raw/*566.53*/("""
								                    """),format.raw/*567.29*/("""</button>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*570.54*/tweet),format.raw/*570.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*581.44*/b4/*581.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*581.110*/{_display_(Seq[Any](format.raw/*581.111*/(""" 

						                                            """),_display_(/*583.52*/b4/*583.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*586.66*/("""

						                                            """),_display_(/*588.52*/b4/*588.54*/.text(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message",
						                                                'size -> 1)),format.raw/*591.66*/("""

						                                    
						                                    """),format.raw/*594.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
						                            """)))}),format.raw/*599.36*/("""
						                              """),format.raw/*600.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*604.16*/("""
										    
								    	""")))}),format.raw/*606.15*/("""
								    """)))}),format.raw/*607.14*/("""
							      """)))}),format.raw/*608.15*/("""
							      
								"""),format.raw/*610.9*/("""</div>
								<script>displayNoTweetsMessage("older"""),_display_(/*611.47*/id),format.raw/*611.49*/("""-cards", "no-older"""),_display_(/*611.68*/id),format.raw/*611.70*/("""")</script>
							</div>

						</div>
					</div>
				
                    """)))}),format.raw/*617.22*/("""

				""")))}),format.raw/*619.6*/("""
	  		""")))}),format.raw/*620.7*/("""
	  	""")))}),format.raw/*621.6*/("""
	  """),format.raw/*622.4*/("""</div>
	</div>
</div>
</div>
		  <script>
			var myVar;
            myVar = setTimeout(showPage, 3000);

            function showPage() """),format.raw/*630.33*/("""{"""),format.raw/*630.34*/("""
              """),format.raw/*631.15*/("""document.getElementById("loader").style.display = "none";
              document.getElementById("page-content").style.display = "block";
            """),format.raw/*633.13*/("""}"""),format.raw/*633.14*/("""
          """),format.raw/*634.11*/("""</script>

""")))}),format.raw/*636.2*/("""

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
                  DATE: Thu Feb 15 23:02:02 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: 4ed1d6f3007dfcaf7d7542a21ffe4d76801879f1
                  MATRIX: 1108->1|1484->307|1521->324|1553->348|1647->304|1676->411|1705->413|1956->638|1970->644|2032->686|2096->724|2121->740|2142->752|2157->758|2172->764|2194->777|2208->782|2231->796|2250->806|2270->817|2282->820|2321->821|2352->825|2409->855|2431->856|2850->1249|2904->1287|2943->1288|2975->1293|3073->1364|3103->1373|3199->1442|3221->1443|3250->1444|3302->1466|3332->1469|4204->2314|4239->2333|4278->2334|4321->2350|4356->2376|4410->2392|4472->2427|4507->2453|4546->2454|4593->2473|4668->2521|4702->2534|4800->2605|4834->2618|4990->2747|5025->2760|5094->2802|5128->2815|5185->2844|5315->2947|5349->2960|6215->3799|6226->3801|6300->3865|6340->3866|6421->3920|6432->3922|6768->4237|6848->4290|6859->4292|7132->4544|7247->4631|7665->5018|7730->5055|7929->5222|7976->5237|8019->5248|8056->5257|8741->5914|8777->5933|8817->5934|8862->5951|8898->5977|8953->5993|9018->6030|9053->6055|9093->6056|9142->6076|9218->6124|9253->6137|9352->6208|9387->6221|9544->6350|9580->6363|9650->6405|9685->6418|9743->6447|9832->6504|9877->6520|9937->6552|9972->6565|10839->7404|10851->7406|10926->7470|10967->7471|11049->7525|11061->7527|11398->7842|11479->7895|11491->7897|11765->8149|11881->8236|12300->8623|12366->8660|12553->8815|12613->8843|12655->8856|13348->9521|13384->9540|13424->9541|13468->9557|13504->9583|13559->9599|13603->9615|13639->9641|13679->9642|13727->9661|13803->9709|13838->9722|13937->9793|13972->9806|14129->9935|14165->9948|14235->9990|14270->10003|14328->10032|14416->10088|14458->10101|14518->10133|14553->10146|15420->10985|15432->10987|15507->11051|15548->11052|15630->11106|15642->11108|15979->11423|16060->11476|16072->11478|16346->11730|16462->11817|16881->12204|16947->12241|17144->12406|17191->12421|17234->12435|17918->13091|17954->13110|17994->13111|18038->13127|18074->13153|18129->13169|18176->13188|18212->13214|18252->13215|18300->13234|18376->13282|18411->13295|18510->13366|18545->13379|18702->13508|18738->13521|18808->13563|18843->13576|18901->13605|19027->13703|19062->13716|19929->14555|19941->14557|20016->14621|20057->14622|20139->14676|20151->14678|20488->14993|20569->15046|20581->15048|20855->15300|20971->15387|21390->15774|21456->15811|21627->15950|21702->15993|21749->16008|21786->16017|21963->16167|21998->16185|22038->16186|22072->16193|22101->16212|22141->16213|22176->16221|22218->16253|22271->16267|22307->16276|22356->16315|22402->16322|22439->16331|22765->16629|22789->16631|22862->16675|22887->16677|23035->16797|23059->16799|23145->16857|23169->16859|23226->16888|23250->16890|23375->16987|23399->16989|23450->17012|23486->17031|23526->17032|23570->17048|23606->17074|23661->17090|23707->17108|23745->17136|23785->17137|23831->17155|23867->17181|23907->17182|23955->17201|24031->17249|24066->17262|24164->17332|24199->17345|24352->17470|24379->17475|24449->17517|24484->17530|24542->17559|24665->17654|24692->17659|25559->18498|25571->18500|25646->18564|25687->18565|25768->18618|25780->18620|26117->18935|26198->18988|26210->18990|26484->19242|26600->19329|27019->19716|27085->19753|27268->19904|27330->19934|27376->19948|27423->19963|27474->19986|27555->20039|27579->20041|27626->20060|27650->20062|27901->20285|27925->20287|27997->20330|28022->20332|28173->20455|28197->20457|28282->20514|28306->20516|28363->20545|28387->20547|28511->20643|28535->20645|28587->20669|28623->20688|28663->20689|28708->20706|28744->20732|28799->20748|28846->20767|28884->20795|28924->20796|28971->20815|29006->20840|29046->20841|29095->20861|29171->20909|29206->20922|29304->20992|29339->21005|29492->21130|29519->21135|29589->21177|29624->21190|29682->21219|29793->21302|29820->21307|30687->22146|30699->22148|30774->22212|30815->22213|30897->22267|30909->22269|31246->22584|31327->22637|31339->22639|31613->22891|31729->22978|32148->23365|32214->23402|32387->23543|32451->23575|32498->23590|32546->23606|32598->23630|32678->23682|32702->23684|32749->23703|32773->23705|33026->23930|33050->23932|33123->23976|33148->23978|33301->24103|33325->24105|33411->24163|33435->24165|33493->24195|33517->24197|33642->24294|33666->24296|33717->24319|33753->24338|33793->24339|33837->24355|33873->24381|33928->24397|33974->24415|34012->24443|34052->24444|34098->24462|34134->24488|34174->24489|34222->24508|34298->24556|34333->24569|34431->24639|34466->24652|34619->24777|34646->24782|34716->24824|34751->24837|34809->24866|34932->24961|34959->24966|35826->25805|35838->25807|35899->25858|35939->25859|36021->25913|36033->25915|36370->26230|36451->26283|36463->26285|36737->26537|36854->26625|37273->27012|37339->27049|37510->27188|37572->27218|37618->27232|37665->27247|37716->27270|37797->27323|37821->27325|37869->27345|37893->27347|38141->27567|38165->27569|38238->27613|38263->27615|38411->27735|38435->27737|38521->27795|38545->27797|38602->27826|38626->27828|38751->27925|38775->27927|38826->27950|38862->27969|38902->27970|38946->27986|38982->28012|39037->28028|39083->28046|39121->28074|39161->28075|39207->28093|39243->28119|39283->28120|39331->28139|39407->28187|39442->28200|39540->28270|39575->28283|39728->28408|39755->28413|39825->28455|39860->28468|39918->28497|40041->28592|40068->28597|40935->29436|40947->29438|41022->29502|41063->29503|41145->29557|41157->29559|41494->29874|41575->29927|41587->29929|41861->30181|41977->30268|42396->30655|42462->30692|42633->30831|42695->30861|42741->30875|42788->30890|42839->30913|42920->30966|42944->30968|42991->30987|43015->30989|43125->31067|43163->31074|43201->31081|43238->31087|43270->31091|43436->31228|43466->31229|43510->31244|43688->31393|43718->31394|43758->31405|43801->31417
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|58->26|59->27|82->50|82->50|82->50|83->51|83->51|83->51|85->53|85->53|85->53|86->54|87->55|87->55|89->57|89->57|91->59|91->59|92->60|92->60|93->61|97->65|97->65|108->76|108->76|108->76|108->76|110->78|110->78|113->81|115->83|115->83|118->86|121->89|126->94|127->95|133->101|134->102|135->103|136->104|153->121|153->121|153->121|154->122|154->122|154->122|156->124|156->124|156->124|157->125|158->126|158->126|160->128|160->128|162->130|162->130|163->131|163->131|164->132|166->134|167->135|167->135|167->135|178->146|178->146|178->146|178->146|180->148|180->148|183->151|185->153|185->153|188->156|191->159|196->164|197->165|202->170|204->172|205->173|223->191|223->191|223->191|224->192|224->192|224->192|225->193|225->193|225->193|226->194|227->195|227->195|229->197|229->197|231->199|231->199|232->200|232->200|233->201|235->203|236->204|236->204|236->204|247->215|247->215|247->215|247->215|249->217|249->217|252->220|254->222|254->222|257->225|260->228|265->233|266->234|272->240|273->241|274->242|291->259|291->259|291->259|292->260|292->260|292->260|293->261|293->261|293->261|294->262|295->263|295->263|297->265|297->265|299->267|299->267|300->268|300->268|301->269|304->272|304->272|315->283|315->283|315->283|315->283|317->285|317->285|320->288|322->290|322->290|325->293|328->296|333->301|334->302|338->306|341->309|342->310|343->311|353->321|353->321|353->321|354->322|354->322|354->322|355->323|355->323|355->323|356->324|356->324|356->324|357->325|363->331|363->331|363->331|363->331|370->338|370->338|370->338|370->338|371->339|371->339|372->340|372->340|373->341|373->341|373->341|374->342|374->342|374->342|375->343|375->343|375->343|376->344|376->344|376->344|377->345|378->346|378->346|380->348|380->348|382->350|382->350|383->351|383->351|384->352|387->355|387->355|398->366|398->366|398->366|398->366|399->367|399->367|402->370|404->372|404->372|407->375|410->378|415->383|416->384|420->388|422->390|423->391|424->392|426->394|427->395|427->395|427->395|427->395|433->401|433->401|433->401|433->401|440->408|440->408|440->408|440->408|441->409|441->409|442->410|442->410|443->411|443->411|443->411|444->412|444->412|444->412|445->413|445->413|445->413|446->414|446->414|446->414|447->415|448->416|448->416|450->418|450->418|452->420|452->420|453->421|453->421|454->422|457->425|457->425|468->436|468->436|468->436|468->436|470->438|470->438|473->441|475->443|475->443|478->446|481->449|486->454|487->455|492->460|494->462|495->463|496->464|498->466|499->467|499->467|499->467|499->467|506->474|506->474|506->474|506->474|513->481|513->481|513->481|513->481|514->482|514->482|515->483|515->483|516->484|516->484|516->484|517->485|517->485|517->485|518->486|518->486|518->486|519->487|519->487|519->487|520->488|521->489|521->489|523->491|523->491|525->493|525->493|526->494|526->494|527->495|530->498|530->498|541->509|541->509|541->509|541->509|543->511|543->511|546->514|548->516|548->516|551->519|555->523|560->528|561->529|565->533|567->535|568->536|569->537|571->539|572->540|572->540|572->540|572->540|578->546|578->546|578->546|578->546|585->553|585->553|585->553|585->553|586->554|586->554|587->555|587->555|588->556|588->556|588->556|589->557|589->557|589->557|590->558|590->558|590->558|591->559|591->559|591->559|592->560|593->561|593->561|595->563|595->563|597->565|597->565|598->566|598->566|599->567|602->570|602->570|613->581|613->581|613->581|613->581|615->583|615->583|618->586|620->588|620->588|623->591|626->594|631->599|632->600|636->604|638->606|639->607|640->608|642->610|643->611|643->611|643->611|643->611|649->617|651->619|652->620|653->621|654->622|662->630|662->630|663->631|665->633|665->633|666->634|668->636
                  -- GENERATED --
              */
          