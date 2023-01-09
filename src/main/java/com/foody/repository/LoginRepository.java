package com.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foody.model.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByEmailAndPassword(String email,String password);

}
