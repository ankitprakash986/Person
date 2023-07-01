package com.example.capi.persons.repositories;

import com.example.capi.persons.entities.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonsRepository extends JpaRepository<Persons,Long> {
    List<Persons> getByFirstName(String name);

    List<Persons> getAllByFirstName(String name);
}
