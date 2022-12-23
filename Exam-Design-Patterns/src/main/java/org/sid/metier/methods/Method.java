package org.sid.metier.methods;

import java.util.ArrayList;
import java.util.List;

public abstract class Method {
    protected String name;
    protected final List<Parametre> parametres
            = new ArrayList<>();
    protected Method(String name,
                     List<Parametre> parametres) {
        this.name = name;
    }

}


