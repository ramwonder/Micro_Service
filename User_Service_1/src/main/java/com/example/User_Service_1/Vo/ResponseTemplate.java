package com.example.User_Service_1.Vo;

import com.example.User_Service_1.Model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

private	User user;
	
private Department department;
}
