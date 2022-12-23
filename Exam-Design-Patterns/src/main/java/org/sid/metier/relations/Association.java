package org.sid.metier.relations;
public class Association implements Relation {
    private Destination destination;
    private Source source;
    private boolean isBidirecctional;
    public Association(Source source, Destination destination, boolean isBidirecctional) {
        this.source = source;
        this.destination = destination;
        this.isBidirecctional = isBidirecctional;
    }
}


