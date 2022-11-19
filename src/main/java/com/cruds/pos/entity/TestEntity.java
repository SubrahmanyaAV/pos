package com.cruds.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TestEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String msg;

	public TestEntity() {
		super();
	}

	public TestEntity(String msg) {
		super();
		this.msg = msg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
