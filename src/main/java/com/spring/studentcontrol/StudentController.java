package com.spring.studentcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@RequestMapping("/account")
	public String studentForm() {
		
		return "student-front/studentaccount";
		
	}

	@RequestMapping("studentprocess")          //action of form
	public String getDataStudent(@RequestParam("fname")String fname ,@RequestParam("fname")String lname ,@RequestParam("fname")String age , Model model) {
		
		Student student=new Student();
		student.setFname(fname);            //get attributes and set to object
		student.setLname(lname);
		student.setAge(age);
		model.addAttribute("myStudent",student);
		
		return "student-front/showdatastudent";
		
	}
}
