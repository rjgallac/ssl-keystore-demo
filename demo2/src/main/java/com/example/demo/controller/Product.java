package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("product")
public class Product {


    RestTemplate restTemplate = new RestTemplate();
    @GetMapping
    public String get(){

                restTemplate.getForEntity("https://springboot:8443/product", String.class);
        return "hi";
    }
}
