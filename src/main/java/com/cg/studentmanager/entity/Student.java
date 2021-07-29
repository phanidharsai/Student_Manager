package com.cg.studentmanager.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private long studentId;
	private String studentName;
	private int age;
	private String primarySubject;
	private Date dbupdatedate;
	
	public Student() {
		super();
	}



	public Date getDbupdatedate() {
		return dbupdatedate;
	}



	public void setDbupdatedate(Date dbupdatedate) {
		this.dbupdatedate = dbupdatedate;
	}



	public Student(long studentId, String studentName, int age, String primarySubject, Date dbupdatedate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.primarySubject = primarySubject;
		this.dbupdatedate = dbupdatedate;
	}



	public long getStudentId() {
		return studentId;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPrimarySubject() {
		return primarySubject;
	}


	public void setPrimarySubject(String primarySubject) {
		this.primarySubject = primarySubject;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", primarySubject="
				+ primarySubject + ", dbupdatedate=" + dbupdatedate + "]";
	}	
	

	
}

