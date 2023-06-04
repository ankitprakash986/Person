package com.example.capi.persons.controller;

import com.example.capi.persons.entities.Email;
import com.example.capi.persons.entities.Persons;
import com.example.capi.persons.repositories.EmailRepository;
import com.example.capi.persons.repositories.PersonsRepository;
import com.example.capi.persons.service.EmailService;
import com.example.capi.persons.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/email/{id}")
    public List<Email> getAll(@PathVariable Long id){
        return this.emailService.getEmailByPerson_id(id);
    }

}
