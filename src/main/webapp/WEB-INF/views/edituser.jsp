<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

	<h1>User Page</h1>

	<form:form action="editUser.html" method="post">
		<label>Id</label>
		<form:input path="id" readonly ="true" />
		<br /><br />
		<label>FirstName</label>
		<form:input path="firstName" />
		<br /><br />
		<label>LastName</label>
		<form:input path="lastName" />
		<br /><br />
		
  		<label>DOB</label>
		<form:input type="date" path="dateOfBirth" readonly ="true"/>
		<br />
		<label>Gender</label>
		<select name="gender" id="gender" readonly ="true">
			<option>Male</option>
			<option>Female</option>
			<option>Other</option>
		</select>
		<br />
		<label>Street</label>
		<form:input path="street" />
		<br />
		<label>Location</label>
		<form:input path="location"  />
		<br />
		<label>City</label>
		<form:input path="city"  />
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

<%-- 	<label>Password</label>
		<form:input type="password" path="password" />
		<br />
 --%>		<input type="submit" value="update" />
	</form:form>


</body>
</html>