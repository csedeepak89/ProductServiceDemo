package com.ecommerce.productservicedemo.models;

import lombok.Data;
import java.util.Date;

@Data
public class Base {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
