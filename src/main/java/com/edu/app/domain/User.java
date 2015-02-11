package com.edu.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends BaseEntity {
	
	
	private String firstname;
	private String lastname;
	
	public User(){
		
	}

	public String getFirstname() {
		return firstname;
	}

	@Column(name="first_name",unique = false, nullable = false, insertable = true, updatable = true, length = 64)
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Column(name="last_name", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	

}
