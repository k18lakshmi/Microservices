package com.tcs.foodapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.foodapplication.model.Cart;
import com.tcs.foodapplication.service.CartService;

@RestController
public class CartController {

	@Autowired
	CartService cartService;
	
	@GetMapping("/carts")
	public List<Cart> getCart() {
		return cartService.findAll();
	}
	
	@GetMapping("/carts/{id}")
	public Cart getCartById(@PathVariable int id) {
		return cartService.findById(id).get();
	}
	
	@PostMapping("/carts")
	public void addCarts(@RequestBody Cart cart) {
		cartService.save(cart);
	}
	@PutMapping("/cart/{id}")
	public void editCart(@PathVariable int id,@RequestBody Cart cart) {
		cartService.update(id, cart);
	}
	@DeleteMapping("/cart/{id}")
	public void deleteCart(@PathVariable int id) {
		cartService.delete(id);
	}
	
}
