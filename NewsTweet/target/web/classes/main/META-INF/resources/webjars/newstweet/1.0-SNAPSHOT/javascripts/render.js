function rendering(){
	var here = document.getElementById(arguments[0]);
	var id = arguments[0];
    if (id.substring(id.length-1) == "a" || id.substring(id.length-1) == "p")
    {
        id = id.substring(0, id.length-1);
    }

	window.onload = (create(id.trim(), here));

    //hideDeletedTweet(here, id);
}

function create(){
		twttr.widgets.createTweet(
	      arguments[0], arguments[1], 
	 	   {
		        conversation : 'all',    // or all
		        cards        : 'visible',  // or visible 
		        linkColor    : '#5e97f2', // default is blue
		        theme        : 'light'    // or dark	
		});
	 }

function openCity(evt, cityName) {
    var i, x, tablinks;
    x = document.getElementsByClassName("city");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("persona");
    console.log(tablinks);
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" clicked", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " clicked";
}

function openTab(evt, cityName) {
    var i, x, tablinks;
    x = document.getElementsByClassName("tweets");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("search_result");
    console.log(tablinks);
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}

function display(section, toBeHidden) {
    console.log("h4");
    var x = document.getElementById(section);
    var y = document.getElementById(toBeHidden);
    if (x.style.display === "none") {
        console.log("ok");
        x.style.display = "block";
        y.style.display = "none";
    } 
    else {
        console.log("o");
        x.style.display = "none";
        y.style.display = "block";
    }
}

function displayNoTweetsMessage(section, messageArea){
    var x = document.getElementById(messageArea);
    if(!$.trim( $('#'+section).html() ).length) {
        x.style.display = "block";
    }
}

function hideDeletedTweet(tweetDiv, tweet){
    var x = document.getElementById(tweetDiv);
    //var y = $("#"+tweet).attr("id");
    var t = document.getElementById(tweet);
    var y = t.getElementsByTagName("iframe");
    console.log(y);
    if(y.length==0) {
        x.style.display = "none";
    }
}
