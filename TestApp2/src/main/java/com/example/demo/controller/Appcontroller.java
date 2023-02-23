package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Appcontroller {
@RequestMapping("/")
public String handler() {
	return "Soorya";
}
@RequestMapping("/login")
public String handler1() {
	return "login";
}
}
