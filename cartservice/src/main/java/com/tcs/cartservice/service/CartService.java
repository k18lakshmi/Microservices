package com.tcs.cartservice.service;

import java.util.List;
import java.util.Optional;

import com.tcs.cartservice.model.Cart;

public interface CartService {

	public static final List<Cart> carts = null;
	public List<Cart> findAll();  //method declaration only
	public Optional<Cart> findById(int id);
	public void save(Cart cart);
	public void update(int id, Cart cart);
	public void delete(int id);
	
}
