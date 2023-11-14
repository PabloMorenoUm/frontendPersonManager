package de.ldbv.frontendjsf.dtos;

import java.util.UUID;

public class PersonDtoHandler {
    public PersonDto createNewPersonDto(String name, int age) {
        return new PersonDto(UUID.randomUUID(), name, age);
    }
}
