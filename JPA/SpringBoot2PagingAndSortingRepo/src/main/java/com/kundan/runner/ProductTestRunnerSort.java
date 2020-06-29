package com.kundan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import com.kundan.repository.ProductRepository;

//@Component
public class ProductTestRunnerSort implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("***********Sorting in Assending order****************");
		Sort sort = Sort.by("prodCost");
		productRepository.findAll(sort).forEach(System.out::println);
		
		System.out.println("***********Sorting in Descending order****************");
		Sort desSort = Sort.by(Direction.DESC,"prodCode");
		productRepository.findAll(desSort).forEach(System.out::println);

	}

}
