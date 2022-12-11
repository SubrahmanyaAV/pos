package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.exception.POSException;

public interface FoodDAO {
	
	public void addFood(FoodBean foodBean);
	
	public FoodBean edit(String foodID);
	
	public boolean modifyFood(FoodBean foodbean)throws POSException;

	public boolean removeFood(String foodID);
	
	public FoodBean viewFood(String foodID);
	
	public ArrayList<FoodBean> viewAllFood(String storeID);
	
	List<FoodBean> getAll();
	
	public void changeOrderStatus(String orderID);

}
