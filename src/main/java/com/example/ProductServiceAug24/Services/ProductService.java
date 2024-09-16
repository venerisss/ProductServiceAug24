package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.Exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.Models.Product;

public interface ProductService {
    public Product getProductById(long id) throws ProductNotFoundException;
}
