package com.orderingapp.OrderinngApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.orderingapp.OrderinngApp.model.Product;
import com.orderingapp.OrderinngApp.repo.ProductRepo;
@Service
public class ProductService {
	private final ProductRepo productRepo;
	
	public ProductService(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}
	
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> listAllProducts(){
		return productRepo.findAll();
	}
}
