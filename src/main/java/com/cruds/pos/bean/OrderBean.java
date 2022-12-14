package com.cruds.pos.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="o_id")
	private Long o_id;
	
	@Column(length=6,name="orderID")
	private String orderID;			
	                 
	@Column(name="orderDate",nullable = false)
	private LocalDate orderDateO;
	
	@Column(name="totalPrice",nullable = false)
	private double totalPrice;
	
	@Column(name="orderStatus",length=15)
	private String oStatus;
	
	@Column(name="street",length=50, nullable = false)
	private String oStreet;
	
	@Column(name="city",length=15, nullable = false)
	private String oCity;
	
	@Column(name="state",length=15, nullable = false)
	private String oState;
	
	@Column(name="pincode",length=10)
	private String pincodeO;
	
	@Column(name="mobileNo",length=10, nullable = false)
	private String mobileNum;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CredentialsBean credentials;
	
	@ManyToOne
	@JoinColumn(name="s_id")
	private StoreBean store;
	
	@ManyToOne
	@JoinColumn(name="cartID")
	private CartBean cart;

	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderBean(String orderID, LocalDate orderDateO, double totalPrice, String oStatus, String oStreet, String oCity,
			String oState, String pincodeO, String mobileNum) {
		super();
		this.orderID = orderID;
		this.orderDateO = orderDateO;
		this.totalPrice = totalPrice;
		this.oStatus = oStatus;
		this.oStreet = oStreet;
		this.oCity = oCity;
		this.oState = oState;
		this.pincodeO = pincodeO;
		this.mobileNum = mobileNum;
	}

	public OrderBean(String orderID, LocalDate orderDateO, double totalPrice, String oStatus, String oStreet, String oCity,
			String oState, String pincodeO, String mobileNum, CredentialsBean credentials, StoreBean store,
			CartBean cart) {
		super();
		this.orderID = orderID;
		this.orderDateO = orderDateO;
		this.totalPrice = totalPrice;
		this.oStatus = oStatus;
		this.oStreet = oStreet;
		this.oCity = oCity;
		this.oState = oState;
		this.pincodeO = pincodeO;
		this.mobileNum = mobileNum;
		this.credentials = credentials;
		this.store = store;
		this.cart = cart;
	}

	public Long getO_id() {
		return o_id;
	}

	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public LocalDate getOrderDateO() {
		return orderDateO;
	}

	public void setOrderDateO(LocalDate orderDateO) {
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

	public CredentialsBean getCredentials() {
		return credentials;
	}

	public void setCredentials(CredentialsBean credentials) {
		this.credentials = credentials;
	}

	public StoreBean getStore() {
		return store;
	}

	public void setStore(StoreBean store) {
		this.store = store;
	}

	public CartBean getCart() {
		return cart;
	}

	public void setCart(CartBean cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "OrderBean [o_id=" + o_id + ", orderID=" + orderID + ", orderDateO=" + orderDateO + ", totalPrice="
				+ totalPrice + ", oStatus=" + oStatus + ", oStreet=" + oStreet + ", oCity=" + oCity + ", oState="
				+ oState + ", pincodeO=" + pincodeO + ", mobileNum=" + mobileNum + ", credentials=" + credentials
				+ ", store=" + store + ", cart=" + cart + "]";
	}

}
