package com.tamago.JavaApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class StudyController {


    @GetMapping
    public String index(){
        return "Hello World!";
    }


}
