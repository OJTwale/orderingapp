package com.orderingapp.OrderinngApp.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderingapp.OrderinngApp.model.Product;
import com.orderingapp.OrderinngApp.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductResource {
	
	private final ProductService productService;
	
	public ProductResource(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> listAllProducts(){
		List<Product> product = productService.listAllProducts();
		return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product products = productService.createProduct(product);
		return new ResponseEntity<>(products, HttpStatus.CREATED);
		
	}
	
	
	
}
