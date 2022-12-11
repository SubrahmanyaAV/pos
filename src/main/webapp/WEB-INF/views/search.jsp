<%@page import="com.cruds.pos.bean.CredentialsBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>

<%-- 	<%
		CredentialsBean cb = (CredentialsBean) session.getAttribute("CREDENTIAL");
	
	%>

	<%
		if(cb.getC_id().equals(""))
		{
	%>
 --%>
 	<form action="search.html" method="post">
		<label>ID</label> 
		<input type="text" name="id"><br /> 
		<input type="submit" value="search">
	</form>
 	
<%--  	
 	
	<h3>User Profile</h3>

	<table border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>DateOfBirth</td>
				<td>Gender</td>
				<td>Street</td>
				<td>Location</td>
				<td>City</td>
				<td>State</td>
				<td>Pincode</td>
				<td>MobileNo</td>
				<td>emailID</td>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${PROFILE}" var="u">

				<tr>
					<td><c:out value="${u.id}"></c:out></td>
					<td><c:out value="${u.firstName}"></c:out></td>
					<td><c:out value="${u.lastName}"></c:out></td>
					<td><c:out value="${u.dateOfBirth}"></c:out></td>
					<td><c:out value="${u.gender}"></c:out></td>
					<td><c:out value="${u.street}"></c:out></td>
					<td><c:out value="${u.location}"></c:out></td>
					<td><c:out value="${u.city}"></c:out></td>
					<td><c:out value="${u.state}"></c:out></td>
					<td><c:out value="${u.pincode}"></c:out></td>
					<td><c:out value="${u.mobileNo}"></c:out></td>
					<td><c:out value="${u.emailID}"></c:out></td>
					<td><a href="<c:url value='/user-edit-${u.id}'/>">edit</a></td>
				</tr>

			</c:forEach>

		</tbody>
	</table>
	<br />

 --%>	<h3>User Credentials</h3>

	<table border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>isActive</td>
				<td>userID</td>
				<td>loginStatus</td>
				<!-- <td>profile id</td> -->
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${User}" var="u">

				<tr>
					<td><c:out value="${u.id}"></c:out></td>
					<td><c:out value="${u.isActive}"></c:out></td>
					<td><c:out value="${u.userID}"></c:out></td>
					<td><c:out value="${u.loginStatus}"></c:out></td>
					<td><a href="<c:url value='/userinactive-${u.id}'/>">InActivate</a></td>
					<%-- <td><c:out value="${u.profile_id}"></c:out></td> --%>
					<%-- <td><a href="<c:url value='/user-del-${u.id}'/>">Delete</a></td> --%>
				</tr>

			</c:forEach>

		</tbody>
	</table>
	
	<br/><br/>
	<a href="home.html">Home</a>
	




<%-- 	<%
		}
	%>
 --%>

</body>
</html>