package com.svj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//This is controller class
@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/get")
	public String getData(){
		return "For Git Pract";
	}
}
