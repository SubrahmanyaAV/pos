package com.cruds.pos.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.dao.FoodDAO;
import com.cruds.pos.exception.POSException;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	FoodDAO dao;
	
	@Override
	public void addFood(FoodBean foodBean) {
		dao.addFood(foodBean);
	}

	@Override
	public FoodBean getByID(String foodID) {
		return dao.getByID(foodID);
	}

	@Override
	public boolean modifyFood(FoodBean foodbean) throws POSException {
		return dao.modifyFood(foodbean);
	}

	@Override
	public boolean removeFood(Long f_id) {
		return dao.removeFood(f_id);
	}

	@Override
	public FoodBean viewFood(Long f_id) {
		// TODO Auto-generated method stub
		return dao.viewFood(f_id);
	}

	@Override
	public ArrayList<FoodBean> viewAllFood(String storeID) {
		return dao.viewAllFood(storeID);
	}

	@Override
	public void changeOrderStatus(String orderID) {
		dao.changeOrderStatus(orderID);		
	}

	@Override
	public List<FoodBean> getAll() {
		return dao.getAll();
	}
	

}
