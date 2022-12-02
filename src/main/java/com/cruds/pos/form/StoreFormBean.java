package com.cruds.pos.form;

import java.util.Date;

public class StoreFormBean {

	private String storeID;
	private String name;
	private String street;
	private String mobileNo;
	private String city;
	private String state;
	private String pincode;
	
	private String orderID;
	private Date orderDateO;
	private double totalPrice;
	private String oStatus;
	private String oStreet;
	private String oCity;
	private String oState;
	private String pincodeO;
	private String mobileNum;
	public StoreFormBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStoreID() {
		return storeID;
	}
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
