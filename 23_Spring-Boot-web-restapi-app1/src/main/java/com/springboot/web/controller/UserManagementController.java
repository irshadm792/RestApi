package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.controller.dto.UserDetailsRegistrationDto2;
import com.springboot.web.controller.dto.UserDetailsRequestDto;
import com.springboot.web.controller.dto.list.UserDetailsDto3;
import com.springboot.web.service.UserManegmentService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManegmentService usermanegement;

	@PostMapping(path="user/create",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String userRegistration(@RequestBody UserDetailsRequestDto UserDetails) {
		System.out.println("receive request Data"+UserDetails);
	String result=	usermanegement.userRegistration(UserDetails);
		return result;
	}
		@PostMapping(path="user/create/adress",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public String userRegistrationWithAdress(@RequestBody UserDetailsRegistrationDto2 UserDetails) {
			System.out.println("receive request Data"+UserDetails);
			return "User Rgistration succesfully";
	}
		@PostMapping(path="user/create/education")
		public String userRegistrationWithEducation(@RequestBody UserDetailsDto3 UserDetails) {
			
			System.out.println("receve request data"+UserDetails);
			return "USer Registrationn successfully";
			
		}
}
