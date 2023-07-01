package com.example.capi.persons.service;

import com.example.capi.persons.PersonsFeignClient;
import com.example.capi.persons.entities.Persons;
import com.example.capi.persons.models.Hobbies;
import com.example.capi.persons.repositories.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonsRepository personsRepository;

    @Autowired
    private PersonsFeignClient personsFeignClient;

    @Override
    public List<Persons> getPersonsByFirstName(String name){
        return personsRepository.getByFirstName(name);
    }

    @Override
   public List<Hobbies> getHobbiesByFirstName(String firstName){
        List<Persons> persons =  personsRepository.getAllByFirstName(firstName);
        List<Long> personIds = new ArrayList<>();

        for(Persons person : persons){
            personIds.add(person.getId());
        }

        ResponseEntity<List<Hobbies>> response = personsFeignClient.fetchAllHobbiesByPersonIds(personIds);

        return response.getBody();
    }

}
