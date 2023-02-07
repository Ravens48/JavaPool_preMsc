package Observer;

public interface Observable {
    void addObserver(Observer obsv);
    boolean notifyObservers();
}
