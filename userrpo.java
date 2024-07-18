package com.Hospital_Appointment_System.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital_Appointment_System.model.usersign;

@Repository
public interface userrpo extends JpaRepository<usersign, Integer>{
	
	List<usersign> findByEmail(String email);
	List<usersign> findByPassword(String password);
	
}
