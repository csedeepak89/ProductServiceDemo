package com.ecommerce.productservicedemo.services;

import com.ecommerce.productservicedemo.dtos.FakeStoreProductDto;
import com.ecommerce.productservicedemo.models.Category;
import com.ecommerce.productservicedemo.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product getSingleProduct(Long productId) {
        FakeStoreProductDto fakeStoreProductDto =
                restTemplate.getForObject("https://fakestoreapi.com/products/" + productId,
                        FakeStoreProductDto.class);

        System.out.println("DTO received: " + fakeStoreProductDto);

        if (fakeStoreProductDto == null) {
            throw new RuntimeException("Product not found");
        }

        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setPrice(fakeStoreProductDto.getPrice());

        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        category.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(category);

        product.setTitle(fakeStoreProductDto.getTitle());
        return product;
    }
//    @Override
//    public Product getSingleProduct(Long id) {
//        FakeStoreProductDto fakeStoreProductDto =
//                restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
//                FakeStoreProductDto.class);
//        //Now convert FakeStoreProductDto to my Product
//        //instead of writing code here, we make a helper function to do this conversion
//        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
//    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

//    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {
//        Product product = new Product();
//        product.setId(fakeStoreProductDto.getId());
//        product.setCategory(new Category(fakeStoreProductDto.getCategory(), fakeStoreProductDto.getDescription()));
//        product.setTitle(fakeStoreProductDto.getTitle());
//        product.setPrice(fakeStoreProductDto.getPrice());
//        return product;
//    }
}



/*
to call 3rd party API, we have to use RestTemplate
now here we will check fakeStore web to check how they have given API for getSingleProduct and
getAllProduct.
single product :- https://fakestoreapi.com/products/1
output:-
        id:1,
        title:'...',
        price:'...',
        category:'...',
        description:'...',
        image:'...'

get all products :- https://fakestoreapi.com/products
output:-
        {
                    id:1,
                    title:'...',
                    price:'...',
                    category:'...',
                    description:'...',
                    image:'...'
                },

                {
                    id:30,
                    title:'...',
                    price:'...',
                    category:'...',
                    description:'...',
                    image:'...'
        }
 */
