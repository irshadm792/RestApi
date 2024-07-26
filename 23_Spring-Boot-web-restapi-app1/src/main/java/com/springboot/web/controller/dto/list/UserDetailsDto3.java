package com.springboot.web.controller.dto.list;

import java.util.List;

public class UserDetailsDto3 {
	
	private String name;
	private String email;
	private String password;
	private long contact;
    private AdressDetailsDto3  adress;
    private List<EducationDetailsDto> education;
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
	public AdressDetailsDto3 getAdress() {
		return adress;
	}
	public void setAdress(AdressDetailsDto3 adress) {
		this.adress = adress;
	}
	public List<EducationDetailsDto> getEducation() {
		return education;
	}
	public void setEducation(List<EducationDetailsDto> education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "UserDetailsDto3 [name=" + name + ", email=" + email + ", password=" + password + ", contact=" + contact
				+ ", adress=" + adress + ", education=" + education + "]";
	}
    
    

}
