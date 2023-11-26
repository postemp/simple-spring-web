package ru.otus.java.basic.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//root: http://localhost:8189/app/hello
@RestController
public class MainController {
    @GetMapping("/hello")
    public String getDemoData(){
        return "Hello World!";

    }

    @GetMapping("/hello1")
    public String getDemoData1(){
        return "Hello World!1";

    }

}
