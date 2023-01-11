package com.example.BenchTrainingProject.entity;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue
    @Column(name = "reviewId")
    private Integer reviewId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "shortDesc")
    private String shortDesc;
    private int rating;

    @Column(name = "productId")
    private Integer productId;

    @ManyToOne
    @JoinColumn(name = "productId", insertable=false, updatable=false)
    private Product product;

    public Review(Integer reviewId, String userName, String shortDesc, int rating, Integer productId) {
        this.reviewId = reviewId;
        this.userName = userName;
        this.shortDesc = shortDesc;
        this.rating = rating;
        this.productId = productId;
    }

    public Review() {
    }
}
