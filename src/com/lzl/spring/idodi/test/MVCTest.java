package com.lzl.spring.idodi.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.lzl.spring.iocdi.action.PersonAction;
import com.lzl.spring.iocdi.dao.Person;
@Component("test")
public class MVCTest {

	@Resource()
	public Person person;
	
	@Test
	public void mvcTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction personAction = (PersonAction) context.getBean("personAction");
		personAction.savePerson();
	}
}
