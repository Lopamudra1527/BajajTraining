package com.bajaj.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {  
	
	public int id;  
	public String name;  
	Adress address;
	List<String> skills;


public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


public Adress getAdress() {
	return address;
}


public void setAdress(Adress adress) {
	this.address = adress;
}


public List getSkills() {
	return skills;
}


public void setSkills(List skills) {
	this.skills = skills;
}


public Employee(int id,String name, Adress adress)
{
  this.id=id;
  this.name=name;
  this.address=adress;
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
  

public void display(){  
    System.out.println(id+" "+name);  
}  
  @Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", adress=" + address.getCity() + ", skills=" + skills + "]";
}
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}
}  
