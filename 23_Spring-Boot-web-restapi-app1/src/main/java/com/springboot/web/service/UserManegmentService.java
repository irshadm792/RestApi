package com.springboot.web.service;

import java.util.List;

import com.springboot.web.controller.dto.UserDetailsRequestDto;
import com.springboot.web.service.entity.UserDetails;

public interface UserManegmentService {
	 String userRegistration(UserDetailsRequestDto dto);

	UserDetails getUserDatabyEmail(String email);


	List<UserDetails> getgetUserDataCityAndGender(String city, String gender);

	String DeleteUserDatabyCity(String city);

	String updateUserPasswordByEamil(String email, String newPassword);

	UserDetails findByEmail(String email);

	UserDetails save(UserDetails user);

	List<UserDetails> getUserDetailsCityAndGender(String city, String gender);

	List<UserDetails> getUserByCity(String city);


		


}