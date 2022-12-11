package example1.observers;

import example1.observable.Observable;

public interface Observer {
    // Technique Puch
    // void update(int state);

    // Technique Pop
    void update(Observable observable);
}
