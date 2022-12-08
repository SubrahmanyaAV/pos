<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit FOOD</title>
</head>
<body>

	<a href="home.html">Home</a>
	<br /><br />
	
	<h1>EDIT FOOD</h1>

	<form:form action="modifyFood.html" method="POST">

		<label>FoodId</label>
		<form:input path="foodID" />
		<br />
		<br />

		<label>Food Name</label>
		<form:input path="name" />
		<br />
		<br />

		<label>FoodType</label>
		<form:input path="foodtype" />
		<br />
		<br />

		<label>Food Size</label>
		<form:input path="foodSize" />
		<br />
		<br />

		<label>Quantity</label>
		<form:input path="foodQuantity" />
		<br />
		<br />

		<label>Price</label>
		<form:input path="price" />
		<br />
		<br />

		<input type="submit" value="update" />

	</form:form>

	<h1>Food List</h1>

	<table border="1">

		<thead>
			<tr>
				<td>id</td>
				<td>Food id</td>
				<td>Food Name</td>
				<td>Food Type</td>
				<td>Food Size</td>
				<td>Quantity</td>
				<td>Price</td>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${FOOD}" var="f">

				<tr>
					<td><c:out value="${f.f_id}"></c:out></td>
					<td><c:out value="${f.foodID}"></c:out></td>
					<td><c:out value="${f.foodQuantity}"></c:out></td>
					<td><c:out value="${f.foodSize}"></c:out></td>
					<td><c:out value="${f.foodtype}"></c:out></td>
					<td><c:out value="${f.name}"></c:out></td>
					<td><c:out value="${f.price}"></c:out></td>

				</tr>

			</c:forEach>

		</tbody>
	</table>



</body>
</html>