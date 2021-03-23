package com.rjo.student.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.rjo.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
