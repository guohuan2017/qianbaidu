<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>welcome</title>

</head>
<body>
	

	<span style="color:red">${message}</span><br>
	<%-- 
	<hr>
	管理员<br>
	user.username + user.password：${user.username } + ${user.password }
	 --%>
	<hr>
	商家<br>
	user.storename + user.password+store.tel：${user.storename } + ${user.password }+ ${user.tel }
	<hr>
	
	<form action="uploadstore.action" method="post" enctype="multipart/form-data">
		<input type="file" name="filename"> <input type="submit" value="上传">
	</form>
	<br>
	<img src="${store.photo}">
</body>
</html>