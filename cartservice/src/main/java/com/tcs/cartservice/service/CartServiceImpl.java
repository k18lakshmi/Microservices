package com.tcs.cartservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.cartservice.model.Cart;
import com.tcs.cartservice.repo.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartrepository;
	
	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return cartrepository.findAll();
	}

	@Override
	public Optional<Cart> findById(int id) {
		// TODO Auto-generated method stub
		return cartrepository.findById(id);
	}

	@Override
	public void save(Cart cart) {
		// TODO Auto-generated method stub
		cartrepository.save(cart);
	}

	@Override
	public void update(int id, Cart cart) {
		// TODO Auto-generated method stub
		cartrepository.save(cart);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cartrepository.deleteById(id);
	}

}
