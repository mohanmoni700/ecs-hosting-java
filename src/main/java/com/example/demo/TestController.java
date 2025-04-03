package com.example.demo;  // Change the package name as per your project structure

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST controller
@RequestMapping("/test")  // Maps all requests under "/test"
public class TestController {

    @GetMapping  // Handles GET requests to "/test"
    public String getTestMessage() {
        return "testing.New.Version2";  // Returns "testing" as the response
    }
}
