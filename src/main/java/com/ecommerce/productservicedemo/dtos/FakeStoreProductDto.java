package com.ecommerce.productservicedemo.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}

/*
FakeStore product Model
        id:1,
        title:'...',
        price:'...',
        category:'...',
        description:'...',
        image:'...'

 Our product model
        id
        createdAt
        updatedAt
        title
        price
        category

 */