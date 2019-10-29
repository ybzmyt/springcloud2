package com.thc.productviewservicefeign.service;

import com.thc.productviewservicefeign.client.ProductClientFeign;
import com.thc.productviewservicefeign.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();
    }
}
