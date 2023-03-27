package com.example.exspring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class C1 {


    @ExceptionHandler({RuntimeException.class})
    public void handleException(){
        System.out.println("abc");
    }
}
