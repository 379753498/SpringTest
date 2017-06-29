package com.xj.Spring;  

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
  //后置处理器
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub  
		System.out.println(bean.getClass()+"--"+beanName+"开始拦截类");
		if (beanName.equals("Factory")) {
			return null;
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub  
		System.out.println(bean.getClass()+"--"+beanName+"结束后拦截类");
		return bean;
	}

}
