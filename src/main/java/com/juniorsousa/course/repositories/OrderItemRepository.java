package com.juniorsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsousa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
