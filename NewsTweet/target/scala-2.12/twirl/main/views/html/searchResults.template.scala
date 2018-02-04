
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
                                    """),_display_(/*54.38*/b4/*54.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*54.104*/{_display_(Seq[Any](format.raw/*54.105*/(""" 

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
                                      """),_display_(/*117.40*/b4/*117.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*117.106*/{_display_(Seq[Any](format.raw/*117.107*/(""" 

                                              """),_display_(/*119.48*/b4/*119.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*122.60*/("""

                                            """),_display_(/*124.46*/b4/*124.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*127.60*/("""

                                      
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
                                      """),_display_(/*179.40*/b4/*179.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*179.106*/{_display_(Seq[Any](format.raw/*179.107*/(""" 

                                              """),_display_(/*181.48*/b4/*181.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*184.60*/("""

                                            """),_display_(/*186.46*/b4/*186.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*189.60*/("""

                                      
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
                                    """),_display_(/*237.38*/b4/*237.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*237.104*/{_display_(Seq[Any](format.raw/*237.105*/(""" 

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
            """),format.raw/*263.13*/("""</div>
          </div> 

          <div id="media" class="tweets">
            <div class="card-columns">
              """),_display_(/*268.16*/for(tweet <- media) yield /*268.35*/{_display_(Seq[Any](format.raw/*268.36*/("""
                """),_display_(/*269.18*/defining(tweet.split("-"))/*269.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*269.60*/("""                 
                  """),format.raw/*270.19*/("""<div class="card">
                    <div id=""""),_display_(/*271.31*/tweetArray(0)),format.raw/*271.44*/("""">
                      <script>
                        rendering(""""),_display_(/*273.37*/tweetArray(0)),format.raw/*273.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*277.94*/tweet),format.raw/*277.99*/("""">
                      Message """),_display_(/*278.32*/tweetArray(1)),format.raw/*278.45*/("""
                    """),format.raw/*279.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*283.48*/tweet),format.raw/*283.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*294.38*/b4/*294.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*294.104*/{_display_(Seq[Any](format.raw/*294.105*/(""" 

                                            """),_display_(/*296.46*/b4/*296.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*299.60*/("""

                                            """),_display_(/*301.46*/b4/*301.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*304.60*/("""
                                    
                                    """),format.raw/*306.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*311.30*/("""
                              """),format.raw/*312.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*317.18*/("""
              """)))}),format.raw/*318.16*/("""

              """),format.raw/*320.15*/("""<button type="button" class="show_btn" id="media">
                Show More
              </button>

              <div id="moreMedia" style="display:none">
                """),_display_(/*325.18*/for(tweet <- media1) yield /*325.38*/{_display_(Seq[Any](format.raw/*325.39*/("""
                  """),_display_(/*326.20*/defining(tweet.split("-"))/*326.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*326.62*/("""                 
                    """),format.raw/*327.21*/("""<div class="card">
                      <div id=""""),_display_(/*328.33*/tweetArray(0)),format.raw/*328.46*/("""">
                        <script>
                          rendering(""""),_display_(/*330.39*/tweetArray(0)),format.raw/*330.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*334.96*/tweet),format.raw/*334.101*/("""">
                        Message """),_display_(/*335.34*/tweetArray(1)),format.raw/*335.47*/("""
                      """),format.raw/*336.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*340.50*/tweet),format.raw/*340.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*351.40*/b4/*351.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*351.106*/{_display_(Seq[Any](format.raw/*351.107*/(""" 

                                              """),_display_(/*353.48*/b4/*353.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*356.60*/("""

                                            """),_display_(/*358.46*/b4/*358.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*361.60*/("""

                                      
                                      """),format.raw/*364.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*369.32*/("""
                                """),format.raw/*370.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*375.20*/("""
                """)))}),format.raw/*376.18*/("""
              """),format.raw/*377.15*/("""</div>

              <button type="button" class="show_btn" id="media2" style="display:none">
                Show More
              </button>

              <div id="moreMedia2" style="display:none">
                """),_display_(/*384.18*/for(tweet <- media2) yield /*384.38*/{_display_(Seq[Any](format.raw/*384.39*/("""
                  """),_display_(/*385.20*/defining(tweet.split("-"))/*385.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*385.62*/("""                 
                    """),format.raw/*386.21*/("""<div class="card">
                      <div id=""""),_display_(/*387.33*/tweetArray(0)),format.raw/*387.46*/("""">
                        <script>
                          rendering(""""),_display_(/*389.39*/tweetArray(0)),format.raw/*389.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*393.96*/tweet),format.raw/*393.101*/("""">
                        Message """),_display_(/*394.34*/tweetArray(1)),format.raw/*394.47*/("""
                      """),format.raw/*395.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*399.50*/tweet),format.raw/*399.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*410.40*/b4/*410.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*410.106*/{_display_(Seq[Any](format.raw/*410.107*/(""" 

                                              """),_display_(/*412.48*/b4/*412.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*415.60*/("""

                                            """),_display_(/*417.46*/b4/*417.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*420.60*/("""

                                      
                                      """),format.raw/*423.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*428.32*/("""
                                """),format.raw/*429.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*434.20*/("""
                """)))}),format.raw/*435.18*/("""
              """),format.raw/*436.15*/("""</div>
            </div>
          </div>

           """),_display_(/*440.13*/if(bool==1)/*440.24*/{_display_(Seq[Any](format.raw/*440.25*/("""

              """),format.raw/*442.15*/("""<div class="fixed-bottom" id="footer">
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
                        """),_display_(/*458.26*/b4/*458.28*/.form(action=helper.CSRF(routes.SearchController.trackSearch()))/*458.92*/{_display_(Seq[Any](format.raw/*458.93*/("""

                            """),_display_(/*460.30*/b4/*460.32*/.text(trackForm("term").copy(value= Option[String](term)),
                              '_label -> "Search Term")),format.raw/*461.56*/("""

                            """),_display_(/*463.30*/b4/*463.32*/.select(
                               trackForm("interest"),
                               helper.options(interests),
                               '_label -> "Interest"
                            )),format.raw/*467.30*/("""

                            """),format.raw/*469.29*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#interest-modal">
                                          create a new interest.
                                        </button>
                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" type="submit">Save changes</button>
                  """)))}),format.raw/*477.20*/("""
                    """),format.raw/*478.21*/("""</div>
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
                                    """),_display_(/*494.38*/b4/*494.40*/.horizontal.form(action=helper.CSRF(routes.InterestController.addInterest()), "col-md-2", "col-md-10")/*494.142*/{ implicit ifc =>_display_(Seq[Any](format.raw/*494.159*/("""

                                        """),_display_(/*496.42*/b4/*496.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*499.56*/("""

                                        """),_display_(/*501.42*/b4/*501.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*505.42*/("""

                                        """),format.raw/*507.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*515.30*/("""
                              """),format.raw/*516.31*/("""</div>
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
                                    """),_display_(/*532.38*/b4/*532.40*/.horizontal.form(action=helper.CSRF(routes.PersonaController.addPersona()), "col-md-2", "col-md-10")/*532.140*/{ implicit ifc =>_display_(Seq[Any](format.raw/*532.157*/("""

                                            """),_display_(/*534.46*/b4/*534.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*537.60*/("""

                                    
                                    """),format.raw/*540.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Save changes</button>
                            """)))}),format.raw/*545.30*/("""
                              """),format.raw/*546.31*/("""</div>
                            </div>
                          </div>
                        </div>

            """)))}),format.raw/*551.14*/("""

            """),format.raw/*553.13*/("""<script>
              $('#show').click(function() """),format.raw/*554.43*/("""{"""),format.raw/*554.44*/("""
                """),format.raw/*555.17*/("""$('#more').toggle();
                $('#show').toggle();
                $('#show2').toggle();
            """),format.raw/*558.13*/("""}"""),format.raw/*558.14*/(""");

              $('#show2').click(function() """),format.raw/*560.44*/("""{"""),format.raw/*560.45*/("""
                """),format.raw/*561.17*/("""$('#showMore').toggle();
                $('#show2').toggle();
            """),format.raw/*563.13*/("""}"""),format.raw/*563.14*/(""");

              $('#media').click(function() """),format.raw/*565.44*/("""{"""),format.raw/*565.45*/("""
                """),format.raw/*566.17*/("""$('#moreMedia').toggle();
                $('#media2').toggle();
                $('#media').toggle();
            """),format.raw/*569.13*/("""}"""),format.raw/*569.14*/(""");

              $('#show2').click(function() """),format.raw/*571.44*/("""{"""),format.raw/*571.45*/("""
                """),format.raw/*572.17*/("""$('#moreMedia2').toggle();
                $('#show2').toggle();
            """),format.raw/*574.13*/("""}"""),format.raw/*574.14*/(""");
          </script>
""")))}),format.raw/*576.2*/("""

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
                  DATE: Fri Feb 02 10:25:35 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: d5ecf82ac29d708ce470ecc73d71d9af1e5eb76a
                  MATRIX: 1210->1|1785->506|1822->523|1854->547|1948->503|1977->610|2006->612|2257->837|2271->843|2333->885|2397->923|2428->945|2449->957|2464->963|2479->969|2501->982|2515->987|2538->1001|2557->1011|2578->1022|2591->1025|2631->1026|2662->1030|2713->1054|2738->1058|2783->1076|2798->1082|2854->1117|3563->1799|3605->1825|3644->1826|3689->1844|3724->1870|3778->1886|3842->1922|3918->1971|3952->1984|4049->2054|4083->2067|4289->2246|4315->2251|4376->2285|4410->2298|4459->2319|4586->2419|4612->2424|5412->3197|5423->3199|5497->3263|5537->3264|5612->3312|5623->3314|5941->3611|6015->3658|6026->3660|6281->3894|6384->3969|6772->4326|6831->4357|7010->4505|7057->4521|7098->4534|7418->4827|7461->4854|7500->4855|7547->4875|7582->4901|7636->4917|7702->4955|7780->5006|7814->5019|7915->5093|7949->5106|8164->5293|8192->5298|8256->5334|8291->5347|8343->5370|8477->5476|8504->5481|9327->6276|9339->6278|9414->6342|9455->6343|9533->6393|9545->6395|9864->6692|9939->6739|9951->6741|10207->6975|10315->7054|10714->7421|10776->7454|10966->7612|11016->7630|11060->7645|11424->7981|11468->8008|11508->8009|11556->8029|11592->8055|11647->8071|11714->8109|11793->8160|11828->8173|11930->8247|11965->8260|12180->8447|12208->8452|12272->8488|12307->8501|12359->8524|12493->8630|12520->8635|13343->9430|13355->9432|13430->9496|13471->9497|13549->9547|13561->9549|13880->9846|13955->9893|13967->9895|14223->10129|14331->10208|14730->10575|14792->10608|14982->10766|15032->10784|15076->10799|15247->10942|15289->10967|15329->10968|15375->10986|15411->11012|15466->11028|15531->11064|15608->11113|15643->11126|15741->11196|15776->11209|15983->11388|16010->11393|16072->11427|16107->11440|16157->11461|16285->11561|16312->11566|17113->12339|17125->12341|17200->12405|17241->12406|17317->12454|17329->12456|17648->12753|17723->12800|17735->12802|17991->13036|18095->13111|18484->13468|18544->13499|18724->13647|18772->13663|18814->13676|18964->13798|19000->13817|19040->13818|19086->13836|19122->13862|19177->13878|19242->13914|19319->13963|19354->13976|19452->14046|19487->14059|19694->14238|19721->14243|19783->14277|19818->14290|19868->14311|19996->14411|20023->14416|20824->15189|20836->15191|20911->15255|20952->15256|21028->15304|21040->15306|21359->15603|21434->15650|21446->15652|21702->15886|21805->15960|22194->16317|22254->16348|22434->16496|22482->16512|22527->16528|22730->16703|22767->16723|22807->16724|22855->16744|22891->16770|22946->16786|23013->16824|23092->16875|23127->16888|23229->16962|23264->16975|23479->17162|23507->17167|23571->17203|23606->17216|23658->17239|23792->17345|23819->17350|24642->18145|24654->18147|24729->18211|24770->18212|24848->18262|24860->18264|25179->18561|25254->18608|25266->18610|25522->18844|25630->18923|26029->19290|26091->19323|26281->19481|26331->19499|26375->19514|26623->19734|26660->19754|26700->19755|26748->19775|26784->19801|26839->19817|26906->19855|26985->19906|27020->19919|27122->19993|27157->20006|27372->20193|27400->20198|27464->20234|27499->20247|27551->20270|27685->20376|27712->20381|28535->21176|28547->21178|28622->21242|28663->21243|28741->21293|28753->21295|29072->21592|29147->21639|29159->21641|29415->21875|29523->21954|29922->22321|29984->22354|30174->22512|30224->22530|30268->22545|30352->22601|30373->22612|30413->22613|30458->22629|31427->23570|31439->23572|31513->23636|31553->23637|31612->23668|31624->23670|31760->23784|31819->23815|31831->23817|32056->24020|32115->24050|32697->24600|32747->24621|33687->25533|33699->25535|33812->25637|33869->25654|33940->25697|33952->25699|34205->25930|34276->25973|34288->25975|34565->26230|34636->26272|35282->26886|35342->26917|36320->27867|36332->27869|36443->27969|36500->27986|36575->28033|36587->28035|36849->28275|36953->28350|37350->28715|37410->28746|37562->28866|37605->28880|37685->28931|37715->28932|37761->28949|37898->29057|37928->29058|38004->29105|38034->29106|38080->29123|38184->29198|38214->29199|38290->29246|38320->29247|38366->29264|38510->29379|38540->29380|38616->29427|38646->29428|38692->29445|38798->29522|38828->29523|38883->29547
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|63->31|65->33|65->33|69->37|69->37|70->38|70->38|71->39|75->43|75->43|86->54|86->54|86->54|86->54|88->56|88->56|91->59|93->61|93->61|96->64|99->67|104->72|105->73|110->78|111->79|112->80|123->91|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|128->96|128->96|132->100|132->100|133->101|133->101|134->102|138->106|138->106|149->117|149->117|149->117|149->117|151->119|151->119|154->122|156->124|156->124|159->127|162->130|167->135|168->136|173->141|174->142|175->143|185->153|185->153|185->153|186->154|186->154|186->154|187->155|188->156|188->156|190->158|190->158|194->162|194->162|195->163|195->163|196->164|200->168|200->168|211->179|211->179|211->179|211->179|213->181|213->181|216->184|218->186|218->186|221->189|224->192|229->197|230->198|235->203|236->204|237->205|243->211|243->211|243->211|244->212|244->212|244->212|245->213|246->214|246->214|248->216|248->216|252->220|252->220|253->221|253->221|254->222|258->226|258->226|269->237|269->237|269->237|269->237|271->239|271->239|274->242|276->244|276->244|279->247|282->250|287->255|288->256|293->261|294->262|295->263|300->268|300->268|300->268|301->269|301->269|301->269|302->270|303->271|303->271|305->273|305->273|309->277|309->277|310->278|310->278|311->279|315->283|315->283|326->294|326->294|326->294|326->294|328->296|328->296|331->299|333->301|333->301|336->304|338->306|343->311|344->312|349->317|350->318|352->320|357->325|357->325|357->325|358->326|358->326|358->326|359->327|360->328|360->328|362->330|362->330|366->334|366->334|367->335|367->335|368->336|372->340|372->340|383->351|383->351|383->351|383->351|385->353|385->353|388->356|390->358|390->358|393->361|396->364|401->369|402->370|407->375|408->376|409->377|416->384|416->384|416->384|417->385|417->385|417->385|418->386|419->387|419->387|421->389|421->389|425->393|425->393|426->394|426->394|427->395|431->399|431->399|442->410|442->410|442->410|442->410|444->412|444->412|447->415|449->417|449->417|452->420|455->423|460->428|461->429|466->434|467->435|468->436|472->440|472->440|472->440|474->442|490->458|490->458|490->458|490->458|492->460|492->460|493->461|495->463|495->463|499->467|501->469|509->477|510->478|526->494|526->494|526->494|526->494|528->496|528->496|531->499|533->501|533->501|537->505|539->507|547->515|548->516|564->532|564->532|564->532|564->532|566->534|566->534|569->537|572->540|577->545|578->546|583->551|585->553|586->554|586->554|587->555|590->558|590->558|592->560|592->560|593->561|595->563|595->563|597->565|597->565|598->566|601->569|601->569|603->571|603->571|604->572|606->574|606->574|608->576
                  -- GENERATED --
              */
          