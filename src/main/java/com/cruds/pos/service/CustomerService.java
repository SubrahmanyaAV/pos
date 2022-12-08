package com.cruds.pos.service;

import java.util.ArrayList;
import java.util.Set;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CartFormBean;
import com.cruds.pos.form.OrderFormBean;

public interface CustomerService {
	
	public CartBean edit(int cartID); 
	
	boolean modifyCart(CartBean cart) throws POSException;
	
//	OrderBean confirmOrder(OrderBean order, ArrayList<CartBean> cart);
	OrderBean confirmOrder(OrderFormBean order, ArrayList<CartBean> cart);
	
	OrderBean cancelOrder(String orderID);
	
	public Set<StoreBean> searchStore(String city);//ArrayList<StoreBean> viewStore(String city);
	
	ArrayList<CartBean> viewCart();
	
	ArrayList <OrderBean> viewOrder();
	
	boolean addToCart(CartFormBean cart) throws POSException;//boolean addToCart(CartBean cart);

}
