package org.sid.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@EmbeddedId
	private EmployeeId id;
	
	private String email;
	private String name;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Employee() {
	}
	
	public EmployeeId getId() {
		return id;
	}

	public void setId(EmployeeId id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhone_number(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Employee(EmployeeId id, String email, String name, String phoneNumber) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
}
