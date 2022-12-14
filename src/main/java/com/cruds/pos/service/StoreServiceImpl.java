package com.cruds.pos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.dao.StoreDAO;
import com.cruds.pos.exception.POSException;

@Service
public class StoreServiceImpl implements StoreService {
	
	@Autowired
	StoreDAO dao;
	
	@Override
	public void addStore(StoreBean storeBean) {
		dao.addStore(storeBean);
	}

	@Override
	public boolean modifyStore(StoreBean storeBean) throws POSException {
		return dao.modifyStore(storeBean);
	}

	@Override
	public boolean removeStore(Long id) {
		return dao.removeStore(id);
	}
	
	
	/*public void removeStore(String storeID) {
		
		 dao.removeStore(storeID);;
	}*/

	
	public StoreBean searchStore(String storeID) {	
		return dao.searchStore(storeID);
	}
	
	
	@Override
	public String viewStore(StoreBean storeBean) {		
		return dao.viewStore(storeBean);
	}

	@Override
	public ArrayList<StoreBean> viewAllStore() {
		return dao.viewAllStore() ;
	}

	@Override
	public StoreBean edit(String storeID) {
		return dao.edit(storeID);
	}


}
