package org.sid.metier.observers;
import java.util.ArrayList;
import java.util.List;
public class ObservableImpl implements Observable {
    List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyAllObservers() {
        observers.forEach(o -> o.
                update(this));
    }
}

