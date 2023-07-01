package com.example.capi.persons.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hobbies {
    Long hobbyId;
    String name;
    String type;
    String description;
}
