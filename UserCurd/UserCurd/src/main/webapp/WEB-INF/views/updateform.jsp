<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user details</title>
</head>
<body>
	<h1 align="center">change  Details</h1>


	<form action="${pageContext.request.contextPath }/user" method="post">
		<label>ID :</label> <input type="number" name=id value="${user.id }"><br>
		<label>First Name :</label> <input type="text" name=firstname
			placeholder="Enter the first name" value="${user.firstname }"><br>
		<label>Last Name :</label> <input type="text" name=lastname
			placeholder="Enter  the last name" value="${user.lastname }"><br>
			<label>Date of Birth</label><input type="text" name="date">
		<label>Gender :</label> <input type="text" required="required"
			name=gender value="${user.gender }"><br> <label>Email
			:</label> <input type="email" name=email placeholder="Enter the valdi email"
			value="${user.email }"><br>
		<button type="submit">update</button>
	</form>
</body>
</html>