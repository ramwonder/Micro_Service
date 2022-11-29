package com.example.Department_service1.Service;

import com.example.Department_service1.model.Department;



public interface DepService {
	public Department createdep(Department dep);

	public Department GetDepartmentById(Long id);

}
