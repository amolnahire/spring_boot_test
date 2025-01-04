package com.krisha.demo.controller;

//rest API
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

    @GetMapping("/hello-world")
    public String Helloworld(){
        return "hello world";
    }
}
