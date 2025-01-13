package com.ecommerce.productservicedemo.controllers;
import com.ecommerce.productservicedemo.models.Product;
import com.ecommerce.productservicedemo.services.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.service.annotation.PutExchange;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final RestTemplate restTemplate;
    ProductService productService;
    public ProductController(ProductService ps, RestTemplate restTemplate) {
        this.productService = ps;
        this.restTemplate = restTemplate;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PatchMapping("/{id}")//Patch does partial update
    public void updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        productService.updateProduct(id, product);
    }

    @PutMapping("/{id}") //Put does full row update CULT MEMBERSHIP TRANSFER
    public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.replaceProduct(id, product);
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