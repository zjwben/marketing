package com.zjw.test;

import java.util.Date;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.zjw.model.Test;
import com.zjw.util.ApplicationContextUtils;


public class TestDAO{
	
	
	
	
	public TestDAO(){
		System.out.println("Create Test");
	}
	
	@org.junit.Test
	public void testConnection(){
		Test test = new Test();
		test.setId((long) 1);
		test.setName("zjw");
		test.setDate(new Date());
	}
	
}
