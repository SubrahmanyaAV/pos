<%@page import="com.cruds.pos.form.CartFormBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
</head>
<body>

	<a href="home.html">Home</a>

	<h3>Cart</h3>

	<table border="1">
		<thead>
			<tr>
				<td>cartID</td>
				<td>quantity</td>
				<td>type</td>
				<td>cost</td>
				<td>orderDate</td>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${CART}" var="c">

				<tr>
					<td><c:out value="${c.cartID}"/></td>
					<td><c:out value="${c.quantity}"/></td>
					<td><c:out value="${c.type}"/></td>
					<td><c:out value="${c.cost}"/></td>
					<td><c:out value="${c.orderDate}"/></td>
				</tr>

			</c:forEach>

		</tbody>
	</table>
	
	
	<br/><br/><br/>
	<a href="order.html"><button>Place Order</button> </a>



</body>
</html>