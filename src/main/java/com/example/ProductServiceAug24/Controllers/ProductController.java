package com.example.ProductServiceAug24.Controllers;

import com.example.ProductServiceAug24.Exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    //GET/products/{id}
    @Autowired //this annotation tells springBoot that it is springBoots responsibility to add the correct object here. i.e to add a dependency via dependency injection
    private ProductService productService; //because productservice is an interface, we can say we can have any child of the product service there
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> GetProductById(@PathVariable("id")long productId) throws ProductNotFoundException {
        /*if(productId<1||productId>20){
            return new ResponseEntity<>(HttpStatusCode.valueOf(400)); //a new response id is created to send a value of 400 which means the client error
        }*/
        Product product =  productService.getProductById(productId);
        return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
    }//after running the application, it would show the application is running and open postman to see the our output
    /*@ExceptionHandler(ProductNotFoundException.class) //this is to tell the controller or java what to do in the case of an exception
    public ResponseEntity<String> getProductNotFoundException(ProductNotFoundException e){ //currently we have set it to product controller level, we are trying to put into a global level, where if we see any exception of this type, we throw this error
        return new ResponseEntity<>(e.getMessage(),HttpStatusCode.valueOf(400));
    }*/ //thus whenever a product which is not there is called we give the ability for springboot to call this exceptional handler method
}
