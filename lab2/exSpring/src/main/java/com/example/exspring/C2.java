package com.example.exspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C2 {
    @GetMapping("/throw")
    public void throwSomething(){
        throw new RuntimeException("ssssss");
    }
}
