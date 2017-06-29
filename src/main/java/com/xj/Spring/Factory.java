package com.xj.Spring;  

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
  
public class Factory implements ApplicationContextAware, BeanFactoryAware {

	private BeanFactory beanFactory;
	private ApplicationContext  applicationContext;
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub  
		this.beanFactory=beanFactory;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
		return beanFactory;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub  
		this.applicationContext=applicationContext;
	}

}
