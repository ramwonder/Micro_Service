package com.example.Department_service1.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Department_service1.Repository.DepRepository;
import com.example.Department_service1.model.Department;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepServiceImp implements DepService{

	@Autowired
	private DepRepository depRepository;

	@Override
	public Department createdep(Department dep) {
		// TODO Auto-generated method stub
		log.info("inside Save Department of deparmentService");
		return depRepository.save(dep);
	}
    @Override
	public Department GetDepartmentById(Long id) {
		// TODO Auto-generated method stub
    	log.info("inside Get Department By Id of deparmentService");
		return depRepository.findDepartmentById(id);
	}
}
