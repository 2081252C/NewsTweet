function rendering(){
	var here = document.getElementById(arguments[0]);
	var id = arguments[0];
	window.onload = (create(id, here));
}

function create(){
		twttr.widgets.createTweet(
	      arguments[0], arguments[1], 
	 	   {
		        conversation : 'none',    // or all
		        cards        : 'hidden',  // or visible 
		        linkColor    : '#cc0000', // default is blue
		        theme        : 'light'    // or dark	
		});
	 }