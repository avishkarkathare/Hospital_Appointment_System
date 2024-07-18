package com.Hospital_Appointment_System.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hospital_Appointment_System.model.doctor_data;

public interface doctrpo extends JpaRepository<doctor_data, Integer>{
	
	List<doctor_data> findByEmail(String email); 
 }
