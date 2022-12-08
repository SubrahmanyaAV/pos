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

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="user_credentials")
public class CredentialsBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=6,name="userID")
	private String userID;
	
	@Column(name="password",length=20, nullable = false)
	private String password;
	
	@ColumnDefault("'C'")
	@Column(name="userType",length=15,nullable = false)
	private String userType = "C";   //(admin or customer)
	
	@Column(name="loginStatus",length=1, nullable = false)
	private int loginStatus = 1;   //(1 ,0)
	
	@Column(name="isActive", nullable = false)
	private String isActive = "Y";
	
	@OneToMany(mappedBy="credentials",cascade = CascadeType.ALL)
	private Set<OrderBean> orders;
	
	public CredentialsBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CredentialsBean(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}

	public CredentialsBean(String userID, String userType, int loginStatus, String isActive) {
		super();
		this.userID = userID;
		this.userType = userType;
		this.loginStatus = loginStatus;
		this.isActive = isActive;
	}

	public CredentialsBean(String userID, String password, String userType, int loginStatus, String isActive) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
		this.isActive = isActive;
	}

	public CredentialsBean(String userID, String password, String userType, int loginStatus, Set<OrderBean> orders) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
		this.orders = orders;
	}

	public Long getC_id() {
		return id;
	}

	public void setC_id(Long c_id) {
		this.id = c_id;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Set<OrderBean> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderBean> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CredentialsBean [id=" + id + ", userID=" + userID + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + ", isActive=" + isActive + ", orders=" + orders + "]";
	}

}
