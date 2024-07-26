package com.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.controller.dto.UserDetailsRequestDto;
import com.springboot.web.service.entity.UserDetails;
import com.springboot.web.service.repository.UserManegmentRepository;

@Service
public class UserManegmentServiceImp  implements UserManegmentService {
	@Autowired
	UserManegmentRepository ums;
	@Override
	public String userRegistration(UserDetailsRequestDto dto) {
		
		UserDetails userdata = new UserDetails();
		
		userdata.setContact(dto.getContact());
		userdata.setEmail(dto.getEmail());
		userdata.setName(dto.getName());
		userdata.setPassword(dto.getPassword());
		userdata.setCity(dto.getCity());
		userdata.setGeneder(dto.getGeneder());
		
		userdata=	ums.save(userdata);
		
		return "User Registration success This is your userId "+userdata.getUserid();
	}
	@Override
	public UserDetails getUserDatabyEmail(String email) {
		// TODO Auto-generated method stub
		return ums.findByEmail(email);
	}
	
	
	public	List<UserDetails> getgetUserDataCityAndGender(String city, String gender){
		
		
		return  ums.findByCityAndGeneder(city, gender);
	}
	@Override
	public String DeleteUserDatabyCity(String city) {
		return ums.deleteByCity(city);
	}

	@Override
	public UserDetails findByEmail(String email) {
		
		return ums.findByEmail(email);
	}
	@Override
	public UserDetails save(UserDetails user) {
		// TODO Auto-generated method stub
		return ums.save(user);
	}
	@Override
	public String updateUserPasswordByEamil(String email, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<UserDetails> getUserDetailsCityAndGender(String city, String gender) {
		
		return ums.findByCityAndGeneder(city, gender);
	}
	@Override
	public List<UserDetails> getUserByCity(String city) {
		// TODO Auto-generated method stub
		return ums.findByCity(city);
	}


}
