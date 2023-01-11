package com.example.BenchTrainingProject.service.serviceImpl;

import com.example.BenchTrainingProject.entity.Brand;
import com.example.BenchTrainingProject.entity.Product;
import com.example.BenchTrainingProject.exception.ResourceNotFoundException;
import com.example.BenchTrainingProject.repository.BrandRepository;
import com.example.BenchTrainingProject.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public Optional<Brand> getBrandById(Integer id) {
        return brandRepository.findById(id);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteBrandById(Integer id) throws ResourceNotFoundException {
        Brand brand = brandRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id + " not found"));
        brandRepository.delete(brand);
        Map<String, Boolean> reponse = new HashMap<>();
        reponse.put("detele", Boolean.TRUE);
        return ResponseEntity.ok(reponse);
    }
}
