package com.tcs.fooditemservice.service;

import java.util.List;
import java.util.Optional;

import com.tcs.fooditemservice.model.FoodItem;

public interface FoodItemService {

	public static final List<FoodItem> fooditems = null;
	public List<FoodItem> findAll();  //method declaration only
	public Optional<FoodItem> findById(int id);
	public void save(FoodItem fooditem);
	public void update(int id, FoodItem fooditem);
	public void delete(int id);
}
