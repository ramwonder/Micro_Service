package com.example.User_Service_1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User_Service_1.Model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserid(Long userid);

}
