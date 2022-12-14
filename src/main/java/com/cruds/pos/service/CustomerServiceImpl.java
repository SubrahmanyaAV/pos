package com.cruds.pos.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.dao.CustomerDAO;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CartFormBean;
import com.cruds.pos.form.OrderFormBean;
import com.cruds.pos.util.CartUtil;
import com.cruds.pos.util.OrderUtil;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDAO dao;

	@Override
	public CartBean edit(int cartID) {
		return dao.getByCartID(cartID);
	}

	@Override
	public boolean modifyCart(CartBean cart) throws POSException {
		return dao.modifyCart(cart);
	}

	@Override
	public OrderBean cancelOrder(String orderID) {
		return dao.cancelOrder(orderID);
	}

/*	@Override
	public ArrayList<StoreBean> viewStore(String city) {
		return dao.viewStore(city);
	}
*/	
	public Set<StoreBean> searchStore(String city)
	{
		Set<StoreBean> sb = new HashSet<>();
		if(city != null && (city.trim().length() > 0 ))
		{
			sb.addAll(dao.viewStore(city));
		}
		return sb;
	}

	@Override
	public ArrayList<CartBean > viewCart() {
		return dao.viewCart();
	}

	@Override
	public ArrayList<OrderBean> viewOrder() {
		return dao.viewOrder();
	}

/*	@Override
	public boolean addToCart(CartBean cart) {
		System.out.println(cart);
		return dao.addToCart(cart);
	}
*/
	@Override
	public boolean addToCartFood(CartFormBean cart) throws POSException {
		CartBean cb = CartUtil.getCartBeanForSave(cart);
		return dao.addToCart(cb);
	}

	@Override
	public OrderBean confirmOrder(OrderFormBean order, ArrayList<CartBean> cart) {
		OrderBean ob = OrderUtil.getOrderSave(order);
		return dao.confirmOrder(ob,cart);
	}

	@Override
	public List<CartBean> list(Long customer_id) {
		return dao.list(customer_id);
	}

	@Override
	public void Update(CartBean cart) {
		dao.Update(cart);
		
	}

	@Override
	public boolean addToCart(CartBean cart) throws POSException {
		return dao.addToCart(cart);
	}

	
}
