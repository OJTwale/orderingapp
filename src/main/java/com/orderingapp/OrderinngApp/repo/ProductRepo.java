package com.orderingapp.OrderinngApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderingapp.OrderinngApp.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
