package org.sid.metier.entities;


import org.sid.metier.Attribute;
import org.sid.metier.groupeclasse.IClass;
import org.sid.metier.methods.ConcreteMethod;
import org.sid.metier.methods.Constructor;

import java.util.ArrayList;
import java.util.List;

public class Class extends Entity implements IClass {
    private boolean isPublic;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;

    private final List<ConcreteMethod> methods = new ArrayList<>();
    private final List<Constructor> constructors = new ArrayList<>();
    private final List<Attribute> attributes = new ArrayList<>();

    public Class(String name) {
        super(name);
    }


    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public List<ConcreteMethod> getMethods() {
        return methods;
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }
}
