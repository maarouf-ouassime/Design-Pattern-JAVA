package org.sid.metier;
import org.sid.metier.observers.ObservableImpl;
public class Attribute extends ObservableImpl {
    private String name;
    private String type;
    private String visibility;
    private boolean isFinal;
    private boolean isStatic;

    public Attribute(String name, String type, String visibility,
                     boolean isFinal, boolean isStatic) {
        this.name = name;
        this.type = type;
        this.visibility = visibility;
        this.isFinal = isFinal;
        this.isStatic = isStatic;
    }
}



