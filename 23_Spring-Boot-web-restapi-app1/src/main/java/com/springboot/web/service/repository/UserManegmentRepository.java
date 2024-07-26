package com.springboot.web.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.web.controller.dto.UserDetailsRequestDto;
import com.springboot.web.service.entity.UserDetails;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface UserManegmentRepository extends JpaRepository<UserDetails, Integer> {

	UserDetails save(UserDetails userdata);

	UserDetails findByEmail(String emailId);
	
	List<UserDetails> findByCityAndGeneder(String city ,String gender);

	String deleteByCity(String city);

	List<UserDetails> findByCity(String city);
	
	
 
}
