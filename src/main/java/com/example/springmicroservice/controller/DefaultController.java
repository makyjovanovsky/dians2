package com.example.springmicroservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/index")
    public String getIndexPage() {
        return "hello";
    }
}
