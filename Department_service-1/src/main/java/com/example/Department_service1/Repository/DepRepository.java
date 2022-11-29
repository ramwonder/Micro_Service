package com.example.Department_service1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Department_service1.model.Department;


public interface DepRepository extends JpaRepository<Department, Long> {

	Department findDepartmentById(Long id);

	
}
