package de.ldbv.frontendjsf.backingbeams;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import java.text.SimpleDateFormat;
import java.util.Date;

@FacesComponent
public class ComponentBackingBean extends UIInput implements NamingContainer {
    private String uhrzeit = "Button wurde noch nicht angeklickt";

    public String getUhrzeit() { return uhrzeit; }

    public String meineButtonMethode()
    {
        uhrzeit = (new SimpleDateFormat( "HH:mm:ss" )).format( new Date() ) + " Uhr";
        return null;
    }

    @Override
    public String getFamily()
    {
        return "javax.faces.NamingContainer";
    }
}
