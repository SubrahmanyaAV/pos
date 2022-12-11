<%@page import="com.cruds.pos.bean.CredentialsBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>

<body>

	<a href="home.html">Home</a>
	<br/>

  	<h3>User Details</h3>
  	
	<form:form action="user.html" method="post">
 		<label>User ID</label>
		<form:input path="userID" />
		<br /> 
		<label>Password</label> 
		<form:input path="password" type="password" />     
		<br /> 
		
		<label>FirstName</label>
		<form:input path="firstName" />
		<br />
		<label>LastName</label>
		<form:input path="lastName" />
		<br />
		<label>DOB</label>
		<form:input type="date" placeholder="yyyy-MM-dd" path="dateOfBirth" />
		<label>  yyyy/MM/dd</label>
		<br />
		<label>Gender</label>
		<select name="gender" id="gender">
			<option>Male</option>
			<option>Female</option>
			<option>I cannot disclose</option>
		</select>
		<br />
		<label>Street</label>
		<form:input path="street" />
		<br />
		<label>Location</label>
		<form:input path="location" />
		<br />
		<label>City</label>
		<form:input path="city" />
		<br />
		<label>State</label>
		<form:input path="state" />
		<br />
		<label>Pincode</label>
		<form:input path="pincode" />
		<br />
		<label>MobileNo</label>
		<form:input path="mobileNo" />
		<br />
		<label>emailID</label>
		<form:input path="emailID" />
		<br />
		<input type="submit" value="Create" />

	</form:form>
	
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
	<br /><br />


	<h3>User Credentials</h3>

	<table border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>isActive</td>
				<td>userID</td>
				<td>Password</td>
				<td>loginStatus</td>
				<!-- <td>profile id</td> -->
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${CREDENTIALS}" var="u">

				<tr>
					<td><c:out value="${u.id}"></c:out></td>
					<td><c:out value="${u.isActive}"></c:out></td>
					<td><c:out value="${u.userID}"></c:out></td>
					<td><c:out value="${u.password}"></c:out></td>
					<td><c:out value="${u.loginStatus}"></c:out></td>
					
					<%-- <td><c:out value="${u.profile_id}"></c:out></td> --%>
					<%-- <td><a href="<c:url value='/user-del-${u.id}'/>">Delete</a></td> --%>
				</tr>

			</c:forEach>

		</tbody>
	</table>
	
	
	
 
</body>
</html>