package com.kundan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kundan.model.Student;
import com.kundan.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	//	System.out.println(studentRepository.getClass().getName());
	//	System.exit(0);
		studentRepository.save(new Student(10,"Kundan Kumar",500.50));
		studentRepository.save(new Student(11,"Rahul Kumar",450.45));
		studentRepository.save(new Student(12,"Deepak Kumar", 534.45));
		
		studentRepository.saveAll(Arrays.asList(
				new Student(13,"Shubham Singh",2000.00),
				new Student(14,"Shubham Singh",2000.89),
				new Student(15,"Shubham Singh",2000.56)
				));
	}
	

}
