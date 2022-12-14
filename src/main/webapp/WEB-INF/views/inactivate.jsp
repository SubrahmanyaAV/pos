<%@page import="java.util.Set"%>
<%@page import="com.cruds.pos.bean.CredentialsBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Page</title>
</head>
<body>

	<%
		Set<CredentialsBean> cb = (Set<CredentialsBean>) session.getAttribute("CREDENTIALS");
	%>

	<h3>Search User</h3>
	
	<a href="home.html">Home</a>
	<br/><br/>

	<h3>User Details</h3>
  	
	<form:form action="inActivate.html" method="post">
		<label>ID</label>
		<form:input path="id" />
		<br /><br />
		<label>isActive</label>
		<select name="isActive" id="isActive">
			<option>Y</option>
			<option>N</option>
		</select>
		<br /><br />

<%-- 		<label>isActive</label>
		<form:input path="isActive"  />
		<br />
 --%>		<!-- <label>loginStatus</label> -->
		<form:input path="loginStatus" hidden="true" readonly="true" />
		<br />
		<label>User ID</label>
		<form:input path="userID" readonly="true" />
		<br />
		<!-- <label>password</label> -->
		<form:input path="password" hidden="true" readonly="true" />
		<br />
		
		<!-- <label>userType</label> -->
		<form:input path="userType" hidden="true" readonly="true" />
		<br />
		<input type="submit" value="InActivate" />
	
	</form:form>
	
	
<%--<h1>Profile</h1>

	
	<table border="1">
		<thead>
			<tr>
			    <td>id</td>
			    <td>isActive</td>
				<td>loginStatus</td>
				<td>userID</td>
				<td>userType</td>
				<!-- <td>profile id</td> -->
			</tr>
		</thead>
		<tbody>
		<%
			for(CredentialsBean c : cb){
		%>
			<tr>
				<td><%=c.getC_id()%></td>
				<td><%=c.getIsActive()%></td>
				<td><%=c.getLoginStatus() %></td>
				<td><%=c.getUserID()%></td>
				<td><%=c.getUserType()%></td>
			</tr>
		<%
			}
		%>		
	
	</tbody>				
	</table>
	
 --%>

</body>
</html>