package com.cruds.pos.util;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.ProfileBean;
import com.cruds.pos.form.CustomerFormBean;

public class CustomerUtil {

	public static ProfileBean getCredBeanForSave(CustomerFormBean customerFormBean)
	{
		CredentialsBean cb = new CredentialsBean(customerFormBean.getUserID()
								, customerFormBean.getPassword(),"C"
								, customerFormBean.getLoginStatus(),"Y");

		ProfileBean pb = new ProfileBean(customerFormBean.getFirstName(), customerFormBean.getLastName()
									, customerFormBean.getDateOfBirth(), customerFormBean.getGender() 
									, customerFormBean.getStreet(), customerFormBean.getLocation() 
									, customerFormBean.getCity(), customerFormBean.getState()
									, customerFormBean.getPincode(), customerFormBean.getMobileNo() 
									, customerFormBean.getEmailID(),cb);

		return pb;

	}

}
