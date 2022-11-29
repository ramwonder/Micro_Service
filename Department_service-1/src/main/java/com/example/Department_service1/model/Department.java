package com.example.Department_service1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String department_name;
	private String department_address;
	private String department_code;
	
}
