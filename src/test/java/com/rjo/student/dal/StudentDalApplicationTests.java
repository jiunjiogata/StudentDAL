package com.rjo.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rjo.student.dal.entities.Student;
import com.rjo.student.dal.repository.StudentRepository;

@SpringBootTest
class StudentDalApplicationTests {
	
	@Autowired
	private StudentRepository repo;

	@Test
	void createStudentRepository() {
		Student student = new Student();
		student.setName("Reinaldo");
		student.setCourse("SERVELESS USING AWS LAMBDA");
		student.setFee(30d);		
		repo.save(student);
	}
	
	@Test
	void findStudentById() {
		Student student = repo.findById(1l).get();
		System.out.println("Procurando student com id = 1...");
		repo.findById(student.getId());
		System.out.println(student.toString());
	}
	
	@Test
	void updateStudentFee() {
		Student student = repo.findById(1l).get();
		student.setFee(40d);
		System.out.println(student.toString());
	}
	
	@Test
	void deleteStudentById() {
		
	}

}
