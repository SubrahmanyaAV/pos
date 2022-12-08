<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

	<h1>Login page</h1>

	<c:if test="${param.ERROR != null }">
		<c:out value="${param.ERROR }" />
	</c:if>

	<form action="login.html" method="post">
		<label>User Id</label> <input type="text" name="userID"><br />
		<label>Password</label> <input type="password" name="password"><br />
		<input type="submit" value="login">
	</form>
<h3> New User<a href = "user.html"> Click Here</a></h3> 

<br/>
 <!-- <h3> New User<a href = "credentials.html   "> Click Here</a></h3> --> 
</body>
</html>