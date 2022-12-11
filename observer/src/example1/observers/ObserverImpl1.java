package example1.observers;

import example1.observable.Observable;
import example1.observable.ObservableImpl;

public class ObserverImpl1 implements Observer {
    private double somme;
   /*
   // Technique Push
   @Override
    public void update(int state) {
        somme += state;
        System.out.println("ObserverImpl1: somme = " + somme);
    }*/

    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl)observable).getState();
        somme += state;
        System.out.println("ObserverImpl1: somme = " + somme);
    }
}
