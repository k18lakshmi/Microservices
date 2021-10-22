package com.tcs.cartservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.cartservice.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
