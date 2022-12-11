package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

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
		
/*		String hql = "INSERT INTO CartBean(cartQuantity,cartType,cost,orderDate)"   
					+ "SELECT cartQuantity,cartType,cost,orderDate FROM CartBean"
					+ "UPDATE CartBean set cartQuantity= cartQuantity-? ,cartType= :cartType ,cost = :cost
					, orderDate = :OrderDate"+ "where cartID = :cartID";
		
		int quantity = 1;	
						
		Query query = session.createQuery(hql);
		query.setParameter("cartID", cart.getCartID());
		query.setParameter("type",cart.getCartType());
		query.setParameter("quantity",quantity);
		query.setParameter("cost",cart.getCost());
		query.setParameter("orderDate",cart.getOrderDate());
//		query.setParameter("customer_id",cart.getCredential().getId());
//		query.setParameter("f_id",cart.getFood().getF_id());
		
		int row = query.executeUpdate();

		session.close();
		return row > 0;		
*/		
		session.save(cart);
		session.getTransaction().commit();
		session.close();
		return true ;
	}
	
	@Override
	public CartBean edit(int cartID) {
		Session session = sf.openSession();
		String hql = "from CartBean c where c.cartID = ? ";

		@SuppressWarnings("unchecked")
		List<CartBean> list = session.createQuery(hql).setLong(0, cartID).list();
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
	public boolean modifyCart(CartBean cart) throws POSException{
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(cart);
		System.out.println(cart);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public OrderBean confirmOrder(OrderBean order, ArrayList<CartBean> cart) {
		
		Session session = sf.openSession();
		session.getTransaction().begin();
		
		session.save(order);
		session.getTransaction().commit();
		session.close();
		return order;
	}

	@Override
	public OrderBean cancelOrder(String orderID) {
		Session session = sf.openSession();
		session.getTransaction().begin();
		OrderBean ob = (OrderBean) session.load(OrderBean.class, orderID);
//		orderID = (String) session.load(Order.class, orderID);
		session.delete(ob);
		session.getTransaction().commit();
		session.close();
		return ob;
		
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
	public ArrayList<CartBean> viewCart() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		ArrayList<CartBean> list = (ArrayList<CartBean>)session
							   .createQuery("FROM CartBean")
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
