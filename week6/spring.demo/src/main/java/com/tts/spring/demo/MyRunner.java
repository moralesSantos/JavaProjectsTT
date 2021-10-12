package com.tts.spring.demo;

import com.tts.spring.demo.model.Person;
import com.tts.spring.demo.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

public class MyRunner{

    @Bean
    public CommandLineRunner runner(PersonRepository personRepository){
        return (args)-> {
            personRepository.save(new Person("Micky","Mouse", LocalDate.MIN));
            personRepository.save(new Person("Mini","Mouse", LocalDate.MIN));
            personRepository.save(new Person("Donald","Duck", LocalDate.MIN));

        };
    }

}
