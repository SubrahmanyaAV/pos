package com.cruds.pos.service;

import java.util.List;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.ProfileBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CustomerFormBean;

public interface UserService {
	
//	public boolean createLogin(CredentialsBean user) throws POSException;
	
	CredentialsBean authenticate(String userID , String password);
	
	public List<CredentialsBean> getAllCredentials();
	
	public List<ProfileBean> getAll();
	
//	public void delete(Long id);
	
	public ProfileBean edit(Long id);
	
	public void update(ProfileBean user);

	public boolean create(CustomerFormBean user) throws POSException;
	
	public boolean inActivate(Long id);

}
