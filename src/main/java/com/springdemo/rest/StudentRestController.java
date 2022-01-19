package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	// define end-point for "/students" - return list of students
	
		@GetMapping("/students")
		public List<Student> getStudents() {

			List<Student> theStudents = new ArrayList<>();
			
			theStudents.add(new Student("Poornima", "Patel"));
			theStudents.add(new Student("Mario", "Rossi"));
			theStudents.add(new Student("Mary", "Smith"));
				
			return theStudents;
		}
		
		@GetMapping("/teachers")
		public List<Teachers> getTeachers(){
			
			List<Teachers> teachers = new ArrayList<>();
			teachers.add(new Teachers("Bob","Mike"));
			teachers.add(new Teachers("Rob","Dunkan"));
			teachers.add(new Teachers("Kyle","Zeke"));
			
			return teachers;
		}
		
}
