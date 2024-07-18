package com.Hospital_Appointment_System.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital_Appointment_System.model.user_appointment;
@Repository
public interface appointment_Repo extends JpaRepository<user_appointment, Integer> {
	List<user_appointment> findByid(int userid);
  }
