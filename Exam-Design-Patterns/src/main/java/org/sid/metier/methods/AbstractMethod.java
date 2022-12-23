package org.sid.metier.methods;


import java.util.List;

public class AbstractMethod extends Method{
    private String type;

    public AbstractMethod(String name, List<Parametre> parametres) {
        super(name, parametres);
    }

    public void setType(String type) {
        this.type = type;
    }
}

