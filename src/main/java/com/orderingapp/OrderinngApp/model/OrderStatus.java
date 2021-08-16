package com.orderingapp.OrderinngApp.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

@Entity
public class OrderStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "status_generator")
	private int id;
	
	@Enumerated(EnumType.STRING)
	private OrderStatusType name;
	
	
	public OrderStatus() {}

	public OrderStatus(int id, OrderStatusType name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderStatusType getName() {
		return name;
	}

	public void setName(OrderStatusType name) {
		this.name = name;
	}
		
}
