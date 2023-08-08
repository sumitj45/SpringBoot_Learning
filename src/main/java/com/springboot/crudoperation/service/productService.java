
package com.springboot.crudoperation.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crudoperation.entity.product;

import com.springboot.crudoperation.repository.productRepository;

@Service
public class productService {

    @Autowired
    private productRepository repository;

    //POST METHOD
public product saveProduct(product Product){
     return repository.save(Product);
    
}
public List<product> saveProducts(List<product> Products){
     return repository.saveAll(Products);
    
}

//GET METHOD
public List<product> getProducts(){
    return repository.findAll();
}
public product getProductById(int id){
    return repository.findById(id).orElse(null);
}

// DELETE METHOD

public String deleteProduct(int id){
repository.deleteById(id);
return "Product deleted/dropped Successfully"+id;

}

//Put Method

public product updateProduct(product Product){
    product existingProduct=repository.findById(Product.getId()).orElse(null);
    existingProduct.setName(Product.getName());
    existingProduct.setQuantity(Product.getQuantity());
    existingProduct.setPrice(Product.getPrice());
    return repository.save(existingProduct);
}






}
