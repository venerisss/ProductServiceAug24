package com.example.ProductServiceAug24.advice;

import com.example.ProductServiceAug24.Exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
@org.springframework.web.bind.annotation.ControllerAdvice //this means whatever methods we define in this class, will be applicable at the global level
public class ControllerAdvice {
    @ExceptionHandler(ProductNotFoundException.class) //this is to tell the controller or java what to do in the case of an exception
    public ResponseEntity<String> getProductNotFoundException(ProductNotFoundException e){ //currently we have set it to product controller level, we are trying to put into a global level, where if we see any exception of this type, we throw this error
        return new ResponseEntity<>(e.getMessage(), HttpStatusCode.valueOf(400));
    }
}
