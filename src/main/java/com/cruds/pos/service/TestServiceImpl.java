package com.cruds.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.db.TestDAO;
import com.cruds.pos.entity.TestEntity;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDAO testDAO;
	
	@Override
	public boolean create(TestEntity te) {
		
		return testDAO.create(te);
	}

}
