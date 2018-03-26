
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

object searchResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template16[Form[Search],Form[Track],Form[Message],String,Integer,List[String],List[String],List[String],List[String],List[String],List[String],List[String],String,String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], messageForm: Form[Message], user: String, bool: Integer, popTweets: List[String], recentTweets: List[String], recentTweets1: List[String], recentTweets2: List[String], media: List[String], media1: List[String], media2: List[String], img: String, term: String, personas: List[String], interests: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*1.361*/("""

"""),format.raw/*4.89*/("""

"""),format.raw/*6.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("javascripts/render.js")),format.raw/*8.63*/(""""; type="text/javascript"></script>

"""),_display_(/*10.2*/main("Search Results")/*10.24*/(searchForm)/*10.36*/(user)/*10.42*/(bool)/*10.48*/(img)/*10.53*/(personas)/*10.63*/(interests)/*10.74*/{_display_(Seq[Any](format.raw/*10.75*/("""
    """),format.raw/*11.5*/("""<h3 id="upper">search results for "<span class="lite">"""),_display_(/*11.60*/term),format.raw/*11.64*/("""</span>":
      <a href=""""),_display_(/*12.17*/routes/*12.23*/.SearchController.searchAnalytics()),format.raw/*12.58*/("""" class="btn btn-primary" id="analytics-btn"> Search Analytics </a>
    </h3>

    <div id="loader-bg">
     <div id="loader"></div>
   </div>

    <div id="page-content" style="display:none">

  	  <ul class="nav nav-tabs">
        <li class="nav-item tab_item">
          <div id="recent_tab"> <a class="nav-link active search_result" onclick="openTab(event, 'recent')">Recent</a></div>
        </li>
        <li class="nav-item tab_item">
            <div id="popular_tab"><a class="nav-link search_result" onclick="openTab(event, 'popular')">Top 15 Tweets</a></div> 
          </li>
          <li class="nav-item tab_item">
            <div id="media_tab"><a class="nav-link search_result" onclick="openTab(event, 'media')">Photos, Videos and Links</a></div>
          </li>
        </ul>

          <div id="recent" class="tweets">
            <div class="card-columns">
              """),_display_(/*35.16*/for(tweet <- recentTweets) yield /*35.42*/{_display_(Seq[Any](format.raw/*35.43*/("""
                """),_display_(/*36.18*/defining(tweet.split("-"))/*36.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*36.60*/("""                 
                  """),format.raw/*37.19*/("""<div class="card">
                    <div id=""""),_display_(/*38.31*/tweetArray(0)),format.raw/*38.44*/("""">
                      <script>
                        rendering(""""),_display_(/*40.37*/tweetArray(0)),format.raw/*40.50*/("""");
                      </script>
                    </div>
                     
                    """),_display_(/*44.22*/if(bool==1)/*44.33*/{_display_(Seq[Any](format.raw/*44.34*/("""  
                      """),format.raw/*45.23*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*45.77*/tweet),format.raw/*45.82*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*46.63*/tweetArray(1)),format.raw/*46.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                    """)))}),format.raw/*48.22*/("""
                  """),format.raw/*49.19*/("""</div>
                

                  <div class="modal fade" id=""""),_display_(/*52.48*/tweet),format.raw/*52.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*63.38*/b4/*63.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*63.115*/{_display_(Seq[Any](format.raw/*63.116*/(""" 

                                            """),_display_(/*65.46*/b4/*65.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "To:",
                                                'size -> 1)),format.raw/*68.60*/("""

                                            """),_display_(/*70.46*/b4/*70.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*73.60*/("""

                                    
                                    """),format.raw/*76.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                            """)))}),format.raw/*81.30*/("""
                              """),format.raw/*82.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*87.18*/("""
              """)))}),format.raw/*88.16*/("""
            """),format.raw/*89.13*/("""</div>

            <hr>
            <div class="button_wrapper">
              <a class="show_btn" id="show">
                <b class="caret"></b> Show More
              </a>
            </div>

              <div class="card-columns">

              <div id="more" style="display:none">
                """),_display_(/*101.18*/for(tweet <- recentTweets1) yield /*101.45*/{_display_(Seq[Any](format.raw/*101.46*/("""
                  """),_display_(/*102.20*/defining(tweet.split("-"))/*102.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*102.62*/("""                 
                    """),format.raw/*103.21*/("""<div class="card">
                      <div id=""""),_display_(/*104.33*/tweetArray(0)),format.raw/*104.46*/("""">
                        <script>
                          rendering(""""),_display_(/*106.39*/tweetArray(0)),format.raw/*106.52*/("""");
                        </script>
                      </div>
                        
                      """),_display_(/*110.24*/if(bool==1)/*110.35*/{_display_(Seq[Any](format.raw/*110.36*/("""  
                        """),format.raw/*111.25*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*111.79*/tweet),format.raw/*111.84*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*112.63*/tweetArray(1)),format.raw/*112.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                      """)))}),format.raw/*114.24*/("""
                    """),format.raw/*115.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*118.50*/tweet),format.raw/*118.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*129.40*/b4/*129.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*129.117*/{_display_(Seq[Any](format.raw/*129.118*/(""" 

                                              """),_display_(/*131.48*/b4/*131.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*134.60*/("""

                                            """),_display_(/*136.46*/b4/*136.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*139.60*/("""

                                      
                                      """),format.raw/*142.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                              """)))}),format.raw/*147.32*/("""
                                """),format.raw/*148.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*153.20*/("""
                """)))}),format.raw/*154.18*/("""
              """),format.raw/*155.15*/("""</div>
            </div>

            <div class="button_wrapper">
              <a class="show_btn" id="show2" style="display:none">
                <hr>
                <b class="caret"></b> Show More
              </a>
            </div>
              <div class="card-columns">

              <div id="showMore" style="display:none">
                """),_display_(/*167.18*/for(tweet <- recentTweets2) yield /*167.45*/{_display_(Seq[Any](format.raw/*167.46*/("""
                  """),_display_(/*168.20*/defining(tweet.split("-"))/*168.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*168.62*/("""                 
                    """),format.raw/*169.21*/("""<div class="card">
                      <div id=""""),_display_(/*170.33*/tweetArray(0)),format.raw/*170.46*/("""">
                        <script>
                          rendering(""""),_display_(/*172.39*/tweetArray(0)),format.raw/*172.52*/("""");
                        </script>
                      </div>
                      
                      """),_display_(/*176.24*/if(bool==1)/*176.35*/{_display_(Seq[Any](format.raw/*176.36*/("""  
                        """),format.raw/*177.25*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*177.79*/tweet),format.raw/*177.84*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*178.63*/tweetArray(1)),format.raw/*178.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                      """)))}),format.raw/*180.24*/("""
                    """),format.raw/*181.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*184.50*/tweet),format.raw/*184.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*195.40*/b4/*195.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*195.117*/{_display_(Seq[Any](format.raw/*195.118*/(""" 

                                              """),_display_(/*197.48*/b4/*197.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*200.60*/("""

                                            """),_display_(/*202.46*/b4/*202.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*205.60*/("""

                                      
                                      """),format.raw/*208.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                              """)))}),format.raw/*213.32*/("""
                                """),format.raw/*214.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*219.20*/("""
                """)))}),format.raw/*220.18*/("""
              """),format.raw/*221.15*/("""</div>
            </div> 
          </div>

          <div id="popular" class="tweets">
            <div class="card-columns">
              """),_display_(/*227.16*/for((tweet) <- popTweets) yield /*227.41*/{_display_(Seq[Any](format.raw/*227.42*/("""
                """),_display_(/*228.18*/defining(tweet.split("-"))/*228.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*228.60*/("""                 
                  """),format.raw/*229.19*/("""<div class="card">
                    <div id=""""),_display_(/*230.31*/tweetArray(0)),format.raw/*230.44*/("""">
                      <script>
                        rendering(""""),_display_(/*232.37*/tweetArray(0)),format.raw/*232.50*/("""");
                      </script>
                    </div>
                     
                    """),_display_(/*236.22*/if(bool==1)/*236.33*/{_display_(Seq[Any](format.raw/*236.34*/("""  
                      """),format.raw/*237.23*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*237.77*/tweet),format.raw/*237.82*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*238.63*/tweetArray(1)),format.raw/*238.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                    """)))}),format.raw/*240.22*/("""
                  """),format.raw/*241.19*/("""</div>
                

                  <div class="modal fade" id=""""),_display_(/*244.48*/tweet),format.raw/*244.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*255.38*/b4/*255.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*255.115*/{_display_(Seq[Any](format.raw/*255.116*/(""" 

                                            """),_display_(/*257.46*/b4/*257.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*260.60*/("""

                                            """),_display_(/*262.46*/b4/*262.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*265.60*/("""

                                    
                                    """),format.raw/*268.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                            """)))}),format.raw/*273.30*/("""
                              """),format.raw/*274.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*279.18*/("""
              """)))}),format.raw/*280.16*/("""
            """),format.raw/*281.13*/("""</div>
          </div> 

          <div id="media" class="tweets">
            <div class="card-columns">
              """),_display_(/*286.16*/for(tweet <- media) yield /*286.35*/{_display_(Seq[Any](format.raw/*286.36*/("""
                """),_display_(/*287.18*/defining(tweet.split("-"))/*287.44*/ { tweetArray =>_display_(Seq[Any](format.raw/*287.60*/("""                 
                  """),format.raw/*288.19*/("""<div class="card">
                    <div id=""""),_display_(/*289.31*/tweetArray(0)),format.raw/*289.44*/("""">
                      <script>
                        rendering(""""),_display_(/*291.37*/tweetArray(0)),format.raw/*291.50*/("""");
                      </script>
                    </div>
                    
                    """),_display_(/*295.22*/if(bool==1)/*295.33*/{_display_(Seq[Any](format.raw/*295.34*/("""  
                      """),format.raw/*296.23*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*296.77*/tweet),format.raw/*296.82*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*297.63*/tweetArray(1)),format.raw/*297.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                    """)))}),format.raw/*299.22*/("""
                  """),format.raw/*300.19*/("""</div>
                

                  <div class="modal fade" id=""""),_display_(/*303.48*/tweet),format.raw/*303.53*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                    """),_display_(/*314.38*/b4/*314.40*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*314.115*/{_display_(Seq[Any](format.raw/*314.116*/(""" 

                                            """),_display_(/*316.46*/b4/*316.48*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*319.60*/("""

                                            """),_display_(/*321.46*/b4/*321.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*324.60*/("""
                                    
                                    """),format.raw/*326.37*/("""</div>
                              </div>
                              <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                            """)))}),format.raw/*331.30*/("""
                              """),format.raw/*332.31*/("""</div>
                            </div>
                          </div>
                        </div>
                        
                """)))}),format.raw/*337.18*/("""
              """)))}),format.raw/*338.16*/("""

            
            """),format.raw/*341.13*/("""</div>
             
             <hr> 
            <div class="button_wrapper">
              <a class="show_btn" id="media1">
                <b class="caret"></b> Show More
              </a>
            </div>

            <div class="card-columns">

              <div id="moreMedia" style="display:none">
                """),_display_(/*353.18*/for(tweet <- media1) yield /*353.38*/{_display_(Seq[Any](format.raw/*353.39*/("""
                  """),_display_(/*354.20*/defining(tweet.split("-"))/*354.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*354.62*/("""                 
                    """),format.raw/*355.21*/("""<div class="card">
                      <div id=""""),_display_(/*356.33*/tweetArray(0)),format.raw/*356.46*/("""">
                        <script>
                          rendering(""""),_display_(/*358.39*/tweetArray(0)),format.raw/*358.52*/("""");
                        </script>
                      </div>
                      
                      """),_display_(/*362.24*/if(bool==1)/*362.35*/{_display_(Seq[Any](format.raw/*362.36*/("""  
                        """),format.raw/*363.25*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*363.79*/tweet),format.raw/*363.84*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*364.63*/tweetArray(1)),format.raw/*364.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                      """)))}),format.raw/*366.24*/("""
                    """),format.raw/*367.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*370.50*/tweet),format.raw/*370.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*381.40*/b4/*381.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*381.117*/{_display_(Seq[Any](format.raw/*381.118*/(""" 

                                              """),_display_(/*383.48*/b4/*383.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*386.60*/("""

                                            """),_display_(/*388.46*/b4/*388.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*391.60*/("""

                                      
                                      """),format.raw/*394.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                              """)))}),format.raw/*399.32*/("""
                                """),format.raw/*400.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*405.20*/("""
                """)))}),format.raw/*406.18*/("""
              """),format.raw/*407.15*/("""</div>
            </div>

            <div class="button_wrapper">
              <a class="show_btn" id="media2" style="display:none">
                <hr>
                <b class="caret"></b> Show More
              </a>
            </div>

            <div class="card-columns">
              <div id="moreMedia2" style="display:none">
                """),_display_(/*419.18*/for(tweet <- media2) yield /*419.38*/{_display_(Seq[Any](format.raw/*419.39*/("""
                  """),_display_(/*420.20*/defining(tweet.split("-"))/*420.46*/ { tweetArray =>_display_(Seq[Any](format.raw/*420.62*/("""                 
                    """),format.raw/*421.21*/("""<div class="card">
                      <div id=""""),_display_(/*422.33*/tweetArray(0)),format.raw/*422.46*/("""">
                        <script>
                          rendering(""""),_display_(/*424.39*/tweetArray(0)),format.raw/*424.52*/("""");
                        </script>
                      </div>
                        
                      """),_display_(/*428.24*/if(bool==1)/*428.35*/{_display_(Seq[Any](format.raw/*428.36*/("""
                        """),format.raw/*429.25*/("""<a class="msg_btn" data-toggle="modal" data-target="#"""),_display_(/*429.79*/tweet),format.raw/*429.84*/("""">
                        Message <span style="color: #E4BC7B">"""),_display_(/*430.63*/tweetArray(1)),format.raw/*430.76*/("""</span> <i class="icon-envelope-l"></i> 
                      </a>
                      """)))}),format.raw/*432.24*/("""
                    """),format.raw/*433.21*/("""</div>
                  

                    <div class="modal fade" id=""""),_display_(/*436.50*/tweet),format.raw/*436.55*/("""" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                                      """),_display_(/*447.40*/b4/*447.42*/.form(action=helper.CSRF(routes.SearchController.sendMessage(request.uri)))/*447.117*/{_display_(Seq[Any](format.raw/*447.118*/(""" 

                                              """),_display_(/*449.48*/b4/*449.50*/.text(messageForm("recipientName").copy(value= Option[String](tweetArray(1))),
                                                'placeholder -> "Recipient Name",
                                                '_label -> "Recipient Name",
                                                'size -> 1)),format.raw/*452.60*/("""

                                            """),_display_(/*454.46*/b4/*454.48*/.textarea(messageForm("message"),
                                                'placeholder -> "Message",
                                                '_label -> "Message:",
                                                'rows -> 4)),format.raw/*457.60*/("""

                                      
                                      """),format.raw/*460.39*/("""</div>
                                </div>
                                <div class="modal-footer">
                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                  <button class="btn btn-primary" id="submit-btn" type="submit">Send</button>
                              """)))}),format.raw/*465.32*/("""
                                """),format.raw/*466.33*/("""</div>
                              </div>
                            </div>
                          </div>
                          
                  """)))}),format.raw/*471.20*/("""
                """)))}),format.raw/*472.18*/("""
              """),format.raw/*473.15*/("""</div>
            </div>
          </div>
        </div>

           """),_display_(/*478.13*/if(bool==1)/*478.24*/{_display_(Seq[Any](format.raw/*478.25*/("""

              """),format.raw/*480.15*/("""<div class="fixed-bottom" id="footer">
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
                        """),_display_(/*496.26*/b4/*496.28*/.form(action=helper.CSRF(routes.SearchController.trackSearch(request.uri)))/*496.103*/{_display_(Seq[Any](format.raw/*496.104*/("""

                            """),_display_(/*498.30*/b4/*498.32*/.text(trackForm("term").copy(value= Option[String](term)),
                              '_label -> "Search Term")),format.raw/*499.56*/("""

                            """),format.raw/*501.29*/("""<div id="to-be-hidden">
                              """),_display_(/*502.32*/b4/*502.34*/.select(
                                 trackForm("interest"),
                                 helper.options(interests),
                                 '_label -> "Interest",
                                 '_default -> "-- Select an Interest --",
                                 'selected -> "-1"
                              )),format.raw/*508.32*/("""
                                """),format.raw/*509.33*/("""Or,  <a id="createinterest" href="#" onclick="display('hidden-form', 'to-be-hidden')"><u>create a new interest</u></a>:
                              
                            </div>

                            <div id="hidden-form" style="display:none">
                              <a  onclick="display('hidden-form', 'to-be-hidden')"><u>Undo</u></a>:
                              """),_display_(/*515.32*/b4/*515.34*/.text(trackForm("newInterestName"),
                                              'placeholder -> "Interest Name",
                                              '_label -> "",
                                              'size -> 5)),format.raw/*518.58*/("""

                              """),format.raw/*520.31*/("""<div id="be-hidden">
                                """),_display_(/*521.34*/b4/*521.36*/.select(
                                   trackForm("personaName"),
                                   helper.options(personas),
                                   '_label -> "",
                                   '_default -> "-- Select an Interest Category --",
                                   'selected -> "-1"
                                )),format.raw/*527.34*/("""
                                """),format.raw/*528.33*/("""Or, <a id="create-persona" onclick="display('hidden-category-form', 'be-hidden')"><u>create a new Interest Category</u></a>:
                              </div>

                              
                            </div>
                            <div id="hidden-category-form" style="display:none">
                              <a onclick="display('hidden-category-form', 'be-hidden')"><u>Undo</u></a>:
                              """),_display_(/*535.32*/b4/*535.34*/.text(trackForm("newPersonaName"),
                                  'placeholder -> "Name of Interest Category",
                                  '_label -> "",
                                  'size -> 1)),format.raw/*538.46*/("""
                            """),format.raw/*539.29*/("""</div>



                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" id="submit-btn" type="submit">Save changes</button>
                  """)))}),format.raw/*548.20*/("""
                    """),format.raw/*549.21*/("""</div>
                  </div>
                </div>
              </div>

              

            """)))}),format.raw/*556.14*/("""
          """),format.raw/*557.11*/("""</div>

            <script>
              $('#show').click(function() """),format.raw/*560.43*/("""{"""),format.raw/*560.44*/("""
                """),format.raw/*561.17*/("""$('#more').toggle();
                $('#show').toggle();
                $('#show2').toggle();
            """),format.raw/*564.13*/("""}"""),format.raw/*564.14*/(""");

              $('#show2').click(function() """),format.raw/*566.44*/("""{"""),format.raw/*566.45*/("""
                """),format.raw/*567.17*/("""$('#showMore').toggle();
                $('#show2').toggle();
            """),format.raw/*569.13*/("""}"""),format.raw/*569.14*/(""");

              $('#media1').click(function() """),format.raw/*571.45*/("""{"""),format.raw/*571.46*/("""
                """),format.raw/*572.17*/("""$('#moreMedia').toggle();
                $('#media2').toggle();
                $('#media1').toggle();
            """),format.raw/*575.13*/("""}"""),format.raw/*575.14*/(""");

              $('#media2').click(function() """),format.raw/*577.45*/("""{"""),format.raw/*577.46*/("""
                """),format.raw/*578.17*/("""$('#moreMedia2').toggle();
                $('#media2').toggle();
            """),format.raw/*580.13*/("""}"""),format.raw/*580.14*/(""");

            var myVar;
            myVar = setTimeout(showPage, 3000);

            function showPage() """),format.raw/*585.33*/("""{"""),format.raw/*585.34*/("""
              """),format.raw/*586.15*/("""document.getElementById("loader").style.display = "none";
              document.getElementById("loader-bg").style.display = "none";
              document.getElementById("page-content").style.display = "block";
            """),format.raw/*589.13*/("""}"""),format.raw/*589.14*/("""
          """),format.raw/*590.11*/("""</script>
""")))}),format.raw/*591.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],messageForm:Form[Message],user:String,bool:Integer,popTweets:List[String],recentTweets:List[String],recentTweets1:List[String],recentTweets2:List[String],media:List[String],media1:List[String],media2:List[String],img:String,term:String,personas:List[String],interests:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,messageForm,user,bool,popTweets,recentTweets,recentTweets1,recentTweets2,media,media1,media2,img,term,personas,interests)

  def f:((Form[Search],Form[Track],Form[Message],String,Integer,List[String],List[String],List[String],List[String],List[String],List[String],List[String],String,String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,messageForm,user,bool,popTweets,recentTweets,recentTweets1,recentTweets2,media,media1,media2,img,term,personas,interests) => apply(searchForm,trackForm,messageForm,user,bool,popTweets,recentTweets,recentTweets1,recentTweets2,media,media1,media2,img,term,personas,interests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 18:01:58 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: 5debc93dc65fd9ad9ac42b53ea2ad41fd83fedd0
                  MATRIX: 1135->1|1567->363|1604->380|1636->404|1730->360|1759->467|1787->469|1983->639|1997->645|2059->687|2123->725|2154->747|2175->759|2190->765|2205->771|2219->776|2238->786|2258->797|2297->798|2329->803|2411->858|2436->862|2489->888|2504->894|2560->929|3478->1820|3520->1846|3559->1847|3604->1865|3639->1891|3693->1907|3757->1943|3833->1992|3867->2005|3964->2075|3998->2088|4131->2194|4151->2205|4190->2206|4243->2231|4324->2285|4350->2290|4442->2355|4476->2368|4596->2457|4643->2476|4742->2548|4768->2553|5568->3326|5579->3328|5664->3403|5704->3404|5779->3452|5790->3454|6097->3740|6171->3787|6182->3789|6442->4028|6545->4103|6930->4457|6989->4488|7168->4636|7215->4652|7256->4665|7592->4973|7636->5000|7676->5001|7724->5021|7760->5047|7815->5063|7882->5101|7961->5152|7996->5165|8098->5239|8133->5252|8276->5367|8297->5378|8337->5379|8393->5406|8475->5460|8502->5465|8595->5530|8630->5543|8753->5634|8803->5655|8907->5731|8934->5736|9757->6531|9769->6533|9855->6608|9896->6609|9974->6659|9986->6661|10305->6958|10380->7005|10392->7007|10653->7246|10761->7325|11157->7689|11219->7722|11409->7880|11459->7898|11503->7913|11887->8269|11931->8296|11971->8297|12019->8317|12055->8343|12110->8359|12177->8397|12256->8448|12291->8461|12393->8535|12428->8548|12569->8661|12590->8672|12630->8673|12686->8700|12768->8754|12795->8759|12888->8824|12923->8837|13046->8928|13096->8949|13200->9025|13227->9030|14050->9825|14062->9827|14148->9902|14189->9903|14267->9953|14279->9955|14598->10252|14673->10299|14685->10301|14946->10540|15054->10619|15450->10983|15512->11016|15702->11174|15752->11192|15796->11207|15967->11350|16009->11375|16049->11376|16095->11394|16131->11420|16186->11436|16251->11472|16328->11521|16363->11534|16461->11604|16496->11617|16630->11723|16651->11734|16691->11735|16745->11760|16827->11814|16854->11819|16947->11884|16982->11897|17103->11986|17151->12005|17251->12077|17278->12082|18079->12855|18091->12857|18177->12932|18218->12933|18294->12981|18306->12983|18625->13280|18700->13327|18712->13329|18973->13568|19077->13643|19463->13997|19523->14028|19703->14176|19751->14192|19793->14205|19943->14327|19979->14346|20019->14347|20065->14365|20101->14391|20156->14407|20221->14443|20298->14492|20333->14505|20431->14575|20466->14588|20599->14693|20620->14704|20660->14705|20714->14730|20796->14784|20823->14789|20916->14854|20951->14867|21072->14956|21120->14975|21220->15047|21247->15052|22048->15825|22060->15827|22146->15902|22187->15903|22263->15951|22275->15953|22594->16250|22669->16297|22681->16299|22942->16538|23045->16612|23431->16966|23491->16997|23671->17145|23719->17161|23775->17188|24131->17516|24168->17536|24208->17537|24256->17557|24292->17583|24347->17599|24414->17637|24493->17688|24528->17701|24630->17775|24665->17788|24806->17901|24827->17912|24867->17913|24923->17940|25005->17994|25032->17999|25125->18064|25160->18077|25283->18168|25333->18189|25437->18265|25464->18270|26287->19065|26299->19067|26385->19142|26426->19143|26504->19193|26516->19195|26835->19492|26910->19539|26922->19541|27183->19780|27291->19859|27687->20223|27749->20256|27939->20414|27989->20432|28033->20447|28418->20804|28455->20824|28495->20825|28543->20845|28579->20871|28634->20887|28701->20925|28780->20976|28815->20989|28917->21063|28952->21076|29095->21191|29116->21202|29156->21203|29210->21228|29292->21282|29319->21287|29412->21352|29447->21365|29570->21456|29620->21477|29724->21553|29751->21558|30574->22353|30586->22355|30672->22430|30713->22431|30791->22481|30803->22483|31122->22780|31197->22827|31209->22829|31470->23068|31578->23147|31974->23511|32036->23544|32226->23702|32276->23720|32320->23735|32419->23806|32440->23817|32480->23818|32525->23834|33494->24775|33506->24777|33592->24852|33633->24853|33692->24884|33704->24886|33840->25000|33899->25030|33982->25085|33994->25087|34353->25424|34415->25457|34833->25847|34845->25849|35100->26082|35161->26114|35243->26168|35255->26170|35629->26522|35691->26555|36165->27001|36177->27003|36407->27211|36465->27240|36839->27582|36889->27603|37027->27709|37067->27720|37167->27791|37197->27792|37243->27809|37380->27917|37410->27918|37486->27965|37516->27966|37562->27983|37666->28058|37696->28059|37773->28107|37803->28108|37849->28125|37994->28241|38024->28242|38101->28290|38131->28291|38177->28308|38284->28386|38314->28387|38451->28495|38481->28496|38525->28511|38778->28735|38808->28736|38848->28747|38890->28758
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|38->6|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|70->38|72->40|72->40|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|80->48|81->49|84->52|84->52|95->63|95->63|95->63|95->63|97->65|97->65|100->68|102->70|102->70|105->73|108->76|113->81|114->82|119->87|120->88|121->89|133->101|133->101|133->101|134->102|134->102|134->102|135->103|136->104|136->104|138->106|138->106|142->110|142->110|142->110|143->111|143->111|143->111|144->112|144->112|146->114|147->115|150->118|150->118|161->129|161->129|161->129|161->129|163->131|163->131|166->134|168->136|168->136|171->139|174->142|179->147|180->148|185->153|186->154|187->155|199->167|199->167|199->167|200->168|200->168|200->168|201->169|202->170|202->170|204->172|204->172|208->176|208->176|208->176|209->177|209->177|209->177|210->178|210->178|212->180|213->181|216->184|216->184|227->195|227->195|227->195|227->195|229->197|229->197|232->200|234->202|234->202|237->205|240->208|245->213|246->214|251->219|252->220|253->221|259->227|259->227|259->227|260->228|260->228|260->228|261->229|262->230|262->230|264->232|264->232|268->236|268->236|268->236|269->237|269->237|269->237|270->238|270->238|272->240|273->241|276->244|276->244|287->255|287->255|287->255|287->255|289->257|289->257|292->260|294->262|294->262|297->265|300->268|305->273|306->274|311->279|312->280|313->281|318->286|318->286|318->286|319->287|319->287|319->287|320->288|321->289|321->289|323->291|323->291|327->295|327->295|327->295|328->296|328->296|328->296|329->297|329->297|331->299|332->300|335->303|335->303|346->314|346->314|346->314|346->314|348->316|348->316|351->319|353->321|353->321|356->324|358->326|363->331|364->332|369->337|370->338|373->341|385->353|385->353|385->353|386->354|386->354|386->354|387->355|388->356|388->356|390->358|390->358|394->362|394->362|394->362|395->363|395->363|395->363|396->364|396->364|398->366|399->367|402->370|402->370|413->381|413->381|413->381|413->381|415->383|415->383|418->386|420->388|420->388|423->391|426->394|431->399|432->400|437->405|438->406|439->407|451->419|451->419|451->419|452->420|452->420|452->420|453->421|454->422|454->422|456->424|456->424|460->428|460->428|460->428|461->429|461->429|461->429|462->430|462->430|464->432|465->433|468->436|468->436|479->447|479->447|479->447|479->447|481->449|481->449|484->452|486->454|486->454|489->457|492->460|497->465|498->466|503->471|504->472|505->473|510->478|510->478|510->478|512->480|528->496|528->496|528->496|528->496|530->498|530->498|531->499|533->501|534->502|534->502|540->508|541->509|547->515|547->515|550->518|552->520|553->521|553->521|559->527|560->528|567->535|567->535|570->538|571->539|580->548|581->549|588->556|589->557|592->560|592->560|593->561|596->564|596->564|598->566|598->566|599->567|601->569|601->569|603->571|603->571|604->572|607->575|607->575|609->577|609->577|610->578|612->580|612->580|617->585|617->585|618->586|621->589|621->589|622->590|623->591
                  -- GENERATED --
              */
          