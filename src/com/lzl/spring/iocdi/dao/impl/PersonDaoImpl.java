package com.lzl.spring.iocdi.dao.impl;

import org.springframework.stereotype.Repository;

import com.lzl.spring.iocdi.dao.PersonDao;
@Repository
public class PersonDaoImpl implements PersonDao{

	@Override
	public void savePerson() {
		System.out.println("save person");
	}

}
