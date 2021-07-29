package com.cg.studentmanager.service;

import java.util.List;

import com.cg.studentmanager.entity.Student;

public interface StudentService {

	public List<Student> getStudents();
	public Student addStudent(Student s);
	public Student updateStudent(Student s);
	// public Student getStudent(long id);
	public Student getStudent(long parseLong);
	//public String deleteStudent(long id);
	public String deleteStudent(long id);

}
