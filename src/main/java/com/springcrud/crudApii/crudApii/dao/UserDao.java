package com.springcrud.crudApii.crudApii.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.crudApii.crudApii.model.User;


public interface UserDao extends JpaRepository<User, Long>{

	
	
	
}
