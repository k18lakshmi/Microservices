package com.tcs.foodapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.foodapplication.model.User;
import com.tcs.foodapplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	@Override
	public Optional<User> findById(int id) {
		// TODO Auto-generated method stub
		return userrepository.findById(id);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userrepository.save(user);
	}

	@Override
	public void update(int id, User user) {
		// TODO Auto-generated method stub
		userrepository.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userrepository.deleteById(id);
	}

}
