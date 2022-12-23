package org.sid;


import org.sid.metier.entities.Class;
import org.sid.metier.methods.ConcreteMethod;
import org.sid.metier.methods.Parametre;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class classe = new Class("Maarouf");
        classe.setPublic(true);
        ConcreteMethod methode = new ConcreteMethod("MaaroufMethode", "int", "public",
                Arrays.asList(new Parametre("code", "int"),
                        new Parametre("name", "String")));
        classe.getMethods().add(methode);
        System.out.println(classe);

    }
}
