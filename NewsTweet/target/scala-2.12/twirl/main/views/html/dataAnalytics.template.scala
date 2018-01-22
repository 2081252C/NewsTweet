
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

"""),format.raw/*3.1*/("""<script sync src="https://platform.twitter.com/widgets.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.js"; type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/render.js")),format.raw/*5.63*/(""""; type="text/javascript"></script>
<script src="//d3js.org/d3.v3.min.js"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/wordcloud.js")),format.raw/*7.66*/(""""; type="text/javascript"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>


"""),_display_(/*11.2*/main("Data Analytics")/*11.24*/(searchForm)/*11.36*/(user)/*11.42*/(bool)/*11.48*/(personaForm)/*11.61*/(img)/*11.66*/(interestForm)/*11.80*/(personas)/*11.90*/(interests)/*11.101*/(i)/*11.104*/{_display_(Seq[Any](format.raw/*11.105*/("""
  """),format.raw/*12.3*/("""<div id="Search Analytics" style="display:block;">
  	<h3>Data Analytics:</h3>
  	<div id="container" style="width:33%; height:400px; display:inline-block; vertical-align:top;">
  		<div id="pie" style="width:90%; height:95%; margin-left: 20px;">
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
  	
  	<div id="forcegraph" style="width:33%; height: 400px; display: inline-block;">
  		<p align="center">Network <br></p>
		<script>

			// some colour variables
			  var tcBlack = "#130C0E";

			var datajson = '"""),_display_(/*84.21*/json),format.raw/*84.25*/("""'.replace(/&quot;/g, "\"");

		    datajson = jQuery.parseJSON(datajson);

		    console.log(datajson);

			// rest of vars
			var w = 350,
			    h = 400,
			    maxNodeSize = 50,
			    x_browser = 20,
			    y_browser = 25,
			    root=datajson;
			 

			root.fixed = true;
   
			var vis;
			var force = d3.layout.force(); 

			vis = d3.select("#forcegraph").append("svg").attr("width", w).attr("height", h);

			root.x = w / 2;
            root.y = h / 2;
		 
		 
		        // Build the path
		    var defs = vis.insert("svg:defs")
		      .data(["end"]);
		 
		 
		    defs.enter().append("svg:path")
		      .attr("d", "M0,-5L10,0L0,5");
		 
		     update();

			/**
			 *   
			 */
			function update() """),format.raw/*123.22*/("""{"""),format.raw/*123.23*/("""
			  """),format.raw/*124.6*/("""var nodes = flatten(root),
			      links = d3.layout.tree().links(nodes);
			 
			  // Restart the force layout.
			  force.nodes(nodes)
			        .links(links)
			        .gravity(0.05)
			    .charge(-1500)
			    .linkDistance(100)
			    .friction(0.5)
			    .linkStrength(function(l, i) """),format.raw/*134.37*/("""{"""),format.raw/*134.38*/("""return 1; """),format.raw/*134.48*/("""}"""),format.raw/*134.49*/(""")
			    .size([w, h])
			    .on("tick", tick)
			        .start();
			 
			   var path = vis.selectAll("path.link")
			      .data(links, function(d) """),format.raw/*140.35*/("""{"""),format.raw/*140.36*/(""" """),format.raw/*140.37*/("""return d.target.id; """),format.raw/*140.57*/("""}"""),format.raw/*140.58*/(""");
			 
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
			      .data(nodes, function(d) """),format.raw/*157.35*/("""{"""),format.raw/*157.36*/(""" """),format.raw/*157.37*/("""return d.id; """),format.raw/*157.50*/("""}"""),format.raw/*157.51*/(""");
			 
			 
			  // Enter any new nodes.
			  var nodeEnter = node.enter().append("svg:g")
			      .attr("class", "node")
			      .attr("transform", function(d) """),format.raw/*163.41*/("""{"""),format.raw/*163.42*/(""" """),format.raw/*163.43*/("""return "translate(" + d.x + "," + d.y + ")"; """),format.raw/*163.88*/("""}"""),format.raw/*163.89*/(""")
			      .on("click", click)
			      .call(force.drag);
			 
			  // Append a circle
			  nodeEnter.append("svg:circle")
			      .attr("r", function(d) """),format.raw/*169.33*/("""{"""),format.raw/*169.34*/(""" """),format.raw/*169.35*/("""return Math.sqrt(d.size) / 10 || 4.5; """),format.raw/*169.73*/("""}"""),format.raw/*169.74*/(""")
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
			        .attr("xlink:href",  function(d) """),format.raw/*183.45*/("""{"""),format.raw/*183.46*/(""" """),format.raw/*183.47*/("""return d.img;"""),format.raw/*183.60*/("""}"""),format.raw/*183.61*/(""")
			        .attr("x", function(d) """),format.raw/*184.35*/("""{"""),format.raw/*184.36*/(""" """),format.raw/*184.37*/("""return -25;"""),format.raw/*184.48*/("""}"""),format.raw/*184.49*/(""")
			        .attr("y", function(d) """),format.raw/*185.35*/("""{"""),format.raw/*185.36*/(""" """),format.raw/*185.37*/("""return -25;"""),format.raw/*185.48*/("""}"""),format.raw/*185.49*/(""")
			        .attr("height", 50)
			        .attr("width", 50)
			        .attr("clip-path", "url(#clipCircle)");
			  
			  // make the image grow a little on mouse over and add the text details on click
			  var setEvents = images
			          // Append hero text
			          .on( 'click', function (d) """),format.raw/*193.41*/("""{"""),format.raw/*193.42*/("""
			          	  """),format.raw/*194.17*/("""if(d.name!=null)"""),format.raw/*194.33*/("""{"""),format.raw/*194.34*/("""
			          	  	"""),format.raw/*195.18*/("""window.open(d.link,"_blank");
			          	  """),format.raw/*196.17*/("""}"""),format.raw/*196.18*/("""

			              """),format.raw/*198.18*/("""}"""),format.raw/*198.19*/(""")

			          .on( 'mouseenter', function() """),format.raw/*200.44*/("""{"""),format.raw/*200.45*/("""
			            """),format.raw/*201.16*/("""// select element in current context
			            d3.select( this )
			              .transition()
			              .attr("x", function(d) """),format.raw/*204.41*/("""{"""),format.raw/*204.42*/(""" """),format.raw/*204.43*/("""return -60;"""),format.raw/*204.54*/("""}"""),format.raw/*204.55*/(""")
			              .attr("y", function(d) """),format.raw/*205.41*/("""{"""),format.raw/*205.42*/(""" """),format.raw/*205.43*/("""return -60;"""),format.raw/*205.54*/("""}"""),format.raw/*205.55*/(""")
			              .attr("height", 100)
			              .attr("width", 100);
			          """),format.raw/*208.14*/("""}"""),format.raw/*208.15*/(""")
			          // set back
			          .on( 'mouseleave', function() """),format.raw/*210.44*/("""{"""),format.raw/*210.45*/("""
			            """),format.raw/*211.16*/("""d3.select( this )
			              .transition()
			              .attr("x", function(d) """),format.raw/*213.41*/("""{"""),format.raw/*213.42*/(""" """),format.raw/*213.43*/("""return -25;"""),format.raw/*213.54*/("""}"""),format.raw/*213.55*/(""")
			              .attr("y", function(d) """),format.raw/*214.41*/("""{"""),format.raw/*214.42*/(""" """),format.raw/*214.43*/("""return -25;"""),format.raw/*214.54*/("""}"""),format.raw/*214.55*/(""")
			              .attr("height", 50)
			              .attr("width", 50);
			          """),format.raw/*217.14*/("""}"""),format.raw/*217.15*/(""");

			  // Append hero name on roll over next to the node as well
			  var names = nodeEnter.append("text")
			      .attr("class", "nodetext")
			      .attr("x", x_browser)
			      .attr("y", y_browser +15)
			      .attr("fill", tcBlack)
			      .text(function(d) """),format.raw/*225.28*/("""{"""),format.raw/*225.29*/(""" 
			      	"""),format.raw/*226.11*/("""if(d.name!="undefined")
			      		return d.name;
			      	
			      	else
			      		return ""; """),format.raw/*230.23*/("""}"""),format.raw/*230.24*/(""");

			   var set = names
			          .on( 'click', function (d) """),format.raw/*233.41*/("""{"""),format.raw/*233.42*/("""
			          	 """),format.raw/*234.16*/("""window.location = d.link;
			              """),format.raw/*235.18*/("""}"""),format.raw/*235.19*/(""")
			 
			 nodeEnter.append("text")
			      .attr("class", "nodetext")
			      .attr("x", x_browser)
			      .attr("y", y_browser +30)
			      .attr("fill", tcBlack)
			      .text(function(d) """),format.raw/*242.28*/("""{"""),format.raw/*242.29*/(""" 
			      	"""),format.raw/*243.11*/("""if(d.followers!=undefined)
			      		return "Follower Count: " + d.followers;
			      	else
			      		return ""; """),format.raw/*246.23*/("""}"""),format.raw/*246.24*/(""");
			 
			  // Exit any old nodes.
			  node.exit().remove();
			 
			 
			  // Re-select for update.
			  path = vis.selectAll("path.link");
			  node = vis.selectAll("g.node");
			 
			function tick() """),format.raw/*256.20*/("""{"""),format.raw/*256.21*/("""
			 
			 
			    """),format.raw/*259.8*/("""path.attr("d", function(d) """),format.raw/*259.35*/("""{"""),format.raw/*259.36*/("""
			 
			     """),format.raw/*261.9*/("""var dx = d.target.x - d.source.x,
			           dy = d.target.y - d.source.y,
			           dr = Math.sqrt(dx * dx + dy * dy);
			           return   "M" + d.source.x + "," 
			            + d.source.y 
			            + "A" + dr + "," 
			            + dr + " 0 0,1 " 
			            + d.target.x + "," 
			            + d.target.y;
			  """),format.raw/*270.6*/("""}"""),format.raw/*270.7*/(""");
			    node.attr("transform", nodeTransform);    
			  """),format.raw/*272.6*/("""}"""),format.raw/*272.7*/("""
			"""),format.raw/*273.4*/("""}"""),format.raw/*273.5*/("""

			 
			"""),format.raw/*276.4*/("""/**
			 * Gives the coordinates of the border for keeping the nodes inside a frame
			 * http://bl.ocks.org/mbostock/1129492
			 */ 
			function nodeTransform(d) """),format.raw/*280.30*/("""{"""),format.raw/*280.31*/("""
			  """),format.raw/*281.6*/("""d.x =  Math.max(maxNodeSize, Math.min(w - (d.imgwidth/2 || 16), d.x));
			    d.y =  Math.max(maxNodeSize, Math.min(h - (d.imgheight/2 || 16), d.y));
			    return "translate(" + d.x + "," + d.y + ")";
			   """),format.raw/*284.7*/("""}"""),format.raw/*284.8*/("""
			 
			"""),format.raw/*286.4*/("""/**
			 * Toggle children on click.
			 */ 
			function click(d) """),format.raw/*289.22*/("""{"""),format.raw/*289.23*/("""
			  """),format.raw/*290.6*/("""if (d.children) """),format.raw/*290.22*/("""{"""),format.raw/*290.23*/("""
			    """),format.raw/*291.8*/("""d._children = d.children;
			    d.children = null;
			  """),format.raw/*293.6*/("""}"""),format.raw/*293.7*/(""" """),format.raw/*293.8*/("""else """),format.raw/*293.13*/("""{"""),format.raw/*293.14*/("""
			    """),format.raw/*294.8*/("""d.children = d._children;
			    d._children = null;
			  """),format.raw/*296.6*/("""}"""),format.raw/*296.7*/("""
			 
			  """),format.raw/*298.6*/("""update();
			"""),format.raw/*299.4*/("""}"""),format.raw/*299.5*/("""
			 
			 
			"""),format.raw/*302.4*/("""/**
			 * Returns a list of all nodes under the root.
			 */ 
			function flatten(root) """),format.raw/*305.27*/("""{"""),format.raw/*305.28*/("""
			  """),format.raw/*306.6*/("""var nodes = []; 
			  var i = 0;
			 
			  function recurse(node) """),format.raw/*309.29*/("""{"""),format.raw/*309.30*/("""
			    """),format.raw/*310.8*/("""if (node.children) 
			      node.children.forEach(recurse);
			    if (!node.id) 
			      node.id = ++i;
			    nodes.push(node);
			  """),format.raw/*315.6*/("""}"""),format.raw/*315.7*/("""
			 
			  """),format.raw/*317.6*/("""recurse(root);
			  return nodes;
			"""),format.raw/*319.4*/("""}"""),format.raw/*319.5*/(""" 
			  
			  
			"""),format.raw/*322.4*/("""</script>

    

	</div>
	<div id="wordcloud" style="width:33%; height: 400px; display:inline-block; vertical-align:top">
		<p align="center">Wordcloud</p>
		<script>
	var wordcloudData = '"""),_display_(/*330.24*/wordcloudData),format.raw/*330.37*/("""'.replace(/&quot;/g, "\"");

    var frequency_list = JSON.parse(wordcloudData); 

    console.log(frequency_list);

    var color = d3.scale.linear()
            .domain([0,1,2,3,4,5,6,10,15,20,100])
            .range(["#ddd", "#ccc", "#bbb", "#aaa", "#999", "#888", "#777", "#666", "#555", "#444", "#333", "#222"]);
    d3.layout.cloud().size([400, 300])
            .words(frequency_list)
            .rotate(0)
            .fontSize(function(d) """),format.raw/*342.35*/("""{"""),format.raw/*342.36*/(""" """),format.raw/*342.37*/("""return d.size*10; """),format.raw/*342.55*/("""}"""),format.raw/*342.56*/(""")
            .on("end", draw)
            .start();
    function draw(words) """),format.raw/*345.26*/("""{"""),format.raw/*345.27*/("""
        """),format.raw/*346.9*/("""d3.select("#wordcloud").append("svg")
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
                .style("font-size", function(d) """),format.raw/*357.49*/("""{"""),format.raw/*357.50*/(""" """),format.raw/*357.51*/("""return d.size + "px"; """),format.raw/*357.73*/("""}"""),format.raw/*357.74*/(""")
                .style("fill", function(d, i) """),format.raw/*358.47*/("""{"""),format.raw/*358.48*/(""" """),format.raw/*358.49*/("""return color(i); """),format.raw/*358.66*/("""}"""),format.raw/*358.67*/(""")
                .attr("transform", function(d) """),format.raw/*359.48*/("""{"""),format.raw/*359.49*/("""
                    """),format.raw/*360.21*/("""return "translate(" + [d.x, d.y] + ")rotate(" + d.rotate + ")";
                """),format.raw/*361.17*/("""}"""),format.raw/*361.18*/(""")
                .on('click', function (d) """),format.raw/*362.43*/("""{"""),format.raw/*362.44*/("""
			          """),format.raw/*363.14*/("""window.open("http://localhost:9000/search?searchTerm="+d.text+"&searchType=Content","_blank");
			        """),format.raw/*364.12*/("""}"""),format.raw/*364.13*/(""")
                .text(function(d) """),format.raw/*365.35*/("""{"""),format.raw/*365.36*/(""" """),format.raw/*365.37*/("""return d.text; """),format.raw/*365.52*/("""}"""),format.raw/*365.53*/(""");
    """),format.raw/*366.5*/("""}"""),format.raw/*366.6*/("""
