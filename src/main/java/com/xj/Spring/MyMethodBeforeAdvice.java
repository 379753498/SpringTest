package com.xj.Spring;  

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
  
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub  
		System.out.println("开始方法级别拦截");

	}

}
