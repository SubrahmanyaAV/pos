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

	<a href="adminstore.html">Add Store</a>
	<br />
	<br />

	<a href="user.html">User</a>
	<br />
	<br />
	
	<a href="search.html">Search User</a>
	<br />
	<br />
	
	<%
 		}
 	%>
	<a href="user.html">Edit Profile</a>
	<br />
	<br />

	<a href="store.html">Store</a>
	<br />
	<br />
	
	<h3>Food</h3>	
	<br/>
	<br/>
	
	
	<form action="cart.html" method="post">
		<label>Quantity </label> 
		<input type="number" id="cartQuantity" name="cartQuantity" min="1" max="5" />
		<br /> 
		<br /> 
		
		<label>type</label> <select name="cartType" id="cartType">
			<option>Veg</option>
			<option>Non Veg</option>
		</select> 
		<br />
		<br />
		  
		<label>cost</label> 
		<input type="text" name="cost" /> 
		<br />
		<br />
		<label>orderDate</label> 
		<input type="date" name="orderDate" /> 
		<br />
		<br />

		<label>Customer ID</label>
		<input type="text" name="id" />
		<br />
		<br />
		
		<label>foodID</label>
		<input type="text" name="f_id" />
		<br />
 		<br />
		<input type="submit" value="add to cart" />
		<br /><br />
	</form>




	<table cellpadding="2" cellspacing="2" border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>Food Id</td>
				<td>Food Name</td>
				<td>Food Type</td>
				<td>Food Size</td>
				<td>Quantity</td>
				<td>Price</td>
				<td>Add</td>
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
					<td><a href="<c:url value='/food-add'/>"><button>Add To Cart</button></a></td>
				</tr>

			</c:forEach>

		</tbody>
	</table>



</body>
</html>