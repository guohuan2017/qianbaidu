window.onscroll = function(){
	console.log(document.body.scrollTop);
	if(document.body.scrollTop >= 392){
		$("#nav-left").show();
	}else{
		$("#nav-left").hide();
	}
};
