package com.example.capi.persons.repositories;

import com.example.capi.persons.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email,Long> {
    public List<Email> getEmailByPersons_Id(Long id);
}
