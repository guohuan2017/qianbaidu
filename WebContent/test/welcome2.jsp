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
	<hr>
	管理员<br>
	admin.username + admin.password：${admin.username } + ${admin.password }
	<hr>
	商家<br>
	store.storename + store.password+store.tel：${store.storename } + ${store.password }+ ${store.tel }
	<hr>
	
	<form action="uploadstore.action" method="post" enctype="multipart/form-data">
		<input type="file" name="filename"> <input type="submit" value="上传">
	</form>
	<br>
	<img src="${store.photo}">
</body>
</html>