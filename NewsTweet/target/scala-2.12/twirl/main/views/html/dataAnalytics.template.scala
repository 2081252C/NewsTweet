
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

"""),format.raw/*3.1*/("""<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>
<script src="//d3js.org/d3.v3.min.js"></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("javascripts/wordcloud.js")),format.raw/*9.66*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>


"""),_display_(/*13.2*/main("Search Analytics")/*13.26*/(searchForm)/*13.38*/(user)/*13.44*/(bool)/*13.50*/(img)/*13.55*/(personas)/*13.65*/(interests)/*13.76*/{_display_(Seq[Any](format.raw/*13.77*/("""
  """),format.raw/*14.3*/("""<div id="Search Analytics" style="display:block;">
  	<h3 id="upper">Search Analytics for "<span class="lite">"""),_display_(/*15.61*/term),format.raw/*15.65*/("""</span>":</h3>
  	<div id="sentiment" style="width:33%; height:400px; display:inline-block; vertical-align:top;">
  		<div id="pie" style="width:100%; height:380px;"">
  		<script>

			Highcharts.chart('pie', """),format.raw/*20.28*/("""{"""),format.raw/*20.29*/("""
			    """),format.raw/*21.8*/("""chart: """),format.raw/*21.15*/("""{"""),format.raw/*21.16*/("""
			        """),format.raw/*22.12*/("""plotBackgroundColor: null,
			        plotBorderWidth: 0,
			        plotShadow: false,
			        type: 'pie'
			    """),format.raw/*26.8*/("""}"""),format.raw/*26.9*/(""",
			    title: """),format.raw/*27.15*/("""{"""),format.raw/*27.16*/("""
			        """),format.raw/*28.12*/("""text: 'Sentiment'
			    """),format.raw/*29.8*/("""}"""),format.raw/*29.9*/(""",
			    tooltip: """),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
			        """),format.raw/*31.12*/("""pointFormat: '"""),format.raw/*31.26*/("""{"""),format.raw/*31.27*/("""series.name"""),format.raw/*31.38*/("""}"""),format.raw/*31.39*/(""": <b>"""),format.raw/*31.44*/("""{"""),format.raw/*31.45*/("""point.percentage:.1f"""),format.raw/*31.65*/("""}"""),format.raw/*31.66*/("""%</b>'
			    """),format.raw/*32.8*/("""}"""),format.raw/*32.9*/(""",
			    plotOptions: """),format.raw/*33.21*/("""{"""),format.raw/*33.22*/("""
			        """),format.raw/*34.12*/("""pie: """),format.raw/*34.17*/("""{"""),format.raw/*34.18*/("""
			            """),format.raw/*35.16*/("""allowPointSelect: true,
			            cursor: 'pointer',
			            point: """),format.raw/*37.23*/("""{"""),format.raw/*37.24*/("""
			                """),format.raw/*38.20*/("""events: """),format.raw/*38.28*/("""{"""),format.raw/*38.29*/("""
			                    """),format.raw/*39.24*/("""click: function () """),format.raw/*39.43*/("""{"""),format.raw/*39.44*/("""
			                        """),format.raw/*40.28*/("""location.href = window.location.href + '/' +
			                            this.options.key;
			                    """),format.raw/*42.24*/("""}"""),format.raw/*42.25*/("""
			                """),format.raw/*43.20*/("""}"""),format.raw/*43.21*/("""
			            """),format.raw/*44.16*/("""}"""),format.raw/*44.17*/(""",

			            dataLabels: """),format.raw/*46.28*/("""{"""),format.raw/*46.29*/("""
			                """),format.raw/*47.20*/("""enabled: true,
			                format: '<b>"""),format.raw/*48.32*/("""{"""),format.raw/*48.33*/("""point.name"""),format.raw/*48.43*/("""}"""),format.raw/*48.44*/("""</b>: """),format.raw/*48.50*/("""{"""),format.raw/*48.51*/("""point.percentage:.1f"""),format.raw/*48.71*/("""}"""),format.raw/*48.72*/(""" """),format.raw/*48.73*/("""%',
			                style: """),format.raw/*49.27*/("""{"""),format.raw/*49.28*/("""
			                    """),format.raw/*50.24*/("""color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
			                """),format.raw/*51.20*/("""}"""),format.raw/*51.21*/("""
			            """),format.raw/*52.16*/("""}"""),format.raw/*52.17*/("""
			        """),format.raw/*53.12*/("""}"""),format.raw/*53.13*/("""
			    """),format.raw/*54.8*/("""}"""),format.raw/*54.9*/(""",

			    series: ["""),format.raw/*56.17*/("""{"""),format.raw/*56.18*/("""
			        """),format.raw/*57.12*/("""name: 'Sentiment',
			        colorByPoint: true,
			        data: ["""),format.raw/*59.19*/("""{"""),format.raw/*59.20*/("""
			            """),format.raw/*60.16*/("""name: 'Positive',
			            y: """),_display_(/*61.20*/posSize),format.raw/*61.27*/(""",
			            key: 'positive',
			        """),format.raw/*63.12*/("""}"""),format.raw/*63.13*/(""", """),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""
			            """),format.raw/*64.16*/("""name: 'Negative',
			            y: """),_display_(/*65.20*/negSize),format.raw/*65.27*/(""",
			            key: 'negative',
			        """),format.raw/*67.12*/("""}"""),format.raw/*67.13*/(""",
			        """),format.raw/*68.12*/("""{"""),format.raw/*68.13*/("""
			            """),format.raw/*69.16*/("""name: 'Neutral',
			            y: """),_display_(/*70.20*/neutSize),format.raw/*70.28*/(""",
			            key: 'neutral',
			        """),format.raw/*72.12*/("""}"""),format.raw/*72.13*/("""]
			    """),format.raw/*73.8*/("""}"""),format.raw/*73.9*/("""]
			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/(""");
  		</script>
  	</div>
  	</div>
  	
  	<div id="middle" style="width:33%; height: 400px; display: inline-block;">
  		<p align="center" id="upper">Network <br></p>

  		"""),_display_(/*82.6*/if(json.contains(":[]"))/*82.30*/{_display_(Seq[Any](format.raw/*82.31*/("""
  			"""),format.raw/*83.6*/("""<div align=center style="margin-top:80px"> <br><b>Graph Unavailable</b><br>
  			You have exceeded the Twitter API limit.<br>
  			Please try again in 15 minutes. 
  			<br><br>
  			<h2> <span id="timer">15 : 00</span> </h2> </div>
  		</div>
  		""")))}/*89.7*/else/*89.12*/{_display_(Seq[Any](format.raw/*89.13*/("""

  		"""),format.raw/*91.5*/("""<div id="forcegraph">
  		</div>
		<div class="footer">
			<p id="expand-network" data-toggle="modal" data-target="#expandedNetwork" style="float:right; margin-right:20px; margin-top:10px">
			<img src=""""),_display_(/*95.15*/routes/*95.21*/.Assets.versioned("images/new.png")),format.raw/*95.56*/("""" width="20px" border="0px"></p>
			</div>	
	</div>

	<!-- Modal -->
    <div class="modal fade" id="expandedNetwork" tabindex="-1" role="dialog" aria-labelledby="networkModelLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" style="margin-left:45%;" id="expand-label" id="upper">Top Users Talking About """),_display_(/*104.116*/term),format.raw/*104.120*/("""</h5>
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
    	""")))}),format.raw/*119.7*/("""

	"""),format.raw/*121.2*/("""<div id="wordcloud" style="width:33%; height: 400px; display:inline-block; vertical-align:top">
		<p align="center" id="upper">Related Terms</p>
		<script>
	var wordcloudData = '"""),_display_(/*124.24*/wordcloudData),format.raw/*124.37*/("""'.replace(/&quot;/g, "\"");

    var frequency_list = JSON.parse(wordcloudData); 

    var color = d3.scale.linear()
            .domain([0,1,2,3,4,5,6,10,15,20,100])
            .range(["#ddd", "#ccc", "#bbb", "#aaa", "#999", "#888", "#777", "#666", "#555", "#444", "#333", "#222"]);
    d3.layout.cloud().size([330, 380])
            .words(frequency_list)
            .rotate(0)
            .fontSize(function(d) """),format.raw/*134.35*/("""{"""),format.raw/*134.36*/(""" """),format.raw/*134.37*/("""return d.size*10; """),format.raw/*134.55*/("""}"""),format.raw/*134.56*/(""")
            .on("end", draw)
            .start();
    function draw(words) """),format.raw/*137.26*/("""{"""),format.raw/*137.27*/("""
        """),format.raw/*138.9*/("""d3.select("#wordcloud").append("svg")
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
                .style("font-size", function(d) """),format.raw/*149.49*/("""{"""),format.raw/*149.50*/(""" """),format.raw/*149.51*/("""return d.size + "px"; """),format.raw/*149.73*/("""}"""),format.raw/*149.74*/(""")
                .style("fill", function(d, i) """),format.raw/*150.47*/("""{"""),format.raw/*150.48*/(""" """),format.raw/*150.49*/("""return color(i); """),format.raw/*150.66*/("""}"""),format.raw/*150.67*/(""")
                .attr("transform", function(d) """),format.raw/*151.48*/("""{"""),format.raw/*151.49*/("""
                    """),format.raw/*152.21*/("""return "translate(" + [d.x, d.y] + ")rotate(" + d.rotate + ")";
                """),format.raw/*153.17*/("""}"""),format.raw/*153.18*/(""")
                .on('click', function (d) """),format.raw/*154.43*/("""{"""),format.raw/*154.44*/("""
                	  """),format.raw/*155.20*/("""d.text = d.text.replace("#", "%23");
			          window.open("http://localhost:9000/search?searchTerm="+d.text+"&searchType=Content","_blank");
			        """),format.raw/*157.12*/("""}"""),format.raw/*157.13*/(""")
                .text(function(d) """),format.raw/*158.35*/("""{"""),format.raw/*158.36*/(""" """),format.raw/*158.37*/("""return d.text; """),format.raw/*158.52*/("""}"""),format.raw/*158.53*/(""");
    """),format.raw/*159.5*/("""}"""),format.raw/*159.6*/("""
"""),format.raw/*160.1*/("""</script>
	</div>
  	</div>
    <script>
		
					// some colour variables
					  var tcBlack = "#130C0E";

					var datajson = '"""),_display_(/*168.23*/json),format.raw/*168.27*/("""'.replace(/&quot;/g, "\"");

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

                 	console.log(""""),_display_(/*218.33*/json),format.raw/*218.37*/("""");

                 	update(root0, w0, h0, vis0, force0);
				    update(root1, w1, h1, vis1, force1);
                 	
                 	root0.children.forEach(click);

				     

					/**
					 *   
					 */
					function update(root, w, h, vis, force) """),format.raw/*230.46*/("""{"""),format.raw/*230.47*/("""
					  """),format.raw/*231.8*/("""var nodes = flatten(root),
					      links = d3.layout.tree().links(nodes);
					 
					  // Restart the force layout.
					  force.nodes(nodes)
					        .links(links)
					        .gravity(0.05)
					    .charge(-1500)
					    .linkDistance(100)
					    .friction(0.5)
					    .linkStrength(function(l, i) """),format.raw/*241.39*/("""{"""),format.raw/*241.40*/("""return 1; """),format.raw/*241.50*/("""}"""),format.raw/*241.51*/(""")
					    .size([w, h])
					    .on("tick", tick)
					        .start();
					 
					   var path = vis.selectAll("path.link")
					      .data(links, function(d) """),format.raw/*247.37*/("""{"""),format.raw/*247.38*/(""" """),format.raw/*247.39*/("""return d.target.id; """),format.raw/*247.59*/("""}"""),format.raw/*247.60*/(""");
					 
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
					      .data(nodes, function(d) """),format.raw/*264.37*/("""{"""),format.raw/*264.38*/(""" """),format.raw/*264.39*/("""return d.id; """),format.raw/*264.52*/("""}"""),format.raw/*264.53*/(""");
					 
					 
					  // Enter any new nodes.
					  var nodeEnter = node.enter().append("svg:g")
					      .attr("class", "node")
					      .attr("transform", function(d) """),format.raw/*270.43*/("""{"""),format.raw/*270.44*/(""" """),format.raw/*270.45*/("""return "translate(" + d.x + "," + d.y + ")"; """),format.raw/*270.90*/("""}"""),format.raw/*270.91*/(""")
					      .on("click", click)
					      .call(force.drag);
					 
					  // Append a circle
					  nodeEnter.append("svg:circle")
					      .attr("r", function(d) """),format.raw/*276.35*/("""{"""),format.raw/*276.36*/(""" """),format.raw/*276.37*/("""return Math.sqrt(d.size) / 10 || 4.5; """),format.raw/*276.75*/("""}"""),format.raw/*276.76*/(""")
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
					        .attr("xlink:href",  function(d) """),format.raw/*290.47*/("""{"""),format.raw/*290.48*/(""" """),format.raw/*290.49*/("""return d.img;"""),format.raw/*290.62*/("""}"""),format.raw/*290.63*/(""")
					        .attr("x", function(d) """),format.raw/*291.37*/("""{"""),format.raw/*291.38*/(""" """),format.raw/*291.39*/("""return -25;"""),format.raw/*291.50*/("""}"""),format.raw/*291.51*/(""")
					        .attr("y", function(d) """),format.raw/*292.37*/("""{"""),format.raw/*292.38*/(""" """),format.raw/*292.39*/("""return -25;"""),format.raw/*292.50*/("""}"""),format.raw/*292.51*/(""")
					        .attr("height", 50)
					        .attr("width", 50)
					        .attr("clip-path", "url(#clipCircle)");
					  
					  // make the image grow a little on mouse over and add the text details on click
					  var setEvents = images
					          // Append hero text
					          .on( 'click', function (d) """),format.raw/*300.43*/("""{"""),format.raw/*300.44*/("""
					          	  """),format.raw/*301.19*/("""if(d.name!=null)"""),format.raw/*301.35*/("""{"""),format.raw/*301.36*/("""
					          	  	"""),format.raw/*302.20*/("""//window.open(d.link,"_blank");
					          	  """),format.raw/*303.19*/("""}"""),format.raw/*303.20*/("""

					              """),format.raw/*305.20*/("""}"""),format.raw/*305.21*/(""")

					          .on( 'mouseenter', function() """),format.raw/*307.46*/("""{"""),format.raw/*307.47*/("""
					            """),format.raw/*308.18*/("""// select element in current context
					            d3.select( this )
					              .transition()
					              .attr("x", function(d) """),format.raw/*311.43*/("""{"""),format.raw/*311.44*/(""" """),format.raw/*311.45*/("""return -60;"""),format.raw/*311.56*/("""}"""),format.raw/*311.57*/(""")
					              .attr("y", function(d) """),format.raw/*312.43*/("""{"""),format.raw/*312.44*/(""" """),format.raw/*312.45*/("""return -60;"""),format.raw/*312.56*/("""}"""),format.raw/*312.57*/(""")
					              .attr("height", 100)
					              .attr("width", 100);
					          """),format.raw/*315.16*/("""}"""),format.raw/*315.17*/(""")
					          // set back
					          .on( 'mouseleave', function() """),format.raw/*317.46*/("""{"""),format.raw/*317.47*/("""
					            """),format.raw/*318.18*/("""d3.select( this )
					              .transition()
					              .attr("x", function(d) """),format.raw/*320.43*/("""{"""),format.raw/*320.44*/(""" """),format.raw/*320.45*/("""return -25;"""),format.raw/*320.56*/("""}"""),format.raw/*320.57*/(""")
					              .attr("y", function(d) """),format.raw/*321.43*/("""{"""),format.raw/*321.44*/(""" """),format.raw/*321.45*/("""return -25;"""),format.raw/*321.56*/("""}"""),format.raw/*321.57*/(""")
					              .attr("height", 50)
					              .attr("width", 50);
					          """),format.raw/*324.16*/("""}"""),format.raw/*324.17*/(""");

					  // Append hero name on roll over next to the node as well
					  var names = nodeEnter.append("text")
					      .attr("class", "nodetext")
					      .attr("x", x_browser)
					      .attr("y", y_browser +15)
					      .attr("fill", tcBlack)
					      .text(function(d) """),format.raw/*332.30*/("""{"""),format.raw/*332.31*/(""" 
					      	"""),format.raw/*333.13*/("""if(d.name!="undefined")
					      		return d.name;
					      	
					      	else
					      		return ""; """),format.raw/*337.25*/("""}"""),format.raw/*337.26*/(""");

					   var set = names
					          .on( 'click', function (d) """),format.raw/*340.43*/("""{"""),format.raw/*340.44*/("""
					          	 """),format.raw/*341.18*/("""window.location = d.link;
					              """),format.raw/*342.20*/("""}"""),format.raw/*342.21*/(""")
					 
					 nodeEnter.append("text")
					      .attr("class", "nodetext")
					      .attr("x", x_browser)
					      .attr("y", y_browser +30)
					      .attr("fill", tcBlack)
					      .text(function(d) """),format.raw/*349.30*/("""{"""),format.raw/*349.31*/(""" 
					      	"""),format.raw/*350.13*/("""if(d.followers!=undefined)
					      		return "Follower Count: " + d.followers;
					      	else
					      		return ""; """),format.raw/*353.25*/("""}"""),format.raw/*353.26*/(""");
					 
					  // Exit any old nodes.
					  node.exit().remove();
					 
					 
					  // Re-select for update.
					  path = vis.selectAll("path.link");
					  node = vis.selectAll("g.node");
					 
					function tick() """),format.raw/*363.22*/("""{"""),format.raw/*363.23*/("""
					 
					 
					    """),format.raw/*366.10*/("""path.attr("d", function(d) """),format.raw/*366.37*/("""{"""),format.raw/*366.38*/("""
					 
					     """),format.raw/*368.11*/("""var dx = d.target.x - d.source.x,
					           dy = d.target.y - d.source.y,
					           dr = Math.sqrt(dx * dx + dy * dy);
					           return   "M" + d.source.x + "," 
					            + d.source.y 
					            + "A" + dr + "," 
					            + dr + " 0 0,1 " 
					            + d.target.x + "," 
					            + d.target.y;
					  """),format.raw/*377.8*/("""}"""),format.raw/*377.9*/(""");
					    node.attr("transform", nodeTransform);    
					  """),format.raw/*379.8*/("""}"""),format.raw/*379.9*/("""
					"""),format.raw/*380.6*/("""}"""),format.raw/*380.7*/("""

					 
					"""),format.raw/*383.6*/("""/**
					 * Gives the coordinates of the border for keeping the nodes inside a frame
					 * http://bl.ocks.org/mbostock/1129492
					 */ 
					function nodeTransform(d) """),format.raw/*387.32*/("""{"""),format.raw/*387.33*/("""
					  """),format.raw/*388.8*/("""d.x =  Math.max(maxNodeSize, Math.min(w0 - (d.imgwidth/2 || 16), d.x));
					    d.y =  Math.max(maxNodeSize, Math.min(h0 - (d.imgheight/2 || 16), d.y));
					    return "translate(" + d.x + "," + d.y + ")";
					   """),format.raw/*391.9*/("""}"""),format.raw/*391.10*/("""
					 
					"""),format.raw/*393.6*/("""/**
					 * Toggle children on click.
					 */ 
					function click(d) """),format.raw/*396.24*/("""{"""),format.raw/*396.25*/("""
					  """),format.raw/*397.8*/("""if (d.children) """),format.raw/*397.24*/("""{"""),format.raw/*397.25*/("""
					    """),format.raw/*398.10*/("""d._children = d.children;
					    d.children = null;
					  """),format.raw/*400.8*/("""}"""),format.raw/*400.9*/(""" """),format.raw/*400.10*/("""else """),format.raw/*400.15*/("""{"""),format.raw/*400.16*/("""
					    """),format.raw/*401.10*/("""d.children = d._children;
					    d._children = null;
					  """),format.raw/*403.8*/("""}"""),format.raw/*403.9*/("""
					 
					  """),format.raw/*405.8*/("""update(root0, w0, h0, vis0, force0);
				      update(root1, w1, h1, vis1, force1);
					"""),format.raw/*407.6*/("""}"""),format.raw/*407.7*/("""

					"""),format.raw/*409.6*/("""/**
					 * Returns a list of all nodes under the root.
					 */ 
					function flatten(root) """),format.raw/*412.29*/("""{"""),format.raw/*412.30*/("""
					  """),format.raw/*413.8*/("""var nodes = []; 
					  var i = 0;
					 
					  function recurse(node) """),format.raw/*416.31*/("""{"""),format.raw/*416.32*/("""
					    """),format.raw/*417.10*/("""if (node.children) 
					      node.children.forEach(recurse);
					    if (!node.id) 
					      node.id = ++i;
					    nodes.push(node);
					  """),format.raw/*422.8*/("""}"""),format.raw/*422.9*/("""
					 
					  """),format.raw/*424.8*/("""recurse(root);
					  return nodes;
					"""),format.raw/*426.6*/("""}"""),format.raw/*426.7*/(""" 


   """),format.raw/*429.4*/("""window.onload = function()"""),format.raw/*429.30*/("""{"""),format.raw/*429.31*/("""
     """),format.raw/*430.6*/("""var hou = 14;
     var sec = 59;
     var seconds = 59;
     setInterval(function()"""),format.raw/*433.28*/("""{"""),format.raw/*433.29*/("""

       """),format.raw/*435.8*/("""document.getElementById("timer").innerHTML = hou +" : " + seconds ;
       sec--;
       if(sec == 00)
       """),format.raw/*438.8*/("""{"""),format.raw/*438.9*/("""
         """),format.raw/*439.10*/("""hou--;
         sec = 59;
         if (hou == 0)
         """),format.raw/*442.10*/("""{"""),format.raw/*442.11*/("""
            """),format.raw/*443.13*/("""hou = 15;
         """),format.raw/*444.10*/("""}"""),format.raw/*444.11*/("""
       """),format.raw/*445.8*/("""}"""),format.raw/*445.9*/("""
       """),format.raw/*446.8*/("""if(sec<10)"""),format.raw/*446.18*/("""{"""),format.raw/*446.19*/("""
       	"""),format.raw/*447.9*/("""seconds = '0'+sec;
       """),format.raw/*448.8*/("""}"""),format.raw/*448.9*/("""else"""),format.raw/*448.13*/("""{"""),format.raw/*448.14*/("""
	    """),format.raw/*449.6*/("""seconds = sec;
		"""),format.raw/*450.3*/("""}"""),format.raw/*450.4*/("""

      """),format.raw/*452.7*/("""}"""),format.raw/*452.8*/(""",1000);
    """),format.raw/*453.5*/("""}"""),format.raw/*453.6*/("""
					  
	 """),format.raw/*455.3*/("""</script>
""")))}),format.raw/*456.2*/("""

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
                  DATE: Thu Mar 01 15:22:31 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: 4548cd58120cbb9fbdc582d60979a947b854b77c
                  MATRIX: 1092->1|1484->297|1512->299|1923->684|1937->690|1999->732|2123->830|2137->836|2202->881|2333->986|2366->1010|2387->1022|2402->1028|2417->1034|2431->1039|2450->1049|2470->1060|2509->1061|2539->1064|2677->1175|2702->1179|2939->1388|2968->1389|3003->1397|3038->1404|3067->1405|3107->1417|3252->1535|3280->1536|3324->1552|3353->1553|3393->1565|3445->1590|3473->1591|3519->1609|3548->1610|3588->1622|3630->1636|3659->1637|3698->1648|3727->1649|3760->1654|3789->1655|3837->1675|3866->1676|3907->1690|3935->1691|3985->1713|4014->1714|4054->1726|4087->1731|4116->1732|4160->1748|4268->1828|4297->1829|4345->1849|4381->1857|4410->1858|4462->1882|4509->1901|4538->1902|4594->1930|4739->2047|4768->2048|4816->2068|4845->2069|4889->2085|4918->2086|4976->2116|5005->2117|5053->2137|5127->2183|5156->2184|5194->2194|5223->2195|5257->2201|5286->2202|5334->2222|5363->2223|5392->2224|5450->2254|5479->2255|5531->2279|5653->2373|5682->2374|5726->2390|5755->2391|5795->2403|5824->2404|5859->2412|5887->2413|5934->2432|5963->2433|6003->2445|6099->2513|6128->2514|6172->2530|6236->2567|6264->2574|6337->2619|6366->2620|6396->2622|6425->2623|6469->2639|6533->2676|6561->2683|6634->2728|6663->2729|6704->2742|6733->2743|6777->2759|6840->2795|6869->2803|6941->2847|6970->2848|7006->2857|7034->2858|7066->2863|7094->2864|7295->3039|7328->3063|7367->3064|7400->3070|7667->3320|7680->3325|7719->3326|7752->3332|7983->3536|7998->3542|8054->3577|8531->4025|8558->4029|9083->4523|9114->4526|9321->4705|9356->4718|9801->5134|9831->5135|9861->5136|9908->5154|9938->5155|10045->5233|10075->5234|10112->5243|10687->5789|10717->5790|10747->5791|10798->5813|10828->5814|10905->5862|10935->5863|10965->5864|11011->5881|11041->5882|11119->5931|11149->5932|11199->5953|11308->6033|11338->6034|11411->6078|11441->6079|11490->6099|11675->6255|11705->6256|11770->6292|11800->6293|11830->6294|11874->6309|11904->6310|11939->6317|11968->6318|11997->6319|12154->6448|12180->6452|13370->7614|13396->7618|13684->7877|13714->7878|13750->7886|14094->8201|14124->8202|14163->8212|14193->8213|14386->8377|14416->8378|14446->8379|14495->8399|14525->8400|14998->8844|15028->8845|15058->8846|15100->8859|15130->8860|15335->9036|15365->9037|15395->9038|15469->9083|15499->9084|15696->9252|15726->9253|15756->9254|15823->9292|15853->9293|16253->9664|16283->9665|16313->9666|16355->9679|16385->9680|16452->9718|16482->9719|16512->9720|16552->9731|16582->9732|16649->9770|16679->9771|16709->9772|16749->9783|16779->9784|17130->10106|17160->10107|17208->10126|17253->10142|17283->10143|17332->10163|17411->10213|17441->10214|17491->10235|17521->10236|17598->10284|17628->10285|17675->10303|17851->10450|17881->10451|17911->10452|17951->10463|17981->10464|18054->10508|18084->10509|18114->10510|18154->10521|18184->10522|18310->10619|18340->10620|18443->10694|18473->10695|18520->10713|18642->10806|18672->10807|18702->10808|18742->10819|18772->10820|18845->10864|18875->10865|18905->10866|18945->10877|18975->10878|19099->10973|19129->10974|19442->11258|19472->11259|19515->11273|19650->11379|19680->11380|19779->11450|19809->11451|19856->11469|19930->11514|19960->11515|20200->11726|20230->11727|20273->11741|20424->11863|20454->11864|20707->12088|20737->12089|20790->12113|20846->12140|20876->12141|20923->12159|21307->12515|21336->12516|21426->12578|21455->12579|21489->12585|21518->12586|21560->12600|21759->12770|21789->12771|21825->12779|22069->12995|22099->12996|22140->13009|22240->13080|22270->13081|22306->13089|22351->13105|22381->13106|22420->13116|22509->13177|22538->13178|22568->13179|22602->13184|22632->13185|22671->13195|22761->13257|22790->13258|22833->13273|22950->13362|22979->13363|23014->13370|23137->13464|23167->13465|23203->13473|23304->13545|23334->13546|23373->13556|23548->13703|23577->13704|23620->13719|23689->13760|23718->13761|23753->13768|23808->13794|23838->13795|23872->13801|23984->13884|24014->13885|24051->13894|24189->14004|24218->14005|24257->14015|24344->14073|24374->14074|24416->14087|24464->14106|24494->14107|24530->14115|24559->14116|24595->14124|24634->14134|24664->14135|24701->14144|24755->14170|24784->14171|24817->14175|24847->14176|24881->14182|24926->14199|24955->14200|24991->14208|25020->14209|25060->14221|25089->14222|25128->14233|25170->14244
                  LINES: 28->1|33->1|35->3|39->7|39->7|39->7|41->9|41->9|41->9|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|47->15|52->20|52->20|53->21|53->21|53->21|54->22|58->26|58->26|59->27|59->27|60->28|61->29|61->29|62->30|62->30|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|64->32|64->32|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|75->43|75->43|76->44|76->44|78->46|78->46|79->47|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|81->49|81->49|82->50|83->51|83->51|84->52|84->52|85->53|85->53|86->54|86->54|88->56|88->56|89->57|91->59|91->59|92->60|93->61|93->61|95->63|95->63|95->63|95->63|96->64|97->65|97->65|99->67|99->67|100->68|100->68|101->69|102->70|102->70|104->72|104->72|105->73|105->73|106->74|106->74|114->82|114->82|114->82|115->83|121->89|121->89|121->89|123->91|127->95|127->95|127->95|136->104|136->104|151->119|153->121|156->124|156->124|166->134|166->134|166->134|166->134|166->134|169->137|169->137|170->138|181->149|181->149|181->149|181->149|181->149|182->150|182->150|182->150|182->150|182->150|183->151|183->151|184->152|185->153|185->153|186->154|186->154|187->155|189->157|189->157|190->158|190->158|190->158|190->158|190->158|191->159|191->159|192->160|200->168|200->168|250->218|250->218|262->230|262->230|263->231|273->241|273->241|273->241|273->241|279->247|279->247|279->247|279->247|279->247|296->264|296->264|296->264|296->264|296->264|302->270|302->270|302->270|302->270|302->270|308->276|308->276|308->276|308->276|308->276|322->290|322->290|322->290|322->290|322->290|323->291|323->291|323->291|323->291|323->291|324->292|324->292|324->292|324->292|324->292|332->300|332->300|333->301|333->301|333->301|334->302|335->303|335->303|337->305|337->305|339->307|339->307|340->308|343->311|343->311|343->311|343->311|343->311|344->312|344->312|344->312|344->312|344->312|347->315|347->315|349->317|349->317|350->318|352->320|352->320|352->320|352->320|352->320|353->321|353->321|353->321|353->321|353->321|356->324|356->324|364->332|364->332|365->333|369->337|369->337|372->340|372->340|373->341|374->342|374->342|381->349|381->349|382->350|385->353|385->353|395->363|395->363|398->366|398->366|398->366|400->368|409->377|409->377|411->379|411->379|412->380|412->380|415->383|419->387|419->387|420->388|423->391|423->391|425->393|428->396|428->396|429->397|429->397|429->397|430->398|432->400|432->400|432->400|432->400|432->400|433->401|435->403|435->403|437->405|439->407|439->407|441->409|444->412|444->412|445->413|448->416|448->416|449->417|454->422|454->422|456->424|458->426|458->426|461->429|461->429|461->429|462->430|465->433|465->433|467->435|470->438|470->438|471->439|474->442|474->442|475->443|476->444|476->444|477->445|477->445|478->446|478->446|478->446|479->447|480->448|480->448|480->448|480->448|481->449|482->450|482->450|484->452|484->452|485->453|485->453|487->455|488->456
                  -- GENERATED --
              */
          