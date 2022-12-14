package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.exception.POSException;

public interface FoodDAO {
	
	public void addFood(FoodBean foodBean);
	
	public FoodBean getByID(String foodID);
	
	public boolean modifyFood(FoodBean foodbean)throws POSException;

	public boolean removeFood(Long f_id);
	
	public FoodBean viewFood(Long f_id);
	
	
	public ArrayList<FoodBean> viewAllFood(String storeID);
	
	List<FoodBean> getAll();
	
	public void changeOrderStatus(String orderID);

}
