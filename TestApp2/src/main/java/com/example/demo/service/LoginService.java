package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoginService {
	@Autowired
	LoginService serivice;
	@RequestMapping("/home")
	public String greeting() {
		return null;
		
	}

}
