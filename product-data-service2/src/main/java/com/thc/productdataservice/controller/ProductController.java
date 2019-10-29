package com.thc.productdataservice.controller;
 
import java.util.List;

import com.thc.productdataservice.entity.Product;
import com.thc.productdataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class ProductController {
  
    @Autowired
    ProductService productService;
     
    @RequestMapping("/products")
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}