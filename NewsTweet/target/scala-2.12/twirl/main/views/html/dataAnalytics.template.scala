
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
  	<h3>Search Analytics for "<b>"""),_display_(/*15.34*/term),format.raw/*15.38*/("""</b>":</h3>
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
    	""")))}),format.raw/*119.7*/("""

	"""),format.raw/*121.2*/("""<div id="wordcloud" style="width:33%; height: 400px; display:inline-block; vertical-align:top">
		<p align="center">Wordcloud</p>
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

  def render(searchForm:Form[Search],trackForm:Form[Track],user:String,bool:Integer,tweets:List[String],posTweets:List[String],posSize:Double,negTweets:List[String],negSize:Double,neutTweets:List[String],neutSize:Double,personaForm:Form[Persona],img:String,interestForm:Form[Interest],term:String,personas:List[String],interests:List[String],i:String,json:String,wordcloudData:String): play.twirl.api.HtmlFormat.Appendable = apply(searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,personaForm,img,interestForm,term,personas,interests,i,json,wordcloudData)

  def f:((Form[Search],Form[Track],String,Integer,List[String],List[String],Double,List[String],Double,List[String],Double,Form[Persona],String,Form[Interest],String,List[String],List[String],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,personaForm,img,interestForm,term,personas,interests,i,json,wordcloudData) => apply(searchForm,trackForm,user,bool,tweets,posTweets,posSize,negTweets,negSize,neutTweets,neutSize,personaForm,img,interestForm,term,personas,interests,i,json,wordcloudData)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 13 21:05:27 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: 9f2408ddab4d9e37af8d1430ae6e0899cc2fea5f
                  MATRIX: 1153->1|1660->412|1688->414|2099->799|2113->805|2175->847|2299->945|2313->951|2378->996|2509->1101|2542->1125|2563->1137|2578->1143|2593->1149|2615->1162|2629->1167|2652->1181|2671->1191|2692->1202|2705->1205|2745->1206|2775->1209|2886->1293|2911->1297|3145->1503|3174->1504|3209->1512|3244->1519|3273->1520|3313->1532|3458->1650|3486->1651|3530->1667|3559->1668|3599->1680|3651->1705|3679->1706|3725->1724|3754->1725|3794->1737|3836->1751|3865->1752|3904->1763|3933->1764|3966->1769|3995->1770|4043->1790|4072->1791|4113->1805|4141->1806|4191->1828|4220->1829|4260->1841|4293->1846|4322->1847|4366->1863|4474->1943|4503->1944|4551->1964|4587->1972|4616->1973|4668->1997|4715->2016|4744->2017|4800->2045|4945->2162|4974->2163|5022->2183|5051->2184|5095->2200|5124->2201|5182->2231|5211->2232|5259->2252|5333->2298|5362->2299|5400->2309|5429->2310|5463->2316|5492->2317|5540->2337|5569->2338|5598->2339|5656->2369|5685->2370|5737->2394|5859->2488|5888->2489|5932->2505|5961->2506|6001->2518|6030->2519|6065->2527|6093->2528|6140->2547|6169->2548|6209->2560|6305->2628|6334->2629|6378->2645|6442->2682|6470->2689|6543->2734|6572->2735|6602->2737|6631->2738|6675->2754|6739->2791|6767->2798|6840->2843|6869->2844|6910->2857|6939->2858|6983->2874|7046->2910|7075->2918|7147->2962|7176->2963|7212->2972|7240->2973|7272->2978|7300->2979|7490->3143|7523->3167|7562->3168|7595->3174|7862->3424|7875->3429|7914->3430|7947->3436|8178->3640|8193->3646|8249->3681|9193->4594|9224->4597|9416->4761|9451->4774|9896->5190|9926->5191|9956->5192|10003->5210|10033->5211|10140->5289|10170->5290|10207->5299|10782->5845|10812->5846|10842->5847|10893->5869|10923->5870|11000->5918|11030->5919|11060->5920|11106->5937|11136->5938|11214->5987|11244->5988|11294->6009|11403->6089|11433->6090|11506->6134|11536->6135|11585->6155|11770->6311|11800->6312|11865->6348|11895->6349|11925->6350|11969->6365|11999->6366|12034->6373|12063->6374|12092->6375|12249->6504|12275->6508|13465->7670|13491->7674|13779->7933|13809->7934|13845->7942|14189->8257|14219->8258|14258->8268|14288->8269|14481->8433|14511->8434|14541->8435|14590->8455|14620->8456|15093->8900|15123->8901|15153->8902|15195->8915|15225->8916|15430->9092|15460->9093|15490->9094|15564->9139|15594->9140|15791->9308|15821->9309|15851->9310|15918->9348|15948->9349|16348->9720|16378->9721|16408->9722|16450->9735|16480->9736|16547->9774|16577->9775|16607->9776|16647->9787|16677->9788|16744->9826|16774->9827|16804->9828|16844->9839|16874->9840|17225->10162|17255->10163|17303->10182|17348->10198|17378->10199|17427->10219|17506->10269|17536->10270|17586->10291|17616->10292|17693->10340|17723->10341|17770->10359|17946->10506|17976->10507|18006->10508|18046->10519|18076->10520|18149->10564|18179->10565|18209->10566|18249->10577|18279->10578|18405->10675|18435->10676|18538->10750|18568->10751|18615->10769|18737->10862|18767->10863|18797->10864|18837->10875|18867->10876|18940->10920|18970->10921|19000->10922|19040->10933|19070->10934|19194->11029|19224->11030|19537->11314|19567->11315|19610->11329|19745->11435|19775->11436|19874->11506|19904->11507|19951->11525|20025->11570|20055->11571|20295->11782|20325->11783|20368->11797|20519->11919|20549->11920|20802->12144|20832->12145|20885->12169|20941->12196|20971->12197|21018->12215|21402->12571|21431->12572|21521->12634|21550->12635|21584->12641|21613->12642|21655->12656|21854->12826|21884->12827|21920->12835|22164->13051|22194->13052|22235->13065|22335->13136|22365->13137|22401->13145|22446->13161|22476->13162|22515->13172|22604->13233|22633->13234|22663->13235|22697->13240|22727->13241|22766->13251|22856->13313|22885->13314|22928->13329|23045->13418|23074->13419|23109->13426|23232->13520|23262->13521|23298->13529|23399->13601|23429->13602|23468->13612|23643->13759|23672->13760|23715->13775|23784->13816|23813->13817|23848->13824|23903->13850|23933->13851|23967->13857|24079->13940|24109->13941|24146->13950|24284->14060|24313->14061|24352->14071|24439->14129|24469->14130|24511->14143|24559->14162|24589->14163|24625->14171|24654->14172|24690->14180|24729->14190|24759->14191|24796->14200|24850->14226|24879->14227|24912->14231|24942->14232|24976->14238|25021->14255|25050->14256|25086->14264|25115->14265|25155->14277|25184->14278|25223->14289|25265->14300
                  LINES: 28->1|33->1|35->3|39->7|39->7|39->7|41->9|41->9|41->9|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|47->15|52->20|52->20|53->21|53->21|53->21|54->22|58->26|58->26|59->27|59->27|60->28|61->29|61->29|62->30|62->30|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|63->31|64->32|64->32|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|75->43|75->43|76->44|76->44|78->46|78->46|79->47|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|81->49|81->49|82->50|83->51|83->51|84->52|84->52|85->53|85->53|86->54|86->54|88->56|88->56|89->57|91->59|91->59|92->60|93->61|93->61|95->63|95->63|95->63|95->63|96->64|97->65|97->65|99->67|99->67|100->68|100->68|101->69|102->70|102->70|104->72|104->72|105->73|105->73|106->74|106->74|114->82|114->82|114->82|115->83|121->89|121->89|121->89|123->91|127->95|127->95|127->95|151->119|153->121|156->124|156->124|166->134|166->134|166->134|166->134|166->134|169->137|169->137|170->138|181->149|181->149|181->149|181->149|181->149|182->150|182->150|182->150|182->150|182->150|183->151|183->151|184->152|185->153|185->153|186->154|186->154|187->155|189->157|189->157|190->158|190->158|190->158|190->158|190->158|191->159|191->159|192->160|200->168|200->168|250->218|250->218|262->230|262->230|263->231|273->241|273->241|273->241|273->241|279->247|279->247|279->247|279->247|279->247|296->264|296->264|296->264|296->264|296->264|302->270|302->270|302->270|302->270|302->270|308->276|308->276|308->276|308->276|308->276|322->290|322->290|322->290|322->290|322->290|323->291|323->291|323->291|323->291|323->291|324->292|324->292|324->292|324->292|324->292|332->300|332->300|333->301|333->301|333->301|334->302|335->303|335->303|337->305|337->305|339->307|339->307|340->308|343->311|343->311|343->311|343->311|343->311|344->312|344->312|344->312|344->312|344->312|347->315|347->315|349->317|349->317|350->318|352->320|352->320|352->320|352->320|352->320|353->321|353->321|353->321|353->321|353->321|356->324|356->324|364->332|364->332|365->333|369->337|369->337|372->340|372->340|373->341|374->342|374->342|381->349|381->349|382->350|385->353|385->353|395->363|395->363|398->366|398->366|398->366|400->368|409->377|409->377|411->379|411->379|412->380|412->380|415->383|419->387|419->387|420->388|423->391|423->391|425->393|428->396|428->396|429->397|429->397|429->397|430->398|432->400|432->400|432->400|432->400|432->400|433->401|435->403|435->403|437->405|439->407|439->407|441->409|444->412|444->412|445->413|448->416|448->416|449->417|454->422|454->422|456->424|458->426|458->426|461->429|461->429|461->429|462->430|465->433|465->433|467->435|470->438|470->438|471->439|474->442|474->442|475->443|476->444|476->444|477->445|477->445|478->446|478->446|478->446|479->447|480->448|480->448|480->448|480->448|481->449|482->450|482->450|484->452|484->452|485->453|485->453|487->455|488->456
                  -- GENERATED --
              */
          