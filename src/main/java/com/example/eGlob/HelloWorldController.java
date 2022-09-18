package com.example.eGlob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloWorldController {
    // new comment
    //GET PUT POST DELETE
    @GetMapping("/hello")
    public List<String> getHelloWorld() {
        return List.of("Hello", "World!");
    }

    @GetMapping("/")
    public String health() {
        return "Hello & Welcome to Our project !!!";
    }

}
