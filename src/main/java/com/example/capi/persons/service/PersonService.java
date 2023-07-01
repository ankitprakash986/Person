package com.example.capi.persons.service;

import com.example.capi.persons.entities.Persons;
import com.example.capi.persons.models.Hobbies;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<Persons> getPersonsByFirstName(String name);

    List<Hobbies> getHobbiesByFirstName(String firstName);
}
