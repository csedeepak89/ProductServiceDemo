package com.ecommerce.productservicedemo.dtos;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class FakeStoreProductDto {
    /*
    DTO's are exact replica of what a 3rd party API is sending us
    here FakeStoreProductDto contains all the attributes of product sent by FakeStore
     */
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