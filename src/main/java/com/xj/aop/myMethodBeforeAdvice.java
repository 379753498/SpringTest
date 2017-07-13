package com.xj.aop;  

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.AspectInstanceFactory;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.AspectJMethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class myMethodBeforeAdvice   {
	
	   
	    @Pointcut("execution(* *sayhello(..))")  
	    private void aspectJMethod(){};  
	      
	    @Before("aspectJMethod()")  
	    public void doBefore(JoinPoint joinPoint){  
	        System.out.println("----dobefore()开始----");  
	       
	    }  
	    @Around("aspectJMethod()")  
	    public Object doAround(ProceedingJoinPoint pjp) throws Throwable{  
	          
	        System.out.println("----doAround()开始----");  
	   
	        //核心逻辑  
	        Object retval=pjp.proceed();  
	       
	          
	        return retval;  
	    }  
	    @After(value="aspectJMethod()")  
	    public void doAfter(JoinPoint joinPoint){  
	        System.out.println("----doAfter()开始----");  
	     
	    }  
	      
	    @AfterReturning(value="aspectJMethod()",returning="retval")  
	    public void doReturn(JoinPoint joinPoint, String retval){  
	        System.out.println("AfterReturning()开始");  
	        
	          
	    }  
	      
	    @AfterThrowing(value="aspectJMethod()", throwing="e")  
	    public void doThrowing(JoinPoint joinPoint,Exception e){  
	        System.out.println("-----doThrowing()开始-----");    
	       
	    }  

}
