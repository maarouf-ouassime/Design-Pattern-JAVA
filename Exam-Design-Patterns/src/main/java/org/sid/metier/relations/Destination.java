package org.sid.metier.relations;
import org.sid.metier.entities.Entity;
public class Destination {
    Entity entity;
    Cardinality[] cardinality = new Cardinality[2];

    public Destination(Entity entity, Cardinality[] cardinality) {
        this.entity = entity;
        this.cardinality = cardinality;
    }
}
