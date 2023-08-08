package com.springboot.crudoperation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")

public class product {

@Id
@GeneratedValue

     private int id;
     private String name;
     private String quantity;
     private String price;
    
}
