package com.csf.delivery.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.csf.delivery.model.Restaurant;
import com.csf.delivery.service.RestaurantService;

//mark class as Controller  
@RestController  
@CrossOrigin(origins = "*")
public class RestaurantController  
{  
	//autowire the BooksService class  
	@Autowired  
	RestaurantService rS;  
	//creating a get mapping that retrieves all the Restaurants detail from the database   
	@GetMapping("/Restaurant")  
	private List<Restaurant> getAllRestaurant()   
	{  
		return rS.getAllRestaurant();  
	}  
	//creating a get mapping that retrieves the detail of a specific Restaurant  
	@GetMapping("/Restaurant/{id}")  
	private Restaurant getRestaurantById(@PathVariable("id") int id)   
	{  
		return rS.getRestaurantById(id);  
	}  
	//creating a delete mapping that deletes a specified Restaurant  
	@DeleteMapping("/Restaurant/{id}")  
	private void deleteRestaurant(@PathVariable("id") int id)   
	{  
		System.out.println("Suppression Restaurant ID : " + id);
		rS.delete(id);  
	}  
	//creating post mapping that post the Restaurant detail in the database  
	@PostMapping("/Restaurant")  
	private int saveRestaurant(@RequestBody Restaurant f)   
	{  
		rS.saveOrUpdate(f);  
		return f.getId();  
	}  
	//creating put mapping that updates the Restaurant detail   
	@PutMapping("/Restaurant")  
	private Restaurant update(@RequestBody Restaurant f)   
	{  
		rS.saveOrUpdate(f);  
		return f;  
	}  
} 


