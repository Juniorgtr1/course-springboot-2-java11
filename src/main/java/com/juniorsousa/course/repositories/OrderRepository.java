package com.juniorsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsousa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
