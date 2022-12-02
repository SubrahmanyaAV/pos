package com.cruds.pos.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.bean.OrderBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sf;

	@Override
	public boolean addToCart(CartBean cart) {
		
		Session session = sf.openSession();		
		session.beginTransaction();
/*		
		int row = 0;
		String hql = "INSERT INTO Cart(cart_id,type,quantity,cost,orderDate,user_id,food_id,cart_id)" +
						"SELECT cart_id,type,quantity,cost,orderDate,user_id,food_id,cart_id FROM Cart";
		Query query = session.createQuery(hql);
		row = query.executeUpdate();
		
		session.close();
		return row > 0;		
*/		
		session.save(cart);
		session.getTransaction().commit();
		session.close();
		return true ;
	}

	@Override
	public boolean modifyCart(CartBean cart) throws POSException{
		Session session = sf.openSession();
		session.beginTransaction();
		
		int row = 0;
		String hql = "UPDATE CartBean set type = :type ,quantity = :quantity ,cost = :cost , orderDate = :OrderDate"
						+ "where cartID = :cartID";
		Query query = session.createQuery(hql);
		query.setParameter("cartID", cart.getCartID());
		query.setParameter("type",cart.getCartType());
		query.setParameter("quantity",cart.getCartQuantity());
		query.setParameter("cost",cart.getCost());
		query.setParameter("orderDate",cart.getOrderDate());
		query.setParameter("customer_id",cart.getCredential().getId());
		query.setParameter("food_id",cart.getFood().getF_id());
		row = query.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		
		return row > 0;
		
	}

	@Override
	public String confirmOrder(OrderBean order, ArrayList<CartBean> cart) {
		
		Session session = sf.openSession();
		session.getTransaction().begin();
		
		session.save(order);
		
		session.getTransaction().commit();
		session.close();

		return null;
	}

	@Override
	public String cancelOrder(String orderID) {
		Session session = sf.openSession();
		session.getTransaction().begin();
		String ob = (String) session.load(OrderBean.class, orderID);
//		orderID = (String) session.load(Order.class, orderID);
		session.delete(ob);
		session.getTransaction().commit();
		session.close();
		
		return orderID;
	}

	@Override
	public ArrayList<StoreBean> viewStore(String city) {
		Session session = sf.openSession();
				
		@SuppressWarnings("unchecked")
		ArrayList<StoreBean> list = (ArrayList<StoreBean>)session
								.createQuery("FROM StoreBean WHERE city = ?")
								.setString(0, city)
								.list();
		session.close();
		return list;
	}

	@Override
	public ArrayList<CartBean> viewCart(Long id) {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		ArrayList<CartBean> list = (ArrayList<CartBean>)session
							   .createQuery("FROM CartBean where id = ? ")
							   .setLong(0, id)
							   .list();
		
		session.close();
		return list;
	}

	@Override
	public ArrayList<OrderBean> viewOrder() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		ArrayList<OrderBean> list = (ArrayList<OrderBean>)session
								.createQuery("FROM OrderBean")
								.list();
		session.close();
		return list;
	}

}
