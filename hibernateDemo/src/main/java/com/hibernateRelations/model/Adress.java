package com.hibernateRelations.model;

//One to One
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adress {

	public Adress() {
		// TODO Auto-generated constructor stub
	}
  @Id
  int id;
  String adress;
  
  @OneToOne(mappedBy="adress")
  EmployeeDetails edt;
  
public EmployeeDetails getEdt() {
	return edt;
}
public void setEdt(EmployeeDetails edt) {
	this.edt = edt;
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
  
}
