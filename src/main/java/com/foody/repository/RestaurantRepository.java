package com.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foody.model.Restaurants;

public interface RestaurantRepository extends JpaRepository<Restaurants, Long>{
	Restaurants findByEmailAndPassword(String email,String password);

}
