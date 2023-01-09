package com.foody.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foody.model.Items;
import com.foody.repository.ItemRepository;
@RestController
@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/items")
public class Itemcontroller {
@Autowired
private ItemRepository itemrepo;
@PostMapping("/save")
public Items saveItem(@RequestBody Items item)
{
	System.out.println(item);
	Items items=itemrepo.save(item);
	return items;
}
}
