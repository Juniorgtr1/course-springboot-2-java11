package com.juniorsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsousa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
