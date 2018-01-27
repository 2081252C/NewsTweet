
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
                        console.log(""""),_display_(/*34.39*/tweetArray(0)),format.raw/*34.52*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*38.94*/tweet),format.raw/*38.99*/("""">
                      Message """),_display_(/*39.32*/tweetArray(1)),format.raw/*39.45*/("""
                    """),format.raw/*40.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*44.48*/tweet),format.raw/*44.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*55.38*/b4/*55.40*/.form(action=routes.SearchController.sendMessage())/*55.91*/{_display_(Seq[Any](format.raw/*55.92*/(""" 

                                            """),_display_(/*57.46*/b4/*57.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*60.60*/("""

                                            """),_display_(/*62.46*/b4/*62.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*65.60*/("""

                                    
                                    """),format.raw/*68.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*73.30*/("""
                              """),format.raw/*74.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*79.18*/("""
              """)))}),format.raw/*80.16*/("""

              """),format.raw/*82.15*/("""<button type="button" class="show_btn" id="show">
                Show More
              </button>

              <div id="more" style="display:none">
                """),_display_(/*87.18*/for(tweet <- recentTweets1) yield /*87.45*/{_display_(Seq[Any](format.raw/*87.46*/("""
                  """),_display_(/*88.20*/defining(tweet.split("-"))/*88.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*88.62*/("""                 
                    """),format.raw/*89.21*/("""<div class="card">
                      <div id=""""),_display_(/*90.33*/tweetArray(0)),format.raw/*90.46*/("""">
                        <script>
                          rendering(""""),_display_(/*92.39*/tweetArray(0)),format.raw/*92.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*96.96*/tweet),format.raw/*96.101*/("""">
                        Message """),_display_(/*97.34*/tweetArray(1)),format.raw/*97.47*/("""
                      """),format.raw/*98.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*102.50*/tweet),format.raw/*102.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*113.40*/b4/*113.42*/.form(action=routes.SearchController.sendMessage())/*113.93*/{_display_(Seq[Any](format.raw/*113.94*/(""" 

                                              """),_display_(/*115.48*/b4/*115.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*118.62*/("""

                                              """),_display_(/*120.48*/b4/*120.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*123.62*/("""

                                      
                                      """),format.raw/*126.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*131.32*/("""
                                """),format.raw/*132.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*137.20*/("""
                """)))}),format.raw/*138.18*/("""
              """),format.raw/*139.15*/("""</div>

              <button type="button" class="show_btn" id="show2" style="display:none">
                Show More
              </button>

              <div id="showMore" style="display:none">
                """),_display_(/*146.18*/for(tweet <- recentTweets2) yield /*146.45*/{_display_(Seq[Any](format.raw/*146.46*/("""
                  """),_display_(/*147.20*/defining(tweet.split("-"))/*147.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*147.62*/("""                 
                    """),format.raw/*148.21*/("""<div class="card">
                      <div id=""""),_display_(/*149.33*/tweetArray(0)),format.raw/*149.46*/("""">
                        <script>
                          rendering(""""),_display_(/*151.39*/tweetArray(0)),format.raw/*151.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*155.96*/tweet),format.raw/*155.101*/("""">
                        Message """),_display_(/*156.34*/tweetArray(1)),format.raw/*156.47*/("""
                      """),format.raw/*157.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*161.50*/tweet),format.raw/*161.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*172.40*/b4/*172.42*/.form(action=routes.SearchController.sendMessage())/*172.93*/{_display_(Seq[Any](format.raw/*172.94*/(""" 

                                              """),_display_(/*174.48*/b4/*174.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*177.62*/("""

                                              """),_display_(/*179.48*/b4/*179.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*182.62*/("""

                                      
                                      """),format.raw/*185.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*190.32*/("""
                                """),format.raw/*191.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*196.20*/("""
                """)))}),format.raw/*197.18*/("""
              """),format.raw/*198.15*/("""</div>
            </div> 
          </div>

          <div id="popular" class="tweets">
            <div class="card-columns">
              """),_display_(/*204.16*/for((tweet) <- popTweets) yield /*204.41*/{_display_(Seq[Any](format.raw/*204.42*/("""
                """),_display_(/*205.18*/defining(tweet.split("-"))/*205.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*205.60*/("""                 
                  """),format.raw/*206.19*/("""<div class="card">
                    <div id=""""),_display_(/*207.31*/tweetArray(0)),format.raw/*207.44*/("""">
                      <script>
                        rendering(""""),_display_(/*209.37*/tweetArray(0)),format.raw/*209.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*213.94*/tweet),format.raw/*213.99*/("""">
                      Message """),_display_(/*214.32*/tweetArray(1)),format.raw/*214.45*/("""
                    """),format.raw/*215.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*219.48*/tweet),format.raw/*219.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*230.38*/b4/*230.40*/.form(action=routes.SearchController.sendMessage())/*230.91*/{_display_(Seq[Any](format.raw/*230.92*/(""" 

                                            """),_display_(/*232.46*/b4/*232.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*235.60*/("""

                                            """),_display_(/*237.46*/b4/*237.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*240.60*/("""

                                    
                                    """),format.raw/*243.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*248.30*/("""
                              """),format.raw/*249.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*254.18*/("""
              """)))}),format.raw/*255.16*/("""

              """),format.raw/*257.15*/("""<!-- """),_display_(/*257.21*/for((tweet) <- popTweets1) yield /*257.47*/{_display_(Seq[Any](format.raw/*257.48*/("""
                """),_display_(/*258.18*/defining(tweet.split("-"))/*258.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*258.60*/("""                 
                  """),format.raw/*259.19*/("""<div class="card">
                    <div id=""""),_display_(/*260.31*/tweetArray(0)),format.raw/*260.44*/("""">
                      <script>
                        rendering(""""),_display_(/*262.37*/tweetArray(0)),format.raw/*262.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*266.94*/tweet),format.raw/*266.99*/("""">
                      Message """),_display_(/*267.32*/tweetArray(1)),format.raw/*267.45*/("""
                    """),format.raw/*268.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*272.48*/tweet),format.raw/*272.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*283.38*/b4/*283.40*/.form(action=routes.SearchController.sendMessage())/*283.91*/{_display_(Seq[Any](format.raw/*283.92*/(""" 

                                            """),_display_(/*285.46*/b4/*285.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*288.60*/("""

                                            """),_display_(/*290.46*/b4/*290.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*293.60*/("""

                                    
                                    """),format.raw/*296.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*301.30*/("""
                              """),format.raw/*302.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*307.18*/("""
              """)))}),format.raw/*308.16*/("""

              """),_display_(/*310.16*/for((tweet) <- popTweets2) yield /*310.42*/{_display_(Seq[Any](format.raw/*310.43*/("""
                """),_display_(/*311.18*/defining(tweet.split("-"))/*311.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*311.60*/("""                 
                  """),format.raw/*312.19*/("""<div class="card">
                    <div id=""""),_display_(/*313.31*/tweetArray(0)),format.raw/*313.44*/("""">
                      <script>
                        rendering(""""),_display_(/*315.37*/tweetArray(0)),format.raw/*315.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*319.94*/tweet),format.raw/*319.99*/("""">
                      Message """),_display_(/*320.32*/tweetArray(1)),format.raw/*320.45*/("""
                    """),format.raw/*321.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*325.48*/tweet),format.raw/*325.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*336.38*/b4/*336.40*/.form(action=routes.SearchController.sendMessage())/*336.91*/{_display_(Seq[Any](format.raw/*336.92*/(""" 

                                            """),_display_(/*338.46*/b4/*338.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*341.60*/("""

                                            """),_display_(/*343.46*/b4/*343.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*346.60*/("""

                                    
                                    """),format.raw/*349.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*354.30*/("""
                              """),format.raw/*355.31*/("""</div>
                            </div>
                          </div>
                        </div>
                         -->
               <!--  """)))}),format.raw/*360.23*/("""
              """)))}),format.raw/*361.16*/("""-->
            </div>
          </div> 

          <div id="media" class="tweets">
            <div class="card-columns">
              """),_display_(/*367.16*/for(tweet <- media) yield /*367.35*/{_display_(Seq[Any](format.raw/*367.36*/("""
                """),_display_(/*368.18*/defining(tweet.split("-"))/*368.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*368.60*/("""                 
                  """),format.raw/*369.19*/("""<div class="card">
                    <div id=""""),_display_(/*370.31*/tweetArray(0)),format.raw/*370.44*/("""">
                      <script>
                        rendering(""""),_display_(/*372.37*/tweetArray(0)),format.raw/*372.50*/("""");
                      </script>
                    </div>
                      
                    <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*376.94*/tweet),format.raw/*376.99*/("""">
                      Message """),_display_(/*377.32*/tweetArray(1)),format.raw/*377.45*/("""
                    """),format.raw/*378.21*/("""</button>
                  </div>
                

                  <div class="modal fade" id=""""),_display_(/*382.48*/tweet),format.raw/*382.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*393.38*/b4/*393.40*/.form(action=routes.SearchController.sendMessage())/*393.91*/{_display_(Seq[Any](format.raw/*393.92*/(""" 

                                            """),_display_(/*395.46*/b4/*395.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*398.60*/("""

                                            """),_display_(/*400.46*/b4/*400.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*403.60*/("""

                                    
                                    """),format.raw/*406.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*411.30*/("""
                              """),format.raw/*412.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*417.18*/("""
              """)))}),format.raw/*418.16*/("""

              """),format.raw/*420.15*/("""<button type="button" class="show_btn" id="media">
                Show More
              </button>

              <div id="moreMedia" style="display:none">
                """),_display_(/*425.18*/for(tweet <- media1) yield /*425.38*/{_display_(Seq[Any](format.raw/*425.39*/("""
                  """),_display_(/*426.20*/defining(tweet.split("-"))/*426.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*426.62*/("""                 
                    """),format.raw/*427.21*/("""<div class="card">
                      <div id=""""),_display_(/*428.33*/tweetArray(0)),format.raw/*428.46*/("""">
                        <script>
                          rendering(""""),_display_(/*430.39*/tweetArray(0)),format.raw/*430.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*434.96*/tweet),format.raw/*434.101*/("""">
                        Message """),_display_(/*435.34*/tweetArray(1)),format.raw/*435.47*/("""
                      """),format.raw/*436.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*440.50*/tweet),format.raw/*440.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*451.40*/b4/*451.42*/.form(action=routes.SearchController.sendMessage())/*451.93*/{_display_(Seq[Any](format.raw/*451.94*/(""" 

                                              """),_display_(/*453.48*/b4/*453.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*456.62*/("""

                                              """),_display_(/*458.48*/b4/*458.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*461.62*/("""

                                      
                                      """),format.raw/*464.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*469.32*/("""
                                """),format.raw/*470.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*475.20*/("""
                """)))}),format.raw/*476.18*/("""
              """),format.raw/*477.15*/("""</div>

              <button type="button" class="show_btn" id="media2" style="display:none">
                Show More
              </button>

              <div id="moreMedia2" style="display:none">
                """),_display_(/*484.18*/for(tweet <- media2) yield /*484.38*/{_display_(Seq[Any](format.raw/*484.39*/("""
                  """),_display_(/*485.20*/defining(tweet.split("-"))/*485.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*485.62*/("""                 
                    """),format.raw/*486.21*/("""<div class="card">
                      <div id=""""),_display_(/*487.33*/tweetArray(0)),format.raw/*487.46*/("""">
                        <script>
                          rendering(""""),_display_(/*489.39*/tweetArray(0)),format.raw/*489.52*/("""");
                        </script>
                      </div>
                        
                      <button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*493.96*/tweet),format.raw/*493.101*/("""">
                        Message """),_display_(/*494.34*/tweetArray(1)),format.raw/*494.47*/("""
                      """),format.raw/*495.23*/("""</button>
                    </div>
                  

                    <div class="modal fade" id=""""),_display_(/*499.50*/tweet),format.raw/*499.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*510.40*/b4/*510.42*/.form(action=routes.SearchController.sendMessage())/*510.93*/{_display_(Seq[Any](format.raw/*510.94*/(""" 

                                              """),_display_(/*512.48*/b4/*512.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                  'placeholder -> "Recipient Name",
                                                  '_label -> "Recipient Name",
                                                  'size -> 1)),format.raw/*515.62*/("""

                                              """),_display_(/*517.48*/b4/*517.50*/.text(messageForm("message"),
                                                  'placeholder -> "Message",
                                                  '_label -> "Message",
                                                  'size -> 1)),format.raw/*520.62*/("""

                                      
                                      """),format.raw/*523.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*528.32*/("""
                                """),format.raw/*529.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*534.20*/("""
                """)))}),format.raw/*535.18*/("""
              """),format.raw/*536.15*/("""</div>
            </div>
          </div>

           """),_display_(/*540.13*/if(bool==1)/*540.24*/{_display_(Seq[Any](format.raw/*540.25*/("""

              """),format.raw/*542.15*/("""<div class="fixed-bottom" id="footer">
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
                        """),_display_(/*558.26*/b4/*558.28*/.form(action=routes.SearchController.trackSearch())/*558.79*/{_display_(Seq[Any](format.raw/*558.80*/("""

                            """),_display_(/*560.30*/b4/*560.32*/.text(trackForm("term").copy(value= Option[String](term)),
                              '_label -> "Search Term")),format.raw/*561.56*/("""

                            """),_display_(/*563.30*/b4/*563.32*/.select(
                               trackForm("interest"),
                               helper.options(interests),
                               '_label -> "Interest"
                            )),format.raw/*567.30*/("""

                            """),format.raw/*569.29*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#interest-modal">
                                          create a new interest.
                                        </button>
                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" type="submit">Save changes</button>
                  """)))}),format.raw/*577.20*/("""
                    """),format.raw/*578.21*/("""</div>
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
                                    """),_display_(/*594.38*/b4/*594.40*/.horizontal.form(action=routes.InterestController.addInterest(), "col-md-2", "col-md-10")/*594.129*/{ implicit ifc =>_display_(Seq[Any](format.raw/*594.146*/("""

                                        """),_display_(/*596.42*/b4/*596.44*/.text(interestForm("interestName"),
                                            'placeholder -> "Interest Name",
                                            '_label -> "Name",
                                            'size -> 5)),format.raw/*599.56*/("""

                                        """),_display_(/*601.42*/b4/*601.44*/.select(
                                           interestForm("personaName"),
                                           helper.options(personas),
                                           '_label -> "Persona"
                                        )),format.raw/*605.42*/("""

                                        """),format.raw/*607.41*/("""Or, <button type="button" id="add_interest" class="btn btn-primary" data-toggle="modal" data-target="#persona_modal">
                                          create a new persona.
                                        </button>
                                    </div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" type="submit">Save changes</button>
                            """)))}),format.raw/*615.30*/("""
                              """),format.raw/*616.31*/("""</div>
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
                                    """),_display_(/*632.38*/b4/*632.40*/.horizontal.form(action=routes.PersonaController.addPersona(), "col-md-2", "col-md-10")/*632.127*/{ implicit ifc =>_display_(Seq[Any](format.raw/*632.144*/("""

                                            """),_display_(/*634.46*/b4/*634.48*/.text(personaForm("personaName"),
                                                'placeholder -> "Persona Name",
                                                '_label -> "Name",
                                                'size -> 1)),format.raw/*637.60*/("""

                                    
                                    """),format.raw/*640.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Save changes</button>
                            """)))}),format.raw/*645.30*/("""
                              """),format.raw/*646.31*/("""</div>
                            </div>
                          </div>
                        </div>

            """)))}),format.raw/*651.14*/("""

            """),format.raw/*653.13*/("""<script>
              $('#show').click(function() """),format.raw/*654.43*/("""{"""),format.raw/*654.44*/("""
                """),format.raw/*655.17*/("""$('#more').toggle();
                $('#show').toggle();
                $('#show2').toggle();
            """),format.raw/*658.13*/("""}"""),format.raw/*658.14*/(""");

              $('#show2').click(function() """),format.raw/*660.44*/("""{"""),format.raw/*660.45*/("""
                """),format.raw/*661.17*/("""$('#showMore').toggle();
                $('#show2').toggle();
            """),format.raw/*663.13*/("""}"""),format.raw/*663.14*/(""");

              $('#media').click(function() """),format.raw/*665.44*/("""{"""),format.raw/*665.45*/("""
                """),format.raw/*666.17*/("""$('#moreMedia').toggle();
                $('#media2').toggle();
                $('#media').toggle();
            """),format.raw/*669.13*/("""}"""),format.raw/*669.14*/(""");

              $('#show2').click(function() """),format.raw/*671.44*/("""{"""),format.raw/*671.45*/("""
                """),format.raw/*672.17*/("""$('#moreMedia2').toggle();
                $('#show2').toggle();
            """),format.raw/*674.13*/("""}"""),format.raw/*674.14*/(""");
          </script>
""")))}),format.raw/*676.2*/("""

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
                  DATE: Sat Jan 27 19:03:21 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 41987238083cd37bde99558f0bd7292d1a24d50a
                  MATRIX: 1210->1|1785->506|1822->523|1854->547|1948->503|1977->610|2006->612|2257->837|2271->843|2333->885|2397->923|2428->945|2449->957|2464->963|2479->969|2501->982|2515->987|2538->1001|2557->1011|2578->1022|2591->1025|2631->1026|2662->1030|2713->1054|2738->1058|2783->1076|2798->1082|2854->1117|3563->1799|3605->1825|3644->1826|3689->1844|3724->1870|3778->1886|3842->1922|3918->1971|3952->1984|4049->2054|4083->2067|4152->2109|4186->2122|4392->2301|4418->2306|4479->2340|4513->2353|4562->2374|4689->2474|4715->2479|5515->3252|5526->3254|5586->3305|5625->3306|5700->3354|5711->3356|6029->3653|6103->3700|6114->3702|6369->3936|6472->4011|6860->4368|6919->4399|7098->4547|7145->4563|7189->4579|7385->4748|7428->4775|7467->4776|7514->4796|7549->4822|7603->4838|7669->4876|7747->4927|7781->4940|7882->5014|7916->5027|8130->5214|8157->5219|8220->5255|8254->5268|8305->5291|8439->5397|8466->5402|9289->6197|9301->6199|9362->6250|9402->6251|9480->6301|9492->6303|9817->6606|9894->6655|9906->6657|10168->6897|10276->6976|10675->7343|10737->7376|10927->7534|10977->7552|11021->7567|11266->7784|11310->7811|11350->7812|11398->7832|11434->7858|11489->7874|11556->7912|11635->7963|11670->7976|11772->8050|11807->8063|12022->8250|12050->8255|12114->8291|12149->8304|12201->8327|12335->8433|12362->8438|13185->9233|13197->9235|13258->9286|13298->9287|13376->9337|13388->9339|13713->9642|13790->9691|13802->9693|14064->9933|14172->10012|14571->10379|14633->10412|14823->10570|14873->10588|14917->10603|15088->10746|15130->10771|15170->10772|15216->10790|15252->10816|15307->10832|15372->10868|15449->10917|15484->10930|15582->11000|15617->11013|15824->11192|15851->11197|15913->11231|15948->11244|15998->11265|16126->11365|16153->11370|16954->12143|16966->12145|17027->12196|17067->12197|17143->12245|17155->12247|17474->12544|17549->12591|17561->12593|17817->12827|17921->12902|18310->13259|18370->13290|18550->13438|18598->13454|18643->13470|18677->13476|18720->13502|18760->13503|18806->13521|18842->13547|18897->13563|18962->13599|19039->13648|19074->13661|19172->13731|19207->13744|19414->13923|19441->13928|19503->13962|19538->13975|19588->13996|19716->14096|19743->14101|20544->14874|20556->14876|20617->14927|20657->14928|20733->14976|20745->14978|21064->15275|21139->15322|21151->15324|21407->15558|21511->15633|21900->15990|21960->16021|22140->16169|22188->16185|22233->16202|22276->16228|22316->16229|22362->16247|22398->16273|22453->16289|22518->16325|22595->16374|22630->16387|22728->16457|22763->16470|22970->16649|22997->16654|23059->16688|23094->16701|23144->16722|23272->16822|23299->16827|24100->17600|24112->17602|24173->17653|24213->17654|24289->17702|24301->17704|24620->18001|24695->18048|24707->18050|24963->18284|25067->18359|25456->18716|25516->18747|25705->18904|25753->18920|25919->19058|25955->19077|25995->19078|26041->19096|26077->19122|26132->19138|26197->19174|26274->19223|26309->19236|26407->19306|26442->19319|26649->19498|26676->19503|26738->19537|26773->19550|26823->19571|26951->19671|26978->19676|27779->20449|27791->20451|27852->20502|27892->20503|27968->20551|27980->20553|28299->20850|28374->20897|28386->20899|28642->21133|28746->21208|29135->21565|29195->21596|29375->21744|29423->21760|29468->21776|29671->21951|29708->21971|29748->21972|29796->21992|29832->22018|29887->22034|29954->22072|30033->22123|30068->22136|30170->22210|30205->22223|30420->22410|30448->22415|30512->22451|30547->22464|30599->22487|30733->22593|30760->22598|31583->23393|31595->23395|31656->23446|31696->23447|31774->23497|31786->23499|32111->23802|32188->23851|32200->23853|32462->24093|32570->24172|32969->24539|33031->24572|33221->24730|33271->24748|33315->24763|33563->24983|33600->25003|33640->25004|33688->25024|33724->25050|33779->25066|33846->25104|33925->25155|33960->25168|34062->25242|34097->25255|34312->25442|34340->25447|34404->25483|34439->25496|34491->25519|34625->25625|34652->25630|35475->26425|35487->26427|35548->26478|35588->26479|35666->26529|35678->26531|36003->26834|36080->26883|36092->26885|36354->27125|36462->27204|36861->27571|36923->27604|37113->27762|37163->27780|37207->27795|37291->27851|37312->27862|37352->27863|37397->27879|38366->28820|38378->28822|38439->28873|38479->28874|38538->28905|38550->28907|38686->29021|38745->29052|38757->29054|38982->29257|39041->29287|39623->29837|39673->29858|40613->30770|40625->30772|40725->30861|40782->30878|40853->30921|40865->30923|41118->31154|41189->31197|41201->31199|41478->31454|41549->31496|42195->32110|42255->32141|43233->33091|43245->33093|43343->33180|43400->33197|43475->33244|43487->33246|43749->33486|43853->33561|44250->33926|44310->33957|44462->34077|44505->34091|44585->34142|44615->34143|44661->34160|44798->34268|44828->34269|44904->34316|44934->34317|44980->34334|45084->34409|45114->34410|45190->34457|45220->34458|45266->34475|45410->34590|45440->34591|45516->34638|45546->34639|45592->34656|45698->34733|45728->34734|45783->34758
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|63->31|65->33|65->33|66->34|66->34|70->38|70->38|71->39|71->39|72->40|76->44|76->44|87->55|87->55|87->55|87->55|89->57|89->57|92->60|94->62|94->62|97->65|100->68|105->73|106->74|111->79|112->80|114->82|119->87|119->87|119->87|120->88|120->88|120->88|121->89|122->90|122->90|124->92|124->92|128->96|128->96|129->97|129->97|130->98|134->102|134->102|145->113|145->113|145->113|145->113|147->115|147->115|150->118|152->120|152->120|155->123|158->126|163->131|164->132|169->137|170->138|171->139|178->146|178->146|178->146|179->147|179->147|179->147|180->148|181->149|181->149|183->151|183->151|187->155|187->155|188->156|188->156|189->157|193->161|193->161|204->172|204->172|204->172|204->172|206->174|206->174|209->177|211->179|211->179|214->182|217->185|222->190|223->191|228->196|229->197|230->198|236->204|236->204|236->204|237->205|237->205|237->205|238->206|239->207|239->207|241->209|241->209|245->213|245->213|246->214|246->214|247->215|251->219|251->219|262->230|262->230|262->230|262->230|264->232|264->232|267->235|269->237|269->237|272->240|275->243|280->248|281->249|286->254|287->255|289->257|289->257|289->257|289->257|290->258|290->258|290->258|291->259|292->260|292->260|294->262|294->262|298->266|298->266|299->267|299->267|300->268|304->272|304->272|315->283|315->283|315->283|315->283|317->285|317->285|320->288|322->290|322->290|325->293|328->296|333->301|334->302|339->307|340->308|342->310|342->310|342->310|343->311|343->311|343->311|344->312|345->313|345->313|347->315|347->315|351->319|351->319|352->320|352->320|353->321|357->325|357->325|368->336|368->336|368->336|368->336|370->338|370->338|373->341|375->343|375->343|378->346|381->349|386->354|387->355|392->360|393->361|399->367|399->367|399->367|400->368|400->368|400->368|401->369|402->370|402->370|404->372|404->372|408->376|408->376|409->377|409->377|410->378|414->382|414->382|425->393|425->393|425->393|425->393|427->395|427->395|430->398|432->400|432->400|435->403|438->406|443->411|444->412|449->417|450->418|452->420|457->425|457->425|457->425|458->426|458->426|458->426|459->427|460->428|460->428|462->430|462->430|466->434|466->434|467->435|467->435|468->436|472->440|472->440|483->451|483->451|483->451|483->451|485->453|485->453|488->456|490->458|490->458|493->461|496->464|501->469|502->470|507->475|508->476|509->477|516->484|516->484|516->484|517->485|517->485|517->485|518->486|519->487|519->487|521->489|521->489|525->493|525->493|526->494|526->494|527->495|531->499|531->499|542->510|542->510|542->510|542->510|544->512|544->512|547->515|549->517|549->517|552->520|555->523|560->528|561->529|566->534|567->535|568->536|572->540|572->540|572->540|574->542|590->558|590->558|590->558|590->558|592->560|592->560|593->561|595->563|595->563|599->567|601->569|609->577|610->578|626->594|626->594|626->594|626->594|628->596|628->596|631->599|633->601|633->601|637->605|639->607|647->615|648->616|664->632|664->632|664->632|664->632|666->634|666->634|669->637|672->640|677->645|678->646|683->651|685->653|686->654|686->654|687->655|690->658|690->658|692->660|692->660|693->661|695->663|695->663|697->665|697->665|698->666|701->669|701->669|703->671|703->671|704->672|706->674|706->674|708->676
                  -- GENERATED --
              */
          