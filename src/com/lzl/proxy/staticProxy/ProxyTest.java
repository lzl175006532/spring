package com.lzl.proxy.staticProxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void TestProxy(){
		PersonImpl personImpl = new PersonImpl();
		Transation transation = new Transation();
		Proxy proxy = new Proxy(personImpl, transation);
		proxy.save();
	}
}
