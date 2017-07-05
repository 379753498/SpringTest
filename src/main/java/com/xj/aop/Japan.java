package com.xj.aop;  

import org.springframework.stereotype.Component;

@Component
public class Japan implements PeopleAopinterface {

	public void sayhello() {
		// TODO Auto-generated method stub  
		System.out.println("China"+Japan.class.getName());
	}


}

