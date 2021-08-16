package com.orderingapp.OrderinngApp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column
	private String productName;
	
	@Column
	private String productDesc;
	
	@Column
	private Double productCost;
	
	@ManyToMany(mappedBy = "orderedProducts")
	private Set<CustomerOrder> customerOrder;

	public Product() {
		
	}

	public Product(int id, String productName, String productDesc, Double productCost) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productCost = productCost;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
}
