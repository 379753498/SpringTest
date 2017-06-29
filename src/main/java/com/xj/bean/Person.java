package com.xj.bean;  

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")//prototype 原型模式 每次获取都是全新的实例
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

public class Person {

	public Person()
	{
		System.out.println("people被实例化了");
	}
	
	private String name;
	private int age;



	public String getName() {
		return name;
	}
	
	@Value(value = "SpEL表达式")  
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
