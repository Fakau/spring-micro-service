package com.engine.fakau.serviceemploye.domaine;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Basic(optional = false)
 private Long id;
 private String firstName;
 private String lastName;
 private String departement;
 
 
public Employe(Long id, String firstName, String lastName, String departement) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.departement = departement;
}
public Employe() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDepartement() {
	return departement;
}
public void setDepartement(String departement) {
	this.departement = departement;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", departement=" + departement
			+ "]";
}
 
 
 
}
