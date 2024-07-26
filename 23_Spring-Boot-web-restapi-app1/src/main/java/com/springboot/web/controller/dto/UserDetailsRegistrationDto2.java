package com.springboot.web.controller.dto;

public class UserDetailsRegistrationDto2 {
	
	private String name;
	private String email;
	private String password;
	private long contact;
    private AdressDetailsDto adress;
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
public AdressDetailsDto getAdress() {
	return adress;
}
public void setAdress(AdressDetailsDto adress) {
	this.adress = adress;
}
@Override
public String toString() {
	return "UserDetailsRegistrationDto2 [name=" + name + ", email=" + email + ", password=" + password + ", contact="
			+ contact + ", adress=" + adress + "]";
}

 
}
