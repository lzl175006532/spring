package com.lzl.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 1、引入目标类和事物类
 * 2、完成invoke方法
 * @author DIY
 *
 */
public class JdkInterceptor implements InvocationHandler{

	private Object target;
	private Transation transation;
	
	public JdkInterceptor(Object target, Transation transation) {
		super();
		this.target = target;
		this.transation = transation;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		transation.beginTransation();
		method.invoke(this.target, args);
		transation.commit();
		return null;
	}

}
