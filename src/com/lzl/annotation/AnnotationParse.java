package com.lzl.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

public class AnnotationParse {

	/**
	 * 如果解析类的注解，先得到这个类
	 * 如果解析方法的注解，先得到这个方法
	 */
	public static void parse(){
		Class class1 = AnnotationDomainTest.class;
		if (class1.isAnnotationPresent(ClassInfo.class)) {
			ClassInfo classInfo = (ClassInfo) class1.getAnnotation(ClassInfo.class);
			System.out.println(classInfo.name()+";"+classInfo.value());
		}
		
		Method[] method = class1.getMethods();
		for (Method method2 : method) {
			if (method2.isAnnotationPresent(MethodInfo.class)) {
				MethodInfo methodInfo = method2.getAnnotation(MethodInfo.class);
				System.out.println(methodInfo.name()+";"+methodInfo.value());
			}
		}
	}
	
	@Test
	public void annotationTest(){
		AnnotationParse.parse();
		
	}
}
