package com.orderingapp.OrderinngApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderingapp.OrderinngApp.model.CustomerOrder;
import com.orderingapp.OrderinngApp.model.User;

public interface CustomerOrderRepo extends JpaRepository<CustomerOrder, Integer>{
	Optional<List<CustomerOrder>> findByorderedByUser(String orderedByUser);
}
