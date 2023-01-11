package com.example.BenchTrainingProject.repository;

import com.example.BenchTrainingProject.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
