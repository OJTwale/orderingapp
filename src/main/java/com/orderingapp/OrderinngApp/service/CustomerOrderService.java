package com.orderingapp.OrderinngApp.service;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;


import com.orderingapp.OrderinngApp.model.CustomerOrder;
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
		customerOrder.setOrderStatus(1);
		return customerOrderRepo.save(customerOrder);
	}
	
	public List<CustomerOrder> listAllOrders(){
		return customerOrderRepo.findAll();
	}
	
	
	public CustomerOrder updateOrder(CustomerOrder customerOrder) {
		return customerOrderRepo.save(customerOrder);
	}
	 
	public CustomerOrder updateStatus(@NotNull CustomerOrder customerOrder, Integer status) {
        customerOrder.setOrderStatus(status);
        return updateOrder(customerOrder);
    }
	
	public CustomerOrder findById(Integer id){
		return customerOrderRepo.findById(id).orElse(null);
	}
	
	public void deleteOrder(int id) {
		customerOrderRepo.deleteById(id);
	}
	
	public List<CustomerOrder> findByOrderedUser(String orderedBy){
		return customerOrderRepo.findByorderedByUser(orderedBy).orElse(null);
	}
	
}
