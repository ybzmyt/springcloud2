package com.thc.productviewservicefeign.controller;

import com.thc.productviewservicefeign.entity.Product;
import com.thc.productviewservicefeign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired ProductService productService;

    @RequestMapping("/list")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
