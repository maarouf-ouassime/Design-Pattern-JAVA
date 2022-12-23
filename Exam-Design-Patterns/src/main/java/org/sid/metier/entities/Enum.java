package org.sid.metier.entities;

import java.util.ArrayList;
import java.util.List;

public class Enum extends Entity{
    List<String> values = new ArrayList<>();

    public Enum(String name) {
        super(name);
    }
}

