package com.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foody.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
