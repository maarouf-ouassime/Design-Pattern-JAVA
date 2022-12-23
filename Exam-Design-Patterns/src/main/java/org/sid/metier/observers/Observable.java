package org.sid.metier.observers;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllObservers();
}

