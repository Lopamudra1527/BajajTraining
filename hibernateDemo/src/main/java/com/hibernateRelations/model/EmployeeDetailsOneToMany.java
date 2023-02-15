package com.hibernateRelations.model;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
public class EmployeeDetailsOneToMany {

	public EmployeeDetailsOneToMany() {
		// TODO Auto-generated constructor stub
	}
	@Id
	int id;
	String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	
	List<AdressType> adressType;
	
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
	public List<AdressType> getAdress() {
		return adressType;
	}
	public void setAdress(List<AdressType> adress) {
		this.adressType = adress;
	}
	

}
