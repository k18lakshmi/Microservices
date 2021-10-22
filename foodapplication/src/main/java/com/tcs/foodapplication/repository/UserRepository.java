package com.tcs.foodapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.foodapplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
