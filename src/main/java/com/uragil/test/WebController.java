package com.uragil.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	
	@RequestMapping(value="/")
	public String home() {
		
		return "index";
			
		}
	
	@RequestMapping(value="/index")
	public String index() {
		
		return "index";
	}
	
	
	@RequestMapping(value="/profile")
	public String profile() {
		
		return "profile";
	}
	
	@RequestMapping(value="/contact")
	public String contact() {
		
		return "contact";
	}
}
