package com.example.BenchTrainingProject.controller;

import com.example.BenchTrainingProject.entity.Brand;
import com.example.BenchTrainingProject.exception.ResourceNotFoundException;
import com.example.BenchTrainingProject.service.BrandService;
import com.example.BenchTrainingProject.service.serviceImpl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/brands")
@RestController
public class BrandController {

    @Autowired
    BrandServiceImpl brandService;

    @PostMapping("/addBrand")
    public void addBrand(@RequestBody Brand brand) {
        brandService.addBrand(brand);
    }

    @GetMapping("/brand/{id}")
    public Optional<Brand> getBrandById(@PathVariable Integer id){
        return brandService.getBrandById(id);
    }

    @DeleteMapping("/deleteBrand/{id}")
    public void deleteBrandById(@PathVariable Integer id) throws ResourceNotFoundException {
        brandService.deleteBrandById(id);
    }
}
