package com.example.User_Service_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.User_Service_1.Model.User;
import com.example.User_Service_1.Service.UserServiceImp;
import com.example.User_Service_1.Vo.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class usercontroller {

	@Autowired
	private UserServiceImp userServiceImp;
	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public User CreateNewUser(@RequestBody User user)
	{
		log.info("inside User New User Created in Controller");
	 return userServiceImp.CreateUser(user);	
	}
	
	@GetMapping("/users/{userid}")
	public ResponseTemplate  getUserWithDepartment(@PathVariable Long userid)
	{
		return userServiceImp.getuserwithdepartment(userid);
	}
	
	
}
