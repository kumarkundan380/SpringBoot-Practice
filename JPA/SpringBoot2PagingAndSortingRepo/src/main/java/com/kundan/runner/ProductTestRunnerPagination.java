package com.kundan.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.kundan.model.Product;
import com.kundan.repository.ProductRepository;

@Component
public class ProductTestRunnerPagination implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pageable pageable = PageRequest.of(2, 5);
		Page<Product> page = productRepository.findAll(pageable);
		List<Product> list = page.getContent();
		//list.forEach(System.out::println);
		list.stream().sorted((p1,p2)->p1.getProdCode().compareTo(p2.getProdCode()))
		.forEach(System.out::println);
		
		System.out.println("IS First Page:"+page.isFirst());
		System.out.println("IS Last Page:"+page.isLast());

		System.out.println("HAS NEXT Page:"+page.hasNext());
		System.out.println("HAS PREV Page:"+page.hasPrevious());

		System.out.println("TOTAL PAGES:"+page.getTotalPages());
		System.out.println("TOTAL ROWS:"+page.getTotalElements());

		System.out.println("PAGE SIZE:"+page.getSize());
		System.out.println("CURRENT PAGE NUMBER:"+page.getNumber());

		System.out.println("IS DATA EXIST IN PAGE?"+page.hasContent());


	}

}


