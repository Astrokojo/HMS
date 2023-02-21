package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hospital")
    public String getInfo() {
        return "You Welcome To Hospital";
    }

}
