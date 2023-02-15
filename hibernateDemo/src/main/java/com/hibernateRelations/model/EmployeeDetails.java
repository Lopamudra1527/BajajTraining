package com.hibernateRelations.model;

//One to One 
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class EmployeeDetails {

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	@Id
  int id;
  String name;
  @OneToOne
  Adress adress;
  
public Adress getAdress() {
	return adress;
}
public void setAdress(Adress adress) {
	this.adress = adress;
}
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
  
}
