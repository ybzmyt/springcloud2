package com.thc.productviewserviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    RestTemplate restTemplate;

    public List prductList() {
        return restTemplate.getForObject("http://product-data-service/products", List.class);
    }
}
