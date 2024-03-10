package com.example.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //bardziej wyspecjalizowany niż Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @PostMapping("/helloworld")
    public String helloWorldPost() {
        return "Hello World - POST";
    }

    @DeleteMapping("/helloworld")
    public String helloWorldDelete() {
        return "Hello World - DELETE";
    }
}
