package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;
import com.springdemo.entity.Teachers;

@RestController
@RequestMapping("/api")
public class TeacherRestController {
	
	private List<Student> theStudents;
	
	@GetMapping("/teachers")
	public List<Teachers> getTeachers() {

		List<Teachers> teachers = new ArrayList<>();
		teachers.add(new Teachers("Bob", "Mike"));
		teachers.add(new Teachers("Rob", "Dunkan"));
		teachers.add(new Teachers("Kyle", "Zeke"));

		return teachers;
	}

	
	// Path Variables:  returning only unique students by passing path variable
	@GetMapping("/students/{studentId}")
	public Student getStudents(@PathVariable int studentId) {
		return theStudents.get(studentId);
	}
}
