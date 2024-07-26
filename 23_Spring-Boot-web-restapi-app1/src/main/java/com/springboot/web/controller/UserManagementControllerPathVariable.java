package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.controller.dto.UserDetailsRequestDto;
import com.springboot.web.service.UserManegmentService;
import com.springboot.web.service.entity.UserDetails;

@RestController
public class UserManagementControllerPathVariable {
	
	@Autowired
	UserManegmentService usermanegement;
	
	@GetMapping(path="/user/{emailId}")
	public UserDetails getUserDatabyEmailId(@PathVariable("emailId") String  email) {
		
		System.out.println("Email id recieve for information= "+(String) email);
		
		return usermanegement.getUserDatabyEmail(email);                                                                               
	}
	
	
	@GetMapping(path="/user/{city}/{gender}")
	public List<UserDetails> getgetUserDataCityAndGender(@PathVariable(name="city") String city ,
		@PathVariable(name="gender")String gender) {
		
		return usermanegement.getgetUserDataCityAndGender(city , gender);
	}
	
	@DeleteMapping(path="/user/{city}")
	public String DeleteUserDatabyCity(@PathVariable("city") String  city) {
		
		System.out.println("city recieve for information= "+(String) city);
		usermanegement.DeleteUserDatabyCity(city);
		
		return "User Delete Successfully";                                                                               
	}
	
	@PutMapping(path="user/update/{email}")
	public String updateUserPasswordByEamil( @PathVariable("email") String email,@RequestParam String newPassword) {
		
		UserDetails user = usermanegement.findByEmail(email);
		user.setPassword(newPassword);
		usermanegement.save(user);
		return "user update succesfully";
	}
	
	
	
	

}
