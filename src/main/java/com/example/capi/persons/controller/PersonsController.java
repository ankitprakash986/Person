package com.example.capi.persons.controller;

import com.example.capi.persons.entities.Persons;
import com.example.capi.persons.repositories.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonsController {
    @GetMapping("/ping")
    public ResponseEntity<String> ping (){
        return ResponseEntity.ok("I m Working.");
    }
}
