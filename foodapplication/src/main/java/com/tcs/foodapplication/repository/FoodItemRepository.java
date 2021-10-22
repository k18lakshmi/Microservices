package com.tcs.foodapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.foodapplication.model.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

}
