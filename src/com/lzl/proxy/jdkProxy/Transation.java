package com.lzl.proxy.jdkProxy;

public class Transation {

	public void beginTransation(){
		System.out.println("jdkProxy 开启事物");
	}
	public void commit(){
		System.out.println("jdkProxy 提交事物");
	}
}
