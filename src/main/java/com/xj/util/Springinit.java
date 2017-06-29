package com.xj.util;  


import org.springframework.beans.factory.BeanFactory;

import com.xj.Pojo.PeopleInterface;
import com.xj.Spring.ApplicationContextUitl;
import com.xj.Spring.Factory;
import com.xj.Spring.SpringUtil;
import com.xj.bean.China;
import com.xj.bean.Person;
  
public class Springinit {

	
	public static void main(String[] args) {

//		PeopleInterface bean=null;
//		bean=(PeopleInterface) ApplicationContextUitl.getApplicationContextlzy().getBean("Interface");
//		System.out.println(bean);
//		bean.eat();
//		Factory f=	ApplicationContextUitl.getApplicationContextlzy().getBean(Factory.class);
//		BeanFactory beanFactory = f.getBeanFactory();
////		PeopleInterface bean2 = (PeopleInterface)beanFactory.getBean("Interface");
//		PeopleInterface	bean2=(PeopleInterface) ApplicationContextUitl.getApplicationContextlzy().getBean("Interface");
//		System.out.println(bean2);
//		bean2.eat();
		Person bean3 = ApplicationContextUitl.getApplicationContextlzy().getBean(Person.class);
		China bean4= ApplicationContextUitl.getApplicationContextlzy().getBean(China.class);
		System.out.println(bean3.getName());
		System.out.println(bean4.getPerson().getName());	
		System.out.println(bean4.getPerson().getName());	

	}
}
