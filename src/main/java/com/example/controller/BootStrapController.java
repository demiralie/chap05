package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/bootstrap")
@Log
public class BootStrapController {

	@GetMapping("/merge")
	public String headerMerge() {
		
		log.info("/bootstrap/merge/htmlMerge()...");
		
		return "jsp/bootstrap/merge";
	}
	@GetMapping("/gridsample")
	public String gridsample() {
		
		log.info("/bootstrap/gridsample gridSample()...");
		
		return "jsp/bootstrap/gridsample";
	}
	
	@GetMapping("/gridsample2")
	public String gridsample2() {
		
		log.info("/bootstrap/gridsample gridSample2()...");
		
		return "thymeleaf/bootstrap/gridsample";
	}
}
