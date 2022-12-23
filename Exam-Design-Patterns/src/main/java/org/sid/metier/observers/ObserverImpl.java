package org.sid.metier.observers;
import org.sid.metier.Attribute;
public class ObserverImpl implements Observer {
    @Override
    public void update(Observable observable) {
        Attribute attribute = (Attribute)observable;
    }
}

