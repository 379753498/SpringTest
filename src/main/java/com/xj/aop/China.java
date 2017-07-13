package com.xj.aop;  

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class China implements PeopleAopinterface {


	
	private String name;
	
	public String getName() {
		return name;
	}
	@Autowired
	@Value("人工植入")
	public void setName(String name) {
		this.name = name;
	}
	public void sayhello() {
		// TODO Auto-generated method stub  
		System.out.println("China"+China.class.getName()+name);
	}
	public String sayhello(String s)   {
		// TODO Auto-generated method stub  
System.out.println(s);
		return  s;
	}

	
	
}
