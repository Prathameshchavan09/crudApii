package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.model.User;

@Service

public class UserServiceImp implements UserService {

    @Autowired
	private UserDao userDao;

	@Override
	public User createUser(User user) {
		System.out.println("service  is called");

			return userDao.save(user);

	}
	/*
	 * @Override public User getUserById(Long id) { Optional<User> optionalUser =
	 * userDao.findById(id); return optionalUser.get();
	 * 
	 * }
	 * 
	 * @Override public List<User> getAllUsers() {
	 * 
	 * return userDao.findAll();
	 * 
	 * }
	 * 
	 * @Override public User updateUser(User user) {
	 * 
	 * User existingUser = userDao.findById(user.getId()).get();
	 * existingUser.setName(user.getName()); existingUser.setCity(user.getCity());
	 * existingUser.setSalary(user.getSalary()); User updatedUser =
	 * userDao.save(existingUser); return updatedUser;
	 * 
	 * }
	 * 
	 * @Override public void deleteById(Long id) { userDao.deleteById(id); }
	 */
}
