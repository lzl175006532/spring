package com.lzl.privilege;



import java.util.ArrayList;
import java.util.List;

import org.aspectj.apache.bcel.generic.NEW;
import org.aspectj.lang.ProceedingJoinPoint;

import com.lzl.privilege.annotation.AnnotationParse;
import com.lzl.privilege.dao.PrivilegeDao;


public class AopAspect {

	private List<PrivilegeDao> privilegeDaos = new ArrayList<>();
	
	public List<PrivilegeDao> getPrivilegeDaos() {
		return privilegeDaos;
	}
	private AopAspect(){}
	public void aspect(ProceedingJoinPoint joinPoint) throws Throwable{
		String privilegeName = AnnotationParse.parse(joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
		boolean isTrue = false;
		for (PrivilegeDao privilegeDao : privilegeDaos) {
			if (privilegeDao.getPrivilegeName().equals(privilegeName)) {
				isTrue = true;
				break;
			}
		}
		if (isTrue) {
			joinPoint.proceed();
		}else {
			System.out.println("你没有权限啊！");
		}
		
		
	}
}
