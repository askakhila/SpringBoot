package com.hbsols.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hbsols.binding.Student;
import com.hbsols.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public String loadStudentForm(Model model) {
		
		model.addAttribute("genders",studentService.getGenders());
		model.addAttribute("courses",studentService.getCourses());
		model.addAttribute("timings",studentService.getTimings());
		
		model.addAttribute("student", new Student());
		
		return "studentReg";
	}
	
	@PostMapping("/save")
	public String sendStudentDataToDB(Student student, Model model) {

		System.out.println(student);

		model.addAttribute("msg", studentService.saveStudentInfo(student));
		
	//	model.addAttribute("msg", "Student Details inserted into DB successfully");

		return "response";
	}
}
