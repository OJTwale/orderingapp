package com.orderingapp.OrderinngApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderingapp.OrderinngApp.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByUserName(String userName);

}
