package com.ecommerce.productservicedemo.models;

import lombok.Data;

@Data
public class Product extends Base{
    private String title;
    private Double price;
    private Category category;
}
