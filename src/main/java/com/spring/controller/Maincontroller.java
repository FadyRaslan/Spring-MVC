package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     // this inherit from @component so it consider bean and it also show that it's a controller 
public class Maincontroller {
	@RequestMapping("/")
	public String main() {
		return "main-page";
	}
	

    @RequestMapping("/profile")
	public String mypro() {
		return "myprofile";
	}
    
    @RequestMapping("/signin")
    public String mylogin() {
		return "login";
	}
    
    @RequestMapping("/loginprocess")
    public String formprocess(HttpServletRequest request , Model model) {
    	//get data from my form and store them
    	String userName=request.getParameter("user");
    	String password=request.getParameter("pass");
    	////////////////////doing process in data ///////////////////////
    	String newUserName = "(username = " + userName.toUpperCase() + ")";
    	String newPassword="(password = " + password + ")";
    	/////////////// Adding new values /////////////
    	model.addAttribute("myUserName",newUserName);
    	model.addAttribute("myPassword",newPassword);
    	
		return "main";
	}
}
