package com.bridgelabz.productInformation.service;

import com.bridgelabz.productInformation.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
