package com.example.capi.persons.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
public class Email implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    Persons person;
}
