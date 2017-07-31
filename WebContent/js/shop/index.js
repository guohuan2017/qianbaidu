window.onscroll = function(){
	console.log(document.body.scrollTop);
	if(document.body.scrollTop >= 370){
		$("#nav-left").show();
	}else{
		$("#nav-left").hide();
	}
};

$("#ilikestar").click(function(){
	console.log("hello");
	if($("#ilikestar").css("color") == "white"){
		console.log(("#ilikestar").color);
		$("#ilikestar").color = "yellow";
		
	}else{
		console.log($("#ilikestar").css("color"));
		("#ilikestar").color = "white"
	}
});
