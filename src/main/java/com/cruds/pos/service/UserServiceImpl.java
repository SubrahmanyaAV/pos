package com.cruds.pos.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.ProfileBean;
import com.cruds.pos.dao.UserDAO;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CustomerFormBean;
import com.cruds.pos.util.CustomerUtil;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO dao;

	@Override
	public CredentialsBean authenticate(String userID, String password) {
		return dao.authenticate(userID, password);
	}
	
	@Override
	public List<CredentialsBean> getAllCredentials() {
		return dao.getAllCredentials();
	}

	@Override
	public List<ProfileBean> getAll() {
		return dao.getAll();
	}

/*	@Override
	public void delete(Long id) {
		dao.delete(id);		
	}
*/
	@Override
	public ProfileBean edit(Long id) {
		return dao.edit(id);
	}

	@Override
	public void update(ProfileBean user) {
		System.out.println(user);
		dao.update(user);
	}

	public boolean create(CustomerFormBean userDetBean) throws POSException {
		ProfileBean cb = CustomerUtil.getCredBeanForSave(userDetBean);
		return dao.createLogin(cb);
	}

	@Override
	public boolean inActivate(Long id) {
		return dao.inActivate(id);
	}
	
	public Set<CredentialsBean> searchUser(Long id, String userID)
	{
		Set<CredentialsBean> userSet = new HashSet<>();
		if(userID != null && (userID.trim().length() > 0 ))
		{
			userSet.addAll(dao.findByName(userID));
		}
		if(id != null && (id > 0))
		{
			CredentialsBean user = dao.findUserById(id); //check null since set allows null
			if (user != null) userSet.add(user);
		}
		return userSet;
	}

	@Override
	public void inActivateUser(CredentialsBean user) {
		dao.inActivateUser(user);
	}

	@Override
	public CredentialsBean findUserById(Long id) {
		return dao.findUserById(id);
	}

}
