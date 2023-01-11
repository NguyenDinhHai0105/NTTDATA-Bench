package com.example.BenchTrainingProject.service.serviceImpl;

import com.example.BenchTrainingProject.entity.Product;
import com.example.BenchTrainingProject.exception.ResourceNotFoundException;
import com.example.BenchTrainingProject.repository.ProductRepository;
import com.example.BenchTrainingProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteProductById(Integer id) throws ResourceNotFoundException {
        Product product = productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id + " not found"));
        productRepository.delete(product);
        Map<String, Boolean> reponse = new HashMap<>();
        reponse.put("detele", Boolean.TRUE);
        return ResponseEntity.ok(reponse);
    }

    @Override
    public Optional<Product> findProductById(Integer id) {
        return productRepository.findById(id);
    }
}
