package com.cg.studentmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cg.studentmanager.entity.Student;
import com.cg.studentmanager.service.StudentService;

@RestController
public class Controller {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity getStudents(@RequestHeader(value="Authorization") String authorization){
		
		if(validate(authorization)==false) {
	 		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Unauthorized Access ");
	 		}
	 		else { 	
	 			return ResponseEntity.status(HttpStatus.OK).body(this.studentService.getStudents());
	 		}
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity getStudent(@PathVariable String id, @RequestHeader(value="Authorization") String authorization) {
		if(validate(authorization)==false) {
	 		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Unauthorized Access ");
	 		}
	 		else { 	
		return ResponseEntity.status(HttpStatus.OK).body(this.studentService.getStudent(Long.parseLong(id)));
	 		}
	}
	
	@PostMapping("/student")
	public ResponseEntity addStudent(@RequestBody Student s, @RequestHeader(value="Authorization") String authorization) {
		if(validate(authorization)==false) {
	 		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Unauthorized Access ");
	 		}
	 		else { 	
		return  ResponseEntity.status(HttpStatus.OK).body(this.studentService.addStudent(s));
	 		}
	}
	
	@PutMapping("/student")
	public ResponseEntity updateStudent(@RequestBody Student s, @RequestHeader(value="Authorization") String authorization) {
		if(validate(authorization)==false) {
	 		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Unauthorized Access ");
	 		}
	 		else { 	
		return ResponseEntity.status(HttpStatus.OK).body(this.studentService.updateStudent(s));
	 		}
	}
	@DeleteMapping("/student/{id}")
	public ResponseEntity deleteStudent(@PathVariable long id, @RequestHeader(value="Authorization") String authorization) {
		if(validate(authorization)==false) {
	 		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Unauthorized Access ");
	 		}
	 		else {
		return ResponseEntity.status(HttpStatus.OK).body(this.studentService.deleteStudent(id));
	}
	}
	
	private boolean validate(String authorization) {
 		
 		String[] authorize = authorization.split(" ");
 		if(authorize[1].equals("myauthcode")) {
 			return true;
 		}
 		return false; 		
 	}
	
}
