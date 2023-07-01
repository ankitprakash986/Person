package com.example.capi.persons.controller;

import com.example.capi.persons.entities.Persons;
import com.example.capi.persons.models.Hobbies;
import com.example.capi.persons.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonsController {

    @Autowired
    private PersonService personService;
    @GetMapping("/ping")
    public ResponseEntity<String> ping (){
        return ResponseEntity.ok("I m Working.");
    }

    @GetMapping("/person/{firstName}")
    public ResponseEntity<List<Persons>> getPersonsByFirstName(@PathVariable String firstName){
        return ResponseEntity.ok(personService.getPersonsByFirstName(firstName));
    }

    @GetMapping("/person/hobby/{firstName}")
    public ResponseEntity<List<Hobbies>> getHobbiesByFirstName(@PathVariable String firstName){
        return ResponseEntity.ok(personService.getHobbiesByFirstName(firstName));

    }
}
