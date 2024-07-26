package com.springboot_rest.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="applications")

public class LoanApp {
	
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;
  
@Column(name="first_name")
private String fName;
@Column(name="last_name")
  private String lName;
@Column(name="loan_amt")
  private String amt;
  
  public LoanApp() {
	  
  }
  
public LoanApp(String fName, String lName, String amt) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.amt = amt;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getAmt() {
	return amt;
}
public void setAmt(String amt) {
	this.amt = amt;
}
  
}

