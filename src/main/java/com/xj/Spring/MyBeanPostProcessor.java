package com.xj.Spring;  

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
  //后置处理器
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub  
		System.out.println(bean.getClass()+"--"+beanName+"开始拦截类");
//		  try {
//			Class<?> Classse= Class.forName(bean.getClass().getName());
//			Method[] methods = Classse.getMethods();
//		
//			for (Method method : methods) {
//				
//				if(method.getName().contains("set"))
//				{
//					System.out.println("我要给"+method.getName()+"打个巨大的LOG");
//				}
//				System.out.println(bean.getClass().getName()+"类"+method.getName());
//				Parameter[] parameters = method.getParameters();
//			for (Parameter parameter : parameters) {
//				
//				System.out.println(bean.getClass().getName()+"类"+method.getName()+"参数"+parameter.toString());
//				
//			}
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block  
//			e.printStackTrace();
//		} 
//		
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub  
		System.out.println(bean.getClass()+"--"+beanName+"结束后拦截类");
		return bean;
	}

}
