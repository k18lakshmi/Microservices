package com.tcs.ratingservice.service;

import java.util.List;
import java.util.Optional;

import com.tcs.ratingservice.model.Rating;

public interface RatingService {

	public static final List<Rating> ratings = null;
	public List<Rating> findAll();  //method declaration only
	public Optional<Rating> findById(int id);
	public void save(Rating rating);
	public void update(int id, Rating rating);
	public void delete(int id);
	
}
