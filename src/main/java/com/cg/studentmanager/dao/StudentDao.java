package com.cg.studentmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.studentmanager.entity.Student;

@Repository
public interface StudentDao extends JpaRepository <Student, Long>{

}
