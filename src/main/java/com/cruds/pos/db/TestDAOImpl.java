package com.cruds.pos.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.pos.entity.TestEntity;

@Repository
public class TestDAOImpl implements TestDAO{

	@Autowired
	SessionFactory sf;
	
	@Override
	public boolean create(TestEntity te) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(te);
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
