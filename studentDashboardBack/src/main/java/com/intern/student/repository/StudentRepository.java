package com.intern.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intern.student.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}