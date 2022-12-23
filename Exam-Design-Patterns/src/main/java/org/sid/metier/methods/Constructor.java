package org.sid.metier.methods;
import java.util.List;
public class Constructor extends Method{
    private String visibility;

    public Constructor(String name,
                       List<Parametre> parametres) {
        super(name, parametres);
    }
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}

