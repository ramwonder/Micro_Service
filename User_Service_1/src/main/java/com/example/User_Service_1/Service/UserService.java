package com.example.User_Service_1.Service;


import com.example.User_Service_1.Model.User;
import com.example.User_Service_1.Vo.ResponseTemplate;


public interface UserService {
	public User CreateUser(User user);
	public ResponseTemplate getuserwithdepartment(Long userid);
}
