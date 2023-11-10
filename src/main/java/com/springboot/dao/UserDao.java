package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;



import com.springboot.model.User;

public interface UserDao extends JpaRepository<User, Long>{

	
	
	
}
