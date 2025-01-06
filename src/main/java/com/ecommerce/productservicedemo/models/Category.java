package com.ecommerce.productservicedemo.models;

import lombok.Data;

@Data
public class Category {
    private String name;
    private String description;

    public Category(String category, String description) {
        this.name = category;
        this.description = description;
    }
}
