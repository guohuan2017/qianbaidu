// 判断密码是否为空
$("document").ready(
		function() {
			$("#password").blur(function() {
				if ($(this).val().length == 0) {
					$("#passwordspan").show();
				} else {
					$("#passwordspan").hide();
				}
			});
			
			$("#newpassword").blur(function() {
				if ($(this).val().length == 0) {
					$("#newpasswordspan").show();
				} else {
					$("#newpasswordspan").hide();
				}
			});
			
			$("#repassword").blur(function() {
				if ($(this).val().length == 0) {
					$("#repasswordspan").show();
					$("#repasswordspan2").hide();
				} else if($(this).val() != $("#newpassword").val()){
					$("#repasswordspan").hide();
					$("#repasswordspan2").show();
				}else{
					$("#repasswordspan").hide();
					$("#repasswordspan2").hide();
				}
			});
			
			$("#pwbutton").click(function() {
				if($("#newpassword").val() != $("#repassword").val()){
					$("#repasswordspan2").show();
				}else{
					$("#pwform").submit();
				}
			});
			
			
			
			
		});