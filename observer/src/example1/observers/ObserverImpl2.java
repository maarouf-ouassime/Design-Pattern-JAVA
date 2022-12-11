package example1.observers;

import example1.observable.Observable;
import example1.observable.ObservableImpl;

public class ObserverImpl2 implements Observer {
    private double lastState;
   /*
    // Technique Push
    @Override
    public void update(int state) {
     if (state-lastState>0)
            System.out.println("ObserverImpl2 => Augmentation de la pression");
     else if (state-lastState<0)
            System.out.println("ObserverImpl2 => Diminution de la pression");
     else
            System.out.println("ObserverImpl2 => Pression constante");
        lastState=state;
    }*/


    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl)observable).getState();
        if (state-lastState>0)
            System.out.println("ObserverImpl2 => Augmentation de la pression");
        else if (state-lastState<0)
            System.out.println("ObserverImpl2 => Diminution de la pression");
        else
            System.out.println("ObserverImpl2 => Pression constante");
        lastState=state;
    }
}
