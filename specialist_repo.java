package com.Hospital_Appointment_System.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hospital_Appointment_System.model.specialist;

public interface specialist_repo extends JpaRepository<specialist, Integer> {
	
	List<specialist> findBySpecialistname(String specialistname);

}
