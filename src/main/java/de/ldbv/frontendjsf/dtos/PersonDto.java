package de.ldbv.frontendjsf.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class PersonDto {
    private UUID personId;
    private String name;
    private int age;

    @Override
    public String toString()
    {
        return "{ id=" + personId + ", name=" + name + ", age=" + age + " }";
    }
}
