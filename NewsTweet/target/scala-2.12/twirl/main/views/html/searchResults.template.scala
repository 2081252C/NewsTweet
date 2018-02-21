
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
  	"""),format.raw/*11.4*/("""<h3>Search Results for "<b>"""),_display_(/*11.32*/term),format.raw/*11.36*/("""</b>":
      <a href=""""),_display_(/*12.17*/routes/*12.23*/.SearchController.searchAnalytics()),format.raw/*12.58*/("""" class="btn btn-primary" style="float:right;"> Search Analytics </a>
    </h3>

    <div id="loader"></div>

    <div id="page-content" style="display:none">

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
              """),_display_(/*33.16*/for(tweet <- recentTweets) yield /*33.42*/{_display_(Seq[Any](format.raw/*33.43*/("""
                """),_display_(/*34.18*/defining(tweet.split("-"))/*34.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*34.60*/("""                 
                  """),format.raw/*35.19*/("""<div class="card">
                    <div id=""""),_display_(/*36.31*/tweetArray(0)),format.raw/*36.44*/("""">
                      <script>
                        rendering(""""),_display_(/*38.37*/tweetArray(0)),format.raw/*38.50*/("""");
                      </script>
                    </div>
                     
                    """),_display_(/*42.22*/if(bool==1)/*42.33*/{_display_(Seq[Any](format.raw/*42.34*/("""  
                      """),format.raw/*43.23*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*43.96*/tweet),format.raw/*43.101*/("""">
                        Message """),_display_(/*44.34*/tweetArray(1)),format.raw/*44.47*/("""
                      """),format.raw/*45.23*/("""</button>
                    """)))}),format.raw/*46.22*/("""
                  """),format.raw/*47.19*/("""</div>
                

                  <div class="modal fade" id=""""),_display_(/*50.48*/tweet),format.raw/*50.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*61.38*/b4/*61.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*61.104*/{_display_(Seq[Any](format.raw/*61.105*/(""" 

                                            """),_display_(/*63.46*/b4/*63.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*66.60*/("""

                                            """),_display_(/*68.46*/b4/*68.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*71.60*/("""

                                    
                                    """),format.raw/*74.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*79.30*/("""
                              """),format.raw/*80.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*85.18*/("""
              """)))}),format.raw/*86.16*/("""
            """),format.raw/*87.13*/("""</div>

            <div class="button_wrapper">
              <button type="button" class="show_btn" id="show">
                Show More
              </button>
            </div>

              <div class="card-columns">

              <div id="more" style="display:none">
                """),_display_(/*98.18*/for(tweet <- recentTweets1) yield /*98.45*/{_display_(Seq[Any](format.raw/*98.46*/("""
                  """),_display_(/*99.20*/defining(tweet.split("-"))/*99.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*99.62*/("""                 
                    """),format.raw/*100.21*/("""<div class="card">
                      <div id=""""),_display_(/*101.33*/tweetArray(0)),format.raw/*101.46*/("""">
                        <script>
                          rendering(""""),_display_(/*103.39*/tweetArray(0)),format.raw/*103.52*/("""");
                        </script>
                      </div>
                        
                      """),_display_(/*107.24*/if(bool==1)/*107.35*/{_display_(Seq[Any](format.raw/*107.36*/("""  
                        """),format.raw/*108.25*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*108.98*/tweet),format.raw/*108.103*/("""">
                          Message """),_display_(/*109.36*/tweetArray(1)),format.raw/*109.49*/("""
                        """),format.raw/*110.25*/("""</button>
                      """)))}),format.raw/*111.24*/("""
                    """),format.raw/*112.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*115.50*/tweet),format.raw/*115.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*126.40*/b4/*126.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*126.106*/{_display_(Seq[Any](format.raw/*126.107*/(""" 

                                              """),_display_(/*128.48*/b4/*128.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*131.60*/("""

                                            """),_display_(/*133.46*/b4/*133.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*136.60*/("""

                                      
                                      """),format.raw/*139.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*144.32*/("""
                                """),format.raw/*145.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*150.20*/("""
                """)))}),format.raw/*151.18*/("""
              """),format.raw/*152.15*/("""</div>
            </div>
            <div class="button_wrapper">
              <button type="button" class="show_btn" id="show2" style="display:none">
                Show More
              </button>
            </div>
              <div class="card-columns">

              <div id="showMore" style="display:none">
                """),_display_(/*162.18*/for(tweet <- recentTweets2) yield /*162.45*/{_display_(Seq[Any](format.raw/*162.46*/("""
                  """),_display_(/*163.20*/defining(tweet.split("-"))/*163.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*163.62*/("""                 
                    """),format.raw/*164.21*/("""<div class="card">
                      <div id=""""),_display_(/*165.33*/tweetArray(0)),format.raw/*165.46*/("""">
                        <script>
                          rendering(""""),_display_(/*167.39*/tweetArray(0)),format.raw/*167.52*/("""");
                        </script>
                      </div>
                      
                      """),_display_(/*171.24*/if(bool==1)/*171.35*/{_display_(Seq[Any](format.raw/*171.36*/("""  
                        """),format.raw/*172.25*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*172.98*/tweet),format.raw/*172.103*/("""">
                          Message """),_display_(/*173.36*/tweetArray(1)),format.raw/*173.49*/("""
                        """),format.raw/*174.25*/("""</button>
                      """)))}),format.raw/*175.24*/("""
                    """),format.raw/*176.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*179.50*/tweet),format.raw/*179.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*190.40*/b4/*190.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*190.106*/{_display_(Seq[Any](format.raw/*190.107*/(""" 

                                              """),_display_(/*192.48*/b4/*192.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*195.60*/("""

                                            """),_display_(/*197.46*/b4/*197.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*200.60*/("""

                                      
                                      """),format.raw/*203.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*208.32*/("""
                                """),format.raw/*209.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*214.20*/("""
                """)))}),format.raw/*215.18*/("""
              """),format.raw/*216.15*/("""</div>
            </div> 
          </div>

          <div id="popular" class="tweets">
            <div class="card-columns">
              """),_display_(/*222.16*/for((tweet) <- popTweets) yield /*222.41*/{_display_(Seq[Any](format.raw/*222.42*/("""
                """),_display_(/*223.18*/defining(tweet.split("-"))/*223.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*223.60*/("""                 
                  """),format.raw/*224.19*/("""<div class="card">
                    <div id=""""),_display_(/*225.31*/tweetArray(0)),format.raw/*225.44*/("""">
                      <script>
                        rendering(""""),_display_(/*227.37*/tweetArray(0)),format.raw/*227.50*/("""");
                      </script>
                    </div>
                     
                    """),_display_(/*231.22*/if(bool==1)/*231.33*/{_display_(Seq[Any](format.raw/*231.34*/("""  
                      """),format.raw/*232.23*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*232.96*/tweet),format.raw/*232.101*/("""">
                        Message """),_display_(/*233.34*/tweetArray(1)),format.raw/*233.47*/("""
                      """),format.raw/*234.23*/("""</button>
                    """)))}),format.raw/*235.22*/("""
                  """),format.raw/*236.19*/("""</div>
                

                  <div class="modal fade" id=""""),_display_(/*239.48*/tweet),format.raw/*239.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*250.38*/b4/*250.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*250.104*/{_display_(Seq[Any](format.raw/*250.105*/(""" 

                                            """),_display_(/*252.46*/b4/*252.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*255.60*/("""

                                            """),_display_(/*257.46*/b4/*257.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*260.60*/("""

                                    
                                    """),format.raw/*263.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*268.30*/("""
                              """),format.raw/*269.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*274.18*/("""
              """)))}),format.raw/*275.16*/("""
            """),format.raw/*276.13*/("""</div>
          </div> 

          <div id="media" class="tweets">
            <div class="card-columns">
              """),_display_(/*281.16*/for(tweet <- media) yield /*281.35*/{_display_(Seq[Any](format.raw/*281.36*/("""
                """),_display_(/*282.18*/defining(tweet.split("-"))/*282.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*282.60*/("""                 
                  """),format.raw/*283.19*/("""<div class="card">
                    <div id=""""),_display_(/*284.31*/tweetArray(0)),format.raw/*284.44*/("""">
                      <script>
                        rendering(""""),_display_(/*286.37*/tweetArray(0)),format.raw/*286.50*/("""");
                      </script>
                    </div>
                    
                    """),_display_(/*290.22*/if(bool==1)/*290.33*/{_display_(Seq[Any](format.raw/*290.34*/("""  
                      """),format.raw/*291.23*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*291.96*/tweet),format.raw/*291.101*/("""">
                        Message """),_display_(/*292.34*/tweetArray(1)),format.raw/*292.47*/("""
                      """),format.raw/*293.23*/("""</button>
                    """)))}),format.raw/*294.22*/("""
                  """),format.raw/*295.19*/("""</div>
                

                  <div class="modal fade" id=""""),_display_(/*298.48*/tweet),format.raw/*298.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*309.38*/b4/*309.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*309.104*/{_display_(Seq[Any](format.raw/*309.105*/(""" 

                                            """),_display_(/*311.46*/b4/*311.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*314.60*/("""

                                            """),_display_(/*316.46*/b4/*316.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*319.60*/("""
                                    
                                    """),format.raw/*321.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                            """)))}),format.raw/*326.30*/("""
                              """),format.raw/*327.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*332.18*/("""
              """)))}),format.raw/*333.16*/("""

              """),format.raw/*335.15*/("""<button type="button" class="show_btn" id="media">
                Show More
              </button>

              <div id="moreMedia" style="display:none">
                """),_display_(/*340.18*/for(tweet <- media1) yield /*340.38*/{_display_(Seq[Any](format.raw/*340.39*/("""
                  """),_display_(/*341.20*/defining(tweet.split("-"))/*341.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*341.62*/("""                 
                    """),format.raw/*342.21*/("""<div class="card">
                      <div id=""""),_display_(/*343.33*/tweetArray(0)),format.raw/*343.46*/("""">
                        <script>
                          rendering(""""),_display_(/*345.39*/tweetArray(0)),format.raw/*345.52*/("""");
                        </script>
                      </div>
                      
                      """),_display_(/*349.24*/if(bool==1)/*349.35*/{_display_(Seq[Any](format.raw/*349.36*/("""  
                        """),format.raw/*350.25*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*350.98*/tweet),format.raw/*350.103*/("""">
                          Message """),_display_(/*351.36*/tweetArray(1)),format.raw/*351.49*/("""
                        """),format.raw/*352.25*/("""</button>
                      """)))}),format.raw/*353.24*/("""
                    """),format.raw/*354.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*357.50*/tweet),format.raw/*357.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*368.40*/b4/*368.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*368.106*/{_display_(Seq[Any](format.raw/*368.107*/(""" 

                                              """),_display_(/*370.48*/b4/*370.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*373.60*/("""

                                            """),_display_(/*375.46*/b4/*375.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*378.60*/("""

                                      
                                      """),format.raw/*381.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*386.32*/("""
                                """),format.raw/*387.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*392.20*/("""
                """)))}),format.raw/*393.18*/("""
              """),format.raw/*394.15*/("""</div>

              <button type="button" class="show_btn" id="media2" style="display:none">
                Show More
              </button>

              <div id="moreMedia2" style="display:none">
                """),_display_(/*401.18*/for(tweet <- media2) yield /*401.38*/{_display_(Seq[Any](format.raw/*401.39*/("""
                  """),_display_(/*402.20*/defining(tweet.split("-"))/*402.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*402.62*/("""                 
                    """),format.raw/*403.21*/("""<div class="card">
                      <div id=""""),_display_(/*404.33*/tweetArray(0)),format.raw/*404.46*/("""">
                        <script>
                          rendering(""""),_display_(/*406.39*/tweetArray(0)),format.raw/*406.52*/("""");
                        </script>
                      </div>
                        
                      """),_display_(/*410.24*/if(bool==1)/*410.35*/{_display_(Seq[Any](format.raw/*410.36*/("""
                        """),format.raw/*411.25*/("""<button type="button" class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*411.98*/tweet),format.raw/*411.103*/("""">
                          Message """),_display_(/*412.36*/tweetArray(1)),format.raw/*412.49*/("""
                        """),format.raw/*413.25*/("""</button>
                      """)))}),format.raw/*414.24*/("""
                    """),format.raw/*415.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*418.50*/tweet),format.raw/*418.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*429.40*/b4/*429.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage()))/*429.106*/{_display_(Seq[Any](format.raw/*429.107*/(""" 

                                              """),_display_(/*431.48*/b4/*431.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*434.60*/("""

                                            """),_display_(/*436.46*/b4/*436.48*/.text(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message",
                                                'size -> 1)),format.raw/*439.60*/("""

                                      
                                      """),format.raw/*442.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-button" type="submit">Send</button>
                              """)))}),format.raw/*447.32*/("""
                                """),format.raw/*448.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*453.20*/("""
                """)))}),format.raw/*454.18*/("""
              """),format.raw/*455.15*/("""</div>
            </div>
          </div>

           """),_display_(/*459.13*/if(bool==1)/*459.24*/{_display_(Seq[Any](format.raw/*459.25*/("""

              """),format.raw/*461.15*/("""<div class="fixed-bottom" id="footer">
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
                        """),_display_(/*477.26*/b4/*477.28*/.form(action=helper.CSRF(routes.SearchController.trackSearch()))/*477.92*/{_display_(Seq[Any](format.raw/*477.93*/("""

                            """),_display_(/*479.30*/b4/*479.32*/.text(trackForm("term").copy(value= Option[String](term)),
                              '_label -> "Search Term")),format.raw/*480.56*/("""

                            """),format.raw/*482.29*/("""<div id="to-be-hidden">
                              """),_display_(/*483.32*/b4/*483.34*/.select(
                                 trackForm("interest"),
                                 helper.options(interests),
                                 '_label -> "Interest",
                                 '_default -> "-- Select an Interest --",
                                 'selected -> "-1"
                              )),format.raw/*489.32*/("""
                              """),format.raw/*490.31*/("""Or,  <a onclick="display('hidden-form', 'to-be-hidden')"><u>create a new interest</u></a>:
                            </div>

                            <div id="hidden-form" style="display:none">
                              <a onclick="display('hidden-form', 'to-be-hidden')"><u>Undo</u></a>:
                              """),_display_(/*495.32*/b4/*495.34*/.text(trackForm("newInterestName"),
                                              'placeholder -> "Interest Name",
                                              '_label -> "",
                                              'size -> 5)),format.raw/*498.58*/("""

                              """),format.raw/*500.31*/("""<div id="be-hidden">
                                """),_display_(/*501.34*/b4/*501.36*/.select(
                                   trackForm("personaName"),
                                   helper.options(personas),
                                   '_label -> "",
                                   '_default -> "-- Select an Interest Category --",
                                   'selected -> "-1"
                                )),format.raw/*507.34*/("""
                                """),format.raw/*508.33*/("""Or, <a onclick="display('hidden-category-form', 'be-hidden')"><u>create a new Interest Category</u></a>:
                              </div>

                              
                            </div>
                            <div id="hidden-category-form" style="display:none">
                              <a onclick="display('hidden-category-form', 'be-hidden')"><u>Undo</u></a>:
                              """),_display_(/*515.32*/b4/*515.34*/.text(trackForm("newPersonaName"),
                                  'placeholder -> "Name of Interest Category",
                                  '_label -> "",
                                  'size -> 1)),format.raw/*518.46*/("""
                            """),format.raw/*519.29*/("""</div>



                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" type="submit">Save changes</button>
                  """)))}),format.raw/*528.20*/("""
                    """),format.raw/*529.21*/("""</div>
                  </div>
                </div>
              </div>

              

            """)))}),format.raw/*536.14*/("""
          """),format.raw/*537.11*/("""</div>

            <script>
              $('#show').click(function() """),format.raw/*540.43*/("""{"""),format.raw/*540.44*/("""
                """),format.raw/*541.17*/("""$('#more').toggle();
                $('#show').toggle();
                $('#show2').toggle();
            """),format.raw/*544.13*/("""}"""),format.raw/*544.14*/(""");

              $('#show2').click(function() """),format.raw/*546.44*/("""{"""),format.raw/*546.45*/("""
                """),format.raw/*547.17*/("""$('#showMore').toggle();
                $('#show2').toggle();
            """),format.raw/*549.13*/("""}"""),format.raw/*549.14*/(""");

              $('#media').click(function() """),format.raw/*551.44*/("""{"""),format.raw/*551.45*/("""
                """),format.raw/*552.17*/("""$('#moreMedia').toggle();
                $('#media2').toggle();
                $('#media').toggle();
            """),format.raw/*555.13*/("""}"""),format.raw/*555.14*/(""");

              $('#show2').click(function() """),format.raw/*557.44*/("""{"""),format.raw/*557.45*/("""
                """),format.raw/*558.17*/("""$('#moreMedia2').toggle();
                $('#show2').toggle();
            """),format.raw/*560.13*/("""}"""),format.raw/*560.14*/(""");

            var myVar;
            myVar = setTimeout(showPage, 3000);

            function showPage() """),format.raw/*565.33*/("""{"""),format.raw/*565.34*/("""
              """),format.raw/*566.15*/("""document.getElementById("loader").style.display = "none";
              document.getElementById("page-content").style.display = "block";
            """),format.raw/*568.13*/("""}"""),format.raw/*568.14*/("""
          """),format.raw/*569.11*/("""</script>
""")))}),format.raw/*570.2*/("""

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
                  DATE: Sat Feb 17 15:34:04 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 3fdab6b6905e4458eb10babd1a2874eb9401f9d2
                  MATRIX: 1210->1|1785->506|1822->523|1854->547|1948->503|1977->610|2006->612|2257->837|2271->843|2333->885|2397->923|2428->945|2449->957|2464->963|2479->969|2501->982|2515->987|2538->1001|2557->1011|2578->1022|2591->1025|2631->1026|2662->1030|2717->1058|2742->1062|2792->1085|2807->1091|2863->1126|3652->1888|3694->1914|3733->1915|3778->1933|3813->1959|3867->1975|3931->2011|4007->2060|4041->2073|4138->2143|4172->2156|4305->2262|4325->2273|4364->2274|4417->2299|4517->2372|4544->2377|4607->2413|4641->2426|4692->2449|4754->2480|4801->2499|4900->2571|4926->2576|5726->3349|5737->3351|5811->3415|5851->3416|5926->3464|5937->3466|6255->3763|6329->3810|6340->3812|6595->4046|6698->4121|7086->4478|7145->4509|7324->4657|7371->4673|7412->4686|7732->4979|7775->5006|7814->5007|7861->5027|7896->5053|7950->5069|8017->5107|8096->5158|8131->5171|8233->5245|8268->5258|8411->5373|8432->5384|8472->5385|8528->5412|8629->5485|8657->5490|8723->5528|8758->5541|8812->5566|8877->5599|8927->5620|9031->5696|9058->5701|9881->6496|9893->6498|9968->6562|10009->6563|10087->6613|10099->6615|10418->6912|10493->6959|10505->6961|10761->7195|10869->7274|11268->7641|11330->7674|11520->7832|11570->7850|11614->7865|11978->8201|12022->8228|12062->8229|12110->8249|12146->8275|12201->8291|12268->8329|12347->8380|12382->8393|12484->8467|12519->8480|12660->8593|12681->8604|12721->8605|12777->8632|12878->8705|12906->8710|12972->8748|13007->8761|13061->8786|13126->8819|13176->8840|13280->8916|13307->8921|14130->9716|14142->9718|14217->9782|14258->9783|14336->9833|14348->9835|14667->10132|14742->10179|14754->10181|15010->10415|15118->10494|15517->10861|15579->10894|15769->11052|15819->11070|15863->11085|16034->11228|16076->11253|16116->11254|16162->11272|16198->11298|16253->11314|16318->11350|16395->11399|16430->11412|16528->11482|16563->11495|16697->11601|16718->11612|16758->11613|16812->11638|16913->11711|16941->11716|17005->11752|17040->11765|17092->11788|17155->11819|17203->11838|17303->11910|17330->11915|18131->12688|18143->12690|18218->12754|18259->12755|18335->12803|18347->12805|18666->13102|18741->13149|18753->13151|19009->13385|19113->13460|19502->13817|19562->13848|19742->13996|19790->14012|19832->14025|19982->14147|20018->14166|20058->14167|20104->14185|20140->14211|20195->14227|20260->14263|20337->14312|20372->14325|20470->14395|20505->14408|20638->14513|20659->14524|20699->14525|20753->14550|20854->14623|20882->14628|20946->14664|20981->14677|21033->14700|21096->14731|21144->14750|21244->14822|21271->14827|22072->15600|22084->15602|22159->15666|22200->15667|22276->15715|22288->15717|22607->16014|22682->16061|22694->16063|22950->16297|23053->16371|23442->16728|23502->16759|23682->16907|23730->16923|23775->16939|23978->17114|24015->17134|24055->17135|24103->17155|24139->17181|24194->17197|24261->17235|24340->17286|24375->17299|24477->17373|24512->17386|24653->17499|24674->17510|24714->17511|24770->17538|24871->17611|24899->17616|24965->17654|25000->17667|25054->17692|25119->17725|25169->17746|25273->17822|25300->17827|26123->18622|26135->18624|26210->18688|26251->18689|26329->18739|26341->18741|26660->19038|26735->19085|26747->19087|27003->19321|27111->19400|27510->19767|27572->19800|27762->19958|27812->19976|27856->19991|28104->20211|28141->20231|28181->20232|28229->20252|28265->20278|28320->20294|28387->20332|28466->20383|28501->20396|28603->20470|28638->20483|28781->20598|28802->20609|28842->20610|28896->20635|28997->20708|29025->20713|29091->20751|29126->20764|29180->20789|29245->20822|29295->20843|29399->20919|29426->20924|30249->21719|30261->21721|30336->21785|30377->21786|30455->21836|30467->21838|30786->22135|30861->22182|30873->22184|31129->22418|31237->22497|31636->22864|31698->22897|31888->23055|31938->23073|31982->23088|32066->23144|32087->23155|32127->23156|32172->23172|33141->24113|33153->24115|33227->24179|33267->24180|33326->24211|33338->24213|33474->24327|33533->24357|33616->24412|33628->24414|33987->24751|34047->24782|34404->25111|34416->25113|34671->25346|34732->25378|34814->25432|34826->25434|35200->25786|35262->25819|35716->26245|35728->26247|35958->26455|36016->26484|36374->26810|36424->26831|36562->26937|36602->26948|36702->27019|36732->27020|36778->27037|36915->27145|36945->27146|37021->27193|37051->27194|37097->27211|37201->27286|37231->27287|37307->27334|37337->27335|37383->27352|37527->27467|37557->27468|37633->27515|37663->27516|37709->27533|37815->27610|37845->27611|37982->27719|38012->27720|38056->27735|38234->27884|38264->27885|38304->27896|38346->27907
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|36->4|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|65->33|65->33|65->33|66->34|66->34|66->34|67->35|68->36|68->36|70->38|70->38|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|77->45|78->46|79->47|82->50|82->50|93->61|93->61|93->61|93->61|95->63|95->63|98->66|100->68|100->68|103->71|106->74|111->79|112->80|117->85|118->86|119->87|130->98|130->98|130->98|131->99|131->99|131->99|132->100|133->101|133->101|135->103|135->103|139->107|139->107|139->107|140->108|140->108|140->108|141->109|141->109|142->110|143->111|144->112|147->115|147->115|158->126|158->126|158->126|158->126|160->128|160->128|163->131|165->133|165->133|168->136|171->139|176->144|177->145|182->150|183->151|184->152|194->162|194->162|194->162|195->163|195->163|195->163|196->164|197->165|197->165|199->167|199->167|203->171|203->171|203->171|204->172|204->172|204->172|205->173|205->173|206->174|207->175|208->176|211->179|211->179|222->190|222->190|222->190|222->190|224->192|224->192|227->195|229->197|229->197|232->200|235->203|240->208|241->209|246->214|247->215|248->216|254->222|254->222|254->222|255->223|255->223|255->223|256->224|257->225|257->225|259->227|259->227|263->231|263->231|263->231|264->232|264->232|264->232|265->233|265->233|266->234|267->235|268->236|271->239|271->239|282->250|282->250|282->250|282->250|284->252|284->252|287->255|289->257|289->257|292->260|295->263|300->268|301->269|306->274|307->275|308->276|313->281|313->281|313->281|314->282|314->282|314->282|315->283|316->284|316->284|318->286|318->286|322->290|322->290|322->290|323->291|323->291|323->291|324->292|324->292|325->293|326->294|327->295|330->298|330->298|341->309|341->309|341->309|341->309|343->311|343->311|346->314|348->316|348->316|351->319|353->321|358->326|359->327|364->332|365->333|367->335|372->340|372->340|372->340|373->341|373->341|373->341|374->342|375->343|375->343|377->345|377->345|381->349|381->349|381->349|382->350|382->350|382->350|383->351|383->351|384->352|385->353|386->354|389->357|389->357|400->368|400->368|400->368|400->368|402->370|402->370|405->373|407->375|407->375|410->378|413->381|418->386|419->387|424->392|425->393|426->394|433->401|433->401|433->401|434->402|434->402|434->402|435->403|436->404|436->404|438->406|438->406|442->410|442->410|442->410|443->411|443->411|443->411|444->412|444->412|445->413|446->414|447->415|450->418|450->418|461->429|461->429|461->429|461->429|463->431|463->431|466->434|468->436|468->436|471->439|474->442|479->447|480->448|485->453|486->454|487->455|491->459|491->459|491->459|493->461|509->477|509->477|509->477|509->477|511->479|511->479|512->480|514->482|515->483|515->483|521->489|522->490|527->495|527->495|530->498|532->500|533->501|533->501|539->507|540->508|547->515|547->515|550->518|551->519|560->528|561->529|568->536|569->537|572->540|572->540|573->541|576->544|576->544|578->546|578->546|579->547|581->549|581->549|583->551|583->551|584->552|587->555|587->555|589->557|589->557|590->558|592->560|592->560|597->565|597->565|598->566|600->568|600->568|601->569|602->570
                  -- GENERATED --
              */
          