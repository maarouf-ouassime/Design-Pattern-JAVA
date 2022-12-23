package org.sid.metier.relations;

import org.sid.metier.entities.Interface;

public class InterfaceInheritance {
    Interface supInterface;
    Interface subInterface;

    public InterfaceInheritance(Interface supInterface, Interface subInterface) {
        this.supInterface = supInterface;
        this.subInterface = subInterface;
    }
}

