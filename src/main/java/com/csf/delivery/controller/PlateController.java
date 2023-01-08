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

import com.csf.delivery.model.Plate;
import com.csf.delivery.service.PlateService;

//mark class as Controller  
@RestController  
@CrossOrigin(origins = "*")
public class PlateController  
{  
	//autowire the BooksService class  
	@Autowired  
	PlateService pS;  
	//creating a get mapping that retrieves all the Plates detail from the database   
	@GetMapping("/Plate")  
	private List<Plate> getAllPlate()   
	{  
		return pS.getAllPlate();  
	}  
	//creating a get mapping that retrieves the detail of a specific Plate  
	@GetMapping("/Plate/{id}")  
	private Plate getPlateById(@PathVariable("id") int id)   
	{  
		return pS.getPlateById(id);  
	}  
	
	//creating a get mapping that retrieves the detail of a specific Plate  
	@GetMapping("/PlateName/{name}")  
	private List<Plate> getPlateByName(@PathVariable("name") String name)   
	{  
		System.out.println("Name : " + name);
		return pS.getPlateByName(name);  
	} 	
	
	//creating a get mapping that retrieves all plates delivered by the restaurant   
	@GetMapping("/PlateRestaurant/{id}")  
	private List<Plate> getPlateByName(@PathVariable("id") int id)   
	{  
		System.out.println("Restaurant id  : " + id);
		return pS.findByRestaurantId(id);  
	} 	
	
	//creating a delete mapping that deletes a specified Plate  
	@DeleteMapping("/Plate/{id}")  
	private void deletePlate(@PathVariable("id") int id)   
	{  
		System.out.println("Suppression Plate ID : " + id);
		pS.delete(id);  
	}  
	//creating post mapping that post the Plate detail in the database  
	@PostMapping("/Plate")  
	private int savePlate(@RequestBody Plate f)   
	{  
		pS.saveOrUpdate(f);  
		return f.getId();  
	}  
	//creating put mapping that updates the Plate detail   
	@PutMapping("/Plate")  
	private Plate update(@RequestBody Plate f)   
	{  
		pS.saveOrUpdate(f);  
		return f;  
	}  
} 



