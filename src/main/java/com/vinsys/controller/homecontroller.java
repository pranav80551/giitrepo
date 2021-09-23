package com.vinsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vinsys.service.Istudentservice;

@Controller
public class homecontroller {
	
	@Autowired
	private Istudentservice studentservice;
	
	@GetMapping("/")
	public String home(Model model) {
		return "newcrud";
		
	}

}
