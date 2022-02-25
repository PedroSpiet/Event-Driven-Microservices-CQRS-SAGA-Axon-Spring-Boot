package com.spiet.products.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductsController {

    @GetMapping
    private ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello CQRS");
    }
}
