package com.cruds.pos.util;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.form.CartFormBean;

public class CartUtil {
	
	public static CartBean getCartBeanForSave(CartFormBean cartFormBean)
	{
		CredentialsBean credb = new CredentialsBean(cartFormBean.getUserID()
								   ,cartFormBean.getPassword(),"C"
								   ,cartFormBean.getLoginStatus(),"Y");
		
		FoodBean fb = new FoodBean(cartFormBean.getFoodID(), cartFormBean.getName()
								   , cartFormBean.getFoodtype(), cartFormBean.getFoodSize()
								   , cartFormBean.getFoodQuantity(), cartFormBean.getPrice());
		
		CartBean cb = new CartBean(/*foodFormBean.getCartID(),*/ cartFormBean.getCartType()
								   , cartFormBean.getCartQuantity(), cartFormBean.getCost()
								   , cartFormBean.getOrderDate(), credb, fb);
		
		return cb;
		
	}

}
