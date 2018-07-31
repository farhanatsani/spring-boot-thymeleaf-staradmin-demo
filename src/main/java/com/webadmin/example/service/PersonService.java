package com.webadmin.example.service;

import com.webadmin.example.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public List<Person> persons = new ArrayList<>();

    public void addPerson() {
        Person person = new Person();
        person.setId("1");
        person.setName("Dadang");
        person.setAddress("Jl. Pahlawan Seribu");
        persons.add(person);
    }

    public List<Person> getAllPersons() {
        return persons;
    }

}
