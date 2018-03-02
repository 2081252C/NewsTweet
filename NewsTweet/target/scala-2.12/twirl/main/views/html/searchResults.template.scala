
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
            <a class="nav-link active search_result" onclick="openTab(event, 'recent')">Recent</a>
          </li>
        <li class="nav-item tab_item">
            <a class="nav-link search_result" onclick="openTab(event, 'popular')">Top 15 Tweets</a> 
          </li>
          <li class="nav-item tab_item">
            <a class="nav-link search_result" onclick="openTab(event, 'media')">Photos, Videos and Links</a>
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
                              """),format.raw/*509.31*/("""Or,  <a onclick="display('hidden-form', 'to-be-hidden')"><u>create a new interest</u></a>:
                            </div>

                            <div id="hidden-form" style="display:none">
                              <a onclick="display('hidden-form', 'to-be-hidden')"><u>Undo</u></a>:
                              """),_display_(/*514.32*/b4/*514.34*/.text(trackForm("newInterestName"),
                                              'placeholder -> "Interest Name",
                                              '_label -> "",
                                              'size -> 5)),format.raw/*517.58*/("""

                              """),format.raw/*519.31*/("""<div id="be-hidden">
                                """),_display_(/*520.34*/b4/*520.36*/.select(
                                   trackForm("personaName"),
                                   helper.options(personas),
                                   '_label -> "",
                                   '_default -> "-- Select an Interest Category --",
                                   'selected -> "-1"
                                )),format.raw/*526.34*/("""
                                """),format.raw/*527.33*/("""Or, <a onclick="display('hidden-category-form', 'be-hidden')"><u>create a new Interest Category</u></a>:
                              </div>

                              
                            </div>
                            <div id="hidden-category-form" style="display:none">
                              <a onclick="display('hidden-category-form', 'be-hidden')"><u>Undo</u></a>:
                              """),_display_(/*534.32*/b4/*534.34*/.text(trackForm("newPersonaName"),
                                  'placeholder -> "Name of Interest Category",
                                  '_label -> "",
                                  'size -> 1)),format.raw/*537.46*/("""
                            """),format.raw/*538.29*/("""</div>



                    </div>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                      <button class="btn btn-primary" id="submit-btn" type="submit">Save changes</button>
                  """)))}),format.raw/*547.20*/("""
                    """),format.raw/*548.21*/("""</div>
                  </div>
                </div>
              </div>

              

            """)))}),format.raw/*555.14*/("""
          """),format.raw/*556.11*/("""</div>

            <script>
              $('#show').click(function() """),format.raw/*559.43*/("""{"""),format.raw/*559.44*/("""
                """),format.raw/*560.17*/("""$('#more').toggle();
                $('#show').toggle();
                $('#show2').toggle();
            """),format.raw/*563.13*/("""}"""),format.raw/*563.14*/(""");

              $('#show2').click(function() """),format.raw/*565.44*/("""{"""),format.raw/*565.45*/("""
                """),format.raw/*566.17*/("""$('#showMore').toggle();
                $('#show2').toggle();
            """),format.raw/*568.13*/("""}"""),format.raw/*568.14*/(""");

              $('#media1').click(function() """),format.raw/*570.45*/("""{"""),format.raw/*570.46*/("""
                """),format.raw/*571.17*/("""$('#moreMedia').toggle();
                $('#media2').toggle();
                $('#media1').toggle();
            """),format.raw/*574.13*/("""}"""),format.raw/*574.14*/(""");

              $('#media2').click(function() """),format.raw/*576.45*/("""{"""),format.raw/*576.46*/("""
                """),format.raw/*577.17*/("""$('#moreMedia2').toggle();
                $('#media2').toggle();
            """),format.raw/*579.13*/("""}"""),format.raw/*579.14*/(""");

            var myVar;
            myVar = setTimeout(showPage, 3000);

            function showPage() """),format.raw/*584.33*/("""{"""),format.raw/*584.34*/("""
              """),format.raw/*585.15*/("""document.getElementById("loader").style.display = "none";
              document.getElementById("loader-bg").style.display = "none";
              document.getElementById("page-content").style.display = "block";
            """),format.raw/*588.13*/("""}"""),format.raw/*588.14*/("""
          """),format.raw/*589.11*/("""</script>
