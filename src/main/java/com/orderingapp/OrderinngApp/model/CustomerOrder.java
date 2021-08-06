package com.orderingapp.OrderinngApp.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class CustomerOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
	private int id;
	
	@Column
	private String orderNumber;
	
	@Column
	private Date orderDate;
	
	@Column
	private Double orderCost;
	
	@Column
	private String customerName;
	
	@Column
	private String customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private OrderStatus orderStatus;

	public CustomerOrder() {}
	
	public CustomerOrder(int id, String orderNumber, Date orderDate, Double orderCost, String customerName,
			String customerAddress, OrderStatus orderStatus) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderCost = orderCost;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}
		
	public void setId(int id) {
		this.id = id;
	}	

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(Double orderCost) {
		this.orderCost = orderCost;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
} 
