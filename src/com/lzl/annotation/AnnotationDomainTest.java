package com.lzl.annotation;
@ClassInfo(name = "类注解的name",value = "类注解的value")
public class AnnotationDomainTest {

	@MethodInfo(name = "方法注解的name",value = "方法注解的value")
	public void say(){
		System.out.println("say");
	}
}
