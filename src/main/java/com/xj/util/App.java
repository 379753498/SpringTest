package com.xj.util;  

import com.xj.Spring.ApplicationContextUitl;
import com.xj.aop.China;

  
public class App {

	
	public static void main(String[] args) {
		
		
		China bean = ApplicationContextUitl.getApplicationContextlzy().getBean(China.class);
		bean.sayhello();
	}
}
