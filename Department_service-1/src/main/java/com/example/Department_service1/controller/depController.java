package com.example.Department_service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Department_service1.Service.DepServiceImp;
import com.example.Department_service1.model.Department;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class depController {
	
	@Autowired
	private DepServiceImp depServiceImp;
	@PostMapping("/departments")
	@ResponseStatus(HttpStatus.CREATED)
	public Department PostDepartment(@RequestBody Department dep)
	{
		log.info("Inside saveDepartment method of departmentController");
		
		return depServiceImp.createdep(dep);
	}
	
	@GetMapping("/departments/{id}")
	public Department GetDepartmentById(@PathVariable Long id)
	{
		log.info("inside getDepartemnet by id using controller");
		return depServiceImp.GetDepartmentById(id);
	}

}
