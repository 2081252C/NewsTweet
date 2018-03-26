
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

object dataAnalytics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[Form[Search],String,Integer,List[String],Double,List[String],Double,List[String],Double,String,String,List[String],List[String],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], user: String, bool: Integer, posTweets: List[String], posSize: Double, negTweets: List[String], negSize: Double, neutTweets: List[String], neutSize: Double, img: String, term: String, personas: List[String], interests: List[String], json: String, wordcloudData: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.298*/("""

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>
<script src="//d3js.org/d3.v3.min.js"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/wordcloud.js")),format.raw/*7.66*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>


"""),_display_(/*11.2*/main("Search Analytics")/*11.26*/(searchForm)/*11.38*/(user)/*11.44*/(bool)/*11.50*/(img)/*11.55*/(personas)/*11.65*/(interests)/*11.76*/{_display_(Seq[Any](format.raw/*11.77*/("""
  """),format.raw/*12.3*/("""<div id="SearchAnalytics" style="display:block;">
  	<h3 id="upper">Search Analytics for "<span class="lite">"""),_display_(/*13.61*/term),format.raw/*13.65*/("""</span>":</h3>
  	<div id="sentiment" style="width:33%; height:400px; display:inline-block; vertical-align:top;">
  		<div id="pie" style="width:100%; height:380px;"">
  		<script>

			Highcharts.chart('pie', """),format.raw/*18.28*/("""{"""),format.raw/*18.29*/("""
			    """),format.raw/*19.8*/("""chart: """),format.raw/*19.15*/("""{"""),format.raw/*19.16*/("""
			        """),format.raw/*20.12*/("""plotBackgroundColor: null,
			        plotBorderWidth: 0,
			        plotShadow: false,
			        type: 'pie'
			    """),format.raw/*24.8*/("""}"""),format.raw/*24.9*/(""",
			    title: """),format.raw/*25.15*/("""{"""),format.raw/*25.16*/("""
			        """),format.raw/*26.12*/("""text: 'Sentiment'
			    """),format.raw/*27.8*/("""}"""),format.raw/*27.9*/(""",
			    tooltip: """),format.raw/*28.17*/("""{"""),format.raw/*28.18*/("""
			        """),format.raw/*29.12*/("""pointFormat: '"""),format.raw/*29.26*/("""{"""),format.raw/*29.27*/("""series.name"""),format.raw/*29.38*/("""}"""),format.raw/*29.39*/(""": <b>"""),format.raw/*29.44*/("""{"""),format.raw/*29.45*/("""point.percentage:.1f"""),format.raw/*29.65*/("""}"""),format.raw/*29.66*/("""%</b>'
			    """),format.raw/*30.8*/("""}"""),format.raw/*30.9*/(""",
			    plotOptions: """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""
			        """),format.raw/*32.12*/("""pie: """),format.raw/*32.17*/("""{"""),format.raw/*32.18*/("""
			            """),format.raw/*33.16*/("""allowPointSelect: true,
			            cursor: 'pointer',
			            point: """),format.raw/*35.23*/("""{"""),format.raw/*35.24*/("""
			                """),format.raw/*36.20*/("""events: """),format.raw/*36.28*/("""{"""),format.raw/*36.29*/("""
			                    """),format.raw/*37.24*/("""click: function () """),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""
			                        """),format.raw/*38.28*/("""location.href = window.location.href + '/' +
			                            this.options.key;
			                    """),format.raw/*40.24*/("""}"""),format.raw/*40.25*/("""
			                """),format.raw/*41.20*/("""}"""),format.raw/*41.21*/("""
			            """),format.raw/*42.16*/("""}"""),format.raw/*42.17*/(""",

			            dataLabels: """),format.raw/*44.28*/("""{"""),format.raw/*44.29*/("""
			                """),format.raw/*45.20*/("""enabled: true,
			                format: '<b>"""),format.raw/*46.32*/("""{"""),format.raw/*46.33*/("""point.name"""),format.raw/*46.43*/("""}"""),format.raw/*46.44*/("""</b>: """),format.raw/*46.50*/("""{"""),format.raw/*46.51*/("""point.percentage:.1f"""),format.raw/*46.71*/("""}"""),format.raw/*46.72*/(""" """),format.raw/*46.73*/("""%',
			                style: """),format.raw/*47.27*/("""{"""),format.raw/*47.28*/("""
			                    """),format.raw/*48.24*/("""color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
			                """),format.raw/*49.20*/("""}"""),format.raw/*49.21*/("""
			            """),format.raw/*50.16*/("""}"""),format.raw/*50.17*/("""
			        """),format.raw/*51.12*/("""}"""),format.raw/*51.13*/("""
			    """),format.raw/*52.8*/("""}"""),format.raw/*52.9*/(""",

			    series: ["""),format.raw/*54.17*/("""{"""),format.raw/*54.18*/("""
			        """),format.raw/*55.12*/("""name: 'Sentiment',
			        colorByPoint: true,
			        data: ["""),format.raw/*57.19*/("""{"""),format.raw/*57.20*/("""
			            """),format.raw/*58.16*/("""name: 'Positive',
			            y: """),_display_(/*59.20*/posSize),format.raw/*59.27*/(""",
			            key: 'positive',
			        """),format.raw/*61.12*/("""}"""),format.raw/*61.13*/(""", """),format.raw/*61.15*/("""{"""),format.raw/*61.16*/("""
			            """),format.raw/*62.16*/("""name: 'Negative',
			            y: """),_display_(/*63.20*/negSize),format.raw/*63.27*/(""",
			            key: 'negative',
			        """),format.raw/*65.12*/("""}"""),format.raw/*65.13*/(""",
			        """),format.raw/*66.12*/("""{"""),format.raw/*66.13*/("""
			            """),format.raw/*67.16*/("""name: 'Neutral',
			            y: """),_display_(/*68.20*/neutSize),format.raw/*68.28*/(""",
			            key: 'neutral',
			        """),format.raw/*70.12*/("""}"""),format.raw/*70.13*/("""]
			    """),format.raw/*71.8*/("""}"""),format.raw/*71.9*/("""]
			"""),format.raw/*72.4*/("""}"""),format.raw/*72.5*/(""");
  		</script>
  	</div>
  	</div>
  	
  	<div id="middle" style="width:33%; height: 400px; display: inline-block;">
  		<p align="center" id="upper">Network <br></p>

  		"""),_display_(/*80.6*/if(json.contains(":[]"))/*80.30*/{_display_(Seq[Any](format.raw/*80.31*/("""
  			"""),format.raw/*81.6*/("""<div align=center style="margin-top:80px"> <br><b>Graph Unavailable</b><br>
  			You have exceeded the Twitter API limit.<br>
  			Please try again in 15 minutes. 
  			<br><br>
  			<h2> <span id="timer">15 : 00</span> </h2> </div>
  		</div>
  		""")))}/*87.7*/else/*87.12*/{_display_(Seq[Any](format.raw/*87.13*/("""

  		"""),format.raw/*89.5*/("""<div id="forcegraph">
  		</div>
		<div class="footer">
			<p id="expand-network" data-toggle="modal" data-target="#expandedNetwork" style="float:right; margin-right:20px; margin-top:10px">
			<img src=""""),_display_(/*93.15*/routes/*93.21*/.Assets.versioned("images/new.png")),format.raw/*93.56*/("""" width="20px" border="0px"></p>
			</div>	
	</div>

	<!-- Modal -->
    <div class="modal fade" id="expandedNetwork" tabindex="-1" role="dialog" aria-labelledby="networkModelLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" style="margin-left:45%;" id="expand-label" id="upper">Top Users Talking About """),_display_(/*102.116*/term),format.raw/*102.120*/("""</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div id="network-body">
                </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
          </div>
        </div>
      </div>
    </div>
    	""")))}),format.raw/*117.7*/("""

	"""),format.raw/*119.2*/("""<div id="wordcloud" style="width:33%; height: 400px; display:inline-block; vertical-align:top">
		<p align="center" id="upper">Related Terms</p>
		<script>
	var wordcloudData = '"""),_display_(/*122.24*/wordcloudData),format.raw/*122.37*/("""'.replace(/&quot;/g, "\"");

    var frequency_list = JSON.parse(wordcloudData); 

    var color = d3.scale.linear()
            .domain([0,1,2,3,4,5,6,10,15,20,100])
            .range(["#ddd", "#ccc", "#bbb", "#aaa", "#999", "#888", "#777", "#666", "#555", "#444", "#333", "#222"]);
    d3.layout.cloud().size([320, 340])
            .words(frequency_list)
            .rotate(0)
            .fontSize(function(d) """),format.raw/*132.35*/("""{"""),format.raw/*132.36*/(""" """),format.raw/*132.37*/("""return d.size*10; """),format.raw/*132.55*/("""}"""),format.raw/*132.56*/(""")
            .on("end", draw)
            .start();
    function draw(words) """),format.raw/*135.26*/("""{"""),format.raw/*135.27*/("""
        """),format.raw/*136.9*/("""d3.select("#wordcloud").append("svg")
                .attr("width", 330)
                .attr("height", 350)
                .attr("class", "wordcloud")
                .append("g")
                // without the transform, words words would get cutoff to the left and top, they would
                // appear outside of the SVG area
                .attr("transform", "translate(160,200)")
                .selectAll("text")
                .data(words)
                .enter().append("text")
                .style("font-size", function(d) """),format.raw/*147.49*/("""{"""),format.raw/*147.50*/(""" """),format.raw/*147.51*/("""return d.size + "px"; """),format.raw/*147.73*/("""}"""),format.raw/*147.74*/(""")
                .style("fill", function(d, i) """),format.raw/*148.47*/("""{"""),format.raw/*148.48*/(""" """),format.raw/*148.49*/("""return color(i); """),format.raw/*148.66*/("""}"""),format.raw/*148.67*/(""")
                .attr("transform", function(d) """),format.raw/*149.48*/("""{"""),format.raw/*149.49*/("""
                    """),format.raw/*150.21*/("""return "translate(" + [d.x, d.y] + ")rotate(" + d.rotate + ")";
                """),format.raw/*151.17*/("""}"""),format.raw/*151.18*/(""")
                .on('click', function (d) """),format.raw/*152.43*/("""{"""),format.raw/*152.44*/("""
                	  """),format.raw/*153.20*/("""d.text = d.text.replace("#", "%23");
			          window.open("http://localhost:9000/search?searchTerm="+d.text+"&searchType=Content","_blank");
			        """),format.raw/*155.12*/("""}"""),format.raw/*155.13*/(""")
                .text(function(d) """),format.raw/*156.35*/("""{"""),format.raw/*156.36*/(""" """),format.raw/*156.37*/("""return d.text; """),format.raw/*156.52*/("""}"""),format.raw/*156.53*/(""");
    """),format.raw/*157.5*/("""}"""),format.raw/*157.6*/("""
"""),format.raw/*158.1*/("""</script>
	</div>
  	</div>
    <script>
		
					// some colour variables
					  var tcBlack = "#130C0E";

					var datajson = '"""),_display_(/*166.23*/json),format.raw/*166.27*/("""'.replace(/&quot;/g, "\"");

				    datajson = jQuery.parseJSON(datajson);

					// rest of vars
					var w0 = 700,
					    h0 = 600,
					    w1 = 400,
					    h1 = 300,
					    maxNodeSize = 50,
					    x_browser = 20,
					    y_browser = 25,
					    root0=datajson,
					    root1=datajson;
					 

					root0.fixed = true;
					root1.fixed = true;
		   
					var vis0;
					var force0 = d3.layout.force(); 

					var vis1;
					var force1 = d3.layout.force(); 

					vis0 = d3.select("#network-body").append("svg").attr("width", w0).attr("height", h0);
					vis1 = d3.select("#forcegraph").append("svg").attr("width", w1).attr("height", h1);

					root0.x = w0/2;
		            root0.y = h0/2;

		            root1.x = w1/2;
		            root1.y = h1/2;
				 
				 
				        // Build the path
				    var defs0 = vis0.insert("svg:defs")
				      .data(["end"]);

			      	var defs1 = vis1.insert("svg:defs")
			      	  .data(["end"]);

				 
				 
				    defs0.enter().append("svg:path")
				      .attr("d", "M0,-5L10,0L0,5");

				    defs1.enter().append("svg:path")
				      .attr("d", "M0,-5L10,0L0,5");

                 	console.log(""""),_display_(/*216.33*/json),format.raw/*216.37*/("""");

                 	update(root0, w0, h0, vis0, force0);
				    update(root1, w1, h1, vis1, force1);
                 	
                 	root0.children.forEach(click);

				     

					/**
					 *   
					 */
					function update(root, w, h, vis, force) """),format.raw/*228.46*/("""{"""),format.raw/*228.47*/("""
					  """),format.raw/*229.8*/("""var nodes = flatten(root),
					      links = d3.layout.tree().links(nodes);
					 
					  // Restart the force layout.
					  force.nodes(nodes)
					        .links(links)
					        .gravity(0.05)
					    .charge(-1500)
					    .linkDistance(100)
					    .friction(0.5)
					    .linkStrength(function(l, i) """),format.raw/*239.39*/("""{"""),format.raw/*239.40*/("""return 1; """),format.raw/*239.50*/("""}"""),format.raw/*239.51*/(""")
					    .size([w, h])
					    .on("tick", tick)
					        .start();
					 
					   var path = vis.selectAll("path.link")
					      .data(links, function(d) """),format.raw/*245.37*/("""{"""),format.raw/*245.38*/(""" """),format.raw/*245.39*/("""return d.target.id; """),format.raw/*245.59*/("""}"""),format.raw/*245.60*/(""");
					 
					    path.enter().insert("svg:path")
					      .attr("class", "link")
					      // .attr("marker-end", "url(#end)")
					      .style("stroke", "#eee")
					      .style("stroke-width", "2px")
					      .style("fill", "none");
					 
					 
					  // Exit any old paths.
					  path.exit().remove();
					 
					 
					 
					  // Update the nodes…
					  var node = vis.selectAll("g.node")
					      .data(nodes, function(d) """),format.raw/*262.37*/("""{"""),format.raw/*262.38*/(""" """),format.raw/*262.39*/("""return d.id; """),format.raw/*262.52*/("""}"""),format.raw/*262.53*/(""");
					 
					 
					  // Enter any new nodes.
					  var nodeEnter = node.enter().append("svg:g")
					      .attr("class", "node")
					      .attr("transform", function(d) """),format.raw/*268.43*/("""{"""),format.raw/*268.44*/(""" """),format.raw/*268.45*/("""return "translate(" + d.x + "," + d.y + ")"; """),format.raw/*268.90*/("""}"""),format.raw/*268.91*/(""")
					      .on("click", click)
					      .call(force.drag);
					 
					  // Append a circle
					  nodeEnter.append("svg:circle")
					      .attr("r", function(d) """),format.raw/*274.35*/("""{"""),format.raw/*274.36*/(""" """),format.raw/*274.37*/("""return Math.sqrt(d.size) / 10 || 4.5; """),format.raw/*274.75*/("""}"""),format.raw/*274.76*/(""")
					      .style("fill", "#eee");

					   nodeEnter.append("clipPath")
					    .attr("id", "clipCircle")
					  	.append("circle")
					  	.attr("id", "cp")
					    .attr("r", 25)
					    .attr("cx", 0)
					    .attr("cy", 0);
					 
					   
					  // Append images
					  var images = nodeEnter.append("svg:image")
					        .attr("xlink:href",  function(d) """),format.raw/*288.47*/("""{"""),format.raw/*288.48*/(""" """),format.raw/*288.49*/("""return d.img;"""),format.raw/*288.62*/("""}"""),format.raw/*288.63*/(""")
					        .attr("x", function(d) """),format.raw/*289.37*/("""{"""),format.raw/*289.38*/(""" """),format.raw/*289.39*/("""return -25;"""),format.raw/*289.50*/("""}"""),format.raw/*289.51*/(""")
					        .attr("y", function(d) """),format.raw/*290.37*/("""{"""),format.raw/*290.38*/(""" """),format.raw/*290.39*/("""return -25;"""),format.raw/*290.50*/("""}"""),format.raw/*290.51*/(""")
					        .attr("height", 50)
					        .attr("width", 50)
					        .attr("clip-path", "url(#clipCircle)");
					  
					  // make the image grow a little on mouse over and add the text details on click
					  var setEvents = images
					          // Append hero text
					          .on( 'click', function (d) """),format.raw/*298.43*/("""{"""),format.raw/*298.44*/("""
					          	  """),format.raw/*299.19*/("""if(d.name!=null)"""),format.raw/*299.35*/("""{"""),format.raw/*299.36*/("""
					          	  	"""),format.raw/*300.20*/("""//window.open(d.link,"_blank");
					          	  """),format.raw/*301.19*/("""}"""),format.raw/*301.20*/("""

					              """),format.raw/*303.20*/("""}"""),format.raw/*303.21*/(""")

					          .on( 'mouseenter', function() """),format.raw/*305.46*/("""{"""),format.raw/*305.47*/("""
					            """),format.raw/*306.18*/("""// select element in current context
					            d3.select( this )
					              .transition()
					              .attr("x", function(d) """),format.raw/*309.43*/("""{"""),format.raw/*309.44*/(""" """),format.raw/*309.45*/("""return -60;"""),format.raw/*309.56*/("""}"""),format.raw/*309.57*/(""")
					              .attr("y", function(d) """),format.raw/*310.43*/("""{"""),format.raw/*310.44*/(""" """),format.raw/*310.45*/("""return -60;"""),format.raw/*310.56*/("""}"""),format.raw/*310.57*/(""")
					              .attr("height", 100)
					              .attr("width", 100);
					          """),format.raw/*313.16*/("""}"""),format.raw/*313.17*/(""")
					          // set back
					          .on( 'mouseleave', function() """),format.raw/*315.46*/("""{"""),format.raw/*315.47*/("""
					            """),format.raw/*316.18*/("""d3.select( this )
					              .transition()
					              .attr("x", function(d) """),format.raw/*318.43*/("""{"""),format.raw/*318.44*/(""" """),format.raw/*318.45*/("""return -25;"""),format.raw/*318.56*/("""}"""),format.raw/*318.57*/(""")
					              .attr("y", function(d) """),format.raw/*319.43*/("""{"""),format.raw/*319.44*/(""" """),format.raw/*319.45*/("""return -25;"""),format.raw/*319.56*/("""}"""),format.raw/*319.57*/(""")
					              .attr("height", 50)
					              .attr("width", 50);
					          """),format.raw/*322.16*/("""}"""),format.raw/*322.17*/(""");

					  // Append hero name on roll over next to the node as well
					  var names = nodeEnter.append("text")
					      .attr("class", "nodetext")
					      .attr("x", x_browser)
					      .attr("y", y_browser +15)
					      .attr("fill", tcBlack)
					      .text(function(d) """),format.raw/*330.30*/("""{"""),format.raw/*330.31*/(""" 
					      	"""),format.raw/*331.13*/("""if(d.name!="undefined")
					      		return d.name;
					      	
					      	else
					      		return ""; """),format.raw/*335.25*/("""}"""),format.raw/*335.26*/(""");

					   var set = names
					          .on( 'click', function (d) """),format.raw/*338.43*/("""{"""),format.raw/*338.44*/("""
					          	 """),format.raw/*339.18*/("""window.location = d.link;
					              """),format.raw/*340.20*/("""}"""),format.raw/*340.21*/(""")
					 
					 nodeEnter.append("text")
					      .attr("class", "nodetext")
					      .attr("x", x_browser)
					      .attr("y", y_browser +30)
					      .attr("fill", tcBlack)
					      .text(function(d) """),format.raw/*347.30*/("""{"""),format.raw/*347.31*/(""" 
					      	"""),format.raw/*348.13*/("""if(d.followers!=undefined)
					      		return "Follower Count: " + d.followers;
					      	else
					      		return ""; """),format.raw/*351.25*/("""}"""),format.raw/*351.26*/(""");
					 
					  // Exit any old nodes.
					  node.exit().remove();
					 
					 
					  // Re-select for update.
					  path = vis.selectAll("path.link");
					  node = vis.selectAll("g.node");
					 
					function tick() """),format.raw/*361.22*/("""{"""),format.raw/*361.23*/("""
					 
					 
					    """),format.raw/*364.10*/("""path.attr("d", function(d) """),format.raw/*364.37*/("""{"""),format.raw/*364.38*/("""
					 
					     """),format.raw/*366.11*/("""var dx = d.target.x - d.source.x,
					           dy = d.target.y - d.source.y,
					           dr = Math.sqrt(dx * dx + dy * dy);
					           return   "M" + d.source.x + "," 
					            + d.source.y 
					            + "A" + dr + "," 
					            + dr + " 0 0,1 " 
					            + d.target.x + "," 
					            + d.target.y;
					  """),format.raw/*375.8*/("""}"""),format.raw/*375.9*/(""");
					    node.attr("transform", nodeTransform);    
					  """),format.raw/*377.8*/("""}"""),format.raw/*377.9*/("""
					"""),format.raw/*378.6*/("""}"""),format.raw/*378.7*/("""

					 
					"""),format.raw/*381.6*/("""/**
					 * Gives the coordinates of the border for keeping the nodes inside a frame
					 * http://bl.ocks.org/mbostock/1129492
					 */ 
					function nodeTransform(d) """),format.raw/*385.32*/("""{"""),format.raw/*385.33*/("""
					  """),format.raw/*386.8*/("""d.x =  Math.max(maxNodeSize, Math.min(w0 - (d.imgwidth/2 || 16), d.x));
					    d.y =  Math.max(maxNodeSize, Math.min(h0 - (d.imgheight/2 || 16), d.y));
					    return "translate(" + d.x + "," + d.y + ")";
					   """),format.raw/*389.9*/("""}"""),format.raw/*389.10*/("""
					 
					"""),format.raw/*391.6*/("""/**
					 * Toggle children on click.
					 */ 
					function click(d) """),format.raw/*394.24*/("""{"""),format.raw/*394.25*/("""
					  """),format.raw/*395.8*/("""if (d.children) """),format.raw/*395.24*/("""{"""),format.raw/*395.25*/("""
					    """),format.raw/*396.10*/("""d._children = d.children;
					    d.children = null;
					  """),format.raw/*398.8*/("""}"""),format.raw/*398.9*/(""" """),format.raw/*398.10*/("""else """),format.raw/*398.15*/("""{"""),format.raw/*398.16*/("""
					    """),format.raw/*399.10*/("""d.children = d._children;
					    d._children = null;
					  """),format.raw/*401.8*/("""}"""),format.raw/*401.9*/("""
					 
					  """),format.raw/*403.8*/("""update(root0, w0, h0, vis0, force0);
				      update(root1, w1, h1, vis1, force1);
					"""),format.raw/*405.6*/("""}"""),format.raw/*405.7*/("""

					"""),format.raw/*407.6*/("""/**
					 * Returns a list of all nodes under the root.
					 */ 
					function flatten(root) """),format.raw/*410.29*/("""{"""),format.raw/*410.30*/("""
					  """),format.raw/*411.8*/("""var nodes = []; 
					  var i = 0;
					 
					  function recurse(node) """),format.raw/*414.31*/("""{"""),format.raw/*414.32*/("""
					    """),format.raw/*415.10*/("""if (node.children) 
					      node.children.forEach(recurse);
					    if (!node.id) 
					      node.id = ++i;
					    nodes.push(node);
					  """),format.raw/*420.8*/("""}"""),format.raw/*420.9*/("""
					 
					  """),format.raw/*422.8*/("""recurse(root);
					  return nodes;
					"""),format.raw/*424.6*/("""}"""),format.raw/*424.7*/(""" 


   """),format.raw/*427.4*/("""window.onload = function()"""),format.raw/*427.30*/("""{"""),format.raw/*427.31*/("""
     """),format.raw/*428.6*/("""var hou = 14;
     var sec = 59;
     var seconds = 59;
     setInterval(function()"""),format.raw/*431.28*/("""{"""),format.raw/*431.29*/("""

       """),format.raw/*433.8*/("""document.getElementById("timer").innerHTML = hou +" : " + seconds ;
       sec--;
       if(sec == 00)
       """),format.raw/*436.8*/("""{"""),format.raw/*436.9*/("""
         """),format.raw/*437.10*/("""hou--;
         sec = 59;
         if (hou == 0)
         """),format.raw/*440.10*/("""{"""),format.raw/*440.11*/("""
            """),format.raw/*441.13*/("""hou = 15;
         """),format.raw/*442.10*/("""}"""),format.raw/*442.11*/("""
       """),format.raw/*443.8*/("""}"""),format.raw/*443.9*/("""
       """),format.raw/*444.8*/("""if(sec<10)"""),format.raw/*444.18*/("""{"""),format.raw/*444.19*/("""
       	"""),format.raw/*445.9*/("""seconds = '0'+sec;
       """),format.raw/*446.8*/("""}"""),format.raw/*446.9*/("""else"""),format.raw/*446.13*/("""{"""),format.raw/*446.14*/("""
	    """),format.raw/*447.6*/("""seconds = sec;
		"""),format.raw/*448.3*/("""}"""),format.raw/*448.4*/("""

      """),format.raw/*450.7*/("""}"""),format.raw/*450.8*/(""",1000);
    """),format.raw/*451.5*/("""}"""),format.raw/*451.6*/("""
					  
	 """),format.raw/*453.3*/("""</script>
""")))}),format.raw/*454.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],user:String,bool:Integer,posTweets:List[String],posSize:Double,negTweets:List[String],negSize:Double,neutTweets:List[String],neutSize:Double,img:String,term:String,personas:List[String],interests:List[String],json:String,wordcloudData:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,user,bool,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,img,term,personas,interests,json,wordcloudData)

  def f:((Form[Search],String,Integer,List[String],Double,List[String],Double,List[String],Double,String,String,List[String],List[String],String,String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,user,bool,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,img,term,personas,interests,json,wordcloudData) => apply(searchForm,user,bool,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,img,term,personas,interests,json,wordcloudData)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 18 13:47:56 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: 53529bb6bcd72b23f18c8bc68921ac70246af64c
                  MATRIX: 1092->1|1484->297|1512->299|1708->469|1722->475|1784->517|1908->615|1922->621|1987->666|2118->771|2151->795|2172->807|2187->813|2202->819|2216->824|2235->834|2255->845|2294->846|2324->849|2461->959|2486->963|2723->1172|2752->1173|2787->1181|2822->1188|2851->1189|2891->1201|3036->1319|3064->1320|3108->1336|3137->1337|3177->1349|3229->1374|3257->1375|3303->1393|3332->1394|3372->1406|3414->1420|3443->1421|3482->1432|3511->1433|3544->1438|3573->1439|3621->1459|3650->1460|3691->1474|3719->1475|3769->1497|3798->1498|3838->1510|3871->1515|3900->1516|3944->1532|4052->1612|4081->1613|4129->1633|4165->1641|4194->1642|4246->1666|4293->1685|4322->1686|4378->1714|4523->1831|4552->1832|4600->1852|4629->1853|4673->1869|4702->1870|4760->1900|4789->1901|4837->1921|4911->1967|4940->1968|4978->1978|5007->1979|5041->1985|5070->1986|5118->2006|5147->2007|5176->2008|5234->2038|5263->2039|5315->2063|5437->2157|5466->2158|5510->2174|5539->2175|5579->2187|5608->2188|5643->2196|5671->2197|5718->2216|5747->2217|5787->2229|5883->2297|5912->2298|5956->2314|6020->2351|6048->2358|6121->2403|6150->2404|6180->2406|6209->2407|6253->2423|6317->2460|6345->2467|6418->2512|6447->2513|6488->2526|6517->2527|6561->2543|6624->2579|6653->2587|6725->2631|6754->2632|6790->2641|6818->2642|6850->2647|6878->2648|7079->2823|7112->2847|7151->2848|7184->2854|7451->3104|7464->3109|7503->3110|7536->3116|7767->3320|7782->3326|7838->3361|8315->3809|8342->3813|8867->4307|8898->4310|9105->4489|9140->4502|9585->4918|9615->4919|9645->4920|9692->4938|9722->4939|9829->5017|9859->5018|9896->5027|10471->5573|10501->5574|10531->5575|10582->5597|10612->5598|10689->5646|10719->5647|10749->5648|10795->5665|10825->5666|10903->5715|10933->5716|10983->5737|11092->5817|11122->5818|11195->5862|11225->5863|11274->5883|11459->6039|11489->6040|11554->6076|11584->6077|11614->6078|11658->6093|11688->6094|11723->6101|11752->6102|11781->6103|11938->6232|11964->6236|13154->7398|13180->7402|13468->7661|13498->7662|13534->7670|13878->7985|13908->7986|13947->7996|13977->7997|14170->8161|14200->8162|14230->8163|14279->8183|14309->8184|14782->8628|14812->8629|14842->8630|14884->8643|14914->8644|15119->8820|15149->8821|15179->8822|15253->8867|15283->8868|15480->9036|15510->9037|15540->9038|15607->9076|15637->9077|16037->9448|16067->9449|16097->9450|16139->9463|16169->9464|16236->9502|16266->9503|16296->9504|16336->9515|16366->9516|16433->9554|16463->9555|16493->9556|16533->9567|16563->9568|16914->9890|16944->9891|16992->9910|17037->9926|17067->9927|17116->9947|17195->9997|17225->9998|17275->10019|17305->10020|17382->10068|17412->10069|17459->10087|17635->10234|17665->10235|17695->10236|17735->10247|17765->10248|17838->10292|17868->10293|17898->10294|17938->10305|17968->10306|18094->10403|18124->10404|18227->10478|18257->10479|18304->10497|18426->10590|18456->10591|18486->10592|18526->10603|18556->10604|18629->10648|18659->10649|18689->10650|18729->10661|18759->10662|18883->10757|18913->10758|19226->11042|19256->11043|19299->11057|19434->11163|19464->11164|19563->11234|19593->11235|19640->11253|19714->11298|19744->11299|19984->11510|20014->11511|20057->11525|20208->11647|20238->11648|20491->11872|20521->11873|20574->11897|20630->11924|20660->11925|20707->11943|21091->12299|21120->12300|21210->12362|21239->12363|21273->12369|21302->12370|21344->12384|21543->12554|21573->12555|21609->12563|21853->12779|21883->12780|21924->12793|22024->12864|22054->12865|22090->12873|22135->12889|22165->12890|22204->12900|22293->12961|22322->12962|22352->12963|22386->12968|22416->12969|22455->12979|22545->13041|22574->13042|22617->13057|22734->13146|22763->13147|22798->13154|22921->13248|22951->13249|22987->13257|23088->13329|23118->13330|23157->13340|23332->13487|23361->13488|23404->13503|23473->13544|23502->13545|23537->13552|23592->13578|23622->13579|23656->13585|23768->13668|23798->13669|23835->13678|23973->13788|24002->13789|24041->13799|24128->13857|24158->13858|24200->13871|24248->13890|24278->13891|24314->13899|24343->13900|24379->13908|24418->13918|24448->13919|24485->13928|24539->13954|24568->13955|24601->13959|24631->13960|24665->13966|24710->13983|24739->13984|24775->13992|24804->13993|24844->14005|24873->14006|24912->14017|24954->14028
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|45->13|45->13|50->18|50->18|51->19|51->19|51->19|52->20|56->24|56->24|57->25|57->25|58->26|59->27|59->27|60->28|60->28|61->29|61->29|61->29|61->29|61->29|61->29|61->29|61->29|61->29|62->30|62->30|63->31|63->31|64->32|64->32|64->32|65->33|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|72->40|72->40|73->41|73->41|74->42|74->42|76->44|76->44|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|78->46|78->46|79->47|79->47|80->48|81->49|81->49|82->50|82->50|83->51|83->51|84->52|84->52|86->54|86->54|87->55|89->57|89->57|90->58|91->59|91->59|93->61|93->61|93->61|93->61|94->62|95->63|95->63|97->65|97->65|98->66|98->66|99->67|100->68|100->68|102->70|102->70|103->71|103->71|104->72|104->72|112->80|112->80|112->80|113->81|119->87|119->87|119->87|121->89|125->93|125->93|125->93|134->102|134->102|149->117|151->119|154->122|154->122|164->132|164->132|164->132|164->132|164->132|167->135|167->135|168->136|179->147|179->147|179->147|179->147|179->147|180->148|180->148|180->148|180->148|180->148|181->149|181->149|182->150|183->151|183->151|184->152|184->152|185->153|187->155|187->155|188->156|188->156|188->156|188->156|188->156|189->157|189->157|190->158|198->166|198->166|248->216|248->216|260->228|260->228|261->229|271->239|271->239|271->239|271->239|277->245|277->245|277->245|277->245|277->245|294->262|294->262|294->262|294->262|294->262|300->268|300->268|300->268|300->268|300->268|306->274|306->274|306->274|306->274|306->274|320->288|320->288|320->288|320->288|320->288|321->289|321->289|321->289|321->289|321->289|322->290|322->290|322->290|322->290|322->290|330->298|330->298|331->299|331->299|331->299|332->300|333->301|333->301|335->303|335->303|337->305|337->305|338->306|341->309|341->309|341->309|341->309|341->309|342->310|342->310|342->310|342->310|342->310|345->313|345->313|347->315|347->315|348->316|350->318|350->318|350->318|350->318|350->318|351->319|351->319|351->319|351->319|351->319|354->322|354->322|362->330|362->330|363->331|367->335|367->335|370->338|370->338|371->339|372->340|372->340|379->347|379->347|380->348|383->351|383->351|393->361|393->361|396->364|396->364|396->364|398->366|407->375|407->375|409->377|409->377|410->378|410->378|413->381|417->385|417->385|418->386|421->389|421->389|423->391|426->394|426->394|427->395|427->395|427->395|428->396|430->398|430->398|430->398|430->398|430->398|431->399|433->401|433->401|435->403|437->405|437->405|439->407|442->410|442->410|443->411|446->414|446->414|447->415|452->420|452->420|454->422|456->424|456->424|459->427|459->427|459->427|460->428|463->431|463->431|465->433|468->436|468->436|469->437|472->440|472->440|473->441|474->442|474->442|475->443|475->443|476->444|476->444|476->444|477->445|478->446|478->446|478->446|478->446|479->447|480->448|480->448|482->450|482->450|483->451|483->451|485->453|486->454
                  -- GENERATED --
              */
          