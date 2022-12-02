package com.cruds.pos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.dao.CustomerDAO;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CartFormBean;
import com.cruds.pos.util.CartUtil;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDAO dao;


/*	@Override
	public boolean addToCart(CartBean cart) {
		System.out.println(cart);
		return dao.addToCart(cart);
	}
*/
	@Override
	public boolean modifyCart(CartBean cart) throws POSException {
		return dao.modifyCart(cart);
	}

	@Override
	public String confirmOrder(OrderBean order, ArrayList<CartBean> cart) {
		return dao.confirmOrder(order, cart);
	}

	@Override
	public String cancelOrder(String orderID) {
		return dao.cancelOrder(orderID);
	}

	@Override
	public ArrayList<StoreBean> viewStore(String city) {
		return dao.viewStore(city);
	}

	@Override
	public ArrayList<CartBean > viewCart(Long id) {
		return dao.viewCart(id);
	}

	@Override
	public ArrayList<OrderBean> viewOrder() {
		return dao.viewOrder();
	}

	@Override
	public boolean addToCart(CartFormBean cart) {
		CartBean cb = CartUtil.getCartBeanForSave(cart);
		return dao.addToCart(cb);
	}

}
