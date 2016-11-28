package com.classical.guitar.service.user;

import java.util.List;

import com.classical.guitar.domain.user.User;

public interface UserService {
	
	User save(User user);
	
	User findOne(Long id);
	
	List<User> findAll();
	
	Long count();
	
	void delete(Long id);
	
	boolean exists(Long id);

}
