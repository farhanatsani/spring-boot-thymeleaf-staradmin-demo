package com.farhan.staradmin.service;

import com.farhan.staradmin.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public static List<Person> persons = new ArrayList<>();

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
