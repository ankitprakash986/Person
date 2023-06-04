package com.example.capi.persons.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Phone {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String phone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    Persons person;
}
