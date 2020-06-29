package com.kundan.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kundan.model.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
