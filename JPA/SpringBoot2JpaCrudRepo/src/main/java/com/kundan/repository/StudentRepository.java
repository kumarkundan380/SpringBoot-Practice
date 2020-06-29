package com.kundan.repository;

import org.springframework.data.repository.CrudRepository;

import com.kundan.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
