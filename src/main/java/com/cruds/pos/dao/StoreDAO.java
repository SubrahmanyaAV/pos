package com.cruds.pos.dao;

import java.util.ArrayList;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface StoreDAO {
	
	public void addStore(StoreBean storeBean);
	
	public StoreBean edit(String storeID);
	
	public boolean modifyStore(StoreBean storeBean) throws POSException;
	
	//public int removeStore(Long id);
	
	public StoreBean searchStore(String storeID);
	
	public String viewStore(StoreBean storeBean) ;
	
	//public StoreBean viewStore(StoreBean storeBean);
	
	public ArrayList<StoreBean> viewAllStore();


}
