package com.example.capi.persons.entities;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Persons implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String first_name;
    String last_name;
    String age;
    String country;
}

