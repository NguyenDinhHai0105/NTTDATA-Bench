package com.example.BenchTrainingProject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "productId")
    private Integer productId;
    private String name;
    private String shortDesc;
    private double price;
    private int stock;
    private int sold;

    @Column(name = "brand_id")
    private Integer brandId;

    @ManyToOne
    @JoinColumn(name = "brand_id", insertable=false, updatable=false)
    private Brand brand;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

    public Product() {
    }

    public Product(String name, String shortDesc, double price, int stock, int sold, Integer brandId, List<Review> reviews) {
        this.name = name;
        this.shortDesc = shortDesc;
        this.price = price;
        this.stock = stock;
        this.sold = sold;
        this.brandId = brandId;
        this.reviews = reviews;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getSold() {
        return sold;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public Brand getBrand() {
        return brand;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
