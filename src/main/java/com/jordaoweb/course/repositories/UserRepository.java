package com.jordaoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordaoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
