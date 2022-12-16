package com.springboot.searchmicroservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User { 

	private String lastName;
	private String firstname;
	private String age;
	private String gender; 
	private String email;
	
	@Override
	public String toString() {
		return "User [lastName=" + lastName + ", firstname=" + firstname + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + "]";
	}

	public User(String lastName, String firstname, String age, String gender, String email) {
		super();
		this.lastName = lastName;
		this.firstname = firstname;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
