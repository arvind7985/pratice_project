<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.div1{
align-content: left;
}
.div1,h1{
color:sky blue;
}

</style>
</head>
<body>
<div id="div1">
	<h1>Output is </h1>
</div>
<%

out.print(session.getAttribute("list"));

%>
</body>
</html>