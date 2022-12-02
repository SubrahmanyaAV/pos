package com.cruds.pos.service;

import java.util.ArrayList;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CartFormBean;

public interface CustomerService {
	
//	boolean addToCart(CartBean cart);
	
	boolean modifyCart(CartBean cart) throws POSException;
	
	String confirmOrder(OrderBean order, ArrayList<CartBean> cart);
	
	String cancelOrder(String orderID);
	
	ArrayList<StoreBean> viewStore(String city);
	
	ArrayList<CartBean> viewCart(Long id);
	
	ArrayList <OrderBean> viewOrder();
	
	public boolean addToCart(CartFormBean cart);

}
