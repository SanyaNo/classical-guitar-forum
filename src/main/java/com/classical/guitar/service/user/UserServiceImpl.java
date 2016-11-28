package com.classical.guitar.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classical.guitar.domain.user.User;
import com.classical.guitar.domain.user.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	public User findOne(Long id) {
		return userDao.findOne(id);
	}

	@Override
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public Long count() {
		return userDao.count();
	}

	@Override
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	public boolean exists(Long id) {
		return userDao.exists(id);
	}

}
