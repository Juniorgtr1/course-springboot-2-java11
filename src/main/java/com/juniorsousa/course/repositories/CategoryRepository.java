package com.juniorsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsousa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
