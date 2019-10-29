package com.thc.productviewservicefeign.client;

import com.thc.productviewservicefeign.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(value = "product-data-service")
//public interface ProductClientFeign {
//
//    @GetMapping("/products")
//    List<Product> productList();
//}
@FeignClient(value = "product-data-service")
public interface ProductClientFeign {

    @GetMapping("/products")
    public List<Product> listProdcuts();
}
