package example1.observable;

import example1.observers.Observer;

public interface Observable {
     void subscribe(Observer observer);
     void unsubscribe(Observer observer);
     void notifyObservers();
}
