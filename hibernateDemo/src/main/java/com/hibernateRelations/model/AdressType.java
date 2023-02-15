package com.hibernateRelations.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//One to Many
@Entity
public class AdressType {

	public AdressType() {
		// TODO Auto-generated constructor stub
	}
	
	  @Id
	  int id;
	  String adress;
	  String adressType;
	  
	  @ManyToOne
	  EmployeeDetailsOneToMany ed=new  EmployeeDetailsOneToMany();
	
	  public AdressType(int id, String adress, String adressType) {
		super();
		this.id = id;
		this.adress = adress;
		this.adressType = adressType;
	}
	  
	public EmployeeDetailsOneToMany getEd() {
		return ed;
	}

	public void setEd(EmployeeDetailsOneToMany ed) {
		this.ed = ed;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdressType() {
		return adressType;
	}
	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}
	  

}
