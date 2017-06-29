package com.xj.bean;  

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
  @Component
public class China {

	
	private Person person;

	public Person getPerson() {
		return person;
	}
	
//	@Resource(name ="person")
	@Autowired
	@Qualifier(value="person")
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
