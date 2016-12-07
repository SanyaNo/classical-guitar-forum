package com.classical.guitar.service.user;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classical.guitar.domain.user.User;
import com.classical.guitar.domain.user.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	@Transactional
	public User findOne(Long id) {
		return userDao.findOne(id);
	}

	@Override
	@Transactional
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	@Transactional
	public Long count() {
		return userDao.count();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	@Transactional
	public boolean exists(Long id) {
		return userDao.exists(id);
	}

	@Override
	@Transactional
	public void delete(User user) {
		userDao.delete(user);
	}

}
