package com.barclays.springsecurityapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	
	
	@GetMapping("/") 
	public String checkAnyone() {
		return "Hello Guys";
	}
	 
	@GetMapping("user")
	public String checkUser() {
		return "Hello User";
	}
	@GetMapping("admin")
	public String checkAdmin() {
		return "Hello Admin";
	}
}
