<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user details</title>
</head>
<body>
	<h1 align="center">Add User Details</h1>



	<form action="user" method="post">

		<label>First Name :</label> <input type="text" name=firstname
			placeholder="Enter the first name"><br> <label>Last
			Name :</label> <input type="text" name=lastname
			placeholder="Enter  the last name"><br> <label>Date
			Of Birth :</label> <input type="text" name=date placeholder="dd/mm/yyy"><br>
		<label>Gender :</label> <input type="text" required="required" name=gender ><br>
		<label>Email :</label> <input type="email" name=email
			placeholder="Enter the valdi email"><br>
		<button type="submit">Add User</button>

	</form>
</body>
</html>