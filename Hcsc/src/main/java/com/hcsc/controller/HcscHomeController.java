package com.hcsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HcscHomeController {
	
	@GetMapping("/hcsc/home")
	public String hcscHomePage() {
		
	return "hcsc-home";		
	}
	@GetMapping("/hcsc/login")
	public String loginPage() {
		return "login";
	}
	

}
