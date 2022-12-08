package com.cruds.pos.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cartID",nullable=false)
	private int cartID;
	
	@Column(name="type",length=10, nullable = false)
	private String cartType;
	
	@Column(name="quantity", nullable = false)
	private int cartQuantity;
	
	@Column(name="cost", nullable = false)
	private double cost;
	
	@Column(name="orderDate")
	private String orderDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CredentialsBean customer;
	
	@ManyToOne
	@JoinColumn(name="f_id")
	private FoodBean food;
	
	@OneToMany(mappedBy="cart",cascade = CascadeType.ALL)
	private Set<OrderBean> orders;

	public CartBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartBean( String cartType, int cartQuantity, double cost, String orderDate) {
		super();
		this.cartType = cartType;
		this.cartQuantity = cartQuantity;
		this.cost = cost;
		this.orderDate = orderDate;
	}

	public CartBean(String cartType, int cartQuantity, double cost, String orderDate, CredentialsBean customer,
			FoodBean food) {
		super();
		this.cartType = cartType;
		this.cartQuantity = cartQuantity;
		this.cost = cost;
		this.orderDate = orderDate;
		this.customer = customer;
		this.food = food;
	}

	public CartBean( String cartType, int cartQuantity, double cost, String orderDate,
			CredentialsBean credential) {
		super();
		
		this.cartType = cartType;
		this.cartQuantity = cartQuantity;
		this.cost = cost;
		this.orderDate = orderDate;
		this.customer = credential;
	}

	public CartBean(String cartType, int cartQuantity, double cost, String orderDate, FoodBean food) {
		super();
		this.cartType = cartType;
		this.cartQuantity = cartQuantity;
		this.cost = cost;
		this.orderDate = orderDate;
		this.food = food;
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

	public CredentialsBean getCredential() {
		return customer;
	}

	public void setCredential(CredentialsBean credential) {
		this.customer = credential;
	}

	public Set<OrderBean> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderBean> orders) {
		this.orders = orders;
	}

	public FoodBean getFood() {
		return food;
	}

	public void setFood(FoodBean food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "CartBean [cartID=" + cartID + ", cartType=" + cartType + ", cartQuantity=" + cartQuantity + ", cost="
				+ cost + ", orderDate=" + orderDate + ", credential=" + customer + ", food=" + food + ", orders="
				+ orders + "]";
	}


}
