
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
						        """),format.raw/*56.15*/("""<div id="card"""),_display_(/*56.29*/tweetArray(1)),format.raw/*56.42*/("""a" class="card">
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
							        """),format.raw/*130.16*/("""<div id="card"""),_display_(/*130.30*/tweetArray(1)),format.raw/*130.43*/("""a" class="card">
						        	<div id=""""),_display_(/*131.26*/tweetArray(1)),format.raw/*131.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*133.30*/tweetArray(1)),format.raw/*133.43*/("""a");
							          
							        </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*136.87*/tweetArray(1)),format.raw/*136.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*137.65*/tweetArray(2)),format.raw/*137.78*/(""" """),format.raw/*137.79*/("""<i class="icon-envelope-l"></i>
				                    </a>
				                   
				                      		                </div>
							    """)))}),format.raw/*141.13*/("""
							    """),format.raw/*142.12*/("""<div class="modal fade" id="all"""),_display_(/*142.44*/tweetArray(1)),format.raw/*142.57*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*153.40*/b4/*153.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*153.117*/{_display_(Seq[Any](format.raw/*153.118*/(""" 

		                                            """),_display_(/*155.48*/b4/*155.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*158.62*/("""

		                                            """),_display_(/*160.48*/b4/*160.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*163.62*/("""

		                                    
		                                    """),format.raw/*166.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		                            
		                              </div>
		                          """)))}),format.raw/*173.30*/("""
		                            """),format.raw/*174.31*/("""</div>
		                          </div>
		                        </div>
						     
					    	""")))}),format.raw/*178.12*/("""
					    
				    """)))}),format.raw/*180.10*/("""
				    """),format.raw/*181.9*/("""<script>displayNoTweetsMessage("week-cards", "no-weeks")</script>
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
			      """),_display_(/*199.11*/for(tweet <- track) yield /*199.30*/{_display_(Seq[Any](format.raw/*199.31*/("""
			      	"""),_display_(/*200.12*/defining(tweet.split("-"))/*200.38*/ { tweetArray =>_display_(Seq[Any](format.raw/*200.54*/(""" 
				   		"""),_display_(/*201.11*/if(tweetArray(3)=="month")/*201.37*/{_display_(Seq[Any](format.raw/*201.38*/("""
						        """),format.raw/*202.15*/("""<div id="card"""),_display_(/*202.29*/tweetArray(1)),format.raw/*202.42*/("""a" class="card">
						        	<div id=""""),_display_(/*203.26*/tweetArray(1)),format.raw/*203.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*205.30*/tweetArray(1)),format.raw/*205.43*/("""a");
							         </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*207.87*/tweetArray(1)),format.raw/*207.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*208.65*/tweetArray(2)),format.raw/*208.78*/(""" """),format.raw/*208.79*/("""<i class="icon-envelope-l"></i>
				                    </a>
				                    
				                      		                </div>
						    """)))}),format.raw/*212.12*/("""
  						"""),format.raw/*213.9*/("""<div class="modal fade" id="all"""),_display_(/*213.41*/tweetArray(1)),format.raw/*213.54*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*224.40*/b4/*224.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*224.117*/{_display_(Seq[Any](format.raw/*224.118*/(""" 

		                                            """),_display_(/*226.48*/b4/*226.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*229.62*/("""

		                                            """),_display_(/*231.48*/b4/*231.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*234.62*/("""

		                                    
		                                    """),format.raw/*237.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		                            
		                              </div>
		                          """)))}),format.raw/*244.30*/("""
		                            """),format.raw/*245.31*/("""</div>
		                          </div>
		                        </div>
						   
				    	
				    """)))}),format.raw/*250.10*/("""
			      """)))}),format.raw/*251.11*/("""
			      """),format.raw/*252.10*/("""<script>displayNoTweetsMessage("month-cards", "no-months")</script>
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
			      """),_display_(/*269.11*/for(tweet <- track) yield /*269.30*/{_display_(Seq[Any](format.raw/*269.31*/("""
			      	"""),_display_(/*270.12*/defining(tweet.split("-"))/*270.38*/ { tweetArray =>_display_(Seq[Any](format.raw/*270.54*/(""" 
				      		"""),_display_(/*271.14*/if(tweetArray(3)=="older")/*271.40*/{_display_(Seq[Any](format.raw/*271.41*/("""
						        """),format.raw/*272.15*/("""<div id="card"""),_display_(/*272.29*/tweetArray(1)),format.raw/*272.42*/("""a" class="card">
						        	<div id=""""),_display_(/*273.26*/tweetArray(1)),format.raw/*273.39*/("""a"></div>
							        <script>
							          rendering(""""),_display_(/*275.30*/tweetArray(1)),format.raw/*275.43*/("""a");
							         </script>
							        <a type="button" class="msg_btn" data-toggle="modal" data-target="#all"""),_display_(/*277.87*/tweetArray(1)),format.raw/*277.100*/("""">
				                      Message <span style="color: #E4BC7B">"""),_display_(/*278.65*/tweetArray(2)),format.raw/*278.78*/(""" """),format.raw/*278.79*/("""<i class="icon-envelope-l"></i>
				                    </a>
				                    
				                      		                </div>

				                <div class="modal fade" id="all"""),_display_(/*283.53*/tweetArray(1)),format.raw/*283.66*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
		                                    """),_display_(/*294.40*/b4/*294.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*294.117*/{_display_(Seq[Any](format.raw/*294.118*/(""" 

		                                            """),_display_(/*296.48*/b4/*296.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
		                                                'placeholder -> "Recipient Name",
		                                                '_label -> "Recipient Name",
		                                                'size -> 1)),format.raw/*299.62*/("""

		                                            """),_display_(/*301.48*/b4/*301.50*/.textarea(messageForm("message"),
		                                                'placeholder -> "Message",
		                                                '_label -> "Message:",
		                                                'rows -> 4)),format.raw/*304.62*/("""

		                                    
		                                    """),format.raw/*307.39*/("""</div>
		                              </div>
		                              <div class="modal-footer">
		                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
		                            
		                              </div>
		                          """)))}),format.raw/*314.30*/("""
		                            """),format.raw/*315.31*/("""</div>
		                          </div>
		                        </div>
						    """)))}),format.raw/*318.12*/("""
						    
				    	
				    """)))}),format.raw/*321.10*/("""
			      """)))}),format.raw/*322.11*/("""
				"""),format.raw/*323.5*/("""</div>
				<script>displayNoTweetsMessage("older-cards", "no-older")</script>
			</div>

		</div>
					
  				
	    </div>
	</div>

	    """),_display_(/*333.7*/for(term <- terms) yield /*333.25*/{_display_(Seq[Any](format.raw/*333.26*/("""
	  		"""),_display_(/*334.7*/if(term contains i)/*334.26*/{_display_(Seq[Any](format.raw/*334.27*/("""
	  			"""),_display_(/*335.8*/defining(term.replace("-"+i,""))/*335.40*/ { tweetTerm=>_display_(Seq[Any](format.raw/*335.54*/("""
	  				"""),_display_(/*336.9*/defining(tweetTerm.replaceAll(" ","-"))/*336.48*/ { id=>_display_(Seq[Any](format.raw/*336.55*/("""
			  			"""),format.raw/*337.9*/("""<div class="carousel-item">
			  				<div id="accordion" role="tablist" aria-multiselectable="true">

							 <div class="card">
							    <div class="card-header" role="tab" id="daily">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#today"""),_display_(/*343.80*/id),format.raw/*343.82*/("""" aria-expanded="true" aria-controls="today"""),_display_(/*343.126*/id),format.raw/*343.128*/("""">
							          Today
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="today"""),_display_(/*350.23*/id),format.raw/*350.25*/("""" class="collapse" role="tabpanel" aria-labelledby="today"""),_display_(/*350.83*/id),format.raw/*350.85*/("""">
								<div id="no-today"""),_display_(/*351.27*/id),format.raw/*351.29*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="today"""),_display_(/*352.47*/id),format.raw/*352.49*/("""-cards">
							      """),_display_(/*353.15*/for(tweet <- track) yield /*353.34*/{_display_(Seq[Any](format.raw/*353.35*/("""
							      	"""),_display_(/*354.16*/defining(tweet.split("-"))/*354.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*354.58*/(""" 
								      	"""),_display_(/*355.17*/if(tweetArray(0)==tweetTerm)/*355.45*/{_display_(Seq[Any](format.raw/*355.46*/("""
								      		"""),_display_(/*356.18*/if(tweetArray(3)=="today")/*356.44*/{_display_(Seq[Any](format.raw/*356.45*/("""
										        """),format.raw/*357.19*/("""<div id="card"""),_display_(/*357.33*/tweetArray(1)),format.raw/*357.46*/("""" class="card">
										        	<div id=""""),_display_(/*358.30*/tweetArray(1)),format.raw/*358.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*360.34*/tweetArray(1)),format.raw/*360.47*/("""");
											           </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*362.88*/tweet),format.raw/*362.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*363.69*/tweetArray(2)),format.raw/*363.82*/(""" """),format.raw/*363.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                    
				                      						                </div>

								                <div class="modal fade" id=""""),_display_(/*368.54*/tweet),format.raw/*368.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*379.44*/b4/*379.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*379.121*/{_display_(Seq[Any](format.raw/*379.122*/(""" 
						                                            """),_display_(/*380.52*/b4/*380.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*383.66*/("""

						                                            """),_display_(/*385.52*/b4/*385.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*388.66*/("""

						                                    
						                                    """),format.raw/*391.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*396.36*/("""
						                              """),format.raw/*397.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
						                    """)))}),format.raw/*401.28*/("""
										    
								    	""")))}),format.raw/*403.15*/("""
								    """)))}),format.raw/*404.14*/("""
							      """)))}),format.raw/*405.15*/("""
							      
								"""),format.raw/*407.9*/("""</div>
								<script>displayNoTweetsMessage("today"""),_display_(/*408.47*/id),format.raw/*408.49*/("""-cards", "no-today"""),_display_(/*408.68*/id),format.raw/*408.70*/("""")</script>
							</div>

							 <div class="card">
							    <div class="card-header" role="tab" id="weekly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#week"""),_display_(/*414.79*/id),format.raw/*414.81*/("""" aria-expanded="true" aria-controls="week"""),_display_(/*414.124*/id),format.raw/*414.126*/("""">
							          Past Week
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="week"""),_display_(/*421.22*/id),format.raw/*421.24*/("""" class="collapse" role="tabpanel" aria-labelledby="week"""),_display_(/*421.81*/id),format.raw/*421.83*/("""">
								<div id="no-weeks"""),_display_(/*422.27*/id),format.raw/*422.29*/("""" style="display:none;"> No tweets to show. </div>
					  			<div class="card-columns" id="week"""),_display_(/*423.46*/id),format.raw/*423.48*/("""-cards">
								      """),_display_(/*424.16*/for(tweet <- track) yield /*424.35*/{_display_(Seq[Any](format.raw/*424.36*/("""
								      	"""),_display_(/*425.17*/defining(tweet.split("-"))/*425.43*/ { tweetArray =>_display_(Seq[Any](format.raw/*425.59*/(""" 
									      	"""),_display_(/*426.18*/if(tweetArray(0)==tweetTerm)/*426.46*/{_display_(Seq[Any](format.raw/*426.47*/("""
									      		"""),_display_(/*427.19*/if(tweetArray(3)=="week")/*427.44*/{_display_(Seq[Any](format.raw/*427.45*/("""
											        """),format.raw/*428.20*/("""<div id="card"""),_display_(/*428.34*/tweetArray(1)),format.raw/*428.47*/("""" class="card">
										        	<div id=""""),_display_(/*429.30*/tweetArray(1)),format.raw/*429.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*431.34*/tweetArray(1)),format.raw/*431.47*/("""");
											         </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*433.88*/tweet),format.raw/*433.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*434.69*/tweetArray(2)),format.raw/*434.82*/(""" """),format.raw/*434.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                    
				                      						                </div>

												<div class="modal fade" id=""""),_display_(/*439.42*/tweet),format.raw/*439.47*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*450.44*/b4/*450.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*450.121*/{_display_(Seq[Any](format.raw/*450.122*/(""" 

						                                            """),_display_(/*452.52*/b4/*452.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*455.66*/("""

						                                            """),_display_(/*457.52*/b4/*457.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*460.66*/("""

						                                    
						                                    """),format.raw/*463.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*468.36*/("""
						                              """),format.raw/*469.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>

											    """)))}),format.raw/*474.17*/("""
											    
									    	""")))}),format.raw/*476.16*/("""
									    """)))}),format.raw/*477.15*/("""
								      """)))}),format.raw/*478.16*/("""
								      
								"""),format.raw/*480.9*/("""</div>
								<script>displayNoTweetsMessage("week"""),_display_(/*481.46*/id),format.raw/*481.48*/("""-cards", "no-weeks"""),_display_(/*481.67*/id),format.raw/*481.69*/("""")</script>
							</div>


							<div class="card">
							    <div class="card-header" role="tab" id="monthly">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#month"""),_display_(/*488.80*/id),format.raw/*488.82*/("""" aria-expanded="true" aria-controls="month"""),_display_(/*488.126*/id),format.raw/*488.128*/("""">
							          Past Month
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="month"""),_display_(/*495.23*/id),format.raw/*495.25*/("""" class="collapse" role="tabpanel" aria-labelledby="month"""),_display_(/*495.83*/id),format.raw/*495.85*/("""">
								<div id="no-months"""),_display_(/*496.28*/id),format.raw/*496.30*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="month"""),_display_(/*497.47*/id),format.raw/*497.49*/("""-cards">
							      """),_display_(/*498.15*/for(tweet <- track) yield /*498.34*/{_display_(Seq[Any](format.raw/*498.35*/("""
							      	"""),_display_(/*499.16*/defining(tweet.split("-"))/*499.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*499.58*/(""" 
								      	"""),_display_(/*500.17*/if(tweetArray(0)==tweetTerm)/*500.45*/{_display_(Seq[Any](format.raw/*500.46*/("""
								      		"""),_display_(/*501.18*/if(tweetArray(3)=="month")/*501.44*/{_display_(Seq[Any](format.raw/*501.45*/("""
										        """),format.raw/*502.19*/("""<div id="card"""),_display_(/*502.33*/tweetArray(1)),format.raw/*502.46*/("""" class="card">
										        	<div id=""""),_display_(/*503.30*/tweetArray(1)),format.raw/*503.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*505.34*/tweetArray(1)),format.raw/*505.47*/("""");
											        </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*507.88*/tweet),format.raw/*507.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*508.69*/tweetArray(2)),format.raw/*508.82*/(""" """),format.raw/*508.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                    
				                      						                </div>

								                <div class="modal fade" id=""""),_display_(/*513.54*/tweet),format.raw/*513.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*524.44*/b4/*524.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*524.121*/{_display_(Seq[Any](format.raw/*524.122*/(""" 

						                                            """),_display_(/*526.52*/b4/*526.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*529.66*/("""

						                                            """),_display_(/*531.52*/b4/*531.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*534.66*/("""


						                                    
						                                    """),format.raw/*538.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*543.36*/("""
						                              """),format.raw/*544.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*548.16*/("""
										    
								    	""")))}),format.raw/*550.15*/("""
								    """)))}),format.raw/*551.14*/("""
							      """)))}),format.raw/*552.15*/("""
							      
								"""),format.raw/*554.9*/("""</div>
								<script>displayNoTweetsMessage("month"""),_display_(/*555.47*/id),format.raw/*555.49*/("""-cards", "no-months"""),_display_(/*555.69*/id),format.raw/*555.71*/("""")</script>
							</div>

							<div class="card">
							    <div class="card-header" role="tab" id="old">
							      <h5 class="mb-0">
							        <a data-toggle="collapse" data-parent="#accordion" href="#older"""),_display_(/*561.80*/id),format.raw/*561.82*/("""" aria-expanded="true" aria-controls="older"""),_display_(/*561.126*/id),format.raw/*561.128*/("""">
							          Older
							        </a>
							      </h5>
							    </div>
							</div>

							<div id="older"""),_display_(/*568.23*/id),format.raw/*568.25*/("""" class="collapse" role="tabpanel" aria-labelledby="older"""),_display_(/*568.83*/id),format.raw/*568.85*/("""">
								<div id="no-older"""),_display_(/*569.27*/id),format.raw/*569.29*/("""" style="display:none;"> No tweets to show. </div>
				  				<div class="card-columns" id="older"""),_display_(/*570.47*/id),format.raw/*570.49*/("""-cards">
							      """),_display_(/*571.15*/for(tweet <- track) yield /*571.34*/{_display_(Seq[Any](format.raw/*571.35*/("""
							      	"""),_display_(/*572.16*/defining(tweet.split("-"))/*572.42*/ { tweetArray =>_display_(Seq[Any](format.raw/*572.58*/(""" 
								      	"""),_display_(/*573.17*/if(tweetArray(0)==tweetTerm)/*573.45*/{_display_(Seq[Any](format.raw/*573.46*/("""
								      		"""),_display_(/*574.18*/if(tweetArray(3)=="older")/*574.44*/{_display_(Seq[Any](format.raw/*574.45*/("""
										        """),format.raw/*575.19*/("""<div id="card"""),_display_(/*575.33*/tweetArray(1)),format.raw/*575.46*/("""" class="card">
										        	<div id=""""),_display_(/*576.30*/tweetArray(1)),format.raw/*576.43*/(""""></div>
											        <script>
											          rendering(""""),_display_(/*578.34*/tweetArray(1)),format.raw/*578.47*/("""");
											        </script>
											        <a type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*580.88*/tweet),format.raw/*580.93*/("""">
								                      Message <span style="color: #E4BC7B">"""),_display_(/*581.69*/tweetArray(2)),format.raw/*581.82*/(""" """),format.raw/*581.83*/("""<i class="icon-envelope-l"></i>
								                    </a>
								                    
				                      						                </div>

								                <div class="modal fade" id=""""),_display_(/*586.54*/tweet),format.raw/*586.59*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
						                                    """),_display_(/*597.44*/b4/*597.46*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*597.121*/{_display_(Seq[Any](format.raw/*597.122*/(""" 

						                                            """),_display_(/*599.52*/b4/*599.54*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(2))),
						                                                'placeholder -> "Recipient Name",
						                                                '_label -> "Recipient Name",
						                                                'size -> 1)),format.raw/*602.66*/("""

						                                            """),_display_(/*604.52*/b4/*604.54*/.textarea(messageForm("message"),
						                                                'placeholder -> "Message",
						                                                '_label -> "Message:",
						                                                'rows -> 4)),format.raw/*607.66*/("""

						                                    
						                                    """),format.raw/*610.43*/("""</div>
						                              </div>
						                              <div class="modal-footer">
						                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
						                            """)))}),format.raw/*615.36*/("""
						                              """),format.raw/*616.37*/("""</div>
						                            </div>
						                          </div>
						                        </div>
										    """)))}),format.raw/*620.16*/("""
										    
								    	""")))}),format.raw/*622.15*/("""
								    """)))}),format.raw/*623.14*/("""
							      """)))}),format.raw/*624.15*/("""
							      
								"""),format.raw/*626.9*/("""</div>
								<script>displayNoTweetsMessage("older"""),_display_(/*627.47*/id),format.raw/*627.49*/("""-cards", "no-older"""),_display_(/*627.68*/id),format.raw/*627.70*/("""")</script>
							</div>

						</div>
					</div>
				
                    """)))}),format.raw/*633.22*/("""

				""")))}),format.raw/*635.6*/("""
	  		""")))}),format.raw/*636.7*/("""
	  	""")))}),format.raw/*637.6*/("""
	  """),format.raw/*638.4*/("""</div>
	</div>
</div>
</div>
		  <script>
			var myVar;
            myVar = setTimeout(showPage, 3000);

            function showPage() """),format.raw/*646.33*/("""{"""),format.raw/*646.34*/("""
              """),format.raw/*647.15*/("""document.getElementById("loader").style.display = "none";
              document.getElementById("loader-bg").style.display = "none";
              document.getElementById("page-content").style.display = "block";
            """),format.raw/*650.13*/("""}"""),format.raw/*650.14*/("""
          """),format.raw/*651.11*/("""</script>

""")))}),format.raw/*653.2*/("""

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
                  DATE: Sun Mar 04 01:20:54 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/interest.scala.html
                  HASH: e4b9d2bfab4fb406e8e7353066f73e83a07282fa
                  MATRIX: 1079->1|1397->249|1434->266|1466->290|1560->246|1589->353|1617->355|1813->525|1827->531|1889->573|1953->611|1978->627|1999->639|2014->645|2029->651|2043->656|2062->666|2082->677|2121->678|2152->682|2236->739|2258->740|2715->1171|2769->1209|2808->1210|2840->1215|2938->1286|2968->1295|3064->1364|3086->1365|3115->1366|3167->1388|3197->1391|4024->2192|4059->2211|4098->2212|4137->2224|4172->2250|4226->2266|4280->2293|4315->2319|4354->2320|4397->2335|4438->2349|4472->2362|4541->2404|4575->2417|4665->2480|4699->2493|4842->2609|4877->2622|4971->2689|5005->2702|5227->2897|5261->2910|6083->3705|6094->3707|6179->3782|6219->3783|6296->3833|6307->3835|6631->4138|6707->4187|6718->4189|6984->4434|7091->4513|7528->4919|7588->4950|7749->5079|7792->5090|7830->5097|7863->5102|8501->5712|8537->5731|8577->5732|8618->5745|8654->5771|8709->5787|8766->5816|8801->5841|8841->5842|8886->5858|8928->5872|8963->5885|9033->5927|9068->5940|9159->6003|9194->6016|9356->6150|9392->6163|9487->6230|9522->6243|9552->6244|9732->6392|9773->6404|9833->6436|9868->6449|10691->7244|10703->7246|10789->7321|10830->7322|10908->7372|10920->7374|11245->7677|11322->7726|11334->7728|11601->7973|11709->8052|12173->8484|12233->8515|12363->8613|12415->8633|12452->8642|13099->9261|13135->9280|13175->9281|13215->9293|13251->9319|13306->9335|13346->9347|13382->9373|13422->9374|13466->9389|13508->9403|13543->9416|13613->9458|13648->9471|13739->9534|13774->9547|13919->9664|13955->9677|14050->9744|14085->9757|14115->9758|14295->9906|14332->9915|14392->9947|14427->9960|15250->10755|15262->10757|15348->10832|15389->10833|15467->10883|15479->10885|15804->11188|15881->11237|15893->11239|16160->11484|16268->11563|16732->11995|16792->12026|16928->12130|16971->12141|17010->12151|17648->12761|17684->12780|17724->12781|17764->12793|17800->12819|17855->12835|17898->12850|17934->12876|17974->12877|18018->12892|18060->12906|18095->12919|18165->12961|18200->12974|18291->13037|18326->13050|18471->13167|18507->13180|18602->13247|18637->13260|18667->13261|18885->13451|18920->13464|19743->14259|19755->14261|19841->14336|19882->14337|19960->14387|19972->14389|20297->14692|20374->14741|20386->14743|20653->14988|20761->15067|21225->15499|21285->15530|21403->15616|21466->15647|21509->15658|21542->15663|21707->15801|21742->15819|21782->15820|21816->15827|21845->15846|21885->15847|21920->15855|21962->15887|22015->15901|22051->15910|22100->15949|22146->15956|22183->15965|22509->16263|22533->16265|22606->16309|22631->16311|22779->16431|22803->16433|22889->16491|22913->16493|22970->16522|22994->16524|23119->16621|23143->16623|23194->16646|23230->16665|23270->16666|23314->16682|23350->16708|23405->16724|23451->16742|23489->16770|23529->16771|23575->16789|23611->16815|23651->16816|23699->16835|23741->16849|23776->16862|23849->16907|23884->16920|23982->16990|24017->17003|24168->17126|24195->17131|24294->17202|24329->17215|24359->17216|24590->17419|24617->17424|25484->18263|25496->18265|25582->18340|25623->18341|25704->18394|25716->18396|26053->18711|26134->18764|26146->18766|26425->19023|26541->19110|26957->19494|27023->19531|27206->19682|27268->19712|27314->19726|27361->19741|27412->19764|27493->19817|27517->19819|27564->19838|27588->19840|27839->20063|27863->20065|27935->20108|27960->20110|28111->20233|28135->20235|28220->20292|28244->20294|28301->20323|28325->20325|28449->20421|28473->20423|28525->20447|28561->20466|28601->20467|28646->20484|28682->20510|28737->20526|28784->20545|28822->20573|28862->20574|28909->20593|28944->20618|28984->20619|29033->20639|29075->20653|29110->20666|29183->20711|29218->20724|29316->20794|29351->20807|29500->20928|29527->20933|29626->21004|29661->21017|29691->21018|29910->21209|29937->21214|30804->22053|30816->22055|30902->22130|30943->22131|31025->22185|31037->22187|31374->22502|31455->22555|31467->22557|31746->22814|31862->22901|32278->23285|32344->23322|32517->23463|32581->23495|32628->23510|32676->23526|32728->23550|32808->23602|32832->23604|32879->23623|32903->23625|33156->23850|33180->23852|33253->23896|33278->23898|33431->24023|33455->24025|33541->24083|33565->24085|33623->24115|33647->24117|33772->24214|33796->24216|33847->24239|33883->24258|33923->24259|33967->24275|34003->24301|34058->24317|34104->24335|34142->24363|34182->24364|34228->24382|34264->24408|34304->24409|34352->24428|34394->24442|34429->24455|34502->24500|34537->24513|34635->24583|34670->24596|34818->24716|34845->24721|34944->24792|34979->24805|35009->24806|35240->25009|35267->25014|36134->25853|36146->25855|36232->25930|36273->25931|36355->25985|36367->25987|36704->26302|36785->26355|36797->26357|37076->26614|37193->26702|37609->27086|37675->27123|37846->27262|37908->27292|37954->27306|38001->27321|38052->27344|38133->27397|38157->27399|38205->27419|38229->27421|38477->27641|38501->27643|38574->27687|38599->27689|38747->27809|38771->27811|38857->27869|38881->27871|38938->27900|38962->27902|39087->27999|39111->28001|39162->28024|39198->28043|39238->28044|39282->28060|39318->28086|39373->28102|39419->28120|39457->28148|39497->28149|39543->28167|39579->28193|39619->28194|39667->28213|39709->28227|39744->28240|39817->28285|39852->28298|39950->28368|39985->28381|40133->28501|40160->28506|40259->28577|40294->28590|40324->28591|40555->28794|40582->28799|41449->29638|41461->29640|41547->29715|41588->29716|41670->29770|41682->29772|42019->30087|42100->30140|42112->30142|42391->30399|42507->30486|42923->30870|42989->30907|43160->31046|43222->31076|43268->31090|43315->31105|43366->31128|43447->31181|43471->31183|43518->31202|43542->31204|43652->31282|43690->31289|43728->31296|43765->31302|43797->31306|43963->31443|43993->31444|44037->31459|44290->31683|44320->31684|44360->31695|44403->31707
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|38->6|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|61->29|84->52|84->52|84->52|85->53|85->53|85->53|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|91->59|91->59|93->61|93->61|94->62|94->62|100->68|100->68|111->79|111->79|111->79|111->79|113->81|113->81|116->84|118->86|118->86|121->89|124->92|131->99|132->100|138->106|139->107|140->108|141->109|158->126|158->126|158->126|159->127|159->127|159->127|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|165->133|165->133|168->136|168->136|169->137|169->137|169->137|173->141|174->142|174->142|174->142|185->153|185->153|185->153|185->153|187->155|187->155|190->158|192->160|192->160|195->163|198->166|205->173|206->174|210->178|212->180|213->181|231->199|231->199|231->199|232->200|232->200|232->200|233->201|233->201|233->201|234->202|234->202|234->202|235->203|235->203|237->205|237->205|239->207|239->207|240->208|240->208|240->208|244->212|245->213|245->213|245->213|256->224|256->224|256->224|256->224|258->226|258->226|261->229|263->231|263->231|266->234|269->237|276->244|277->245|282->250|283->251|284->252|301->269|301->269|301->269|302->270|302->270|302->270|303->271|303->271|303->271|304->272|304->272|304->272|305->273|305->273|307->275|307->275|309->277|309->277|310->278|310->278|310->278|315->283|315->283|326->294|326->294|326->294|326->294|328->296|328->296|331->299|333->301|333->301|336->304|339->307|346->314|347->315|350->318|353->321|354->322|355->323|365->333|365->333|365->333|366->334|366->334|366->334|367->335|367->335|367->335|368->336|368->336|368->336|369->337|375->343|375->343|375->343|375->343|382->350|382->350|382->350|382->350|383->351|383->351|384->352|384->352|385->353|385->353|385->353|386->354|386->354|386->354|387->355|387->355|387->355|388->356|388->356|388->356|389->357|389->357|389->357|390->358|390->358|392->360|392->360|394->362|394->362|395->363|395->363|395->363|400->368|400->368|411->379|411->379|411->379|411->379|412->380|412->380|415->383|417->385|417->385|420->388|423->391|428->396|429->397|433->401|435->403|436->404|437->405|439->407|440->408|440->408|440->408|440->408|446->414|446->414|446->414|446->414|453->421|453->421|453->421|453->421|454->422|454->422|455->423|455->423|456->424|456->424|456->424|457->425|457->425|457->425|458->426|458->426|458->426|459->427|459->427|459->427|460->428|460->428|460->428|461->429|461->429|463->431|463->431|465->433|465->433|466->434|466->434|466->434|471->439|471->439|482->450|482->450|482->450|482->450|484->452|484->452|487->455|489->457|489->457|492->460|495->463|500->468|501->469|506->474|508->476|509->477|510->478|512->480|513->481|513->481|513->481|513->481|520->488|520->488|520->488|520->488|527->495|527->495|527->495|527->495|528->496|528->496|529->497|529->497|530->498|530->498|530->498|531->499|531->499|531->499|532->500|532->500|532->500|533->501|533->501|533->501|534->502|534->502|534->502|535->503|535->503|537->505|537->505|539->507|539->507|540->508|540->508|540->508|545->513|545->513|556->524|556->524|556->524|556->524|558->526|558->526|561->529|563->531|563->531|566->534|570->538|575->543|576->544|580->548|582->550|583->551|584->552|586->554|587->555|587->555|587->555|587->555|593->561|593->561|593->561|593->561|600->568|600->568|600->568|600->568|601->569|601->569|602->570|602->570|603->571|603->571|603->571|604->572|604->572|604->572|605->573|605->573|605->573|606->574|606->574|606->574|607->575|607->575|607->575|608->576|608->576|610->578|610->578|612->580|612->580|613->581|613->581|613->581|618->586|618->586|629->597|629->597|629->597|629->597|631->599|631->599|634->602|636->604|636->604|639->607|642->610|647->615|648->616|652->620|654->622|655->623|656->624|658->626|659->627|659->627|659->627|659->627|665->633|667->635|668->636|669->637|670->638|678->646|678->646|679->647|682->650|682->650|683->651|685->653
                  -- GENERATED --
              */
          