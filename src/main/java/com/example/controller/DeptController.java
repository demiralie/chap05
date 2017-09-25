package com.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.DeptVO;
import com.example.repository.DeptRepository;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/dept")
@Log
public class DeptController {
	
	@Inject
	DeptRepository deptRepository;
	
	@GetMapping("/list")
	@Transactional
	public String list(Model model) {
		log.info("/dept/list 호출됨");
		
		List<DeptVO> depts = deptRepository.findAll();
		depts.forEach(e ->{
			System.out.println(e);
		});
		model.addAttribute("depts",depts);
		
		return "jsp/dept/list";
	}
	
	@GetMapping("/listemp")
	@Transactional
	public String listWithEmp(Model model) {
		log.info("/dept/listemp 호출됨");
		
		List<DeptVO> depts = deptRepository.findAll();
		depts.forEach(e ->{
			System.out.println(e);
		});
		model.addAttribute("depts",depts);
		
		return "jsp/dept/listemp";
	}
	
	
	@GetMapping("/list2")
	@Transactional
	public String list2(Model model) {
		log.info("/dept/list2 호출됨");
		
		List<DeptVO> depts = deptRepository.findAll();
		depts.forEach(e ->{
			System.out.println(e);
		});
		model.addAttribute("depts",depts);
		
		return "thymeleaf/dept/list";
	}
	
	@GetMapping("/list2emp")
	@Transactional
	public String list2WithEmp(Model model) {
		log.info("/dept/list2emp 호출됨");
		
		List<DeptVO> depts = deptRepository.findAll();
		depts.forEach(e ->{
			System.out.println(e);
		});
		model.addAttribute("depts",depts);
		
		return "thymeleaf/dept/listemp";
	}
}
