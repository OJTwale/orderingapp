package com.orderingapp.OrderinngApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderingapp.OrderinngApp.model.OrderStatus;

public interface OrderStatusRepo extends JpaRepository<OrderStatus, Integer>{

}
