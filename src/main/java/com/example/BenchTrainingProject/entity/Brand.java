package com.example.BenchTrainingProject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue
    private Integer brandId;
    private String name;
    private String slug;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<Product> products;

    public Brand() {
    }

    public Brand(Integer brandId, String name, String slug, List<Product> products) {
        this.brandId = brandId;
        this.name = name;
        this.slug = slug;
        this.products = products;
    }

    public Integer getId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }
}
