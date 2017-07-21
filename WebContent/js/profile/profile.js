// 判断密码是否为空
			$("#changepassword").blur(function() {
				if ($(this).val().length == 0) {
					$("#changepassword").show();
				} else {
					$("#changepassword").hide();
				}
			});