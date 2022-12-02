<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1>   Welcome      </h1>
		

	
	<br />
	<br />
 	 <a href = "cart.html?quantity=2&type=veg&cost=250&orderDate=2022-11-26&foodID=111">
 	 <button>Add to Cart</button></a> 
 	 
 	 <!-- &quantity=1&foodSize=regular&type=medium&name=vegpizza&price=250 -->
 	 
 <%-- 
	<form:form action="cart.html" method="post">
		<label >Quantity </label>
		<form:input type="number" path="quantity" min="1"
			max="5" />
		<br />
		<label>type</label>
		<select name="type" id="type">
			<option>Veg</option>
			<option>Non Veg</option>
		</select>
		<br />
		<label>cost</label>
		<form:input path="cost" />
		<br />
		<label>orderDate</label>
		<form:input path="orderDate" />
		<br />
		<label>foodID</label>
		<form:input path="foodID" />
		<br />
		<label>foodSize</label>
		<form:input path="foodSize" />
		<br />
		<label>type</label>
		<select name="type" id="type">
			<option>Veg</option>
			<option>Non Veg</option>
		</select>
		<br />
		<label>name</label>
		<form:input path="name" />
		<br />
		<label>price</label>
		<form:input path="price" />
 		<br />
 		<input type="submit" value="add to cart" />

	</form:form>
--%>	

</body>
</html>