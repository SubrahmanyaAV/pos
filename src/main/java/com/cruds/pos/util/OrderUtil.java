package com.cruds.pos.util;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.form.OrderFormBean;

public class OrderUtil {
	
	public static OrderBean getOrderSave(OrderFormBean orderFormBean)//,ArrayList<CartBean> cart)
	{
		CredentialsBean cb = new CredentialsBean(orderFormBean.getOrderID()
								, orderFormBean.getPassword(), "C" , orderFormBean.getLoginStatus(),"Y");
		
		CartBean c = new CartBean(/*foodFormBean.getCartID(),*/ orderFormBean.getCartType()
				   , orderFormBean.getCartQuantity(), orderFormBean.getCost()
				   , orderFormBean.getOrderDate());
		
		StoreBean sb = new StoreBean(orderFormBean.getStoreID(), orderFormBean.getName()
				, orderFormBean.getStreet(), orderFormBean.getMobileNo(), orderFormBean.getCity()
				, orderFormBean.getState(), orderFormBean.getPincode());
				
		
		OrderBean ob = new OrderBean(orderFormBean.getOrderID(), orderFormBean.getOrderDateO()
				, orderFormBean.getTotalPrice(), orderFormBean.getoStatus()
				, orderFormBean.getoStreet(), orderFormBean.getoCity()
				, orderFormBean.getoState(), orderFormBean.getPincodeO()
				, orderFormBean.getMobileNum(),cb,sb,c);
		
//		cart = new ArrayList<>();
		
/*		Set<OrderBean> orders = new HashSet<>();
		orders.add(ob);
		cb.setOrders(orders);
*/		
		return ob;
	}

}
