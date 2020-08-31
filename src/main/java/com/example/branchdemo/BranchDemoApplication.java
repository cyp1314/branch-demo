package com.example.branchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BranchDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BranchDemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "branch test,hello world!";
    }

}
