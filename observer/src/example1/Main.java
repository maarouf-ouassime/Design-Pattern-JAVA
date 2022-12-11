package example1;

import example1.observable.Observable;
import example1.observable.ObservableImpl;
import example1.observers.Observer;
import example1.observers.ObserverImpl1;
import example1.observers.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        ObserverImpl1 observer1 = new ObserverImpl1();
        ObserverImpl2 observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState(90);
        System.out.println("----------------");
        observable.setState(60);
        System.out.println("****************");
        observable.unsubscribe(observer2);
        observable.setState(40);


        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                int state = ((ObservableImpl)observable).getState();
                System.out.println("Observer anonyme: " + state);
            }
        });
        observable.subscribe((observable1) -> {
            int state = ((ObservableImpl)observable1).getState();
            System.out.println("Observer anonyme lambda: " + state);
        });

        observable.setState(20);
    }
}
