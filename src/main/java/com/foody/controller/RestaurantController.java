package com.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foody.model.AddProducts;
import com.foody.model.Restaurants;
import com.foody.repository.AddProRepository;
import com.foody.repository.RestaurantRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/restaurants")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restrepo;
	@Autowired
	private AddProRepository prorepo;
	
	@PostMapping("/regrestaurant")
	public Restaurants saveRestaurants(@RequestBody Restaurants restaurants)
	{
		System.out.println(restaurants);
		Restaurants restaurant=restrepo.save(restaurants);
		return restaurant;
	}
	@PostMapping("/login")
	public Restaurants logrestaurant(@RequestBody Restaurants re)
	{
		
		
		Restaurants restaurant=restrepo.findByEmailAndPassword(re.getEmail(),re.getPassword());   	
		return restaurant;
	}
	@PostMapping("/addproducts")
	public AddProducts saveAddProducts(@RequestBody AddProducts addprod)
	{
		AddProducts addpro=prorepo.save(addprod);
		return addpro;
	}
}
