package com.cruds.pos.dao;

import java.util.ArrayList;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface CustomerDAO {
	
	boolean addToCart(CartBean cart);
	
	boolean modifyCart(CartBean cart) throws POSException;
	
	String confirmOrder(OrderBean order, ArrayList<CartBean> cart);
	
	String cancelOrder(String orderID);
	
	ArrayList<StoreBean> viewStore(String city);
	
	ArrayList<CartBean> viewCart(Long id);
	
	ArrayList <OrderBean> viewOrder();

}
