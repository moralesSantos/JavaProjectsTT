package com.tts.spring.demo.service;

import com.tts.spring.demo.model.Person;
import com.tts.spring.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService {


    @Autowired
    PersonRepository personRepository;

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public List<Person> getAllById() {
        return 
    }
}
