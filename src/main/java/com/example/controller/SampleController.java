package com.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.DeptVO;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
	
	@Inject
	DeptVO vo;
	
	@GetMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		log.info("/thymeleaf 호출됨");
		log.info(vo.toString());
		
		model.addAttribute("deptVO", vo);
		
		return "thymeleaf/hello";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		log.info("/jsp 호출됨");
		log.info(vo.toString());
		
		model.addAttribute("deptVO", vo);
		
		return "jsp/hello";
	}
}
