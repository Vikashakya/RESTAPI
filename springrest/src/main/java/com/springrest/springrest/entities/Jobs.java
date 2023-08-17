package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jobs {
	@Id
   private long id;
   private String rol;
   private String companyName;
   private String Link;
   private String batch;
   private String desk;
public Jobs(Long id,String rol, String companyName, String link, String batch, String desk) {
	super();
	this.id=id;
	this.rol = rol;
	this.companyName = companyName;
	Link = link;
	this.batch = batch;
	this.desk = desk;
}
public Jobs() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId()
{
	return id;
}
public void setId(Long id)
{
	this.id=id;
}
public String getRol() {
	return rol;
}
public void setRol(String rol) {
	this.rol = rol;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getLink() {
	return Link;
}
public void setLink(String link) {
	Link = link;
}
public String getBatch() {
	return batch;
}
public void setBatch(String batch) {
	this.batch = batch;
}
public String getDesk() {
	return desk;
}
public void setDesk(String desk) {
	this.desk = desk;
}
   
   
   

   
}
