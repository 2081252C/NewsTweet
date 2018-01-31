
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template22[Form[Search],Form[Track],Form[Message],String,Integer,List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], messageForm: Form[Message], user: String, bool: Integer, tweets: List[String], popTweets: List[String], popTweets1: List[String], popTweets2: List[String], recentTweets: List[String], recentTweets1: List[String], recentTweets2: List[String], media: List[String], media1: List[String], media2: List[String], personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.504*/("""

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
            <a class="nav-link search_result" onclick="openTab(event, 'popular')">15 Most Popular</a> 
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

            <div class="button_wrapper">
              <button type="button" class="show_btn" id="show">
                Show More
              </button>
            </div>

              <div class="card-columns">

              <div id="more" style="display:none">
                """),_display_(/*91.18*/for(tweet <- recentTweets1) yield /*91.45*/{_display_(Seq[Any](format.raw/*91.46*/("""
                  """),_display_(/*92.20*/defining(tweet.split("-"))/*92.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*92.62*/("""                 
                    """),format.raw/*93.21*/("""<div class="card">
                      <div id=""""),_display_(/*94.33*/tweetArray(0)),format.raw/*94.46*/("""">
                        <script>
                          rendering(""""),_display_(/*96.39*/tweetArray(0)),format.raw/*96.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*100.96*/tweet),format.raw/*100.101*/("""">
                        Message """),_display_(/*101.34*/tweetArray(1)),format.raw/*101.47*/("""
                      """),format.raw/*102.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*106.50*/tweet),format.raw/*106.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*117.40*/b4/*117.42*/.form(action=routes.SearchController.sendMessage())/*117.93*/{_display_(Seq[Any](format.raw/*117.94*/(""" 

                                              """),_display_(/*119.48*/b4/*119.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*122.62*/("""

                                              """),_display_(/*124.48*/b4/*124.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*127.62*/("""

                                      
                                      """),format.raw/*130.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*135.32*/("""
                                """),format.raw/*136.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*141.20*/("""
                """)))}),format.raw/*142.18*/("""
              """),format.raw/*143.15*/("""</div>
            </div>
            <div class="button_wrapper">
              <button type="button" class="show_btn" id="show2" style="display:none">
                Show More
              </button>
            </div>
              <div class="card-columns">

              <div id="showMore" style="display:none">
                """),_display_(/*153.18*/for(tweet <- recentTweets2) yield /*153.45*/{_display_(Seq[Any](format.raw/*153.46*/("""
                  """),_display_(/*154.20*/defining(tweet.split("-"))/*154.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*154.62*/("""                 
                    """),format.raw/*155.21*/("""<div class="card">
                      <div id=""""),_display_(/*156.33*/tweetArray(0)),format.raw/*156.46*/("""">
                        <script>
                          rendering(""""),_display_(/*158.39*/tweetArray(0)),format.raw/*158.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*162.96*/tweet),format.raw/*162.101*/("""">
                        Message """),_display_(/*163.34*/tweetArray(1)),format.raw/*163.47*/("""
                      """),format.raw/*164.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*168.50*/tweet),format.raw/*168.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*179.40*/b4/*179.42*/.form(action=routes.SearchController.sendMessage())/*179.93*/{_display_(Seq[Any](format.raw/*179.94*/(""" 

                                              """),_display_(/*181.48*/b4/*181.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*184.62*/("""

                                              """),_display_(/*186.48*/b4/*186.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*189.62*/("""

                                      
                                      """),format.raw/*192.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*197.32*/("""
                                """),format.raw/*198.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*203.20*/("""
                """)))}),format.raw/*204.18*/("""
              """),format.raw/*205.15*/("""</div>
            </div> 
          </div>

          <div id="popular" class="tweets">
            <div class="card-columns">
              """),_display_(/*211.16*/for((tweet) <- popTweets) yield /*211.41*/{_display_(Seq[Any](format.raw/*211.42*/("""
                """),_display_(/*212.18*/defining(tweet.split("-"))/*212.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*212.60*/("""                 
                  """),format.raw/*213.19*/("""<div class="card">
                    <div id=""""),_display_(/*214.31*/tweetArray(0)),format.raw/*214.44*/("""">
                      <script>
                        rendering(""""),_display_(/*216.37*/tweetArray(0)),format.raw/*216.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*220.94*/tweet),format.raw/*220.99*/("""">
                      Message """),_display_(/*221.32*/tweetArray(1)),format.raw/*221.45*/("""
                    """),format.raw/*222.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*226.48*/tweet),format.raw/*226.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*237.38*/b4/*237.40*/.form(action=routes.SearchController.sendMessage())/*237.91*/{_display_(Seq[Any](format.raw/*237.92*/(""" 

                                            """),_display_(/*239.46*/b4/*239.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*242.60*/("""

                                            """),_display_(/*244.46*/b4/*244.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*247.60*/("""

                                    
                                    """),format.raw/*250.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*255.30*/("""
                              """),format.raw/*256.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*261.18*/("""
              """)))}),format.raw/*262.16*/("""

              """),format.raw/*264.15*/("""<!-- """),_display_(/*264.21*/for((tweet) <- popTweets1) yield /*264.47*/{_display_(Seq[Any](format.raw/*264.48*/("""
                """),_display_(/*265.18*/defining(tweet.split("-"))/*265.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*265.60*/("""                 
                  """),format.raw/*266.19*/("""<div class="card">
                    <div id=""""),_display_(/*267.31*/tweetArray(0)),format.raw/*267.44*/("""">
                      <script>
                        rendering(""""),_display_(/*269.37*/tweetArray(0)),format.raw/*269.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*273.94*/tweet),format.raw/*273.99*/("""">
                      Message """),_display_(/*274.32*/tweetArray(1)),format.raw/*274.45*/("""
                    """),format.raw/*275.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*279.48*/tweet),format.raw/*279.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*290.38*/b4/*290.40*/.form(action=routes.SearchController.sendMessage())/*290.91*/{_display_(Seq[Any](format.raw/*290.92*/(""" 

                                            """),_display_(/*292.46*/b4/*292.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*295.60*/("""

                                            """),_display_(/*297.46*/b4/*297.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*300.60*/("""

                                    
                                    """),format.raw/*303.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*308.30*/("""
                              """),format.raw/*309.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*314.18*/("""
              """)))}),format.raw/*315.16*/("""

              """),_display_(/*317.16*/for((tweet) <- popTweets2) yield /*317.42*/{_display_(Seq[Any](format.raw/*317.43*/("""
                """),_display_(/*318.18*/defining(tweet.split("-"))/*318.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*318.60*/("""                 
                  """),format.raw/*319.19*/("""<div class="card">
                    <div id=""""),_display_(/*320.31*/tweetArray(0)),format.raw/*320.44*/("""">
                      <script>
                        rendering(""""),_display_(/*322.37*/tweetArray(0)),format.raw/*322.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*326.94*/tweet),format.raw/*326.99*/("""">
                      Message """),_display_(/*327.32*/tweetArray(1)),format.raw/*327.45*/("""
                    """),format.raw/*328.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*332.48*/tweet),format.raw/*332.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*343.38*/b4/*343.40*/.form(action=routes.SearchController.sendMessage())/*343.91*/{_display_(Seq[Any](format.raw/*343.92*/(""" 

                                            """),_display_(/*345.46*/b4/*345.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*348.60*/("""

                                            """),_display_(/*350.46*/b4/*350.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*353.60*/("""

                                    
                                    """),format.raw/*356.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*361.30*/("""
                              """),format.raw/*362.31*/("""</div>
                            </div>
                          </div>
                        </div>
                         -->
               <!--  """)))}),format.raw/*367.23*/("""
              """)))}),format.raw/*368.16*/("""-->
            </div>
          </div> 

          <div id="media" class="tweets">
            <div class="card-columns">
              """),_display_(/*374.16*/for(tweet <- media) yield /*374.35*/{_display_(Seq[Any](format.raw/*374.36*/("""
                """),_display_(/*375.18*/defining(tweet.split("-"))/*375.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*375.60*/("""                 
                  """),format.raw/*376.19*/("""<div class="card">
                    <div id=""""),_display_(/*377.31*/tweetArray(0)),format.raw/*377.44*/("""">
                      <script>
                        rendering(""""),_display_(/*379.37*/tweetArray(0)),format.raw/*379.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*383.94*/tweet),format.raw/*383.99*/("""">
                      Message """),_display_(/*384.32*/tweetArray(1)),format.raw/*384.45*/("""
                    """),format.raw/*385.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*389.48*/tweet),format.raw/*389.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*400.38*/b4/*400.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*400.104*/{_display_(Seq[Any](format.raw/*400.105*/(""" 

                                            """),_display_(/*402.46*/b4/*402.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*405.60*/("""

                                            """),_display_(/*407.46*/b4/*407.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*410.60*/("""

                                    
                                    """),format.raw/*413.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*418.30*/("""
                              """),format.raw/*419.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*424.18*/("""
              """)))}),format.raw/*425.16*/("""

              """),format.raw/*427.15*/("""<button type="button" class="show_btn" id="media">
                Show More
              </button>

              <div id="moreMedia" style="display:none">
                """),_display_(/*432.18*/for(tweet <- media1) yield /*432.38*/{_display_(Seq[Any](format.raw/*432.39*/("""
                  """),_display_(/*433.20*/defining(tweet.split("-"))/*433.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*433.62*/("""                 
                    """),format.raw/*434.21*/("""<div class="card">
                      <div id=""""),_display_(/*435.33*/tweetArray(0)),format.raw/*435.46*/("""">
                        <script>
                          rendering(""""),_display_(/*437.39*/tweetArray(0)),format.raw/*437.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*441.96*/tweet),format.raw/*441.101*/("""">
                        Message """),_display_(/*442.34*/tweetArray(1)),format.raw/*442.47*/("""
                      """),format.raw/*443.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*447.50*/tweet),format.raw/*447.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*458.40*/b4/*458.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*458.106*/{_display_(Seq[Any](format.raw/*458.107*/(""" 

                                              """),_display_(/*460.48*/b4/*460.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*463.62*/("""

                                              """),_display_(/*465.48*/b4/*465.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*468.62*/("""

                                      
                                      """),format.raw/*471.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*476.32*/("""
                                """),format.raw/*477.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*482.20*/("""
                """)))}),format.raw/*483.18*/("""
              """),format.raw/*484.15*/("""</div>

              <button type="button" class="show_btn" id="media2" style="display:none">
                Show More
              </button>

              <div id="moreMedia2" style="display:none">
                """),_display_(/*491.18*/for(tweet <- media2) yield /*491.38*/{_display_(Seq[Any](format.raw/*491.39*/("""
                  """),_display_(/*492.20*/defining(tweet.split("-"))/*492.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*492.62*/("""                 
                    """),format.raw/*493.21*/("""<div class="card">
                      <div id=""""),_display_(/*494.33*/tweetArray(0)),format.raw/*494.46*/("""">
                        <script>
                          rendering(""""),_display_(/*496.39*/tweetArray(0)),format.raw/*496.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*500.96*/tweet),format.raw/*500.101*/("""">
                        Message """),_display_(/*501.34*/tweetArray(1)),format.raw/*501.47*/("""
                      """),format.raw/*502.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*506.50*/tweet),format.raw/*506.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*517.40*/b4/*517.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*517.106*/{_display_(Seq[Any](format.raw/*517.107*/(""" 

                                              """),_display_(/*519.48*/b4/*519.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*522.62*/("""

                                              """),_display_(/*524.48*/b4/*524.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*527.62*/("""

                                      
                                      """),format.raw/*530.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*535.32*/("""
                                """),format.raw/*536.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*541.20*/("""
                """)))}),format.raw/*542.18*/("""
              """),format.raw/*543.15*/("""</div>
            </div>
          </div>

           """),_display_(/*547.13*/if(bool==1)/*547.24*/{_display_(Seq[Any](format.raw/*547.25*/("""

              """),format.raw/*549.15*/("""<div class="fixed-bottom" id="footer">
                <button type="button" id="track_btn" class="btn btn-primary" data-toggle="modal" data-target="#trackModal">Track Search</button>
              </div>
               
              
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
                        """),_display_(/*565.26*/b4/*565.28*/.form(action=helper.CSRF(routes.SearchController.trackSearch()))/*565.92*/{_display_(Seq[Any](format.raw/*565.93*/("""

                            """),_display_(/*567.30*/b4/*567.32*/.text(trackForm("term").copy(value= Option[String](term)),
                              '_label -> "Search Term")),format.raw/*568.56*/("""

                            """),_display_(/*570.30*/b4/*570.32*/.select(
                               trackForm("interest"),
                               helper.options(interests),
                               '_label -> "Interest"
                            )),format.raw/*574.30*/("""

                            """),format.raw/*576.29*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#interest-modal">
                                          create a new interest.
                                        </button>
                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" type="submit">Save changes</button>
                  """)))}),format.raw/*584.20*/("""
                    """),format.raw/*585.21*/("""</div>
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
                                    """),_display_(/*601.38*/b4/*601.40*/.horizontal.form(action=helper.CSRF(routes.InterestController.addInterest()), "col-md-2", "col-md-10")/*601.142*/{ implicit ifc =>_display_(Seq[Any](format.raw/*601.159*/("""

                                        """),_display_(/*603.42*/b4/*603.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*606.56*/("""

                                        """),_display_(/*608.42*/b4/*608.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*612.42*/("""

                                        """),format.raw/*614.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*622.30*/("""
                              """),format.raw/*623.31*/("""</div>
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
                                    """),_display_(/*639.38*/b4/*639.40*/.horizontal.form(action=helper.CSRF(routes.PersonaController.addPersona()), "col-md-2", "col-md-10")/*639.140*/{ implicit ifc =>_display_(Seq[Any](format.raw/*639.157*/("""

                                            """),_display_(/*641.46*/b4/*641.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*644.60*/("""

                                    
                                    """),format.raw/*647.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Save changes</button>
                            """)))}),format.raw/*652.30*/("""
                              """),format.raw/*653.31*/("""</div>
                            </div>
                          </div>
                        </div>

            """)))}),format.raw/*658.14*/("""

            """),format.raw/*660.13*/("""<script>
              $('#show').click(function() """),format.raw/*661.43*/("""{"""),format.raw/*661.44*/("""
                """),format.raw/*662.17*/("""$('#more').toggle();
                $('#show').toggle();
                $('#show2').toggle();
            """),format.raw/*665.13*/("""}"""),format.raw/*665.14*/(""");

              $('#show2').click(function() """),format.raw/*667.44*/("""{"""),format.raw/*667.45*/("""
                """),format.raw/*668.17*/("""$('#showMore').toggle();
                $('#show2').toggle();
            """),format.raw/*670.13*/("""}"""),format.raw/*670.14*/(""");

              $('#media').click(function() """),format.raw/*672.44*/("""{"""),format.raw/*672.45*/("""
                """),format.raw/*673.17*/("""$('#moreMedia').toggle();
                $('#media2').toggle();
                $('#media').toggle();
            """),format.raw/*676.13*/("""}"""),format.raw/*676.14*/(""");

              $('#show2').click(function() """),format.raw/*678.44*/("""{"""),format.raw/*678.45*/("""
                """),format.raw/*679.17*/("""$('#moreMedia2').toggle();
                $('#show2').toggle();
            """),format.raw/*681.13*/("""}"""),format.raw/*681.14*/(""");
          </script>
""")))}),format.raw/*683.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],messageForm:Form[Message],user:String,bool:Integer,tweets:List[String],popTweets:List[String],popTweets1:List[String],popTweets2:List[String],recentTweets:List[String],recentTweets1:List[String],recentTweets2:List[String],media:List[String],media1:List[String],media2:List[String],personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,messageForm,user,bool,tweets,popTweets,popTweets1,popTweets2,recentTweets,recentTweets1,recentTweets2,media,media1,media2,personaForm,img,interestForm,term,personas,interests,i)

  def f:((Form[Search],Form[Track],Form[Message],String,Integer,List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],Form[Persona],String,Form[Interest],String,List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,messageForm,user,bool,tweets,popTweets,popTweets1,popTweets2,recentTweets,recentTweets1,recentTweets2,media,media1,media2,personaForm,img,interestForm,term,personas,interests,i) => apply(searchForm,trackForm,messageForm,user,bool,tweets,popTweets,popTweets1,popTweets2,recentTweets,recentTweets1,recentTweets2,media,media1,media2,personaForm,img,interestForm,term,personas,interests,i)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 31 12:28:21 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 85504821b6b8a5bd4de36f3dcc5d19911a6e7fca
                  MATRIX: 1210->1|1785->506|1822->523|1854->547|1948->503|1977->610|2006->612|2257->837|2271->843|2333->885|2397->923|2428->945|2449->957|2464->963|2479->969|2501->982|2515->987|2538->1001|2557->1011|2578->1022|2591->1025|2631->1026|2662->1030|2713->1054|2738->1058|2783->1076|2798->1082|2854->1117|3563->1799|3605->1825|3644->1826|3689->1844|3724->1870|3778->1886|3842->1922|3918->1971|3952->1984|4049->2054|4083->2067|4289->2246|4315->2251|4376->2285|4410->2298|4459->2319|4586->2419|4612->2424|5412->3197|5423->3199|5483->3250|5522->3251|5597->3299|5608->3301|5926->3598|6000->3645|6011->3647|6266->3881|6369->3956|6757->4313|6816->4344|6995->4492|7042->4508|7083->4521|7403->4814|7446->4841|7485->4842|7532->4862|7567->4888|7621->4904|7687->4942|7765->4993|7799->5006|7900->5080|7934->5093|8149->5280|8177->5285|8241->5321|8276->5334|8328->5357|8462->5463|8489->5468|9312->6263|9324->6265|9385->6316|9425->6317|9503->6367|9515->6369|9840->6672|9917->6721|9929->6723|10191->6963|10299->7042|10698->7409|10760->7442|10950->7600|11000->7618|11044->7633|11408->7969|11452->7996|11492->7997|11540->8017|11576->8043|11631->8059|11698->8097|11777->8148|11812->8161|11914->8235|11949->8248|12164->8435|12192->8440|12256->8476|12291->8489|12343->8512|12477->8618|12504->8623|13327->9418|13339->9420|13400->9471|13440->9472|13518->9522|13530->9524|13855->9827|13932->9876|13944->9878|14206->10118|14314->10197|14713->10564|14775->10597|14965->10755|15015->10773|15059->10788|15230->10931|15272->10956|15312->10957|15358->10975|15394->11001|15449->11017|15514->11053|15591->11102|15626->11115|15724->11185|15759->11198|15966->11377|15993->11382|16055->11416|16090->11429|16140->11450|16268->11550|16295->11555|17096->12328|17108->12330|17169->12381|17209->12382|17285->12430|17297->12432|17616->12729|17691->12776|17703->12778|17959->13012|18063->13087|18452->13444|18512->13475|18692->13623|18740->13639|18785->13655|18819->13661|18862->13687|18902->13688|18948->13706|18984->13732|19039->13748|19104->13784|19181->13833|19216->13846|19314->13916|19349->13929|19556->14108|19583->14113|19645->14147|19680->14160|19730->14181|19858->14281|19885->14286|20686->15059|20698->15061|20759->15112|20799->15113|20875->15161|20887->15163|21206->15460|21281->15507|21293->15509|21549->15743|21653->15818|22042->16175|22102->16206|22282->16354|22330->16370|22375->16387|22418->16413|22458->16414|22504->16432|22540->16458|22595->16474|22660->16510|22737->16559|22772->16572|22870->16642|22905->16655|23112->16834|23139->16839|23201->16873|23236->16886|23286->16907|23414->17007|23441->17012|24242->17785|24254->17787|24315->17838|24355->17839|24431->17887|24443->17889|24762->18186|24837->18233|24849->18235|25105->18469|25209->18544|25598->18901|25658->18932|25847->19089|25895->19105|26061->19243|26097->19262|26137->19263|26183->19281|26219->19307|26274->19323|26339->19359|26416->19408|26451->19421|26549->19491|26584->19504|26791->19683|26818->19688|26880->19722|26915->19735|26965->19756|27093->19856|27120->19861|27921->20634|27933->20636|28008->20700|28049->20701|28125->20749|28137->20751|28456->21048|28531->21095|28543->21097|28799->21331|28903->21406|29292->21763|29352->21794|29532->21942|29580->21958|29625->21974|29828->22149|29865->22169|29905->22170|29953->22190|29989->22216|30044->22232|30111->22270|30190->22321|30225->22334|30327->22408|30362->22421|30577->22608|30605->22613|30669->22649|30704->22662|30756->22685|30890->22791|30917->22796|31740->23591|31752->23593|31827->23657|31868->23658|31946->23708|31958->23710|32283->24013|32360->24062|32372->24064|32634->24304|32742->24383|33141->24750|33203->24783|33393->24941|33443->24959|33487->24974|33735->25194|33772->25214|33812->25215|33860->25235|33896->25261|33951->25277|34018->25315|34097->25366|34132->25379|34234->25453|34269->25466|34484->25653|34512->25658|34576->25694|34611->25707|34663->25730|34797->25836|34824->25841|35647->26636|35659->26638|35734->26702|35775->26703|35853->26753|35865->26755|36190->27058|36267->27107|36279->27109|36541->27349|36649->27428|37048->27795|37110->27828|37300->27986|37350->28004|37394->28019|37478->28075|37499->28086|37539->28087|37584->28103|38553->29044|38565->29046|38639->29110|38679->29111|38738->29142|38750->29144|38886->29258|38945->29289|38957->29291|39182->29494|39241->29524|39823->30074|39873->30095|40813->31007|40825->31009|40938->31111|40995->31128|41066->31171|41078->31173|41331->31404|41402->31447|41414->31449|41691->31704|41762->31746|42408->32360|42468->32391|43446->33341|43458->33343|43569->33443|43626->33460|43701->33507|43713->33509|43975->33749|44079->33824|44476->34189|44536->34220|44688->34340|44731->34354|44811->34405|44841->34406|44887->34423|45024->34531|45054->34532|45130->34579|45160->34580|45206->34597|45310->34672|45340->34673|45416->34720|45446->34721|45492->34738|45636->34853|45666->34854|45742->34901|45772->34902|45818->34919|45924->34996|45954->34997|46009->35021
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|63->31|65->33|65->33|69->37|69->37|70->38|70->38|71->39|75->43|75->43|86->54|86->54|86->54|86->54|88->56|88->56|91->59|93->61|93->61|96->64|99->67|104->72|105->73|110->78|111->79|112->80|123->91|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|128->96|128->96|132->100|132->100|133->101|133->101|134->102|138->106|138->106|149->117|149->117|149->117|149->117|151->119|151->119|154->122|156->124|156->124|159->127|162->130|167->135|168->136|173->141|174->142|175->143|185->153|185->153|185->153|186->154|186->154|186->154|187->155|188->156|188->156|190->158|190->158|194->162|194->162|195->163|195->163|196->164|200->168|200->168|211->179|211->179|211->179|211->179|213->181|213->181|216->184|218->186|218->186|221->189|224->192|229->197|230->198|235->203|236->204|237->205|243->211|243->211|243->211|244->212|244->212|244->212|245->213|246->214|246->214|248->216|248->216|252->220|252->220|253->221|253->221|254->222|258->226|258->226|269->237|269->237|269->237|269->237|271->239|271->239|274->242|276->244|276->244|279->247|282->250|287->255|288->256|293->261|294->262|296->264|296->264|296->264|296->264|297->265|297->265|297->265|298->266|299->267|299->267|301->269|301->269|305->273|305->273|306->274|306->274|307->275|311->279|311->279|322->290|322->290|322->290|322->290|324->292|324->292|327->295|329->297|329->297|332->300|335->303|340->308|341->309|346->314|347->315|349->317|349->317|349->317|350->318|350->318|350->318|351->319|352->320|352->320|354->322|354->322|358->326|358->326|359->327|359->327|360->328|364->332|364->332|375->343|375->343|375->343|375->343|377->345|377->345|380->348|382->350|382->350|385->353|388->356|393->361|394->362|399->367|400->368|406->374|406->374|406->374|407->375|407->375|407->375|408->376|409->377|409->377|411->379|411->379|415->383|415->383|416->384|416->384|417->385|421->389|421->389|432->400|432->400|432->400|432->400|434->402|434->402|437->405|439->407|439->407|442->410|445->413|450->418|451->419|456->424|457->425|459->427|464->432|464->432|464->432|465->433|465->433|465->433|466->434|467->435|467->435|469->437|469->437|473->441|473->441|474->442|474->442|475->443|479->447|479->447|490->458|490->458|490->458|490->458|492->460|492->460|495->463|497->465|497->465|500->468|503->471|508->476|509->477|514->482|515->483|516->484|523->491|523->491|523->491|524->492|524->492|524->492|525->493|526->494|526->494|528->496|528->496|532->500|532->500|533->501|533->501|534->502|538->506|538->506|549->517|549->517|549->517|549->517|551->519|551->519|554->522|556->524|556->524|559->527|562->530|567->535|568->536|573->541|574->542|575->543|579->547|579->547|579->547|581->549|597->565|597->565|597->565|597->565|599->567|599->567|600->568|602->570|602->570|606->574|608->576|616->584|617->585|633->601|633->601|633->601|633->601|635->603|635->603|638->606|640->608|640->608|644->612|646->614|654->622|655->623|671->639|671->639|671->639|671->639|673->641|673->641|676->644|679->647|684->652|685->653|690->658|692->660|693->661|693->661|694->662|697->665|697->665|699->667|699->667|700->668|702->670|702->670|704->672|704->672|705->673|708->676|708->676|710->678|710->678|711->679|713->681|713->681|715->683
                  -- GENERATED --
              */
          