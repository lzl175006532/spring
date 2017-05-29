package com.lzl.proxy.staticProxy;

public class PersonImpl implements PersonDao {

	@Override
	public void save() {
		System.out.println("save person !!!");
	}

}
