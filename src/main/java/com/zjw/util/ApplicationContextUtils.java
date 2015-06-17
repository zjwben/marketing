package com.zjw.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;



@Component
public class ApplicationContextUtils implements ApplicationContextAware{

	
	@Autowired
	private static ApplicationContext ctx;
	
	
	public ApplicationContextUtils() {
		// TODO Auto-generated constructor stub
		System.out.println("Create application context");
		
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		ctx = applicationContext;
		System.out.println("set Application");
	}

	public static ApplicationContext getApplicationContext(){
		return ctx;
	}
}
