<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户登录</title>
		<link rel="stylesheet" href="../css/user/login.css" />
	</head>

	<body>
		<div id="head-bar">
			<div id="back">
				<svg viewBox="0 0 20 32" id="arrow-left">
					<a href="../home/shop.jsp">
						<path fill="#fff" d="M16.552 5.633L14.508 3.59 2.243 15.853 14.508 28.41l2.044-2.043-10.22-10.513z">
						</path>
					</a>
				</svg>
			</div>

			<h1 id="center">登录</h1>
			<h1 id="right"><a href="../user/register.jsp" style="color: white;">注册</a></h1>

		</div>

		<form action="../userlogin.action" method="post">
			<div id="loginparent">
				<div class="logincontentdiv">
					<input type="text" class="logincontent" name="phone" placeholder="请输入手机号" />
				</div>
				<div class="logincontentdiv" style="border-bottom: 1px solid; border-color: rgb(221, 221, 221);">
					<input type="password" class="logincontent" name="password" placeholder="请输入密码" />
				</div>

				<button id="loginbtn">登录</button>

			</div>
		</form>

	</body>

</html>