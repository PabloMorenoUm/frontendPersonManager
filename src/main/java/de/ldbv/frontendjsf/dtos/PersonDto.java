package de.ldbv.frontendjsf.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class PersonDto {
    private UUID id;
    private String name;
    private int age;

    @Override
    public String toString()
    {
        return "{ id=" + id + ", name=" + name + ", age=" + age + " }";
    }
}
