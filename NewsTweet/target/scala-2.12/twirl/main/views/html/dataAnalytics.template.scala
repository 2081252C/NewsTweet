
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

object dataAnalytics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template20[Form[Search],Form[Track],String,Integer,List[String],List[String],Double,List[String],Double,List[String],Double,Form[Persona],String,Form[Interest],String,List[String],List[String],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search], trackForm: Form[Track], user: String, bool: Integer, tweets: List[String], posTweets: List[String], posSize: Double, negTweets: List[String], negSize: Double, neutTweets: List[String], neutSize: Double, personaForm: Form[Persona], img: String, interestForm: Form[Interest], term: String, personas: List[String], interests: List[String], i: String, json: String, wordcloudData: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.413*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/render.js")),format.raw/*7.63*/(""""; type="text/javascript"></script>
<script src="//d3js.org/d3.v3.min.js"></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("javascripts/wordcloud.js")),format.raw/*9.66*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>


"""),_display_(/*13.2*/main("Search Analytics")/*13.26*/(searchForm)/*13.38*/(user)/*13.44*/(bool)/*13.50*/(personaForm)/*13.63*/(img)/*13.68*/(interestForm)/*13.82*/(personas)/*13.92*/(interests)/*13.103*/(i)/*13.106*/{_display_(Seq[Any](format.raw/*13.107*/("""
  """),format.raw/*14.3*/("""<div id="Search Analytics" style="display:block;">
  	<h3>Search Analytics for """"),_display_(/*15.31*/term),format.raw/*15.35*/("""":</h3>
  	<div id="container" style="width:33%; height:400px; display:inline-block; vertical-align:top;">
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
  		<p align="center">Network <br></p>
  		<div id="forcegraph">
  		</div>
		<div class="footer">
			<p id="expand-network" data-toggle="modal" data-target="#expandedNetwork" style="float:right; margin-right:20px; margin-top:10px">
			<img src=""""),_display_(/*85.15*/routes/*85.21*/.Assets.versioned("images/new.png")),format.raw/*85.56*/("""" width="20px" border="0px"></p>
			</div>	
	</div>

	<!-- Modal -->
    <div class="modal fade" id="expandedNetwork" tabindex="-1" role="dialog" aria-labelledby="networkModelLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" style="margin-left:45%;" id="expand-label">Network</h5>
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

	<div id="wordcloud" style="width:33%; height: 400px; display:inline-block; vertical-align:top">
		<p align="center">Wordcloud</p>
		<script>
	var wordcloudData = '"""),_display_(/*113.24*/wordcloudData),format.raw/*113.37*/("""'.replace(/&quot;/g, "\"");

    var frequency_list = JSON.parse(wordcloudData); 

    var color = d3.scale.linear()
            .domain([0,1,2,3,4,5,6,10,15,20,100])
            .range(["#ddd", "#ccc", "#bbb", "#aaa", "#999", "#888", "#777", "#666", "#555", "#444", "#333", "#222"]);
    d3.layout.cloud().size([400, 300])
            .words(frequency_list)
            .rotate(0)
            .fontSize(function(d) """),format.raw/*123.35*/("""{"""),format.raw/*123.36*/(""" """),format.raw/*123.37*/("""return d.size*10; """),format.raw/*123.55*/("""}"""),format.raw/*123.56*/(""")
            .on("end", draw)
            .start();
    function draw(words) """),format.raw/*126.26*/("""{"""),format.raw/*126.27*/("""
        """),format.raw/*127.9*/("""d3.select("#wordcloud").append("svg")
                .attr("width", 400)
                .attr("height", 350)
                .attr("class", "wordcloud")
                .append("g")
                // without the transform, words words would get cutoff to the left and top, they would
                // appear outside of the SVG area
                .attr("transform", "translate(160,200)")
                .selectAll("text")
                .data(words)
                .enter().append("text")
                .style("font-size", function(d) """),format.raw/*138.49*/("""{"""),format.raw/*138.50*/(""" """),format.raw/*138.51*/("""return d.size + "px"; """),format.raw/*138.73*/("""}"""),format.raw/*138.74*/(""")
                .style("fill", function(d, i) """),format.raw/*139.47*/("""{"""),format.raw/*139.48*/(""" """),format.raw/*139.49*/("""return color(i); """),format.raw/*139.66*/("""}"""),format.raw/*139.67*/(""")
                .attr("transform", function(d) """),format.raw/*140.48*/("""{"""),format.raw/*140.49*/("""
                    """),format.raw/*141.21*/("""return "translate(" + [d.x, d.y] + ")rotate(" + d.rotate + ")";
                """),format.raw/*142.17*/("""}"""),format.raw/*142.18*/(""")
                .on('click', function (d) """),format.raw/*143.43*/("""{"""),format.raw/*143.44*/("""
			          """),format.raw/*144.14*/("""window.open("http://localhost:9000/search?searchTerm="+d.text+"&searchType=Content","_blank");
			        """),format.raw/*145.12*/("""}"""),format.raw/*145.13*/(""")
                .text(function(d) """),format.raw/*146.35*/("""{"""),format.raw/*146.36*/(""" """),format.raw/*146.37*/("""return d.text; """),format.raw/*146.52*/("""}"""),format.raw/*146.53*/(""");
    """),format.raw/*147.5*/("""}"""),format.raw/*147.6*/("""
"""),format.raw/*148.1*/("""</script>
	</div>
  	</div>
    <script>
		
					// some colour variables
					  var tcBlack = "#130C0E";

					var datajson = '"""),_display_(/*156.23*/json),format.raw/*156.27*/("""'.replace(/&quot;/g, "\"");

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

                 	//root1.children.forEach(click);

				     update(root0, w0, h0, vis0, force0);
				     update(root1, w1, h1, vis1, force1);

					/**
					 *   
					 */
					function update(root, w, h, vis, force) """),format.raw/*214.46*/("""{"""),format.raw/*214.47*/("""
					  """),format.raw/*215.8*/("""var nodes = flatten(root),
					      links = d3.layout.tree().links(nodes);
					 
					  // Restart the force layout.
					  force.nodes(nodes)
					        .links(links)
					        .gravity(0.05)
					    .charge(-1500)
					    .linkDistance(100)
					    .friction(0.5)
					    .linkStrength(function(l, i) """),format.raw/*225.39*/("""{"""),format.raw/*225.40*/("""return 1; """),format.raw/*225.50*/("""}"""),format.raw/*225.51*/(""")
					    .size([w, h])
					    .on("tick", tick)
					        .start();
					 
					   var path = vis.selectAll("path.link")
					      .data(links, function(d) """),format.raw/*231.37*/("""{"""),format.raw/*231.38*/(""" """),format.raw/*231.39*/("""return d.target.id; """),format.raw/*231.59*/("""}"""),format.raw/*231.60*/(""");
					 
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
					      .data(nodes, function(d) """),format.raw/*248.37*/("""{"""),format.raw/*248.38*/(""" """),format.raw/*248.39*/("""return d.id; """),format.raw/*248.52*/("""}"""),format.raw/*248.53*/(""");
					 
					 
					  // Enter any new nodes.
					  var nodeEnter = node.enter().append("svg:g")
					      .attr("class", "node")
					      .attr("transform", function(d) """),format.raw/*254.43*/("""{"""),format.raw/*254.44*/(""" """),format.raw/*254.45*/("""return "translate(" + d.x + "," + d.y + ")"; """),format.raw/*254.90*/("""}"""),format.raw/*254.91*/(""")
					      .on("click", click)
					      .call(force.drag);
					 
					  // Append a circle
					  nodeEnter.append("svg:circle")
					      .attr("r", function(d) """),format.raw/*260.35*/("""{"""),format.raw/*260.36*/(""" """),format.raw/*260.37*/("""return Math.sqrt(d.size) / 10 || 4.5; """),format.raw/*260.75*/("""}"""),format.raw/*260.76*/(""")
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
					        .attr("xlink:href",  function(d) """),format.raw/*274.47*/("""{"""),format.raw/*274.48*/(""" """),format.raw/*274.49*/("""return d.img;"""),format.raw/*274.62*/("""}"""),format.raw/*274.63*/(""")
					        .attr("x", function(d) """),format.raw/*275.37*/("""{"""),format.raw/*275.38*/(""" """),format.raw/*275.39*/("""return -25;"""),format.raw/*275.50*/("""}"""),format.raw/*275.51*/(""")
					        .attr("y", function(d) """),format.raw/*276.37*/("""{"""),format.raw/*276.38*/(""" """),format.raw/*276.39*/("""return -25;"""),format.raw/*276.50*/("""}"""),format.raw/*276.51*/(""")
					        .attr("height", 50)
					        .attr("width", 50)
					        .attr("clip-path", "url(#clipCircle)");
					  
					  // make the image grow a little on mouse over and add the text details on click
					  var setEvents = images
					          // Append hero text
					          .on( 'click', function (d) """),format.raw/*284.43*/("""{"""),format.raw/*284.44*/("""
					          	  """),format.raw/*285.19*/("""if(d.name!=null)"""),format.raw/*285.35*/("""{"""),format.raw/*285.36*/("""
					          	  	"""),format.raw/*286.20*/("""//window.open(d.link,"_blank");
					          	  """),format.raw/*287.19*/("""}"""),format.raw/*287.20*/("""

					              """),format.raw/*289.20*/("""}"""),format.raw/*289.21*/(""")

					          .on( 'mouseenter', function() """),format.raw/*291.46*/("""{"""),format.raw/*291.47*/("""
					            """),format.raw/*292.18*/("""// select element in current context
					            d3.select( this )
					              .transition()
					              .attr("x", function(d) """),format.raw/*295.43*/("""{"""),format.raw/*295.44*/(""" """),format.raw/*295.45*/("""return -60;"""),format.raw/*295.56*/("""}"""),format.raw/*295.57*/(""")
					              .attr("y", function(d) """),format.raw/*296.43*/("""{"""),format.raw/*296.44*/(""" """),format.raw/*296.45*/("""return -60;"""),format.raw/*296.56*/("""}"""),format.raw/*296.57*/(""")
					              .attr("height", 100)
					              .attr("width", 100);
					          """),format.raw/*299.16*/("""}"""),format.raw/*299.17*/(""")
					          // set back
					          .on( 'mouseleave', function() """),format.raw/*301.46*/("""{"""),format.raw/*301.47*/("""
					            """),format.raw/*302.18*/("""d3.select( this )
					              .transition()
					              .attr("x", function(d) """),format.raw/*304.43*/("""{"""),format.raw/*304.44*/(""" """),format.raw/*304.45*/("""return -25;"""),format.raw/*304.56*/("""}"""),format.raw/*304.57*/(""")
					              .attr("y", function(d) """),format.raw/*305.43*/("""{"""),format.raw/*305.44*/(""" """),format.raw/*305.45*/("""return -25;"""),format.raw/*305.56*/("""}"""),format.raw/*305.57*/(""")
					              .attr("height", 50)
					              .attr("width", 50);
					          """),format.raw/*308.16*/("""}"""),format.raw/*308.17*/(""");

					  // Append hero name on roll over next to the node as well
					  var names = nodeEnter.append("text")
					      .attr("class", "nodetext")
					      .attr("x", x_browser)
					      .attr("y", y_browser +15)
					      .attr("fill", tcBlack)
					      .text(function(d) """),format.raw/*316.30*/("""{"""),format.raw/*316.31*/(""" 
					      	"""),format.raw/*317.13*/("""if(d.name!="undefined")
					      		return d.name;
					      	
					      	else
					      		return ""; """),format.raw/*321.25*/("""}"""),format.raw/*321.26*/(""");

					   var set = names
					          .on( 'click', function (d) """),format.raw/*324.43*/("""{"""),format.raw/*324.44*/("""
					          	 """),format.raw/*325.18*/("""window.location = d.link;
					              """),format.raw/*326.20*/("""}"""),format.raw/*326.21*/(""")
					 
					 nodeEnter.append("text")
					      .attr("class", "nodetext")
					      .attr("x", x_browser)
					      .attr("y", y_browser +30)
					      .attr("fill", tcBlack)
					      .text(function(d) """),format.raw/*333.30*/("""{"""),format.raw/*333.31*/(""" 
					      	"""),format.raw/*334.13*/("""if(d.followers!=undefined)
					      		return "Follower Count: " + d.followers;
					      	else
					      		return ""; """),format.raw/*337.25*/("""}"""),format.raw/*337.26*/(""");
					 
					  // Exit any old nodes.
					  node.exit().remove();
					 
					 
					  // Re-select for update.
					  path = vis.selectAll("path.link");
					  node = vis.selectAll("g.node");
					 
					function tick() """),format.raw/*347.22*/("""{"""),format.raw/*347.23*/("""
					 
					 
					    """),format.raw/*350.10*/("""path.attr("d", function(d) """),format.raw/*350.37*/("""{"""),format.raw/*350.38*/("""
					 
					     """),format.raw/*352.11*/("""var dx = d.target.x - d.source.x,
					           dy = d.target.y - d.source.y,
					           dr = Math.sqrt(dx * dx + dy * dy);
					           return   "M" + d.source.x + "," 
					            + d.source.y 
					            + "A" + dr + "," 
					            + dr + " 0 0,1 " 
					            + d.target.x + "," 
					            + d.target.y;
					  """),format.raw/*361.8*/("""}"""),format.raw/*361.9*/(""");
					    node.attr("transform", nodeTransform);    
					  """),format.raw/*363.8*/("""}"""),format.raw/*363.9*/("""
					"""),format.raw/*364.6*/("""}"""),format.raw/*364.7*/("""

					 
					"""),format.raw/*367.6*/("""/**
					 * Gives the coordinates of the border for keeping the nodes inside a frame
					 * http://bl.ocks.org/mbostock/1129492
					 */ 
					function nodeTransform(d) """),format.raw/*371.32*/("""{"""),format.raw/*371.33*/("""
					  """),format.raw/*372.8*/("""d.x =  Math.max(maxNodeSize, Math.min(w0 - (d.imgwidth/2 || 16), d.x));
					    d.y =  Math.max(maxNodeSize, Math.min(h0 - (d.imgheight/2 || 16), d.y));
					    return "translate(" + d.x + "," + d.y + ")";
					   """),format.raw/*375.9*/("""}"""),format.raw/*375.10*/("""
					 
					"""),format.raw/*377.6*/("""/**
					 * Toggle children on click.
					 */ 
					function click(d) """),format.raw/*380.24*/("""{"""),format.raw/*380.25*/("""
					  """),format.raw/*381.8*/("""if (d.children) """),format.raw/*381.24*/("""{"""),format.raw/*381.25*/("""
					    """),format.raw/*382.10*/("""d._children = d.children;
					    d.children = null;
					  """),format.raw/*384.8*/("""}"""),format.raw/*384.9*/(""" """),format.raw/*384.10*/("""else """),format.raw/*384.15*/("""{"""),format.raw/*384.16*/("""
					    """),format.raw/*385.10*/("""d.children = d._children;
					    d._children = null;
					  """),format.raw/*387.8*/("""}"""),format.raw/*387.9*/("""
					 
					  """),format.raw/*389.8*/("""update(root0, w0, h0, vis0, force0);
				      update(root1, w1, h1, vis1, force1);
					"""),format.raw/*391.6*/("""}"""),format.raw/*391.7*/("""

					"""),format.raw/*393.6*/("""/**
					 * Returns a list of all nodes under the root.
					 */ 
					function flatten(root) """),format.raw/*396.29*/("""{"""),format.raw/*396.30*/("""
					  """),format.raw/*397.8*/("""var nodes = []; 
					  var i = 0;
					 
					  function recurse(node) """),format.raw/*400.31*/("""{"""),format.raw/*400.32*/("""
					    """),format.raw/*401.10*/("""if (node.children) 
					      node.children.forEach(recurse);
					    if (!node.id) 
					      node.id = ++i;
					    nodes.push(node);
					  """),format.raw/*406.8*/("""}"""),format.raw/*406.9*/("""
					 
					  """),format.raw/*408.8*/("""recurse(root);
					  return nodes;
					"""),format.raw/*410.6*/("""}"""),format.raw/*410.7*/(""" 
					  
	 """),format.raw/*412.3*/("""</script>
""")))}),format.raw/*413.2*/("""

"""))
      }
    }
  }

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],posTweets:List[String],posSize:Double,negTweets:List[String],negSize:Double,neutTweets:List[String],neutSize:Double,personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String,json:String,wordcloudData:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,personaForm,img,interestForm,term,personas,interests,i,json,wordcloudData)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],Double,List[String],Double,List[String],Double,Form[Persona],String,Form[Interest],String,List[String],List[String],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,personaForm,img,interestForm,term,personas,interests,i,json,wordcloudData) => apply(searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,personaForm,img,interestForm,term,personas,interests,i,json,wordcloudData)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 25 13:58:13 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: d24ae1c8f3a68556df4e047ef54f787269590610
                  MATRIX: 1153->1|1660->412|1688->414|2099->799|2113->805|2175->847|2299->945|2313->951|2378->996|2509->1101|2542->1125|2563->1137|2578->1143|2593->1149|2615->1162|2629->1167|2652->1181|2671->1191|2692->1202|2705->1205|2745->1206|2775->1209|2883->1290|2908->1294|3138->1496|3167->1497|3202->1505|3237->1512|3266->1513|3306->1525|3451->1643|3479->1644|3523->1660|3552->1661|3592->1673|3644->1698|3672->1699|3718->1717|3747->1718|3787->1730|3829->1744|3858->1745|3897->1756|3926->1757|3959->1762|3988->1763|4036->1783|4065->1784|4106->1798|4134->1799|4184->1821|4213->1822|4253->1834|4286->1839|4315->1840|4359->1856|4467->1936|4496->1937|4544->1957|4580->1965|4609->1966|4661->1990|4708->2009|4737->2010|4793->2038|4938->2155|4967->2156|5015->2176|5044->2177|5088->2193|5117->2194|5175->2224|5204->2225|5252->2245|5326->2291|5355->2292|5393->2302|5422->2303|5456->2309|5485->2310|5533->2330|5562->2331|5591->2332|5649->2362|5678->2363|5730->2387|5852->2481|5881->2482|5925->2498|5954->2499|5994->2511|6023->2512|6058->2520|6086->2521|6133->2540|6162->2541|6202->2553|6298->2621|6327->2622|6371->2638|6435->2675|6463->2682|6536->2727|6565->2728|6595->2730|6624->2731|6668->2747|6732->2784|6760->2791|6833->2836|6862->2837|6903->2850|6932->2851|6976->2867|7039->2903|7068->2911|7140->2955|7169->2956|7205->2965|7233->2966|7265->2971|7293->2972|7686->3338|7701->3344|7757->3379|8858->4452|8893->4465|9338->4881|9368->4882|9398->4883|9445->4901|9475->4902|9582->4980|9612->4981|9649->4990|10224->5536|10254->5537|10284->5538|10335->5560|10365->5561|10442->5609|10472->5610|10502->5611|10548->5628|10578->5629|10656->5678|10686->5679|10736->5700|10845->5780|10875->5781|10948->5825|10978->5826|11021->5840|11156->5946|11186->5947|11251->5983|11281->5984|11311->5985|11355->6000|11385->6001|11420->6008|11449->6009|11478->6010|11635->6139|11661->6143|13039->7492|13069->7493|13105->7501|13449->7816|13479->7817|13518->7827|13548->7828|13741->7992|13771->7993|13801->7994|13850->8014|13880->8015|14353->8459|14383->8460|14413->8461|14455->8474|14485->8475|14690->8651|14720->8652|14750->8653|14824->8698|14854->8699|15051->8867|15081->8868|15111->8869|15178->8907|15208->8908|15608->9279|15638->9280|15668->9281|15710->9294|15740->9295|15807->9333|15837->9334|15867->9335|15907->9346|15937->9347|16004->9385|16034->9386|16064->9387|16104->9398|16134->9399|16485->9721|16515->9722|16563->9741|16608->9757|16638->9758|16687->9778|16766->9828|16796->9829|16846->9850|16876->9851|16953->9899|16983->9900|17030->9918|17206->10065|17236->10066|17266->10067|17306->10078|17336->10079|17409->10123|17439->10124|17469->10125|17509->10136|17539->10137|17665->10234|17695->10235|17798->10309|17828->10310|17875->10328|17997->10421|18027->10422|18057->10423|18097->10434|18127->10435|18200->10479|18230->10480|18260->10481|18300->10492|18330->10493|18454->10588|18484->10589|18797->10873|18827->10874|18870->10888|19005->10994|19035->10995|19134->11065|19164->11066|19211->11084|19285->11129|19315->11130|19555->11341|19585->11342|19628->11356|19779->11478|19809->11479|20062->11703|20092->11704|20145->11728|20201->11755|20231->11756|20278->11774|20662->12130|20691->12131|20781->12193|20810->12194|20844->12200|20873->12201|20915->12215|21114->12385|21144->12386|21180->12394|21424->12610|21454->12611|21495->12624|21595->12695|21625->12696|21661->12704|21706->12720|21736->12721|21775->12731|21864->12792|21893->12793|21923->12794|21957->12799|21987->12800|22026->12810|22116->12872|22145->12873|22188->12888|22305->12977|22334->12978|22369->12985|22492->13079|22522->13080|22558->13088|22659->13160|22689->13161|22728->13171|22903->13318|22932->13319|22975->13334|23044->13375|23073->13376|23113->13388|23155->13399
                  LINES: 28->1|33->1|35->3|39->7|39->7|39->7|41->9|41->9|41->9|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|47->15|52->20|52->20|53->21|53->21|53->21|54->22|58->26|58->26|59->27|59->27|60->28|61->29|61->29|62->30|62->30|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|64->32|64->32|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|75->43|75->43|76->44|76->44|78->46|78->46|79->47|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|81->49|81->49|82->50|83->51|83->51|84->52|84->52|85->53|85->53|86->54|86->54|88->56|88->56|89->57|91->59|91->59|92->60|93->61|93->61|95->63|95->63|95->63|95->63|96->64|97->65|97->65|99->67|99->67|100->68|100->68|101->69|102->70|102->70|104->72|104->72|105->73|105->73|106->74|106->74|117->85|117->85|117->85|145->113|145->113|155->123|155->123|155->123|155->123|155->123|158->126|158->126|159->127|170->138|170->138|170->138|170->138|170->138|171->139|171->139|171->139|171->139|171->139|172->140|172->140|173->141|174->142|174->142|175->143|175->143|176->144|177->145|177->145|178->146|178->146|178->146|178->146|178->146|179->147|179->147|180->148|188->156|188->156|246->214|246->214|247->215|257->225|257->225|257->225|257->225|263->231|263->231|263->231|263->231|263->231|280->248|280->248|280->248|280->248|280->248|286->254|286->254|286->254|286->254|286->254|292->260|292->260|292->260|292->260|292->260|306->274|306->274|306->274|306->274|306->274|307->275|307->275|307->275|307->275|307->275|308->276|308->276|308->276|308->276|308->276|316->284|316->284|317->285|317->285|317->285|318->286|319->287|319->287|321->289|321->289|323->291|323->291|324->292|327->295|327->295|327->295|327->295|327->295|328->296|328->296|328->296|328->296|328->296|331->299|331->299|333->301|333->301|334->302|336->304|336->304|336->304|336->304|336->304|337->305|337->305|337->305|337->305|337->305|340->308|340->308|348->316|348->316|349->317|353->321|353->321|356->324|356->324|357->325|358->326|358->326|365->333|365->333|366->334|369->337|369->337|379->347|379->347|382->350|382->350|382->350|384->352|393->361|393->361|395->363|395->363|396->364|396->364|399->367|403->371|403->371|404->372|407->375|407->375|409->377|412->380|412->380|413->381|413->381|413->381|414->382|416->384|416->384|416->384|416->384|416->384|417->385|419->387|419->387|421->389|423->391|423->391|425->393|428->396|428->396|429->397|432->400|432->400|433->401|438->406|438->406|440->408|442->410|442->410|444->412|445->413
                  -- GENERATED --
              */
          