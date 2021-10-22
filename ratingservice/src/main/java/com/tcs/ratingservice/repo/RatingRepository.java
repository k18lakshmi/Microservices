package com.tcs.ratingservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.ratingservice.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
