	package com.springboot.controller;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.springboot.model.User;
	import com.springboot.service.UserService;
	
	
	
	@RestController
	
	@RequestMapping("/api")
	public class UserController {
	
		@Autowired
		private UserService userService;
	
		   @PostMapping("/user")
	        public ResponseEntity<User> createUser(@RequestBody User user) {
			System.out.println("controller is called");
			User createUser = userService.createUser(user);
			
			return new ResponseEntity<>(createUser, HttpStatus.CREATED);
			
			
			
	
		}
		   
		   
		   
		   
		   /*
		@GetMapping("{id}")
		public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		    User retrievedUser = userService.getUserById(id);
		    if (retrievedUser != null) {
		        return new ResponseEntity<>(retrievedUser, HttpStatus.OK);
		    } else {
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		}
		
		@GetMapping
		public ResponseEntity<List<User>> getAllUsers() {
	
			List<User> users = userService.getAllUsers();
			return new ResponseEntity<>(users, HttpStatus.OK);
	
		}
	
		@PutMapping("{id}")
		public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
	
			user.setId(id);
			User updatedUser = userService.updateUser(user);
			return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	
		}
	
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
	
			userService.deleteById(id);
			return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	
		}
		
		*/
	
	}
