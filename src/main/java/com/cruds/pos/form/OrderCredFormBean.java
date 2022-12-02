package com.cruds.pos.form;

import java.util.Date;

public class OrderCredFormBean {
	
	private String userID;
	private String password;
//	private String userType = "C";   //(admin or customer)
//	private String isActive;
	private int loginStatus;  
	
	private String orderID;
	private Date orderDateO;
	private double totalPrice;
	private String oStatus;
	private String oStreet;
	private String oCity;
	private String oState;
	private String pincodeO;
	private String mobileNum;
	
	public OrderCredFormBean() {
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
