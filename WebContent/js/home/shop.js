$(document).ready(function(){
	$("#go-to-cart").click(function(event){
		event.stopPropagation();
		$("#side-bar").css("right","0");
	});
	$("#side-bar").click(function(event){
		event.stopPropagation();
		$("#side-bar").css("right","0");
	});
	$("body").not("#side-bar").click(function(){
		$("#side-bar").css("right","-295px");
	});
});

