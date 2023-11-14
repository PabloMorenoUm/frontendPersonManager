package de.ldbv.frontendjsf.backingbeams;

import de.ldbv.frontendjsf.dtos.PersonDto;
import de.ldbv.frontendjsf.dtos.PersonDtoHandler;
import lombok.Getter;
import lombok.Setter;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;

@FacesComponent
@Getter
@Setter
public class ComponentBackingBean extends UIInput implements NamingContainer {

    private String name = "asdf";
    private int age = 9;
    private PersonDto personDto;

    public String meineButtonMethode()
    {
        PersonDtoHandler handler = new PersonDtoHandler();
        personDto = handler.createNewPersonDto(name, age);
        return null;
    }

    @Override
    public String getFamily()
    {
        return "javax.faces.NamingContainer";
    }
}
