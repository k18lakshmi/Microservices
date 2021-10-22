package com.tcs.foodapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.foodapplication.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
