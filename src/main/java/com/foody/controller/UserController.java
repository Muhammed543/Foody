package com.foody.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foody.model.AddRestaurant;
import com.foody.model.Items;
import com.foody.model.Login;
import com.foody.model.User;
import com.foody.model.UserRegData;
import com.foody.repository.AddRestRepository;
import com.foody.repository.ItemRepository;
import com.foody.repository.LoginRepository;
import com.foody.repository.UserRepository;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private LoginRepository logRepo;
	
	@Autowired
	private AddRestRepository restrepo;
	@Autowired
	private ItemRepository itemrepo;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody UserRegData userdata)
	{
		System.out.println(userdata);
		User user=userRepo.save(userdata.getUser());
		
		Login l=userdata.getLogin();
		l.setUser(user);
		
		logRepo.save(l);
		return user;
	}
	
	@PostMapping("/login")
	public Login loguser(@RequestBody Login lg)
	{
		Login log=logRepo.findByEmailAndPassword(lg.getEmail(),lg.getPassword());   	
		return log;
	}
	@GetMapping("/restaurants")
	public ResponseEntity<Map<String , List>> viewAll(){
		List<AddRestaurant> restlist=restrepo.findAll();
		Map<String , List> map=new HashMap<>();
		map.put("restaurant", restlist);
		
		return ResponseEntity.accepted().body(map);
	}
	@GetMapping("/items")
	public ResponseEntity<Map<String , List>> viewitems(){
		List<Items> restlist=itemrepo.findAll();
		Map<String , List> map=new HashMap<>();
		map.put("items", restlist);
		
		return ResponseEntity.accepted().body(map);
	}

}
