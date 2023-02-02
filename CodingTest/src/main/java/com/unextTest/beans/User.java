package com.unextTest.beans;

public class User {
    int id;
    public User()
    {
    	
    }
    public User(int id, String name, int number)
    {
    	this.id=id;
    	this.name=name;
    	this.number=number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	String name;
    int number;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
}
