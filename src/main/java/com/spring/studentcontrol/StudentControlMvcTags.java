package com.spring.studentcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Student;


@Controller
@RequestMapping("/student-mvc-tags")               //default( at begining of link )
public class StudentControlMvcTags {
	
	@RequestMapping("/student-mvc-tags")
	public String StudentFormMvcTgs(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return "student-front-mvc-tags/studentaccount";
		
	}
	
	@RequestMapping("/processmvctags")
    public String ShowInfo(@javax.validation.Valid@ModelAttribute("student")Student student , BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return  "student-front-mvc-tags/studentaccount";
		}else {
			return   "student-front-mvc-tags/showdatastudent";
		}
			
			
	}

}
