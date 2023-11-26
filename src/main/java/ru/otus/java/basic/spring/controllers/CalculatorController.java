package ru.otus.java.basic.spring.controllers;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    // http://localhost:8189/app

    // http://localhost:8189/app/add?a=10&b=20
    @GetMapping("/add")
    public Integer addOperation(@RequestParam (defaultValue = "0") Integer a,

                                @RequestParam (defaultValue = "0") Integer b
    ) {
        return a + b;
    }

    @GetMapping("/sub")
    public Integer subOperation(@RequestParam (defaultValue = "0") Integer a,

                                @RequestParam (defaultValue = "0") Integer b
    ) {
        return a - b;
    }


}
