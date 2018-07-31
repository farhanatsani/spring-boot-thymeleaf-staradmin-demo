package com.webadmin.example;

import com.webadmin.example.domain.Person;
import com.webadmin.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WebAdminExampleApplication {

	@Autowired
	private static PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(WebAdminExampleApplication.class, args);
	}
}
