package org.sid.metier.methods;
import java.util.List;
public class ConcreteMethod extends Method{
    private boolean isFinal;
    private boolean isStatic;
    private boolean isAbstract;
    private String type;
    private String visibility;
    public ConcreteMethod(String name, String type,
                          String visibility,
                          List<Parametre> parametres) {
        super(name, parametres);
    }

}


