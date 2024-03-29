package com.example.railway_deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/demo/")
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok("Xin chào");
    }

}
