package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.exception.POSException;

@Repository
public class FoodDAOImpl implements FoodDAO {

	@Autowired
	SessionFactory sf;

	@Override
	public void addFood(FoodBean foodBean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(foodBean);
		session.getTransaction().commit();
		session.close();
	}


	public FoodBean edit(String foodID) {

		Session session = sf.openSession();
		String hql = "from FoodBean f where f.foodID = ? ";

		@SuppressWarnings("unchecked")
		List<FoodBean> list = session.createQuery(hql).setString(0, foodID).list();

		session.close();

		if(list.size() > 0)
		{
			return list.get(0);
		}

		else 
		{
			return null;
		}
	}

	@Override
	public boolean modifyFood(FoodBean foodBean) throws POSException {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(foodBean);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean removeFood(String foodID) {

		Session session = sf.openSession();
		session.beginTransaction();

		FoodBean fb = (FoodBean) session.load(FoodBean.class, foodID);
		session.delete(fb);	
		session.getTransaction().commit();
		session.close();
		return true;

	}

	@Override
	public FoodBean viewFood(String foodID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood(String storeID) {
		Session session = sf.openSession();
		@SuppressWarnings({  "unchecked" })
		ArrayList<FoodBean> list = (ArrayList<FoodBean>) session.createQuery("from FoodBean").list();
		session.close();
		return list;
	}

	@Override
	public void changeOrderStatus(String orderID) {
		// TODO Auto-generated method stub

	}


	@Override
	public List<FoodBean> getAll() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<FoodBean> list =(List<FoodBean>) session
								.createQuery("from FoodBean")
								.list(); 
		session.close();
		return list;
	}

}
