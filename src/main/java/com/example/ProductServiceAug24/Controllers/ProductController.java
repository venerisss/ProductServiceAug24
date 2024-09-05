package com.example.ProductServiceAug24.Controllers;

import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    //GET/products/{id}
    @Autowired //this annotation tells springBoot that it is springBoots responsibility to add the correct object here. i.e to add a dependency via dependency injection
    private ProductService productService; //because productservice is an interface, we can say we can have any child of the product service there
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> GetProductById(@PathVariable("id")long productId){
        if(productId<1||productId>20){
            return new ResponseEntity<>(HttpStatusCode.valueOf(400)); //a new response id is created to send a value of 400 which means the client error
        }
        Product product =  productService.getProductById(productId);
        return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
    }//after running the application, it would show the application is running and open postman to see the our output
}
