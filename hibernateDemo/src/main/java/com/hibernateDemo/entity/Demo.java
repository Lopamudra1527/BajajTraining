package com.hibernateDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
  @Id	
  @Column(name = "id")
  int id;
  @Column(name = "name")
  String name;
  @Column(name = "salary")
  int salary;
  
public Demo(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Demo() {
	// TODO Auto-generated constructor stub
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
  
}
