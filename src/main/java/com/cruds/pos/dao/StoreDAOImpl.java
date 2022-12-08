package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

@Repository
public class StoreDAOImpl implements StoreDAO {

	@Autowired
	SessionFactory sf;

	@Override
	public void addStore(StoreBean storeBean) {

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(storeBean);
		session.getTransaction().commit();
		session.close();

	}

	public StoreBean edit(String storeID) {

		Session session = sf.openSession();
		String hql = "from StoreBean s where s.storeID = ? ";

		List<StoreBean> list = session.createQuery(hql).setString(0, storeID).list();

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

	public boolean modifyStore(StoreBean storeBean) throws POSException {

		Session session = sf.openSession();
		session.beginTransaction();
		session.update(storeBean);
		session.getTransaction().commit();
		session.close();
		return true;
	}


	public StoreBean searchStore(String storeID) {

		Session session = sf.openSession();
		String hql = "from StoreBean s where s.storeID = ? ";

		@SuppressWarnings("unchecked")
		List<StoreBean> list = session.createQuery(hql)
							   .setString(0, storeID)
							   .list();

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

	/*public String viewStore(StoreBean storeBean)
	{
		Session session = sf.openSession();
		//session.beginTransaction();
		String store = (String) session.load(StoreBean.class, storeBean);
		//Hibernate.initialize(store.getStoreId());
		//String storeBean = store.getStoreId();
		session.close();
		return store;
	}*/

	/*public String viewStore(String storeId)
    {
       Session session = sf.openSession();
       StoreBean storeBean = (StoreBean) session.load(StoreBean.class, storeId);
       Hibernate.initialize(storeBean.getStoreId());
       session.getTransaction().commit();
       return storeBean.getStoreId();
    }*/
	
	
		@Override
		public ArrayList<StoreBean> viewAllStore() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		ArrayList<StoreBean> list = (ArrayList<StoreBean>) session
									.createQuery("from StoreBean").list();
		session.close();
		return list;
	}

		@Override
		public String viewStore(StoreBean storeBean) {
			// TODO Auto-generated method stub
			return null;
		}

}
