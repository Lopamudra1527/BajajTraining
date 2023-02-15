package com.hibernateDemo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="stu_tab")
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Id
	int id;
	String name;
	String email;
	@Lob
	byte[] image;
	String adress;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Student(int id, String name, String email, byte[] image, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.image = image;
		this.adress = adress;
	}

}
