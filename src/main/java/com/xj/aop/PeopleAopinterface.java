package com.xj.aop;  

import org.springframework.stereotype.Component;

@Component
public interface PeopleAopinterface {

	void sayhello();
	
	String sayhello(String s);
}
