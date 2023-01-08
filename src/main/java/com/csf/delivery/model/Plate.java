package com.csf.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Plate  
{  
	//Defining Product id as primary key  
	@Id  
	@Column  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  
	@Column  
	private String name;  
	@Column  
	private int cooktime;  
	@Column
	private String image;

	@ManyToOne(optional=false)
	@JoinColumn(name="idrestaurant", referencedColumnName="id")	
	private Restaurant restaurant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCooktime() {
		return cooktime;
	}

	public void setCooktime(int cooktime) {
		this.cooktime = cooktime;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Plate [id=" + id + ", name=" + name + ", cooktime=" + cooktime + ", image=" + image
				+ ", restaurant=" + restaurant + "]";
	}




}
