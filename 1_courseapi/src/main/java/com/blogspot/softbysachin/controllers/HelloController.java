package com.blogspot.softbysachin.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/controllers")
    public String sayHello() {
        return "Hello";
    }

}
