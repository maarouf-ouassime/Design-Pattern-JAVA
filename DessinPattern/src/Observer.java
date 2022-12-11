public interface Observer {
    void update(Observer observer);

    void update(Observable observable);
}
