package com.cbss.microservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {
	
	@RequestMapping("/hello")
	public String list(){
		return "list";
	}
}
