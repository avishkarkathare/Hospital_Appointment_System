package com.Hospital_Appointment_System.controller;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Hospital_Appointment_System.model.doctor_data;
import com.Hospital_Appointment_System.model.user_appointment;
import com.Hospital_Appointment_System.repo.appointment_Repo;

@Controller
public class appointment_con {

	@Autowired
	appointment_Repo ar;
	
	 @RequestMapping("/appoin")
	public String addappo(@ModelAttribute user_appointment u) {
		ar.save(u);
		return "user_appointment";
	} 
	 
	 
	 @RequestMapping("/view_app")

	 public String datafect(Model data)
		{
			List<user_appointment> al=ar.findAll();
			
			data.addAttribute("apoin",al);
			
			return "view_appointment";
		}
	 @RequestMapping("/paient")

	 public String datafects(Model data)
		{
			List<user_appointment> al=ar.findAll();
			
			data.addAttribute("doct",al);
			
			return "doctor_paitent";
		}
	 @RequestMapping("/appoi_con")

	 public String datafects1(Model data)
		{
			List<user_appointment> al=ar.findAll();
 			data.addAttribute("doct",al);
			
			return "doctor_paintent_confirm";
		}
	 
 
	 
	 
}
