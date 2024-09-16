package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.DTOs.FakeStoreProductDto;
import com.example.ProductServiceAug24.Exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service //this lets springboot know that this is a service
public class FakeStoreProductService implements ProductService {

    @Override
    public Product getProductById(long id) throws ProductNotFoundException { //here we need to write our business logic or service logic(main logic of business)
        /*
        Take the id from the input and call this endpoint: a
        https://fakestoreapi.com/products/ + id
         */
        String url = "https://fakestoreapi.com/products/" + id; //here we call the api
        RestTemplate restTemplate = new RestTemplate(); //create the restTemplate object
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(url, FakeStoreProductDto.class); //we call the getForObject method on the resttemplate object and giving it the url, fakestoreproductdto class i.e we will get the data in this class
        if(fakeStoreProductDto == null){
            throw new ProductNotFoundException("Product with id: " + id + " was not found"); //this is a
        }
        return convertFakeStoreProductToproduct(fakeStoreProductDto); //here we convert it into our product
    }
    private Product convertFakeStoreProductToproduct(FakeStoreProductDto dto){ //here we convert it to our product
        Product product = new Product();
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        product.setName(dto.getTitle());
        return product;
    }
} //thus in this code we have succesfully called a 3rd party service got data in its format and we converted it into our format
