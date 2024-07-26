package com.springboot.web.controller.dto;

public class UserDetailsRequestDto {

	private String name;
	private String email;
	private String password;
	private long contact;
	private String geneder;
	private String city;
	
	
	
	public UserDetailsRequestDto(String name, String email, String password, long contact) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}
	
	
	public UserDetailsRequestDto() {
		super();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

	

	public String getGeneder() {
		return geneder;
	}


	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public UserDetailsRequestDto(String name, String email, String password, long contact, String geneder,
			String city) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.geneder = geneder;
		this.city = city;
	}


	@Override
	public String toString() {
		return "UserDetailsRequestDto [name=" + name + ", email=" + email + ", password=" + password + ", contact="
				+ contact + "]";
	}
	
	
	
	
}
