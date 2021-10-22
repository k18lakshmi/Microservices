package com.tcs.foodapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.foodapplication.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
