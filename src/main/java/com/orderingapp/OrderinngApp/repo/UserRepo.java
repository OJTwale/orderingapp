package com.orderingapp.OrderinngApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderingapp.OrderinngApp.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	Optional<User> findByUserName(String userName);

}
