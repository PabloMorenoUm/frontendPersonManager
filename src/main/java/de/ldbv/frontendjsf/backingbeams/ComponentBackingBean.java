package de.ldbv.frontendjsf.backingbeams;

import de.ldbv.frontendjsf.dtos.PersonDto;
import lombok.Getter;
import lombok.Setter;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@FacesComponent
@Getter
@Setter
public class ComponentBackingBean extends UIInput implements NamingContainer {

    private String name = "asdf";
    private int age = 9;
    private PersonDto personDto;
    private String uhrzeit = "Button wurde noch nicht angeklickt";

    public String meineButtonMethode()
    {
        personDto = new PersonDto(UUID.randomUUID(), name, age);
        uhrzeit = (new SimpleDateFormat( "HH:mm:ss" )).format( new Date() ) + " Uhr";
        return null;
    }

    @Override
    public String getFamily()
    {
        return "javax.faces.NamingContainer";
    }
}
