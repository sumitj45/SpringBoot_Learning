package com.springboot.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crudoperation.entity.product;

public interface productRepository  extends JpaRepository<product,Integer> {
    
}
