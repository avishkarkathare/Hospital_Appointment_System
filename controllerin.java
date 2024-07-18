package com.Hospital_Appointment_System.controller;

 
 
import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

 import com.Hospital_Appointment_System.model.usersign;
import com.Hospital_Appointment_System.repo.userrpo;
   
   
@Controller
public class controllerin {
	
	@Autowired
	userrpo up;
	
 		@RequestMapping("/")
		public String home()
		{
			return "index";
		}
		@RequestMapping("index1")
		public String home1()
		{
			return  "index";
		}
		@RequestMapping("/doctor2")
		public String doctorlog()
		{
			return "doctor_login";
		}
		@RequestMapping("/admin1")
		public String adminlog()
		{
			return "admin_login";
		}
		@RequestMapping("/home1")
		public String adminlog1()
		{
			return "adminlogin";
		}
		@RequestMapping("/user1")
		public String userlog()
		{
			return "user_login";
		}
		@RequestMapping("/sign1")
		public String usersign()
		{
			return "signup";
		}
		@RequestMapping("/sign")
		public String usersign1(@ModelAttribute usersign u)
		{
			up.save(u);
			return "user_login";
		}
		
		@RequestMapping("/user")
		 public String loginc(@RequestParam("email") String email, @RequestParam("password") String password,Model model) {
	        List<usersign> users = up.findByEmail(email);
	        if (users.size() == 1 && users.get(0).getPassword().equals(password)) {
	        	 model.addAttribute("username", users.get(0).getName());
 
 	             return "userlog";
 	        } else if (users.isEmpty()) {
	            // Handle the case where no user is found
	            return "user_login"; // Could add a message indicating user not found
	        } else {
	            // Handle the case where multiple users are found
	            return "user_login"; // Could add a message indicating multiple users found
	        }
			
	       
		}
		
		@RequestMapping("/home_user")
		public String appointment() {
			return "userlog";
		}
		
		@RequestMapping("/appointment_user")
		public String appointment1() {
			return "user_appointment";
		} 
		
		 @RequestMapping("/admin")
			 public String adminlog(@RequestParam("email") String email, @RequestParam("password") String password) {
			 
	        	if("admin@gmail.com".equals(email) && "admin123".equals(password))
	        	{
	        		return "adminlogin";
	        	}
	        	else
	        	{
	        		return "admin_login";
	        	}
	        }
		
		 @RequestMapping("/adminlogot")
		 public String adminlogout()
		 {
			
			return "admin_login"; 
		 }
		 
		 @RequestMapping("/userlogout")
		 public String userlogout()
		 {
			 return "user_login";
		 }
		 @RequestMapping("/doctor1")
		 public String admindoctor()
		 {
			 return "admin_doctor";
		 }
		 @RequestMapping("/adminlog")
		 public String logo()
		 {
			 return "adminlogin";
		 }
		 
		 
		 
	 
 }

