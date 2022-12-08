package com.cruds.pos.dao;

import java.util.ArrayList;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface CustomerDAO {
	
	public boolean addToCart(CartBean cart) throws POSException;
	
	public CartBean edit(int cartID);
	
	boolean modifyCart(CartBean cart) throws POSException;
	
	OrderBean confirmOrder(OrderBean order, ArrayList<CartBean> cart);
	
	OrderBean cancelOrder(String orderID);
	
	ArrayList<StoreBean> viewStore(String city);
	
	ArrayList<CartBean> viewCart();
	
	ArrayList <OrderBean> viewOrder();

}
