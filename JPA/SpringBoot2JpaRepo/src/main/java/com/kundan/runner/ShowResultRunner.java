package com.kundan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.kundan.model.Product;
import com.kundan.repository.ProductRepository;

@Component
public class ShowResultRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
	//	productRepository.findAll().forEach(System.out::println);
		
	//	Product product=new Product();
	//	product.setProdCode("REN");
	//	product.setProdCost(900.0);
	//	Example<Product> example = Example.of(product);
	//	System.out.println("----Using Example---------");
	//	productRepository.findAll(example).forEach(System.out::println);
		
	//	productRepository.deleteAllInBatch();
		
	//	System.out.println("-----Using FindByProductCode------");
	//	productRepository.findByProdCode("REN").forEach(System.out::println);
		
	//	System.out.println("-----Using FindByProductVendor------");
	//	productRepository.findByProdVender("DEN").forEach(System.out::println);
		
	//	System.out.println("-----Using FindByProductCost------");
	//	productRepository.findByProdCost(900.0).forEach(System.out::println);
		
	//	System.out.println("------Using condition.........");
	//	productRepository.findByProdCostGreaterThan(500.0).forEach(System.out::println);
		
	//	System.out.println("-----Using less than Condition-------");
	//	productRepository.findByProdCostLessThan(1000.0).forEach(System.out::println);

	//	System.out.println("-----Using Product Description null-------");
	//	productRepository.findByProdDescIsNull().forEach(System.out::println);
	
		System.out.println("-----Using Like %-------");
		productRepository.findByProdCodeLike("R%").forEach(System.out::println);
		
		System.out.println("-----Using Like %--%....");
		productRepository.findByProdCodeLike("%E%").forEach(System.out::println);
	
		System.out.println("-----Using %<input>%-------");
		productRepository.findByProdCodeContaining("S").forEach(System.out::println);
	
		System.out.println("--------Using Asscendin Order--------------");
		productRepository.findByProdIdGreaterThanOrderByProdCode(104).forEach(System.out::println);
	
		System.out.println("--------Using Desending Order--------------");
		productRepository.findByProdIdGreaterThanOrderByProdCodeDesc(104).forEach(System.out::println);
	
		System.out.println("--------ProductId Not------ ");
		productRepository.findByProdIdNot(110).forEach(System.out::println);
		
		System.out.println("-------Producr Id Between----------");
		productRepository.findByProdIdBetween(105, 110).forEach(System.out::println);;
	}

}
