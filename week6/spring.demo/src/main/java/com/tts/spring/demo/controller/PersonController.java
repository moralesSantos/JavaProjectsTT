package com.tts.spring.demo.controller;

import com.tts.spring.demo.model.Person;
import com.tts.spring.demo.repository.PersonRepository;
import com.tts.spring.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/get/all")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }


    @GetMapping("/get/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    @GetMapping("/get/persons")
    public Iterable<Person> getPersons(@RequestParam Iterable<Long> id){
        return personRepository.findAllById(id);
    }


}
