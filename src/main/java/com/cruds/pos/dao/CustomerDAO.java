package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface CustomerDAO {
	
	public boolean addToCart(CartBean cart) throws POSException;
	public List<CartBean> list(Long customer_id);
	
	public CartBean getByCartID(int cartID);
	
	boolean modifyCart(CartBean cart) throws POSException;
	
	public void Update(CartBean cart);
	
	OrderBean confirmOrder(OrderBean order, ArrayList<CartBean> cart);
	
	OrderBean cancelOrder(String orderID);
	
	ArrayList<StoreBean> viewStore(String city);
	
	ArrayList<CartBean> viewCart();
	
	ArrayList <OrderBean> viewOrder();

}
