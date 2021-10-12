package com.tts.spring.demo.service;

import com.tts.spring.demo.model.Person;

import java.util.List;

//
public interface PersonService {

    //get Method by Id value
    Person getPersonById(Long id);



    //get all persons
    List<Person> getAllPersons();

    List<Person> getAllById(List<Long>id);




}
