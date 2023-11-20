package de.ldbv.frontendjsf.dtos;

import java.util.List;
import java.util.UUID;

public class PersonDtoHandler {

    public PersonDto createNewPersonDto(String name, int age) {
        return new PersonDto(UUID.randomUUID(), name, age);
    }

    public List<PersonDto> findAll() {
        return List.of(
                new PersonDto(UUID.randomUUID(), "Julia", 27),
                new PersonDto(UUID.randomUUID(), "Pablo", 31)
        );
    }
}
