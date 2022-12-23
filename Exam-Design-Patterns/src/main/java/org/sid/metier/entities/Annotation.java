package org.sid.metier.entities;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entity{
    List<String> properties = new ArrayList<>();

    public Annotation(String name) {
        super(name);
    }
}

