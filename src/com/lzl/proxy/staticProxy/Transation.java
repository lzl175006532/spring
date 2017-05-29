package com.lzl.proxy.staticProxy;

public class Transation {

	public void beginTransation(){
		System.out.println("开启事物");
	}
	public void commit(){
		System.out.println("提交事物");
	}
}
