package com.tts.restdemo.controller;

import com.tts.restdemo.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();




    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/teapot")
    public ResponseEntity<String> teapot(){
        return new ResponseEntity<>("Hello, I am a teapot", HttpStatus.I_AM_A_TEAPOT);
    }

    @GetMapping("/age")
    ResponseEntity<String> age(@RequestParam("Year of birth") int yearOfBirth) {

        if (isInFuture(yearOfBirth)) {
            return new ResponseEntity<>(
                    "year of birth cannot be in the future",
                    HttpStatus.BAD_REQUEST
            );
        }
        return new ResponseEntity<>(
            "your age is " + calculateAge(yearOfBirth),
                HttpStatus.OK);
        }

    private int calculateAge(int yearOfBirth) {
        return 2021 - yearOfBirth;
    }

    private boolean isInFuture(int yearOfBirth){
        return yearOfBirth > 2021;
    }



}
