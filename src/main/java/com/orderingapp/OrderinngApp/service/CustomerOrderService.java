package com.orderingapp.OrderinngApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.orderingapp.OrderinngApp.model.CustomerOrder;
import com.orderingapp.OrderinngApp.model.OrderStatus;
import com.orderingapp.OrderinngApp.model.OrderStatusType;
import com.orderingapp.OrderinngApp.repo.CustomerOrderRepo;

@Service
public class CustomerOrderService {
	private final CustomerOrderRepo customerOrderRepo;
	
	public CustomerOrderService(CustomerOrderRepo customerOrderRepo) {
		super();
		this.customerOrderRepo = customerOrderRepo;
	}
	
	public CustomerOrder createOrder(CustomerOrder customerOrder) {
		customerOrderRepo.save(customerOrder);
		customerOrder.setOrderNumber("ORD"+customerOrder.getId());
		customerOrder.setOrderStatus(new OrderStatus(OrderStatusType.PLACED));
		return customerOrderRepo.save(customerOrder);
	}
	
	public List<CustomerOrder> listAllOrders(){
		return customerOrderRepo.findAll();
	}
	
	
	public CustomerOrder updateOrder(CustomerOrder customerOrder) {
		return customerOrderRepo.save(customerOrder);
	}
	
}
