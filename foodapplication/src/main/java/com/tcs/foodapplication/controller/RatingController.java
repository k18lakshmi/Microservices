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

import com.tcs.foodapplication.model.Rating;
import com.tcs.foodapplication.service.RatingService;

@RestController
public class RatingController {

	@Autowired
	RatingService ratingService;
	
	@GetMapping("/ratings")
	public List<Rating> getRating() {
		return ratingService.findAll();
	}
	
	@GetMapping("/ratings/{id}")
	public Rating getRatingById(@PathVariable int id) {
		return ratingService.findById(id).get();
	}
	
	@PostMapping("/ratings")
	public void addRatings(@RequestBody Rating rating) {
		ratingService.save(rating);
	}
	@PutMapping("/rating/{id}")
	public void editRating(@PathVariable int id,@RequestBody Rating rating) {
		ratingService.update(id, rating);
	}
	@DeleteMapping("/rating/{id}")
	public void deleteRating(@PathVariable int id) {
		ratingService.delete(id);
	}
	
}
