package com.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foody.model.AddRestaurant;
import com.foody.model.Admin;
import com.foody.repository.AddRestRepository;
import com.foody.repository.AdminRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminRepository adminrepo;
	@Autowired
	private AddRestRepository addrepo;
	
	@PostMapping("/login")
public	Admin logadmin(@RequestBody Admin admin)
	{
		
		
		Admin admn=adminrepo.findByEmailAndPassword(admin.getEmail(),admin.getPassword());
		return admn;
		
	}
	@PostMapping("/addrest")
	public AddRestaurant saveAddRestaurant(@RequestBody AddRestaurant addrest)
	{
		AddRestaurant addrst=addrepo.save(addrest);
		return addrst;
	}
}
