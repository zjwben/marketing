package com.zjw.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.zjw.model.Test;


public interface TestRepository extends PagingAndSortingRepository<Test, Long>{
	
	List<Test> findByName(@Param("name")String name);	
	
	
}
