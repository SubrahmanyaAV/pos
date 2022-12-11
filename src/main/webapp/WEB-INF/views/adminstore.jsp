<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Page</title>
</head>
<body>

	<a href="home.html">Home</a>
	<br/>

	<h1>Store Page</h1>

	<form:form action="adminstore.html" method="post">


		<label>StoreId</label>
		<form:input path="storeID" />
		<br />
		<br />

		<label>Store Name</label>
		<form:input path="name" />
		<br />
		<br />

		<label>Street</label>
		<form:input path="street" />
		<br />
		<br />

		<label>Mobile Number</label>
		<form:input path="mobileNo" />
		<br />
		<br />

		<label>City</label>
		<form:input path="city" />
		<br />
		<br />

		<label>State</label>
		<form:input path="state" />
		<br />
		<br />

		<label>Pincode</label>
		<form:input path="pincode" />
		<br />
		<br />

		<input type="submit" value="Create" />

	</form:form>

	<h1>Store List</h1>

	<table border="1">

		<thead>
			<tr>
				<td>id</td>
				<td>Store id</td>
				<td>Store Name</td>
				<td>Street</td>
				<td>Mobile Number</td>
				<td>City</td>
				<td>State</td>
				<td>Pincode</td>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${STORELIST}" var="s">

				<tr>
					<td><c:out value="${s.id}"></c:out></td>
					<td><c:out value="${s.storeID}"></c:out></td>
					<td><c:out value="${s.name}"></c:out></td>
					<td><c:out value="${s.street}"></c:out></td>
					<td><c:out value="${s.mobileNo}"></c:out></td>
					<td><c:out value="${s.city}"></c:out></td>
					<td><c:out value="${s.state}"></c:out></td>
					<td><c:out value="${s.pincode}"></c:out></td>
					<td><a href="<c:url value='/store-del-${s.storeID}'/>"><button>Remove</button></a></td>
					<td><a href="<c:url value='/store-edit-${s.storeID}'/>"><button>Modify</button></a></td>
					<%-- <td><a href="<c:url value='/store-view-${s.storeID}'/>"><button>View</button></a></td> --%>

				</tr>

			</c:forEach>

		</tbody>
	</table>


</body>
</html>