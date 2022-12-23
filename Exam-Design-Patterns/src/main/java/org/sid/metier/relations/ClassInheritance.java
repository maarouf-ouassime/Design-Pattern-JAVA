package org.sid.metier.relations;


public class ClassInheritance implements Inheritance{
    Class superClass;
    Class subClass;

    public Class getSuperClass() {
        return superClass;
    }

    public void setSuperClass(Class superClass) {
        this.superClass = superClass;
    }

    public Class getSubClass() {
        return subClass;
    }

    public void setSubClass(Class subClass) {
        this.subClass = subClass;
    }
}

