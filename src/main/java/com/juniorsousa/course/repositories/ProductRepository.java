package com.juniorsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsousa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
