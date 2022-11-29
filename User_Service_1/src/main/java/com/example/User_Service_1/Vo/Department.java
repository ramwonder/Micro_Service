package com.example.User_Service_1.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private Long id;
	private String department_name;
	private String department_address;
	private String department_code;

}
