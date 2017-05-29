package com.lzl.privilege;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzl.privilege.dao.PrivilegeDao;
import com.lzl.privilege.service.SavePerson;


public class PrivilegeTest {

	@Test
	public void test() throws NoSuchMethodException, SecurityException{
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
		AopAspect aopAspect = (AopAspect) context.getBean("aopAspect");
		List<PrivilegeDao> list = aopAspect.getPrivilegeDaos();
		
		PrivilegeDao privilegeDao1 = new PrivilegeDao(1L, "savePerson");
		PrivilegeDao privilegeDao2 = new PrivilegeDao(2L, "updatePerson");
		list.add(privilegeDao1);
		list.add(privilegeDao2);
		
		SavePerson savePerson = (SavePerson) context.getBean("savePerson");
		savePerson.savePerson();
		
	}
}
