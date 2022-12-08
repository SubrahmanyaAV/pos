package com.cruds.pos.service;

import java.util.ArrayList;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface StoreService {
	
	public void addStore(StoreBean storeBean);
	
	public StoreBean edit(String storeID);
	
	public boolean modifyStore(StoreBean storeBean) throws POSException;
	
	//public int removeStore(ArrayList<String> storeID);
	
	public StoreBean searchStore(String storeID);
	
	public String viewStore(StoreBean storeBean);
	
	//public boolean searchStore(StoreBean storeBean) throws POSException;
	
	public ArrayList<StoreBean> viewAllStore();


}
