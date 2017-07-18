<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="pojo.User"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>welcome</title>

</head>
<body>
	<%-- <%User user = (User)request.getAttribute("user"); %>
	欢迎：<%=user.getUsername() %>+<%=user.getPassword() %><br> --%>
	
	
	username + password：${username } and ${password }<br>
	
	以ModelMap传值时使用 ：
	<!-- 用EL表达式的不同格式 在处理关键字时使用-->
	${modelMap.username } and ${modelMap["password"] }<br>
	
	${message}<br>
	${hello}<br>
	user.username + user.password：${user.username } + ${user.password }
	<br>
	<hr>
	<spring:eval expression="user.username"></spring:eval>
	<spring:eval expression="user.password"></spring:eval>
</body>
</html>