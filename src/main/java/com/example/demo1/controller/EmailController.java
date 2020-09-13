package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.service.EmailService;

@RestController
@RequestMapping("/controller")
public class EmailController {
@Autowired
	EmailService emailService;
	
	@RequestMapping("/email")
	public void sendEmail() {
		emailService.sendEmail();
		
	}
}
