package com.orderingapp.OrderinngApp.service;

import com.orderingapp.OrderinngApp.model.OrderStatus;
import com.orderingapp.OrderinngApp.repo.OrderStatusRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusService {
    @Autowired
    private final OrderStatusRepo orderStatusRepo;

    public OrderStatusService(OrderStatusRepo orderStatusRepo) {
        this.orderStatusRepo = orderStatusRepo;
    }

    public OrderStatus create(OrderStatus orderStatus){
        return orderStatusRepo.save(orderStatus);
    }

    public OrderStatus get(Integer id){
        return orderStatusRepo.findById(id).orElse(null);
    }

	public List<OrderStatus> getAll() {
		return orderStatusRepo.findAll();
	}
}
