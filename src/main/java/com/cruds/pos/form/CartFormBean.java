package com.cruds.pos.form;

public class CartFormBean {
	
	private String userID;
	private String password;
//	private String userType = "C"; //(admin or customer)
//	private String isActive;
	private int loginStatus; 

	private int cartID;
	private int cartQuantity;
	private String cartType;
	private double cost;
	private String orderDate;
	
	private String foodID; 
	private String name; 
	private String foodtype; 
	private String foodSize; 
	private int foodQuantity;
	private double price;
	
	public CartFormBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public String getCartType() {
		return cartType;
	}

	public void setCartType(String cartType) {
		this.cartType = cartType;
	}

	public int getCartQuantity() {
		return cartQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getFoodID() {
		return foodID;
	}

	public void setFoodID(String foodID) {
		this.foodID = foodID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	public String getFoodSize() {
		return foodSize;
	}

	public void setFoodSize(String foodSize) {
		this.foodSize = foodSize;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CartFormBean [userID=" + userID + ", password=" + password + ", loginStatus=" + loginStatus
				+ ", cartID=" + cartID + ", cartQuantity=" + cartQuantity + ", cartType=" + cartType + ", cost=" + cost
				+ ", orderDate=" + orderDate + ", foodID=" + foodID + ", name=" + name + ", foodtype=" + foodtype
				+ ", foodSize=" + foodSize + ", foodQuantity=" + foodQuantity + ", price=" + price + "]";
	}

}
