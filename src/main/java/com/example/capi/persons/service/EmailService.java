package com.example.capi.persons.service;

import com.example.capi.persons.entities.Email;
import com.example.capi.persons.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
   @Autowired
   private EmailRepository emailRepository;

    public List<Email> getEmailByPerson_id(Long id){
        return this.emailRepository.getEmailByPerson_id(id);
    }
}
