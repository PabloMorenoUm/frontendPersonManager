package de.ldbv.frontendjsf.dtos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonDtoHandlerTest {

    private PersonDtoHandler handler;

    @BeforeEach
    void setUp() {
        handler = new PersonDtoHandler();
    }

    @Test
    void createNewPersonDto() {
        String name = "name";
        int age = 42;

        PersonDto result = handler.createNewPersonDto(name, age);

        assertThat(result.getName()).isEqualTo(name);
        assertThat(result.getAge()).isEqualTo(age);
    }
}