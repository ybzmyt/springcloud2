package com.thc.productviewserviceribbon.controller;

import com.thc.productviewserviceribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/list")
    public String prductList(Model m){
        List list = productService.prductList();
        m.addAttribute("ps",list);
        return "products";
    }
}
