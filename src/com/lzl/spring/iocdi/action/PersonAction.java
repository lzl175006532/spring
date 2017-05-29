package com.lzl.spring.iocdi.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lzl.spring.iocdi.service.PersonService;
@Controller
public class PersonAction {

	@Resource
	private PersonService personService;
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public void savePerson(){
		this.personService.savePerson();
	}
}
