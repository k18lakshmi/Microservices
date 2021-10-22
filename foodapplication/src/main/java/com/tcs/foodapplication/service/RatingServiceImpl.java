package com.tcs.foodapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.foodapplication.model.Rating;
import com.tcs.foodapplication.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingRepository ratingrepository;
	
	@Override
	public List<Rating> findAll() {
		// TODO Auto-generated method stub
		return ratingrepository.findAll();
	}

	@Override
	public Optional<Rating> findById(int id) {
		// TODO Auto-generated method stub
		return ratingrepository.findById(id);
	}

	@Override
	public void save(Rating rating) {
		// TODO Auto-generated method stub
		ratingrepository.save(rating);
	}

	@Override
	public void update(int id, Rating rating) {
		// TODO Auto-generated method stub
		ratingrepository.save(rating);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		ratingrepository.deleteById(id);
	}

}
