package com.cruds.pos.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class FoodBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="f_id")
	private Long f_id;
	
	@Column(length=6,name="foodID")
	private String foodID; 

	@Column(name="name",length=20, nullable = false)
	private String name; 

	@Column(name="type",length=10, nullable = false)
	private String foodtype; 

	@Column(name="foodSize",length=15, nullable = false)
	private String foodSize; 

	@Column(name="quantity", nullable = false)
	private int foodQuantity;

	@Column(name="price")
	private double price;

	@OneToMany(mappedBy="food",cascade = CascadeType.ALL)
	private  Set<CartBean> cart;


	public FoodBean() {
		// TODO Auto-generated constructor stub
	}

	public FoodBean(String foodID, String name, String foodtype, String foodSize, int foodQuantity, double price) {
		super();
		this.foodID = foodID;
		this.name = name;
		this.foodtype = foodtype;
		this.foodSize = foodSize;
		this.foodQuantity = foodQuantity;
		this.price = price;
	}

	public FoodBean(String foodID, String name, String foodtype, String foodSize, int foodQuantity, double price,
			Set<CartBean> cart) {
		super();
		this.foodID = foodID;
		this.name = name;
		this.foodtype = foodtype;
		this.foodSize = foodSize;
		this.foodQuantity = foodQuantity;
		this.price = price;
		this.cart = cart;
	}

	public Long getF_id() {
		return f_id;
	}

	public void setF_id(Long f_id) {
		this.f_id = f_id;
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


	public Set<CartBean> getCart() {
		return cart;
	}

	public void setCart(Set<CartBean> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "FoodBean [f_id=" + f_id + ", foodID=" + foodID + ", name=" + name + ", foodtype=" + foodtype
				+ ", foodSize=" + foodSize + ", foodQuantity=" + foodQuantity + ", price=" + price + ", cart=" + cart
				+ "]";
	}

}
