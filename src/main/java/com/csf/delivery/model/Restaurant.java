package com.csf.delivery.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Restaurant  
{  
	//Defining Product id as primary key  
	@Id  
	@Column  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  
	@Column  
	private String name;  
	@Column  
	private String address;  
	@Column
	private String phone;
	@Column
	private String image;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", image="
				+ image + "]";
	}		


}