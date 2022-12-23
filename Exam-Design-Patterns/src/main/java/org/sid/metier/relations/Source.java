package org.sid.metier.relations;
public class Source {
    Class aClass;
    Cardinality[] cardinality = new Cardinality[2];

    public Source(Class aClass, Cardinality[] cardinality) {
        this.aClass = aClass;
        this.cardinality = cardinality;
    }
}
