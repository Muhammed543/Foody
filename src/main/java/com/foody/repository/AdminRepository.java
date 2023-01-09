package com.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foody.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByEmailAndPassword(String email,String password);

}
