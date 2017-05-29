package com.lzl.proxy.jdkProxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class JdkProxyTest {

	@Test
	public void TestJdkProxy(){
		Object target = new PersonDaoImpl();
		Transation transation = new Transation();
		JdkInterceptor interceptor = new JdkInterceptor(target, transation);
		//产生代理类
		/**
		 * 第一个参数：加载类解析器
		 * 第二个参数：目标类实现的所有接口
		 * 第三个参数：拦截器
		 */
		PersonDao personDao = (PersonDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				interceptor);
		personDao.save();
	}
}
