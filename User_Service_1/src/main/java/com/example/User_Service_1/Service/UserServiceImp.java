package com.example.User_Service_1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.User_Service_1.Model.User;
import com.example.User_Service_1.Repository.UserRepository;
import com.example.User_Service_1.Vo.Department;
import com.example.User_Service_1.Vo.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RestTemplate restTemplate;
	
	@Override
	public User CreateUser(User user) {
		// TODO Auto-generated method stub
		log.info("inside new user created in UserService");
		return  userRepository.save(user);
	}

	@Override
	public ResponseTemplate getuserwithdepartment(Long userid) {
		// TODO Auto-generated method stub
		ResponseTemplate vo=new ResponseTemplate();
		User user=userRepository.findByUserid(userid);
		Department department =
				restTemplate.getForObject("http://DEPARTMENT/departments/"+user.getDepartmentid(),Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
