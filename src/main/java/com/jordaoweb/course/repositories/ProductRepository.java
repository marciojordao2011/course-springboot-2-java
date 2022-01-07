package com.jordaoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jordaoweb.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
