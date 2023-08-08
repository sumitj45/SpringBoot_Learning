package com.springboot.crudoperation.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crudoperation.service.productService;
import com.springboot.crudoperation.entity.product;

@RestController
public class productController {
    
@Autowired
    private productService service;

    @PostMapping("/addproduct")
    public product addProduct( @RequestBody product Product){
        return service.saveProduct(Product);
    }

    @PostMapping("/addproducts")
    public List<product> addProducts( @RequestBody List<product> Products){
        return service.saveProducts(Products);
    }


    @GetMapping("/products")
    public List<product> findAllProducts(){
        return service.getProducts();
    }

    @PostMapping("/product/{id}")
    public product finProductById( @PathVariable int id){
        return service.getProductById(id);
    }
    

    
    @PutMapping("/update")
    public product updateProduct( @RequestBody product Product){
        return service.updateProduct(Product);
    }

    @DeleteMapping("/delete/{id}")  
    public String deleteProduct( @PathVariable int id){
        return service.deleteProduct(id);
    }

}
