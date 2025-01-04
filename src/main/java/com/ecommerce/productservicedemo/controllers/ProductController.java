package com.ecommerce.productservicedemo.controllers;
import com.ecommerce.productservicedemo.models.Product;
import com.ecommerce.productservicedemo.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService ps) {
        this.productService = ps;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
/*
Product Service
1. Create Product
2. Get Product
3. Update Product
4. Delete Product

we will use MySQL DB for these crud operation

Client ---> Product Service ---> Database(but first we will use FakeStore API)

FIRST WE WILL CODE THE MODEL CLASS(Entity) FOR PRODUCTS ACC TO MVC

 */