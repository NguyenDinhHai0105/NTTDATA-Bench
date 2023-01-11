package com.example.BenchTrainingProject.service;

import com.example.BenchTrainingProject.entity.Product;
import com.example.BenchTrainingProject.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public interface ProductService {
    public void addProduct(Product product);
    public ResponseEntity<Map<String, Boolean>> deleteProductById(Integer id) throws ResourceNotFoundException;
    public Optional<Product> findProductById(Integer id);
}
