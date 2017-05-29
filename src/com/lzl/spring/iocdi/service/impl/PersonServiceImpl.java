package com.lzl.spring.iocdi.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lzl.spring.iocdi.dao.PersonDao;
import com.lzl.spring.iocdi.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {

	@Resource
	private PersonDao personDao;
	
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson() {
		this.personDao.savePerson();
	}

}
