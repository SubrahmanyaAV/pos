<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Page</title>
</head>
<body>

	<br/><br/>
	<a href="home.html">Home</a>
	<br/>
	<br/>


	<h1>Store</h1>

	<form action="store.html" method="post">
		<label>City</label> 
		<input type="text" name="city"><br/> <br/>
		<input type="submit" value="search">
	</form>
	<br/><br/>
	
	<h3>Store List</h3>

	<table border="1">
		<thead>
			<tr>
				<td>s_id</td>
				<td>city</td>
				<td>mobileNo</td>
				<td>name</td>
				<td>pincode</td>
				<td>state</td>
				<td>storeID</td>
				<td>street</td>
				
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${STORE}" var="s">
				<tr>
					<td><c:out value="${s.id}" /></td>
					<td><c:out value="${s.city}" /></td>
					<td><c:out value="${s.mobileNo}" /></td>
					<td><c:out value="${s.name}" /></td>
					<td><c:out value="${s.pincode}" /></td>
					<td><c:out value="${s.state}" /></td>
					<td><c:out value="${s.storeID}" /></td>
					<td><c:out value="${s.street}" /></td>
					<%-- <td><a href="<c:url value='/select-store'/>">select</a></td> --%>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>