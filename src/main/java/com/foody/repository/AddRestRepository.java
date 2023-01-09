package com.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foody.model.AddRestaurant;

public interface AddRestRepository extends JpaRepository<AddRestaurant, Long> {

}
