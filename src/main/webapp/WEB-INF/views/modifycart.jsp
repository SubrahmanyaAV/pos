<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit FOOD</title>
</head>
<body>

<h1>Food List</h1>

<form:form action="modifycart.html" method="post">

		<label>Cart Id</label>
		<form:input path="cartID" readonly="true" />
		<br />
		<br />

		<label>Type</label>
		<form:input path="cartType" />
		<br />
		<br />

		<label>Food Name</label>
		<form:input path="name" readonly="true"/>
		<br />
		<br />

		<label>FoodType</label>
		<form:input path="cost" />
		<br />
		<br />

		<form:input path="orderDate" hidden="true" readonly="true"/>
		<br />
		<br />

		<label>Quantity</label>
		<form:input path="cartQuantity" />
		<br />
		<br />

		<input type="submit" value="modify" />
	
	</form:form>
	
		</tbody>
	</table>
	
</body>
</html>