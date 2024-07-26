package com.springboot.web.controller.dto.list;

public class AdressDetailsDto3 {
	
	private String city;
	private String area;
	private String state;
	private int pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "AdressDetailsDto [city=" + city + ", area=" + area + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
	

}
