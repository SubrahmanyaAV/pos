package com.cruds.pos.util;

import java.util.HashSet;
import java.util.Set;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.form.OrderCredFormBean;

public class OrderCredUtil {
	
	public static CredentialsBean getOrderSave(OrderCredFormBean orderCredFormBean)
	{
		
		OrderBean ob = new OrderBean(orderCredFormBean.getOrderID(), orderCredFormBean.getOrderDateO()
									, orderCredFormBean.getTotalPrice(), orderCredFormBean.getoStatus()
									, orderCredFormBean.getoStreet(), orderCredFormBean.getoCity()
									, orderCredFormBean.getoState(), orderCredFormBean.getPincodeO()
									, orderCredFormBean.getMobileNum());
		
		CredentialsBean cb = new CredentialsBean(orderCredFormBean.getOrderID(), orderCredFormBean.getPassword()
												, "C" , orderCredFormBean.getLoginStatus() , "Y");
		
		Set<OrderBean> orders = new HashSet<>();
		orders.add(ob);
		cb.setOrders(orders);
		
		return cb;
	}

}
