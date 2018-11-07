package com.farhan.staradmin.controller;

import com.farhan.staradmin.domain.Person;
import com.farhan.staradmin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "persons")
    public List<Person> findAll() {
        personService.addPerson();
        return personService.getAllPersons();
    }

}
