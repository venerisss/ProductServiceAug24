package com.example.ProductServiceAug24.Controllers;

import com.example.ProductServiceAug24.Exceptions.ProductNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    //endpoint name: GET//hello
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
    //Endpoint name: GET/hello/{name}
    @GetMapping("/hello/{name}")//this {name} should be parsed as a variable into the PathVariable
    public String helloWithName(@PathVariable("name") String name) throws ProductNotFoundException{ //string name indicates that it is a string
        /*if(name.equals("Bhavik")){
            throw new ProductNotFoundException("Bhavik is not a product");
        }*/ //since we made the exception as global
        return "Hello "+name;
    }
    @GetMapping("/show/{showId}/seat/{seatId}")
    public String bmsExample(@PathVariable("showId")String showId,@PathVariable("seatId")int seatId){
        return "Hello " + showId + " " + seatId;
    }
}
