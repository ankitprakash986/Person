package com.example.capi.persons.repositories;

import com.example.capi.persons.entities.Persons;
import com.example.capi.persons.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long> {


}
