package com.hibernateRelations.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class AdressMTM {

	public AdressMTM() {
		// TODO Auto-generated constructor stub
	}
	@Id
    int id;
    String adress;
    @ManyToMany
    List<EmployeeDetailsMTM> emtm;
    
	public List<EmployeeDetailsMTM> getEmtm() {
		return emtm;
	}
	public void setEmtm(List<EmployeeDetailsMTM> emtm) {
		this.emtm = emtm;
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
	public AdressMTM(int id, String adress) {
		super();
		this.id = id;
		this.adress = adress;
	}
    
}
