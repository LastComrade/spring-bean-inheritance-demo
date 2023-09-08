package com.deloitte.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* com.deloitte.beans.*.*(..))")
	public void logBefore(JoinPoint jp) {
		System.out.println("Aspect > logBefore");
	}

	@After("execution(* com.deloitte.beans.*.*(..))")
	public void logAfter(JoinPoint jp) {
		System.out.println("Aspect > logAfter");
	}
}
