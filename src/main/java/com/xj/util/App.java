package com.xj.util;  

import com.xj.Spring.ApplicationContextUitl;
import com.xj.aop.China;
import com.xj.aop.myMethodBeforeAdvice;

  
public class App {

	
	public static void main(String[] args) throws Throwable {
		
		
		China bean = ApplicationContextUitl.getApplicationContextlzy().getBean(China.class);
		bean.sayhello();

	
	}
}
