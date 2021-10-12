package com.tts.spring.demo.controller;

import com.tts.spring.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

// below I am using the rest controller annotation
// this allows me to create a restful service
// that will expose resources over urls
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String getHello() {
        return "Hello World from spring boot!!";
    }

    @GetMapping("/bob")
    public Person getBob(){
        return new Person ("Bob",
                "Smith",
                LocalDate.of(1990,1,1));
    }
}
