package com.lzl.proxy.jdkProxy;


public class PersonDaoImpl implements PersonDao{

	@Override
	public void save() {
		System.out.println("jdkProxy save person !!!!");
	}

}