"""),format.raw/*367.1*/("""</script>
	</div>
  	</div>
  
""")))}),format.raw/*371.2*/("""

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
                  DATE: Mon Jan 22 10:26:52 GMT 2018
                  SOURCE: /home/carly/Documents/Project/NewsTweet/NewsTweet/app/views/dataAnalytics.scala.html
                  HASH: 5eb55ff389baeb90e1681ffb326dddaf589fd27f
                  MATRIX: 1153->1|1660->412|1688->414|1884->584|1898->590|1960->632|2084->730|2098->736|2163->781|2294->886|2325->908|2346->920|2361->926|2376->932|2398->945|2412->950|2435->964|2454->974|2475->985|2488->988|2528->989|2558->992|2874->1280|2903->1281|2938->1289|2973->1296|3002->1297|3042->1309|3187->1427|3215->1428|3259->1444|3288->1445|3328->1457|3380->1482|3408->1483|3454->1501|3483->1502|3523->1514|3565->1528|3594->1529|3633->1540|3662->1541|3695->1546|3724->1547|3772->1567|3801->1568|3842->1582|3870->1583|3920->1605|3949->1606|3989->1618|4022->1623|4051->1624|4095->1640|4203->1720|4232->1721|4280->1741|4316->1749|4345->1750|4397->1774|4444->1793|4473->1794|4529->1822|4674->1939|4703->1940|4751->1960|4780->1961|4824->1977|4853->1978|4911->2008|4940->2009|4988->2029|5062->2075|5091->2076|5129->2086|5158->2087|5192->2093|5221->2094|5269->2114|5298->2115|5327->2116|5385->2146|5414->2147|5466->2171|5588->2265|5617->2266|5661->2282|5690->2283|5730->2295|5759->2296|5794->2304|5822->2305|5869->2324|5898->2325|5938->2337|6034->2405|6063->2406|6107->2422|6171->2459|6199->2466|6272->2511|6301->2512|6331->2514|6360->2515|6404->2531|6468->2568|6496->2575|6569->2620|6598->2621|6639->2634|6668->2635|6712->2651|6775->2687|6804->2695|6876->2739|6905->2740|6941->2749|6969->2750|7001->2755|7029->2756|7309->3009|7334->3013|8074->3724|8104->3725|8138->3731|8462->4026|8492->4027|8531->4037|8561->4038|8742->4190|8772->4191|8802->4192|8851->4212|8881->4213|9320->4623|9350->4624|9380->4625|9422->4638|9452->4639|9645->4803|9675->4804|9705->4805|9779->4850|9809->4851|9994->5007|10024->5008|10054->5009|10121->5047|10151->5048|10525->5393|10555->5394|10585->5395|10627->5408|10657->5409|10722->5445|10752->5446|10782->5447|10822->5458|10852->5459|10917->5495|10947->5496|10977->5497|11017->5508|11047->5509|11382->5815|11412->5816|11458->5833|11503->5849|11533->5850|11580->5868|11655->5914|11685->5915|11733->5934|11763->5935|11838->5981|11868->5982|11913->5998|12083->6139|12113->6140|12143->6141|12183->6152|12213->6153|12284->6195|12314->6196|12344->6197|12384->6208|12414->6209|12534->6300|12564->6301|12663->6371|12693->6372|12738->6388|12856->6477|12886->6478|12916->6479|12956->6490|12986->6491|13057->6533|13087->6534|13117->6535|13157->6546|13187->6547|13305->6636|13335->6637|13634->6907|13664->6908|13705->6920|13832->7018|13862->7019|13957->7085|13987->7086|14032->7102|14104->7145|14134->7146|14360->7343|14390->7344|14431->7356|14576->7472|14606->7473|14839->7677|14869->7678|14915->7696|14971->7723|15001->7724|15043->7738|15409->8076|15438->8077|15524->8135|15553->8136|15585->8140|15614->8141|15652->8151|15843->8313|15873->8314|15907->8320|16143->8528|16172->8529|16209->8538|16303->8603|16333->8604|16367->8610|16412->8626|16442->8627|16478->8635|16563->8692|16592->8693|16621->8694|16655->8699|16685->8700|16721->8708|16807->8766|16836->8767|16875->8778|16916->8791|16945->8792|16987->8806|17104->8894|17134->8895|17168->8901|17263->8967|17293->8968|17329->8976|17494->9113|17523->9114|17562->9125|17627->9162|17656->9163|17701->9180|17919->9370|17954->9383|18433->9833|18463->9834|18493->9835|18540->9853|18570->9854|18677->9932|18707->9933|18744->9942|19319->10488|19349->10489|19379->10490|19430->10512|19460->10513|19537->10561|19567->10562|19597->10563|19643->10580|19673->10581|19751->10630|19781->10631|19831->10652|19940->10732|19970->10733|20043->10777|20073->10778|20116->10792|20251->10898|20281->10899|20346->10935|20376->10936|20406->10937|20450->10952|20480->10953|20515->10960|20544->10961|20573->10962|20636->10994
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|50->18|50->18|51->19|51->19|51->19|52->20|56->24|56->24|57->25|57->25|58->26|59->27|59->27|60->28|60->28|61->29|61->29|61->29|61->29|61->29|61->29|61->29|61->29|61->29|62->30|62->30|63->31|63->31|64->32|64->32|64->32|65->33|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|72->40|72->40|73->41|73->41|74->42|74->42|76->44|76->44|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|78->46|78->46|79->47|79->47|80->48|81->49|81->49|82->50|82->50|83->51|83->51|84->52|84->52|86->54|86->54|87->55|89->57|89->57|90->58|91->59|91->59|93->61|93->61|93->61|93->61|94->62|95->63|95->63|97->65|97->65|98->66|98->66|99->67|100->68|100->68|102->70|102->70|103->71|103->71|104->72|104->72|116->84|116->84|155->123|155->123|156->124|166->134|166->134|166->134|166->134|172->140|172->140|172->140|172->140|172->140|189->157|189->157|189->157|189->157|189->157|195->163|195->163|195->163|195->163|195->163|201->169|201->169|201->169|201->169|201->169|215->183|215->183|215->183|215->183|215->183|216->184|216->184|216->184|216->184|216->184|217->185|217->185|217->185|217->185|217->185|225->193|225->193|226->194|226->194|226->194|227->195|228->196|228->196|230->198|230->198|232->200|232->200|233->201|236->204|236->204|236->204|236->204|236->204|237->205|237->205|237->205|237->205|237->205|240->208|240->208|242->210|242->210|243->211|245->213|245->213|245->213|245->213|245->213|246->214|246->214|246->214|246->214|246->214|249->217|249->217|257->225|257->225|258->226|262->230|262->230|265->233|265->233|266->234|267->235|267->235|274->242|274->242|275->243|278->246|278->246|288->256|288->256|291->259|291->259|291->259|293->261|302->270|302->270|304->272|304->272|305->273|305->273|308->276|312->280|312->280|313->281|316->284|316->284|318->286|321->289|321->289|322->290|322->290|322->290|323->291|325->293|325->293|325->293|325->293|325->293|326->294|328->296|328->296|330->298|331->299|331->299|334->302|337->305|337->305|338->306|341->309|341->309|342->310|347->315|347->315|349->317|351->319|351->319|354->322|362->330|362->330|374->342|374->342|374->342|374->342|374->342|377->345|377->345|378->346|389->357|389->357|389->357|389->357|389->357|390->358|390->358|390->358|390->358|390->358|391->359|391->359|392->360|393->361|393->361|394->362|394->362|395->363|396->364|396->364|397->365|397->365|397->365|397->365|397->365|398->366|398->366|399->367|403->371
                  -- GENERATED --
              */
          