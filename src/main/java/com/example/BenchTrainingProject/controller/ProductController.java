package com.example.BenchTrainingProject.controller;

import com.example.BenchTrainingProject.entity.Product;
import com.example.BenchTrainingProject.exception.ResourceNotFoundException;
import com.example.BenchTrainingProject.service.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProductById(@PathVariable Integer id) throws ResourceNotFoundException {
        productService.deleteProductById(id);
    }
}
