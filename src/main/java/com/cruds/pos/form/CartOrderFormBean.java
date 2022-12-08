package com.cruds.pos.form;

import java.util.Date;

public class CartOrderFormBean {
	
	private int cartID;
	private String cartType;
	private int cartQuantity;
	private double cost;
	private String orderDate;

	private String orderID;
	private Date orderDateO;
	private double totalPrice;
	private String oStatus;
	private String oStreet;
	private String oCity;
	private String oState;
	private String pincodeO;
	private String mobileNum;
	public CartOrderFormBean() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Date getOrderDateO() {
		return orderDateO;
	}
	public void setOrderDateO(Date orderDateO) {
		this.orderDateO = orderDateO;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getoStatus() {
		return oStatus;
	}
	public void setoStatus(String oStatus) {
		this.oStatus = oStatus;
	}
	public String getoStreet() {
		return oStreet;
	}
	public void setoStreet(String oStreet) {
		this.oStreet = oStreet;
	}
	public String getoCity() {
		return oCity;
	}
	public void setoCity(String oCity) {
		this.oCity = oCity;
	}
	public String getoState() {
		return oState;
	}
	public void setoState(String oState) {
		this.oState = oState;
	}
	public String getPincodeO() {
		return pincodeO;
	}
	public void setPincodeO(String pincodeO) {
		this.pincodeO = pincodeO;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

}
