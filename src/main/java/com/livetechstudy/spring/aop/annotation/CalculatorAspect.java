package com.livetechstudy.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)
        throws-pattern?)
**/


@Aspect
@Component
public class CalculatorAspect {

	//argument joint point is not necessary
	@Before("execution(public int add(..))")
	//@Before("addPointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("Entering in Method : "+joinPoint.getSignature().getName());
	}
	
	@AfterReturning("execution(public int add(..))")
	//@AfterReturning("addPointCut()")
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("Returning From Method : "+joinPoint.getSignature().getName());
	}
	
	
	@AfterThrowing("execution(public int divide(..))")
	public void afterException(JoinPoint joinPoint) {
		System.out.println("Exception in method : "+joinPoint.getSignature().getName());
	}
	
	@After("execution(public int divide(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("After method : "+joinPoint.getSignature().getName());
	}
	
	@Around("execution(public int divide(..))")
	public int around(JoinPoint joinPoint) throws Throwable {
		System.out.println("Around method start: "+joinPoint.getSignature().getName());
		Object returnValue = ((ProceedingJoinPoint)joinPoint).proceed();
		System.out.println("Around method end: "+joinPoint.getSignature().getName());	
		return (Integer)returnValue;
	}
	
	@Pointcut("execution(public int add(..))")
	public void addPointCut() {
		
	}
}
