package com.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foody.model.AddProducts;

public interface AddProRepository extends JpaRepository<AddProducts, Long> {

}
