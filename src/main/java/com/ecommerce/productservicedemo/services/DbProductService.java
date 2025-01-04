package com.ecommerce.productservicedemo.services;

import com.ecommerce.productservicedemo.models.Product;

import java.util.List;

public class DbProductService implements ProductService {
    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
