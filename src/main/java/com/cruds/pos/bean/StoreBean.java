package com.cruds.pos.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class StoreBean {

	@Id
	@GeneratedValue
	@Column(name="s_id")
	private Long id;
	
	@Column(unique=true,length=6,name="storeID")
	private String storeID;
	
	@Column(length=15, nullable = false)
	private String name;
	
	@Column(length=50, nullable = false)
	private String street;
	
	@Column(length=10, nullable = false)
	private String mobileNo;
	
	@Column(length=15, nullable = false)
	private String city;
	
	@Column(length=15, nullable = false)
	private String state;
	
	@Column(length=10, nullable = false)
	private String pincode;
	
	@OneToMany(mappedBy="store",cascade = CascadeType.ALL)
	private Set<OrderBean> orders;

	public StoreBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreBean(String storeID, String name, String street, String mobileNo, String city, String state,
			String pincode) {
		super();
		this.storeID = storeID;
		this.name = name;
		this.street = street;
		this.mobileNo = mobileNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public StoreBean(String storeID, String name, String street, String mobileNo, String city, String state,
			String pincode, Set<OrderBean> orders) {
		super();
		this.storeID = storeID;
		this.name = name;
		this.street = street;
		this.mobileNo = mobileNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<OrderBean> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderBean> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "StoreBean [id=" + id + ", storeID=" + storeID + ", name=" + name + ", street=" + street + ", mobileNo="
				+ mobileNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", orders=" + orders
				+ "]";
	}

}
