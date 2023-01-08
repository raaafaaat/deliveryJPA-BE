package com.csf.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.csf.delivery.model.Plate;
import com.csf.delivery.model.Restaurant;

//repository that extends CrudRepository  
public interface  PlateRepository extends CrudRepository<Plate, Integer>  
{  
	List<Plate> findByName(String name);
	
	List<Plate> findByRestaurant(Restaurant restaurant);
	
	@Query("SELECT p FROM com.csf.delivery.model.Plate p WHERE p.restaurant.id = :idOfRestaurant") 
	List<Plate> findByRestaurantId(@Param("idOfRestaurant") int idOfRestaurant);	
	
}  
