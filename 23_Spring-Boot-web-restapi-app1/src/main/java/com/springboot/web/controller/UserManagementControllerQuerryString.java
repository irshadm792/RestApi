package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.web.service.entity.UserDetails;
import com.springboot.web.service.UserManegmentService;


@RestController
public class UserManagementControllerQuerryString{
	
	@Autowired
	UserManegmentService service;
	
	@GetMapping("/user/info")
	public List<UserDetails> getUserDetailsByCityAndGender(@RequestParam String City, 
		@RequestParam(name="gender" )String Gender){
		
		
		return service.getUserDetailsCityAndGender(City, Gender);
		
		
	}
	
	
	@GetMapping("/user/info/{city}")
	public List<UserDetails> getUserDetailsByCity(@RequestParam (required = false) String gender, 
		@PathVariable String city){
		
		if(gender!=null) {
			return service.getUserDetailsCityAndGender(city, gender);
		}else {
			return service.getUserByCity(city);
		}
		
		
		
	}
	
	
	

}
