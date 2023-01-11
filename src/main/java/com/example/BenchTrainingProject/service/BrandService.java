package com.example.BenchTrainingProject.service;

import com.example.BenchTrainingProject.entity.Brand;
import com.example.BenchTrainingProject.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public interface BrandService {
    public void addBrand(Brand brand);
    public Optional<Brand> getBrandById(Integer id);

    public ResponseEntity<Map<String, Boolean>> deleteBrandById(Integer id) throws ResourceNotFoundException;
}
