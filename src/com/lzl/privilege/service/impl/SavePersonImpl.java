package com.lzl.privilege.service.impl;

import com.lzl.privilege.annotation.MyAnnotation;
import com.lzl.privilege.service.SavePerson;

public class SavePersonImpl implements SavePerson{

	@Override
	@MyAnnotation(name = "savePerson")
	public void savePerson() {
		System.out.println("savePerson执行了！");
	}

	@Override
	@MyAnnotation(name = "updatePerson")
	public void updatePerson() {
		System.out.println("updatePerson执行了！");
		
	}

}
