
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

object interest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[Form[Search],String,Integer,String,List[String],List[String],List[String],String,List[String],List[String],List[String],Form[Message],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, img: String, personas: List[String], interests: List[String], track: List[String], i: String, terms: List[String], allTweets: List[String], values: List[String], messageForm: Form[Message]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.247*/("""

"""),format.raw/*4.89*/("""

"""),format.raw/*6.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>

"""),_display_(/*10.2*/main("Interest")/*10.18*/(searchForm)/*10.30*/(user)/*10.36*/(bool)/*10.42*/(img)/*10.47*/(personas)/*10.57*/(interests)/*10.68*/{_display_(Seq[Any](format.raw/*10.69*/("""
  	"""),format.raw/*11.4*/("""<h3 id="upper">Tracked Searches for "<span class="lite">"""),_display_(/*11.61*/i),format.raw/*11.62*/("""</span>"</h3>

  	<div id="loader-bg">
  		<div id="loader"></div>
  	</div>

    <div id="page-content" style="display:none">

  	<div id="carousel-centre" class="tweets">
  		<ul class="nav nav-tabs carlist" id="carouselButtons">
		    <li class="active car" data-target="#carouselExampleControls" data-slide-to="0">
		        <a class="nav-link active carousel-btn" id="cb" data-toggle="tab" href="#">All</a>
		    </li>
		    """),_display_(/*24.8*/for((v, index) <- values.zipWithIndex) yield /*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""
				"""),format.raw/*25.5*/("""<li class="car" data-target="#carouselExampleControls" data-slide-to=""""),_display_(/*25.76*/{index+1}),format.raw/*25.85*/("""">
					<a class="nav-link carousel-btn" data-toggle="tab" href="#">"""),_display_(/*26.67*/v),format.raw/*26.68*/(""" """),format.raw/*26.69*/("""</a>
				</li>
	    	""")))}),format.raw/*28.8*/("""
		"""),format.raw/*29.3*/("""</ul>

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
				<div class="none" id="no-today" style="display:none;"> No tweets to show. </div>
  				<div class="card-columns" id="today-cards">
  					"""),_display_(/*52.9*/for(tweet <- track) yield /*52.28*/{_display_(Seq[Any](format.raw/*52.29*/("""
			      	"""),_display_(/*53.12*/defining(tweet.split("-"))/*53.38*/ { tweetArray =>_display_(Seq[Any](format.raw/*53.54*/(""" 
				      	
				      		"""),_display_(/*55.14*/if(tweetArray(3)=="today")/*55.40*/{_display_(Seq[Any](format.raw/*55.41*/("""
						        """),format.raw/*56.15*/("""<div class="card">
						        	<div id=""""),_display_(/*57.26*/tweetArray(1)),format.raw/*57.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*59.30*/tweetArray(1)),format.raw/*59.43*/("""a");
							        </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*61.87*/tweetArray(1)),format.raw/*61.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*62.65*/tweetArray(2)),format.raw/*62.78*/("""</span> <i class="icon-envelope-l"></i>
				                    </a>
				                </div>
				                

						    
						    <div class="modal fade" id="all"""),_display_(/*68.43*/tweetArray(1)),format.raw/*68.56*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*79.40*/b4/*79.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*79.117*/{_display_(Seq[Any](format.raw/*79.118*/(""" 

		                                            """),_display_(/*81.48*/b4/*81.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*84.62*/("""

		                                            """),_display_(/*86.48*/b4/*86.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*89.62*/("""

		                                    
		                                    """),format.raw/*92.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		  
		                              </div>
		                          """)))}),format.raw/*99.30*/("""
		                            """),format.raw/*100.31*/("""</div>
		                          </div>
		                        </div>
		                    
						     
				    	
				    """)))}),format.raw/*106.10*/("""
			      """)))}),format.raw/*107.11*/("""
			  """)))}),format.raw/*108.7*/("""
				"""),format.raw/*109.5*/("""</div>
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
				<div class="none" id="no-weeks" style="display:none;"> No tweets to show. </div>
	  			<div class="card-columns" id="week-cards">
				    """),_display_(/*126.10*/for(tweet <- track) yield /*126.29*/{_display_(Seq[Any](format.raw/*126.30*/("""
				      	"""),_display_(/*127.13*/defining(tweet.split("-"))/*127.39*/ { tweetArray =>_display_(Seq[Any](format.raw/*127.55*/(""" 
					      	
					      		"""),_display_(/*129.15*/if(tweetArray(3)=="week")/*129.40*/{_display_(Seq[Any](format.raw/*129.41*/("""
							        """),format.raw/*130.16*/("""<div class="card">
						        	<div id=""""),_display_(/*131.26*/tweetArray(1)),format.raw/*131.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*133.30*/tweetArray(1)),format.raw/*133.43*/("""a");
							        </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*135.87*/tweetArray(1)),format.raw/*135.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*136.65*/tweetArray(2)),format.raw/*136.78*/(""" """),format.raw/*136.79*/("""<i class="icon-envelope-l"></i>
				                    </a>
				                </div>
							    """)))}),format.raw/*139.13*/("""
							    """),format.raw/*140.12*/("""<div class="modal fade" id="all"""),_display_(/*140.44*/tweetArray(1)),format.raw/*140.57*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*151.40*/b4/*151.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*151.117*/{_display_(Seq[Any](format.raw/*151.118*/(""" 

		                                            """),_display_(/*153.48*/b4/*153.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*156.62*/("""

		                                            """),_display_(/*158.48*/b4/*158.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*161.62*/("""

		                                    
		                                    """),format.raw/*164.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		                            
		                              </div>
		                          """)))}),format.raw/*171.30*/("""
		                            """),format.raw/*172.31*/("""</div>
		                          </div>
		                        </div>
						     
					    	""")))}),format.raw/*176.12*/("""
					    
				    """)))}),format.raw/*178.10*/("""
				    """),format.raw/*179.9*/("""<script>displayNoTweetsMessage("week-cards", "no-weeks")</script>
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
				<div  class="none" id="no-months" style="display:none;"> No tweets to show. </div>
  				<div class="card-columns" id="month-cards">
			      """),_display_(/*197.11*/for(tweet <- track) yield /*197.30*/{_display_(Seq[Any](format.raw/*197.31*/("""
			      	"""),_display_(/*198.12*/defining(tweet.split("-"))/*198.38*/ { tweetArray =>_display_(Seq[Any](format.raw/*198.54*/(""" 
				   		"""),_display_(/*199.11*/if(tweetArray(3)=="month")/*199.37*/{_display_(Seq[Any](format.raw/*199.38*/("""
						        """),format.raw/*200.15*/("""<div class="card">
						        	<div id=""""),_display_(/*201.26*/tweetArray(1)),format.raw/*201.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*203.30*/tweetArray(1)),format.raw/*203.43*/("""a");
							        </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*205.87*/tweetArray(1)),format.raw/*205.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*206.65*/tweetArray(2)),format.raw/*206.78*/(""" """),format.raw/*206.79*/("""<i class="icon-envelope-l"></i>
				                    </a>
				                </div>
						    """)))}),format.raw/*209.12*/("""
  						"""),format.raw/*210.9*/("""<div class="modal fade" id="all"""),_display_(/*210.41*/tweetArray(1)),format.raw/*210.54*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*221.40*/b4/*221.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*221.117*/{_display_(Seq[Any](format.raw/*221.118*/(""" 

		                                            """),_display_(/*223.48*/b4/*223.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*226.62*/("""

		                                            """),_display_(/*228.48*/b4/*228.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*231.62*/("""

		                                    
		                                    """),format.raw/*234.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		                            
		                              </div>
		                          """)))}),format.raw/*241.30*/("""
		                            """),format.raw/*242.31*/("""</div>
		                          </div>
		                        </div>
						   
				    	
				    """)))}),format.raw/*247.10*/("""
			      """)))}),format.raw/*248.11*/("""
			      """),format.raw/*249.10*/("""<script>displayNoTweetsMessage("month-cards", "no-months")</script>
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
				<div  class="none" id="no-older" style="display:none;"> No tweets to show. </div>
  				<div class="card-columns" id="older-cards">
			      """),_display_(/*266.11*/for(tweet <- track) yield /*266.30*/{_display_(Seq[Any](format.raw/*266.31*/("""
			      	"""),_display_(/*267.12*/defining(tweet.split("-"))/*267.38*/ { tweetArray =>_display_(Seq[Any](format.raw/*267.54*/(""" 
				      		"""),_display_(/*268.14*/if(tweetArray(3)=="older")/*268.40*/{_display_(Seq[Any](format.raw/*268.41*/("""
						        """),format.raw/*269.15*/("""<div class="card">
						        	<div id=""""),_display_(/*270.26*/tweetArray(1)),format.raw/*270.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*272.30*/tweetArray(1)),format.raw/*272.43*/("""a");
							        </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*274.87*/tweetArray(1)),format.raw/*274.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*275.65*/tweetArray(2)),format.raw/*275.78*/(""" """),format.raw/*275.79*/("""<i class="icon-envelope-l"></i>
				                    </a>
				                </div>

				                <div class="modal fade" id="all"""),_display_(/*279.53*/tweetArray(1)),format.raw/*279.66*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*290.40*/b4/*290.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*290.117*/{_display_(Seq[Any](format.raw/*290.118*/(""" 

		                                            """),_display_(/*292.48*/b4/*292.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*295.62*/("""

		                                            """),_display_(/*297.48*/b4/*297.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*300.62*/("""

		                                    
		                                    """),format.raw/*303.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		                            
		                              </div>
		                          """)))}),format.raw/*310.30*/("""
		                            """),format.raw/*311.31*/("""</div>
		                          </div>
		                        </div>
						    """)))}),format.raw/*314.12*/("""
						    
				    	
				    """)))}),format.raw/*317.10*/("""
			      """)))}),format.raw/*318.11*/("""
				"""),format.raw/*319.5*/("""</div>
				<script>displayNoTweetsMessage("older-cards", "no-older")</script>
			</div>

		</div>
					
  				
	    </div>
	</div>

	    """),_display_(/*329.7*/for(term <- terms) yield /*329.25*/{_display_(Seq[Any](format.raw/*329.26*/("""
	  		"""),_display_(/*330.7*/if(term contains i)/*330.26*/{_display_(Seq[Any](format.raw/*330.27*/("""
	  			"""),_display_(/*331.8*/defining(term.replace("-"+i,""))/*331.40*/ { tweetTerm=>_display_(Seq[Any](format.raw/*331.54*/("""
	  				"""),_display_(/*332.9*/defining(tweetTerm.replaceAll(" ","-"))/*332.48*/ { id=>_display_(Seq[Any](format.raw/*332.55*/("""
			  			"""),format.raw/*333.9*/("""<div class="carousel-item">
			  				<div id="accordion" role="tablist" aria-multiselectable="true">

							 <div class="card">
							    <div class="card-header" role="tab" id="daily">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#today"""),_display_(/*339.80*/id),format.raw/*339.82*/("""" aria-expanded="true" aria-controls="today"""),_display_(/*339.126*/id),format.raw/*339.128*/("""">
							          Today
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="today"""),_display_(/*346.23*/id),format.raw/*346.25*/("""" class="collapse" role="tabpanel" aria-labelledby="today"""),_display_(/*346.83*/id),format.raw/*346.85*/("""">
								<div id="no-today"""),_display_(/*347.27*/id),format.raw/*347.29*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="today"""),_display_(/*348.47*/id),format.raw/*348.49*/("""-cards">
							      """),_display_(/*349.15*/for(tweet <- track) yield /*349.34*/{_display_(Seq[Any](format.raw/*349.35*/("""
							      	"""),_display_(/*350.16*/defining(tweet.split("-"))/*350.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*350.58*/(""" 
								      	"""),_display_(/*351.17*/if(tweetArray(0)==tweetTerm)/*351.45*/{_display_(Seq[Any](format.raw/*351.46*/("""
								      		"""),_display_(/*352.18*/if(tweetArray(3)=="today")/*352.44*/{_display_(Seq[Any](format.raw/*352.45*/("""
										        """),format.raw/*353.19*/("""<div class="card">
										        	<div id=""""),_display_(/*354.30*/tweetArray(1)),format.raw/*354.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*356.34*/tweetArray(1)),format.raw/*356.47*/("""");
											        </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*358.88*/tweet),format.raw/*358.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*359.69*/tweetArray(2)),format.raw/*359.82*/(""" """),format.raw/*359.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*363.54*/tweet),format.raw/*363.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*374.44*/b4/*374.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*374.121*/{_display_(Seq[Any](format.raw/*374.122*/(""" 
						                                            """),_display_(/*375.52*/b4/*375.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*378.66*/("""

						                                            """),_display_(/*380.52*/b4/*380.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*383.66*/("""

						                                    
						                                    """),format.raw/*386.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*391.36*/("""
						                              """),format.raw/*392.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
						                    """)))}),format.raw/*396.28*/("""
										    
								    	""")))}),format.raw/*398.15*/("""
								    """)))}),format.raw/*399.14*/("""
							      """)))}),format.raw/*400.15*/("""
							      
								"""),format.raw/*402.9*/("""</div>
								<script>displayNoTweetsMessage("today"""),_display_(/*403.47*/id),format.raw/*403.49*/("""-cards", "no-today"""),_display_(/*403.68*/id),format.raw/*403.70*/("""")</script>
							</div>

							 <div class="card">
							    <div class="card-header" role="tab" id="weekly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#week"""),_display_(/*409.79*/id),format.raw/*409.81*/("""" aria-expanded="true" aria-controls="week"""),_display_(/*409.124*/id),format.raw/*409.126*/("""">
							          Past Week
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="week"""),_display_(/*416.22*/id),format.raw/*416.24*/("""" class="collapse" role="tabpanel" aria-labelledby="week"""),_display_(/*416.81*/id),format.raw/*416.83*/("""">
								<div id="no-weeks"""),_display_(/*417.27*/id),format.raw/*417.29*/("""" style="display:none;"> No tweets to show. </div>
					  			<div class="card-columns" id="week"""),_display_(/*418.46*/id),format.raw/*418.48*/("""-cards">
								      """),_display_(/*419.16*/for(tweet <- track) yield /*419.35*/{_display_(Seq[Any](format.raw/*419.36*/("""
								      	"""),_display_(/*420.17*/defining(tweet.split("-"))/*420.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*420.59*/(""" 
									      	"""),_display_(/*421.18*/if(tweetArray(0)==tweetTerm)/*421.46*/{_display_(Seq[Any](format.raw/*421.47*/("""
									      		"""),_display_(/*422.19*/if(tweetArray(3)=="week")/*422.44*/{_display_(Seq[Any](format.raw/*422.45*/("""
											        """),format.raw/*423.20*/("""<div class="card">
										        	<div id=""""),_display_(/*424.30*/tweetArray(1)),format.raw/*424.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*426.34*/tweetArray(1)),format.raw/*426.47*/("""");
											        </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*428.88*/tweet),format.raw/*428.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*429.69*/tweetArray(2)),format.raw/*429.82*/(""" """),format.raw/*429.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                </div>

												<div class="modal fade" id=""""),_display_(/*433.42*/tweet),format.raw/*433.47*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*444.44*/b4/*444.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*444.121*/{_display_(Seq[Any](format.raw/*444.122*/(""" 

						                                            """),_display_(/*446.52*/b4/*446.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*449.66*/("""

						                                            """),_display_(/*451.52*/b4/*451.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*454.66*/("""

						                                    
						                                    """),format.raw/*457.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*462.36*/("""
						                              """),format.raw/*463.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>

											    """)))}),format.raw/*468.17*/("""
											    
									    	""")))}),format.raw/*470.16*/("""
									    """)))}),format.raw/*471.15*/("""
								      """)))}),format.raw/*472.16*/("""
								      
								"""),format.raw/*474.9*/("""</div>
								<script>displayNoTweetsMessage("week"""),_display_(/*475.46*/id),format.raw/*475.48*/("""-cards", "no-weeks"""),_display_(/*475.67*/id),format.raw/*475.69*/("""")</script>
							</div>


							<div class="card">
							    <div class="card-header" role="tab" id="monthly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#month"""),_display_(/*482.80*/id),format.raw/*482.82*/("""" aria-expanded="true" aria-controls="month"""),_display_(/*482.126*/id),format.raw/*482.128*/("""">
							          Past Month
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="month"""),_display_(/*489.23*/id),format.raw/*489.25*/("""" class="collapse" role="tabpanel" aria-labelledby="month"""),_display_(/*489.83*/id),format.raw/*489.85*/("""">
								<div id="no-months"""),_display_(/*490.28*/id),format.raw/*490.30*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="month"""),_display_(/*491.47*/id),format.raw/*491.49*/("""-cards">
							      """),_display_(/*492.15*/for(tweet <- track) yield /*492.34*/{_display_(Seq[Any](format.raw/*492.35*/("""
							      	"""),_display_(/*493.16*/defining(tweet.split("-"))/*493.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*493.58*/(""" 
								      	"""),_display_(/*494.17*/if(tweetArray(0)==tweetTerm)/*494.45*/{_display_(Seq[Any](format.raw/*494.46*/("""
								      		"""),_display_(/*495.18*/if(tweetArray(3)=="month")/*495.44*/{_display_(Seq[Any](format.raw/*495.45*/("""
										        """),format.raw/*496.19*/("""<div class="card">
										        	<div id=""""),_display_(/*497.30*/tweetArray(1)),format.raw/*497.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*499.34*/tweetArray(1)),format.raw/*499.47*/("""");
											        </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*501.88*/tweet),format.raw/*501.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*502.69*/tweetArray(2)),format.raw/*502.82*/(""" """),format.raw/*502.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*506.54*/tweet),format.raw/*506.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*517.44*/b4/*517.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*517.121*/{_display_(Seq[Any](format.raw/*517.122*/(""" 

						                                            """),_display_(/*519.52*/b4/*519.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*522.66*/("""

						                                            """),_display_(/*524.52*/b4/*524.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*527.66*/("""


						                                    
						                                    """),format.raw/*531.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*536.36*/("""
						                              """),format.raw/*537.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*541.16*/("""
										    
								    	""")))}),format.raw/*543.15*/("""
								    """)))}),format.raw/*544.14*/("""
							      """)))}),format.raw/*545.15*/("""
							      
								"""),format.raw/*547.9*/("""</div>
								<script>displayNoTweetsMessage("month"""),_display_(/*548.47*/id),format.raw/*548.49*/("""-cards", "no-months"""),_display_(/*548.69*/id),format.raw/*548.71*/("""")</script>
							</div>

							<div class="card">
							    <div class="card-header" role="tab" id="old">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#older"""),_display_(/*554.80*/id),format.raw/*554.82*/("""" aria-expanded="true" aria-controls="older"""),_display_(/*554.126*/id),format.raw/*554.128*/("""">
							          Older
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="older"""),_display_(/*561.23*/id),format.raw/*561.25*/("""" class="collapse" role="tabpanel" aria-labelledby="older"""),_display_(/*561.83*/id),format.raw/*561.85*/("""">
								<div id="no-older"""),_display_(/*562.27*/id),format.raw/*562.29*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="older"""),_display_(/*563.47*/id),format.raw/*563.49*/("""-cards">
							      """),_display_(/*564.15*/for(tweet <- track) yield /*564.34*/{_display_(Seq[Any](format.raw/*564.35*/("""
							      	"""),_display_(/*565.16*/defining(tweet.split("-"))/*565.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*565.58*/(""" 
								      	"""),_display_(/*566.17*/if(tweetArray(0)==tweetTerm)/*566.45*/{_display_(Seq[Any](format.raw/*566.46*/("""
								      		"""),_display_(/*567.18*/if(tweetArray(3)=="older")/*567.44*/{_display_(Seq[Any](format.raw/*567.45*/("""
										        """),format.raw/*568.19*/("""<div class="card">
										        	<div id=""""),_display_(/*569.30*/tweetArray(1)),format.raw/*569.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*571.34*/tweetArray(1)),format.raw/*571.47*/("""");
											        </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*573.88*/tweet),format.raw/*573.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*574.69*/tweetArray(2)),format.raw/*574.82*/(""" """),format.raw/*574.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                </div>

								                <div class="modal fade" id=""""),_display_(/*578.54*/tweet),format.raw/*578.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*589.44*/b4/*589.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*589.121*/{_display_(Seq[Any](format.raw/*589.122*/(""" 

						                                            """),_display_(/*591.52*/b4/*591.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*594.66*/("""

						                                            """),_display_(/*596.52*/b4/*596.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*599.66*/("""

						                                    
						                                    """),format.raw/*602.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*607.36*/("""
						                              """),format.raw/*608.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*612.16*/("""
										    
								    	""")))}),format.raw/*614.15*/("""
								    """)))}),format.raw/*615.14*/("""
							      """)))}),format.raw/*616.15*/("""
							      
								"""),format.raw/*618.9*/("""</div>
								<script>displayNoTweetsMessage("older"""),_display_(/*619.47*/id),format.raw/*619.49*/("""-cards", "no-older"""),_display_(/*619.68*/id),format.raw/*619.70*/("""")</script>
							</div>

						</div>
					</div>
				
                    """)))}),format.raw/*625.22*/("""

				""")))}),format.raw/*627.6*/("""
	  		""")))}),format.raw/*628.7*/("""
	  	""")))}),format.raw/*629.6*/("""
	  """),format.raw/*630.4*/("""</div>
	</div>
</div>
</div>
		  <script>
			var myVar;
            myVar = setTimeout(showPage, 3000);

            function showPage() """),format.raw/*638.33*/("""{"""),format.raw/*638.34*/("""
              """),format.raw/*639.15*/("""document.getElementById("loader").style.display = "none";
              document.getElementById("loader-bg").style.display = "none";
              document.getElementById("page-content").style.display = "block";
            """),format.raw/*642.13*/("""}"""),format.raw/*642.14*/("""
          """),format.raw/*643.11*/("""</script>

""")))}),format.raw/*645.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,img:String,personas:List[String],interests:List[String],track:List[String],i:String,terms:List[String],allTweets:List[String],values:List[String],messageForm:Form[Message]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,img,personas,interests,track,i,terms,allTweets,values,messageForm)

  def f:((Form[Search],String,Integer,String,List[String],List[String],List[String],String,List[String],List[String],List[String],Form[Message]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,img,personas,interests,track,i,terms,allTweets,values,messageForm) => apply(searchForm,user,bool,img,personas,interests,track,i,terms,allTweets,values,messageForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 02 14:50:31 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: 1273f44dcc5a211551e3254108ef45b571a24398
                  MATRIX: 1079->1|1397->249|1434->266|1466->290|1560->246|1589->353|1617->355|1813->525|1827->531|1889->573|1953->611|1978->627|1999->639|2014->645|2029->651|2043->656|2062->666|2082->677|2121->678|2152->682|2236->739|2258->740|2715->1171|2769->1209|2808->1210|2840->1215|2938->1286|2968->1295|3064->1364|3086->1365|3115->1366|3167->1388|3197->1391|4024->2192|4059->2211|4098->2212|4137->2224|4172->2250|4226->2266|4280->2293|4315->2319|4354->2320|4397->2335|4468->2379|4502->2392|4592->2455|4626->2468|4769->2584|4804->2597|4898->2664|4932->2677|5130->2848|5164->2861|5986->3656|5997->3658|6082->3733|6122->3734|6199->3784|6210->3786|6534->4089|6610->4138|6621->4140|6887->4385|6994->4464|7431->4870|7491->4901|7652->5030|7695->5041|7733->5048|7766->5053|8404->5663|8440->5682|8480->5683|8521->5696|8557->5722|8612->5738|8669->5767|8704->5792|8744->5793|8789->5809|8861->5853|8896->5866|8987->5929|9022->5942|9166->6058|9202->6071|9297->6138|9332->6151|9362->6152|9494->6252|9535->6264|9595->6296|9630->6309|10453->7104|10465->7106|10551->7181|10592->7182|10670->7232|10682->7234|11007->7537|11084->7586|11096->7588|11363->7833|11471->7912|11935->8344|11995->8375|12125->8473|12177->8493|12214->8502|12861->9121|12897->9140|12937->9141|12977->9153|13013->9179|13068->9195|13108->9207|13144->9233|13184->9234|13228->9249|13300->9293|13335->9306|13426->9369|13461->9382|13605->9498|13641->9511|13736->9578|13771->9591|13801->9592|13932->9691|13969->9700|14029->9732|14064->9745|14887->10540|14899->10542|14985->10617|15026->10618|15104->10668|15116->10670|15441->10973|15518->11022|15530->11024|15797->11269|15905->11348|16369->11780|16429->11811|16565->11915|16608->11926|16647->11936|17285->12546|17321->12565|17361->12566|17401->12578|17437->12604|17492->12620|17535->12635|17571->12661|17611->12662|17655->12677|17727->12721|17762->12734|17853->12797|17888->12810|18032->12926|18068->12939|18163->13006|18198->13019|18228->13020|18397->13161|18432->13174|19255->13969|19267->13971|19353->14046|19394->14047|19472->14097|19484->14099|19809->14402|19886->14451|19898->14453|20165->14698|20273->14777|20737->15209|20797->15240|20915->15326|20978->15357|21021->15368|21054->15373|21219->15511|21254->15529|21294->15530|21328->15537|21357->15556|21397->15557|21432->15565|21474->15597|21527->15611|21563->15620|21612->15659|21658->15666|21695->15675|22021->15973|22045->15975|22118->16019|22143->16021|22291->16141|22315->16143|22401->16201|22425->16203|22482->16232|22506->16234|22631->16331|22655->16333|22706->16356|22742->16375|22782->16376|22826->16392|22862->16418|22917->16434|22963->16452|23001->16480|23041->16481|23087->16499|23123->16525|23163->16526|23211->16545|23287->16593|23322->16606|23420->16676|23455->16689|23603->16809|23630->16814|23729->16885|23764->16898|23794->16899|23972->17049|23999->17054|24866->17893|24878->17895|24964->17970|25005->17971|25086->18024|25098->18026|25435->18341|25516->18394|25528->18396|25807->18653|25923->18740|26339->19124|26405->19161|26588->19312|26650->19342|26696->19356|26743->19371|26794->19394|26875->19447|26899->19449|26946->19468|26970->19470|27221->19693|27245->19695|27317->19738|27342->19740|27493->19863|27517->19865|27602->19922|27626->19924|27683->19953|27707->19955|27831->20051|27855->20053|27907->20077|27943->20096|27983->20097|28028->20114|28064->20140|28119->20156|28166->20175|28204->20203|28244->20204|28291->20223|28326->20248|28366->20249|28415->20269|28491->20317|28526->20330|28624->20400|28659->20413|28807->20533|28834->20538|28933->20609|28968->20622|28998->20623|29164->20761|29191->20766|30058->21605|30070->21607|30156->21682|30197->21683|30279->21737|30291->21739|30628->22054|30709->22107|30721->22109|31000->22366|31116->22453|31532->22837|31598->22874|31771->23015|31835->23047|31882->23062|31930->23078|31982->23102|32062->23154|32086->23156|32133->23175|32157->23177|32410->23402|32434->23404|32507->23448|32532->23450|32685->23575|32709->23577|32795->23635|32819->23637|32877->23667|32901->23669|33026->23766|33050->23768|33101->23791|33137->23810|33177->23811|33221->23827|33257->23853|33312->23869|33358->23887|33396->23915|33436->23916|33482->23934|33518->23960|33558->23961|33606->23980|33682->24028|33717->24041|33815->24111|33850->24124|33998->24244|34025->24249|34124->24320|34159->24333|34189->24334|34367->24484|34394->24489|35261->25328|35273->25330|35359->25405|35400->25406|35482->25460|35494->25462|35831->25777|35912->25830|35924->25832|36203->26089|36320->26177|36736->26561|36802->26598|36973->26737|37035->26767|37081->26781|37128->26796|37179->26819|37260->26872|37284->26874|37332->26894|37356->26896|37604->27116|37628->27118|37701->27162|37726->27164|37874->27284|37898->27286|37984->27344|38008->27346|38065->27375|38089->27377|38214->27474|38238->27476|38289->27499|38325->27518|38365->27519|38409->27535|38445->27561|38500->27577|38546->27595|38584->27623|38624->27624|38670->27642|38706->27668|38746->27669|38794->27688|38870->27736|38905->27749|39003->27819|39038->27832|39186->27952|39213->27957|39312->28028|39347->28041|39377->28042|39555->28192|39582->28197|40449->29036|40461->29038|40547->29113|40588->29114|40670->29168|40682->29170|41019->29485|41100->29538|41112->29540|41391->29797|41507->29884|41923->30268|41989->30305|42160->30444|42222->30474|42268->30488|42315->30503|42366->30526|42447->30579|42471->30581|42518->30600|42542->30602|42652->30680|42690->30687|42728->30694|42765->30700|42797->30704|42963->30841|42993->30842|43037->30857|43290->31081|43320->31082|43360->31093|43403->31105
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|38->6|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|61->29|84->52|84->52|84->52|85->53|85->53|85->53|87->55|87->55|87->55|88->56|89->57|89->57|91->59|91->59|93->61|93->61|94->62|94->62|100->68|100->68|111->79|111->79|111->79|111->79|113->81|113->81|116->84|118->86|118->86|121->89|124->92|131->99|132->100|138->106|139->107|140->108|141->109|158->126|158->126|158->126|159->127|159->127|159->127|161->129|161->129|161->129|162->130|163->131|163->131|165->133|165->133|167->135|167->135|168->136|168->136|168->136|171->139|172->140|172->140|172->140|183->151|183->151|183->151|183->151|185->153|185->153|188->156|190->158|190->158|193->161|196->164|203->171|204->172|208->176|210->178|211->179|229->197|229->197|229->197|230->198|230->198|230->198|231->199|231->199|231->199|232->200|233->201|233->201|235->203|235->203|237->205|237->205|238->206|238->206|238->206|241->209|242->210|242->210|242->210|253->221|253->221|253->221|253->221|255->223|255->223|258->226|260->228|260->228|263->231|266->234|273->241|274->242|279->247|280->248|281->249|298->266|298->266|298->266|299->267|299->267|299->267|300->268|300->268|300->268|301->269|302->270|302->270|304->272|304->272|306->274|306->274|307->275|307->275|307->275|311->279|311->279|322->290|322->290|322->290|322->290|324->292|324->292|327->295|329->297|329->297|332->300|335->303|342->310|343->311|346->314|349->317|350->318|351->319|361->329|361->329|361->329|362->330|362->330|362->330|363->331|363->331|363->331|364->332|364->332|364->332|365->333|371->339|371->339|371->339|371->339|378->346|378->346|378->346|378->346|379->347|379->347|380->348|380->348|381->349|381->349|381->349|382->350|382->350|382->350|383->351|383->351|383->351|384->352|384->352|384->352|385->353|386->354|386->354|388->356|388->356|390->358|390->358|391->359|391->359|391->359|395->363|395->363|406->374|406->374|406->374|406->374|407->375|407->375|410->378|412->380|412->380|415->383|418->386|423->391|424->392|428->396|430->398|431->399|432->400|434->402|435->403|435->403|435->403|435->403|441->409|441->409|441->409|441->409|448->416|448->416|448->416|448->416|449->417|449->417|450->418|450->418|451->419|451->419|451->419|452->420|452->420|452->420|453->421|453->421|453->421|454->422|454->422|454->422|455->423|456->424|456->424|458->426|458->426|460->428|460->428|461->429|461->429|461->429|465->433|465->433|476->444|476->444|476->444|476->444|478->446|478->446|481->449|483->451|483->451|486->454|489->457|494->462|495->463|500->468|502->470|503->471|504->472|506->474|507->475|507->475|507->475|507->475|514->482|514->482|514->482|514->482|521->489|521->489|521->489|521->489|522->490|522->490|523->491|523->491|524->492|524->492|524->492|525->493|525->493|525->493|526->494|526->494|526->494|527->495|527->495|527->495|528->496|529->497|529->497|531->499|531->499|533->501|533->501|534->502|534->502|534->502|538->506|538->506|549->517|549->517|549->517|549->517|551->519|551->519|554->522|556->524|556->524|559->527|563->531|568->536|569->537|573->541|575->543|576->544|577->545|579->547|580->548|580->548|580->548|580->548|586->554|586->554|586->554|586->554|593->561|593->561|593->561|593->561|594->562|594->562|595->563|595->563|596->564|596->564|596->564|597->565|597->565|597->565|598->566|598->566|598->566|599->567|599->567|599->567|600->568|601->569|601->569|603->571|603->571|605->573|605->573|606->574|606->574|606->574|610->578|610->578|621->589|621->589|621->589|621->589|623->591|623->591|626->594|628->596|628->596|631->599|634->602|639->607|640->608|644->612|646->614|647->615|648->616|650->618|651->619|651->619|651->619|651->619|657->625|659->627|660->628|661->629|662->630|670->638|670->638|671->639|674->642|674->642|675->643|677->645
                  -- GENERATED --
              */
          