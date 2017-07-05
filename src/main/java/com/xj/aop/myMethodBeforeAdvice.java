package com.xj.aop;  

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.AspectInstanceFactory;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.AspectJMethodBeforeAdvice;
import org.springframework.stereotype.Component;

public class myMethodBeforeAdvice   {
	
	


	public myMethodBeforeAdvice(){
		
	}

	/**
	 * method  被调用的方法名称
	 * args  传递的参数
	 * target  被代理目标对象
	 */
	public void before()
			throws Throwable {
		// TODO Auto-generated method stub  

		System.out.println("日志被记录");
	}
	
	
	public void comit()
			throws Throwable {
		// TODO Auto-generated method stub  

		System.out.println("日志被记录");
	}

}
