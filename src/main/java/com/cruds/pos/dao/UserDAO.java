package com.cruds.pos.dao;

import java.util.List;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.ProfileBean;
import com.cruds.pos.exception.POSException;

public interface UserDAO {
	
	public boolean createLogin(ProfileBean user) throws POSException;//credentials->profile
	
	CredentialsBean authenticate(String userID , String password);
	
	public List<CredentialsBean> getAllCredentials(); 
	
	public List<ProfileBean> getAll(); 
	
//	public void delete(Long id);
	
	public ProfileBean edit(Long id);
	
	public void update(ProfileBean user);

	//should not create with form-> UserCredentialsBean in dao
	
	public boolean inActivate(Long id);
	
	CredentialsBean findUserById(Long id);
	
	public List<CredentialsBean> findByName(String userID);

}
