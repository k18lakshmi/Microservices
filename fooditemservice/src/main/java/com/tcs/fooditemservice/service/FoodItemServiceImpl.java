package com.tcs.fooditemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.fooditemservice.model.FoodItem;
import com.tcs.fooditemservice.repo.FoodItemRepository;

@Service
public class FoodItemServiceImpl implements FoodItemService {

	@Autowired
	FoodItemRepository fooditemrepository;
	
	@Override
	public List<FoodItem> findAll() {
		// TODO Auto-generated method stub
		return fooditemrepository.findAll();
	}

	@Override
	public Optional<FoodItem> findById(int id) {
		// TODO Auto-generated method stub
		return fooditemrepository.findById(id);
	}

	@Override
	public void save(FoodItem fooditem) {
		// TODO Auto-generated method stub
		fooditemrepository.save(fooditem);
	}

	@Override
	public void update(int id, FoodItem fooditem) {
		// TODO Auto-generated method stub
		fooditemrepository.save(fooditem);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		fooditemrepository.deleteById(id);
	}

}
