<%@page import="com.cruds.pos.bean.ProfileBean"%>
<%@page import="com.cruds.pos.bean.FoodBean"%>
<%@page import="com.cruds.pos.bean.CredentialsBean"%>
<%@page import="com.cruds.pos.form.CartFormBean"%>
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

	<div class="col-md-10 well-fix">

		<div class="container well">
			<span>
				Hello <strong>${PROFILE.firstName}</strong>, Welcome to XYZ Pizza
			</span>
		</div>

	</div>



	<br />
	<%
	//	CartFormBean cb = (CartFormBean) session.getAttribute("foodID");	
	//	CartFormBean c = (CartFormBean) session.getAttribute("id");
	
	//	Long f_id = (Long) session.getAttribute("foodID");	
	//	Long customer = (Long) session.getAttribute("ID");
	
		CredentialsBean user = (CredentialsBean) session.getAttribute("USER");
		FoodBean fb = (FoodBean) session.getAttribute("FOOD");
	%>

	<!--  	<a
		href="cart.html?quantity=2&type=veg&cost=250&orderDate=2022-11-26">
		<button>Add to Cart</button>
	</a>
 -->
	<!-- &quantity=1&foodSize=regular&type=medium&name=vegpizza&price=250 -->

	<%-- 	<p>
		Customer ID
		<%=cb.getC_id()%></p>
	<br />

	<p>
		Food ID
		<%=fb.getF_id()%></p>
	<br />
	
 --%>

	<%
 		if(user.getUserType().equals("A"))
 		{	
 	
 	%>
	<a href="food.html">Food</a>
	<br />
	<br />

	<a href="adminstore.html">Store</a>
	<br />
	<br />

	<a href="user.html">User</a>
	<br />
	<br />
	<%
 		}
 	%>
	<a href="userlist.html">Edit Profile</a>
	<br />
	<br />


	<br />

	<form action="cart.html" method="post">
		<label>Quantity </label> <input type="number" id="quantity"
			name="quantity" min="1" max="5" /> <br /> <label>type</label> <select
			name="type" id="type">
			<option>Veg</option>
			<option>Non Veg</option>
		</select> <br /> <label>cost</label> <input type="text" name="cost" /> <br />
		<label>orderDate</label> <input type="date" name="orderDate" /> <br />


		<!-- 	<label>Customer ID</label>
		<input type="text" name="id" />
		<br />
		<label>foodID</label>
		<input type="text" name="f_id" />
		<br />
  -->
		<br /> <input type="submit" value="add to cart" />

	</form>




	<%-- 	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>cartID</th>
			<th>quantity</th>
			<th>type</th>
			<th>cost</th>
			<th>customer_id</th>
			<th>f_id</th>
			<th>Add</th>
		</tr>
		
		<c:forEach var="cart" items="${CART}">
			<tr>
				<td>${cart.cartID }</td>
				<td>${cart.quantity }</td>
				<td>${cart.type }</td>
				<td>${cart.cost }</td>
				<td>${cart.orderDate }</td>
				<td>${cart.customer_id }</td>
				<td>${cart.f_id}</td>
				<td align="center"><a href="/cart.html">Add To Cart</a></td>
			</tr>
		</c:forEach>
	</table>
 --%>


</body>
</html>