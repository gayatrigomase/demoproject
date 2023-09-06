package com.example.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData(){
        return "Book your safe stay with us!!!!!";
    }

}
