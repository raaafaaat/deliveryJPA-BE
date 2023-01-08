package com.csf.delivery.service;



import java.util.ArrayList;  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.delivery.model.Restaurant;
import com.csf.delivery.repository.RestaurantRepository;



//defining the business logic  
@Service  
public class RestaurantService  
{  
	@Autowired  
	RestaurantRepository rR ;  
	//getting all Restaurants record by using the method findaAll() of CrudRepository  
	public List<Restaurant> getAllRestaurant()   
	{  
		List<Restaurant> Restaurants = new ArrayList<Restaurant>();  
		rR.findAll().forEach(f-> Restaurants.add(f));  
		return Restaurants;  	
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantById(int id)   
	{  
		return rR.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant f)   
	{  
		rR.save(f);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		rR.deleteById(id);  
	}  
}  

