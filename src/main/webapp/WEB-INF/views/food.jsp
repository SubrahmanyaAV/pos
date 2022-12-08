<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Food Page</title>
</head>

<body>

<h1>Food Page</h1>

<a href="home.html">Home</a>

<form:form action="food.html" method="post">

		<label>Food Id</label>
		<form:input path="foodID"/>
		<br /> <br /> 
		
		<label>Quantity </label> 
		<form:input type="number" id="foodQuantity"
		path="foodQuantity" min="1" max="5" />
		<br /><br /> 
				
		<label>type</label>
		<select name="foodtype" id="foodtype">
			<option>Veg</option>
			<option>Non Veg</option>
		</select> <br /> <br />
		
		<label>type</label>
		<select name="foodSize" id="foodSize">
			<option>Regular</option>
			<option>Medium</option>
			<option>Large</option>
		</select> <br /> <br /> 
		
		<label>Food Name</label>
		<form:input path="name" />
		<br /><br /> 

		<label>Price</label>
		<form:input path="price" />
		<br /><br /> 
		
		<input type="submit" value="Create" />

	</form:form>

	<h1>Food List</h1>

	<table border="1">

		<thead>
			<tr>
			<td>id </td>
				<td>Food id </td>
				<td>Food Name</td>
				<td>Food Type</td>
				<td>Food Size</td>
				<td>Quantity</td>
				<td>Price</td>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${FOODLIST}" var="f">

				<tr>
				<td><c:out value="${f.f_id}"></c:out></td>
					<td><c:out value="${f.foodID}"></c:out></td>
					<td><c:out value="${f.foodQuantity}"></c:out></td>
					<td><c:out value="${f.foodSize}"></c:out></td>
					<td><c:out value="${f.foodtype}"></c:out></td>
					<td><c:out value="${f.name}"></c:out></td>
					<td><c:out value="${f.price}"></c:out></td>
					
					<td><a href="<c:url value='/food-del-${f.foodID}'/>"><button>Remove</button></a></td>
					<td><a href="<c:url value='/food-edit-${f.foodID}'/>"><button>Modify</button></a></td>					
				</tr>
				
			</c:forEach>

		</tbody>
	</table>


</body>
</html>