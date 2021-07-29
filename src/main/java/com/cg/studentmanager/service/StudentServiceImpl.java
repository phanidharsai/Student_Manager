package com.cg.studentmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.studentmanager.dao.StudentDao;
import com.cg.studentmanager.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	public StudentDao studentDao;

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		studentDao.save(s);
		return s;
	}

	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		studentDao.save(s);
		return s;
	}


	public Student getStudent(long id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id).get();
	}


	public String deleteStudent(long id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(id);
		return "Deleted Successfully";
	}


}
