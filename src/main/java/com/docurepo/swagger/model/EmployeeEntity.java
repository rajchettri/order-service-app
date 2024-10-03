package com.docurepo.swagger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	@Column(name="FIRST_NAME")
	private String firstname;
	@Column(name ="LAST_NAME")
	private String lastname;
	@Column(name="DESIGNATION")
	private String designation;
	@Column(name = "CITY")
	private String city;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "AGE")
	private Integer age;
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", designation=" + designation + ", city=" + city + ", country=" + country + ", age=" + age + "]";
	}
	public EmployeeEntity() {
		// TO DO 
	}
	public EmployeeEntity(String firstname, String lastname, String designation, String city, String country,
			Integer age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.city = city;
		this.country = country;
		this.age = age;
	}

}
