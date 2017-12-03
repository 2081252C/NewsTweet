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

// function carousel() {
// 	alert(called);
//     var i;
//     var x = document.getElementsByClassName(arguments[0]);
//     for (i = 0; i < x.length; i++) {
//       x[i].style.display = "none";
//     }
//     slideIndex++;
//     if (slideIndex > x.length) {slideIndex = 1}
//     x[slideIndex-1].style.display = "block";
//     setTimeout(carousel(), 1000); // Change image every 2 seconds
// }