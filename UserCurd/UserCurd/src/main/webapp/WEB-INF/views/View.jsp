<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<meta charset="UTF-8">
<title>View User Details</title>
</head>
<body>
	<h1 align="center">Welcome to User Details Portal</h1>
	<table>
		<tr>
			<th>id</th>
			<th>First Name</th>
			<th>Last name</th>
			<th>Date of birth</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${users}" var="v">
			<tr>
				<td>${v.id}</td>
				<td>${v.firstname}</td>
				<td>${v.lastname}</td>
				<td>${v.date}</td>
				<td>${v.gender}</td>
				<td>${v.email}</td>
				<td><a href="delete/${v.id }"><button>Delete</button></a></td>
				<td><a href="update/${v.id }"><button>Edit</button></a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="adduser" style="align-items: center;"><button>Add
			user</button></a>
</body>
</html>