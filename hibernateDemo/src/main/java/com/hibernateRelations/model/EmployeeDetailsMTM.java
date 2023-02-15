package com.hibernateRelations.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class EmployeeDetailsMTM {

	public EmployeeDetailsMTM() {
		// TODO Auto-generated constructor stub
	}
	@Id
   int id;
   String name;
   @ManyToMany
   List<AdressMTM> admtm;
public List<AdressMTM> getAdmtm() {
	return admtm;
}
public void setAdmtm(List<AdressMTM> admtm) {
	this.admtm = admtm;
}
public EmployeeDetailsMTM(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
