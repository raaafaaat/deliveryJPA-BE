package com.csf.delivery.service;


import java.util.ArrayList;  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.delivery.model.Plate;
import com.csf.delivery.repository.PlateRepository;



//defining the business logic  
@Service  
public class PlateService  
{  
	@Autowired  
	PlateRepository pR ;  
	//getting all Plates record by using the method findaAll() of CrudRepository  
	public List<Plate> getAllPlate()   
	{  
		List<Plate> Plates = new ArrayList<Plate>();  
		pR.findAll().forEach(f-> Plates.add(f));  
		return Plates;  	
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Plate getPlateById(int id)   
	{  
		return pR.findById(id).get();  
	}  
	
	
	//getting a specific record by using the method findByName() of CrudRepository  
	public List<Plate> getPlateByName(String name)   
	{  
		return pR.findByName(name);
	}  	
	
	//getting a specific records by using the method findByRestaurantId()   
	public List<Plate> findByRestaurantId(int idRestaurant)   
	{  
		return pR.findByRestaurantId(idRestaurant);
	}  		
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Plate f)   
	{  
		pR.save(f);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		pR.deleteById(id);  
	}  
}  