""")))}),format.raw/*590.2*/("""

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
                  DATE: Fri Mar 02 15:20:11 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/searchResults.scala.html
                  HASH: c7a7cf61e6905848bcaa375785048ff8a28a88f7
                  MATRIX: 1135->1|1567->363|1604->380|1636->404|1730->360|1759->467|1787->469|1983->639|1997->645|2059->687|2123->725|2154->747|2175->759|2190->765|2205->771|2219->776|2238->786|2258->797|2297->798|2329->803|2411->858|2436->862|2489->888|2504->894|2560->929|3400->1742|3442->1768|3481->1769|3526->1787|3561->1813|3615->1829|3679->1865|3755->1914|3789->1927|3886->1997|3920->2010|4053->2116|4073->2127|4112->2128|4165->2153|4246->2207|4272->2212|4364->2277|4398->2290|4518->2379|4565->2398|4664->2470|4690->2475|5490->3248|5501->3250|5586->3325|5626->3326|5701->3374|5712->3376|6019->3662|6093->3709|6104->3711|6364->3950|6467->4025|6852->4379|6911->4410|7090->4558|7137->4574|7178->4587|7514->4895|7558->4922|7598->4923|7646->4943|7682->4969|7737->4985|7804->5023|7883->5074|7918->5087|8020->5161|8055->5174|8198->5289|8219->5300|8259->5301|8315->5328|8397->5382|8424->5387|8517->5452|8552->5465|8675->5556|8725->5577|8829->5653|8856->5658|9679->6453|9691->6455|9777->6530|9818->6531|9896->6581|9908->6583|10227->6880|10302->6927|10314->6929|10575->7168|10683->7247|11079->7611|11141->7644|11331->7802|11381->7820|11425->7835|11809->8191|11853->8218|11893->8219|11941->8239|11977->8265|12032->8281|12099->8319|12178->8370|12213->8383|12315->8457|12350->8470|12491->8583|12512->8594|12552->8595|12608->8622|12690->8676|12717->8681|12810->8746|12845->8759|12968->8850|13018->8871|13122->8947|13149->8952|13972->9747|13984->9749|14070->9824|14111->9825|14189->9875|14201->9877|14520->10174|14595->10221|14607->10223|14868->10462|14976->10541|15372->10905|15434->10938|15624->11096|15674->11114|15718->11129|15889->11272|15931->11297|15971->11298|16017->11316|16053->11342|16108->11358|16173->11394|16250->11443|16285->11456|16383->11526|16418->11539|16552->11645|16573->11656|16613->11657|16667->11682|16749->11736|16776->11741|16869->11806|16904->11819|17025->11908|17073->11927|17173->11999|17200->12004|18001->12777|18013->12779|18099->12854|18140->12855|18216->12903|18228->12905|18547->13202|18622->13249|18634->13251|18895->13490|18999->13565|19385->13919|19445->13950|19625->14098|19673->14114|19715->14127|19865->14249|19901->14268|19941->14269|19987->14287|20023->14313|20078->14329|20143->14365|20220->14414|20255->14427|20353->14497|20388->14510|20521->14615|20542->14626|20582->14627|20636->14652|20718->14706|20745->14711|20838->14776|20873->14789|20994->14878|21042->14897|21142->14969|21169->14974|21970->15747|21982->15749|22068->15824|22109->15825|22185->15873|22197->15875|22516->16172|22591->16219|22603->16221|22864->16460|22967->16534|23353->16888|23413->16919|23593->17067|23641->17083|23697->17110|24053->17438|24090->17458|24130->17459|24178->17479|24214->17505|24269->17521|24336->17559|24415->17610|24450->17623|24552->17697|24587->17710|24728->17823|24749->17834|24789->17835|24845->17862|24927->17916|24954->17921|25047->17986|25082->17999|25205->18090|25255->18111|25359->18187|25386->18192|26209->18987|26221->18989|26307->19064|26348->19065|26426->19115|26438->19117|26757->19414|26832->19461|26844->19463|27105->19702|27213->19781|27609->20145|27671->20178|27861->20336|27911->20354|27955->20369|28340->20726|28377->20746|28417->20747|28465->20767|28501->20793|28556->20809|28623->20847|28702->20898|28737->20911|28839->20985|28874->20998|29017->21113|29038->21124|29078->21125|29132->21150|29214->21204|29241->21209|29334->21274|29369->21287|29492->21378|29542->21399|29646->21475|29673->21480|30496->22275|30508->22277|30594->22352|30635->22353|30713->22403|30725->22405|31044->22702|31119->22749|31131->22751|31392->22990|31500->23069|31896->23433|31958->23466|32148->23624|32198->23642|32242->23657|32341->23728|32362->23739|32402->23740|32447->23756|33416->24697|33428->24699|33514->24774|33555->24775|33614->24806|33626->24808|33762->24922|33821->24952|33904->25007|33916->25009|34275->25346|34335->25377|34692->25706|34704->25708|34959->25941|35020->25973|35102->26027|35114->26029|35488->26381|35550->26414|36004->26840|36016->26842|36246->27050|36304->27079|36678->27421|36728->27442|36866->27548|36906->27559|37006->27630|37036->27631|37082->27648|37219->27756|37249->27757|37325->27804|37355->27805|37401->27822|37505->27897|37535->27898|37612->27946|37642->27947|37688->27964|37833->28080|37863->28081|37940->28129|37970->28130|38016->28147|38123->28225|38153->28226|38290->28334|38320->28335|38364->28350|38617->28574|38647->28575|38687->28586|38729->28597
                  LINES: 28->1|31->3|33->4|33->4|34->1|36->4|38->6|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|70->38|72->40|72->40|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|80->48|81->49|84->52|84->52|95->63|95->63|95->63|95->63|97->65|97->65|100->68|102->70|102->70|105->73|108->76|113->81|114->82|119->87|120->88|121->89|133->101|133->101|133->101|134->102|134->102|134->102|135->103|136->104|136->104|138->106|138->106|142->110|142->110|142->110|143->111|143->111|143->111|144->112|144->112|146->114|147->115|150->118|150->118|161->129|161->129|161->129|161->129|163->131|163->131|166->134|168->136|168->136|171->139|174->142|179->147|180->148|185->153|186->154|187->155|199->167|199->167|199->167|200->168|200->168|200->168|201->169|202->170|202->170|204->172|204->172|208->176|208->176|208->176|209->177|209->177|209->177|210->178|210->178|212->180|213->181|216->184|216->184|227->195|227->195|227->195|227->195|229->197|229->197|232->200|234->202|234->202|237->205|240->208|245->213|246->214|251->219|252->220|253->221|259->227|259->227|259->227|260->228|260->228|260->228|261->229|262->230|262->230|264->232|264->232|268->236|268->236|268->236|269->237|269->237|269->237|270->238|270->238|272->240|273->241|276->244|276->244|287->255|287->255|287->255|287->255|289->257|289->257|292->260|294->262|294->262|297->265|300->268|305->273|306->274|311->279|312->280|313->281|318->286|318->286|318->286|319->287|319->287|319->287|320->288|321->289|321->289|323->291|323->291|327->295|327->295|327->295|328->296|328->296|328->296|329->297|329->297|331->299|332->300|335->303|335->303|346->314|346->314|346->314|346->314|348->316|348->316|351->319|353->321|353->321|356->324|358->326|363->331|364->332|369->337|370->338|373->341|385->353|385->353|385->353|386->354|386->354|386->354|387->355|388->356|388->356|390->358|390->358|394->362|394->362|394->362|395->363|395->363|395->363|396->364|396->364|398->366|399->367|402->370|402->370|413->381|413->381|413->381|413->381|415->383|415->383|418->386|420->388|420->388|423->391|426->394|431->399|432->400|437->405|438->406|439->407|451->419|451->419|451->419|452->420|452->420|452->420|453->421|454->422|454->422|456->424|456->424|460->428|460->428|460->428|461->429|461->429|461->429|462->430|462->430|464->432|465->433|468->436|468->436|479->447|479->447|479->447|479->447|481->449|481->449|484->452|486->454|486->454|489->457|492->460|497->465|498->466|503->471|504->472|505->473|510->478|510->478|510->478|512->480|528->496|528->496|528->496|528->496|530->498|530->498|531->499|533->501|534->502|534->502|540->508|541->509|546->514|546->514|549->517|551->519|552->520|552->520|558->526|559->527|566->534|566->534|569->537|570->538|579->547|580->548|587->555|588->556|591->559|591->559|592->560|595->563|595->563|597->565|597->565|598->566|600->568|600->568|602->570|602->570|603->571|606->574|606->574|608->576|608->576|609->577|611->579|611->579|616->584|616->584|617->585|620->588|620->588|621->589|622->590
                  -- GENERATED --
              */
          