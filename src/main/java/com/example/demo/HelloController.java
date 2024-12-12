package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Handle GET request with a path variable
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Handle GET request with a query parameter
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Greetings, " + name + "!";
    }
}
