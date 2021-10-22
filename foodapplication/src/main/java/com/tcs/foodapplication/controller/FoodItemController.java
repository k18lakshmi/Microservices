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

import com.tcs.foodapplication.model.FoodItem;
import com.tcs.foodapplication.service.FoodItemService;

@RestController
public class FoodItemController {

	@Autowired
	FoodItemService fooditemService;
	
	@GetMapping("/fooditems")
	public List<FoodItem> getFoodItem() {
		return fooditemService.findAll();
	}
	
	@GetMapping("/fooditems/{id}")
	public FoodItem getFoodItemById(@PathVariable int id) {
		return fooditemService.findById(id).get();
	}
	
	@PostMapping("/fooditems")
	public void addFoodItems(@RequestBody FoodItem fooditem) {
		fooditemService.save(fooditem);
	}
	@PutMapping("/fooditems/{id}")
	public void editFoodItem(@PathVariable int id,@RequestBody FoodItem fooditem) {
		fooditemService.update(id, fooditem);
	}
	@DeleteMapping("/fooditems/{id}")
	public void deleteFoodItem(@PathVariable int id) {
		fooditemService.delete(id);
	}
		
}
