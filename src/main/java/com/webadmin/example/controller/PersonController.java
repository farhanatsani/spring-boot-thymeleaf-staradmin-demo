package com.webadmin.example.controller;

import com.webadmin.example.domain.Person;
import com.webadmin.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "persons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        personService.addPerson();
        return personService.getAllPersons();
    }

}
