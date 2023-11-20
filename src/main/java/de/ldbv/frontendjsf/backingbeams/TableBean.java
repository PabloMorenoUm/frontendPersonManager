package de.ldbv.frontendjsf.backingbeams;

import de.ldbv.frontendjsf.dtos.PersonDto;
import de.ldbv.frontendjsf.dtos.PersonDtoHandler;
import lombok.Getter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name = "tableBean")
@ViewScoped
@Getter
public class TableBean {
    private final List<PersonDto> personDtos;

    public TableBean() {
        PersonDtoHandler handler = new PersonDtoHandler();
        personDtos = handler.findAll();
    }
}
