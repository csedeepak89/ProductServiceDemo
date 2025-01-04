package com.ecommerce.productservicedemo.services;

import com.ecommerce.productservicedemo.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);
    List<Product> getAllProducts();
}
