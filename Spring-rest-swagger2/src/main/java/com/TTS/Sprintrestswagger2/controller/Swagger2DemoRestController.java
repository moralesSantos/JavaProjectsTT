package com.TTS.Sprintrestswagger2.controller;

import com.TTS.Sprintrestswagger2.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Swagger2DemoRestController {

    List<Student> students = new ArrayList<Student>();
    {
        students.add(new Student("Maxx","IV","USA"));
        students.add(new Student("CG","V", "USA"));
        students.add(new Student("Luis", "III", "Mexico"));
    }

    @RequestMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }

    @RequestMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name")String name) {
        return students.stream().filter(x ->x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }

    @RequestMapping(value = "/getStudentByCountry/{country}")
    public List<Student> getStudentByCountry(@PathVariable(value = "country") String country){
        System.out.println("Searching student in country: " + country);
        List<Student> studentsByCountry = students.stream().filter(x->x.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
        System.out.println(studentsByCountry);
        return studentsByCountry;
    }

    @RequestMapping(value = "/getStudentByClass/{cls}")
    public List<Student> getStudentByClass(@PathVariable(value = "cls") String cls){
        return students.stream().filter(x -> x.getCls().equalsIgnoreCase(cls)).collect(Collectors.toList());
    }




}
