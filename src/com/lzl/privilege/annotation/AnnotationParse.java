package com.lzl.privilege.annotation;

import java.lang.reflect.Method;

public class AnnotationParse {

	public static String parse(Class className,String methodName) throws Exception{
		Method method = className.getMethod(methodName);
		boolean b = method.isAnnotationPresent(MyAnnotation.class);
		String privilegeNameString = "";
		if (b) {
			privilegeNameString = method.getAnnotation(MyAnnotation.class).name();
		}
		return privilegeNameString;
	}
}
