package com.zjw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjw.model.Test;
import com.zjw.repository.TestRepository;
import com.zjw.service.TestService;



@RestController

public class TestController {
	
	@Autowired
	private TestService service;
	
	@Autowired
	private TestRepository repository;
	
	
	
	
//	@RequestMapping("/test")
//	public Test test(){
//		Test test = new Test();
//		test.setId((long) 1);
//		test.setName("zjw");
//		test.setDescription("123");
//		test.setDate(new Date());
//		service.save(test);
//		return test;
//	}
//	
	@RequestMapping("/test2")
	public List<Test> test2(){
		return repository.findByName("zjw");
	}

	@RequestMapping("/test")
	public Page<Test> test(@PageableDefault(page=0,value=20)Pageable pageable){
		return repository.findAll(pageable);
	}


	public TestService getService() {
		return service;
	}




	public void setService(TestService service) {
		this.service = service;
	}




	public TestRepository getRepository() {
		return repository;
	}




	public void setRepository(TestRepository repository) {
		this.repository = repository;
	}
	
}
