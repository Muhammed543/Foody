package com.foody.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.foody.model.Items;

public interface ItemRepository extends JpaRepository<Items,Long> {

}
