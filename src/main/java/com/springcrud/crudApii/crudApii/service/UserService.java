package com.springcrud.crudApii.crudApii.service;

import java.util.List;

import com.springcrud.crudApii.crudApii.model.User;





public interface UserService {

	
	  User createUser(User user);

      User getUserById (Long id);
	  
	  List<User> getAllUsers();
	  
	  User updateUser(User user);
	  
	  void deleteById(Long id);
	  
	 
	
	
	
	
	
	
	
}
