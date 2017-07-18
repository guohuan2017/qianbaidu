<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login页面</title>
</head>
<body>
<!-- 	<form action="/SpringMVCDemo/index.action?method=login" method="post" id="loginform">
 -->	<form action="javascript：void(0);" method="post" id="loginform">
			帐号<input type="text" name="username" id="username"
				placeholder="请输入帐号" value=${param.username}> <span id="usernamespan">用户名不能为空</span><br />
			密码<input type="password" name="password" id="password"
				placeholder="请输入密码" /> <span id="passwordspan">密码不能为空</span> <br />
			
			<input type="button" value="连接数据库login" onclick="operate('sqllogin.action')"/>
			<input type="button" value="连接数据库regist" onclick="operate('sqlregist.action')"/>
	</form>
	${message }
	
	<script type="text/javascript">
		var form=document.getElementById("loginform");
		function operate(action)
        {
            form.action=action;
            form.submit();
        }
	</script>
</body>
</html>