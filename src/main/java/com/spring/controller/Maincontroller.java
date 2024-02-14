package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     // this inherit from @component so it cosider bean and it also show that it's a controller 
public class Maincontroller {
	@RequestMapping("/")
	public String main() {
		return "main-page";
	}
	

    @RequestMapping("/profile")
	public String mypro() {
		return "myprofile";
	}
}
