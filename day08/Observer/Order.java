package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable{
    private String position;
    private String destination;
    private int timeBeforeArrival;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer obsv) {
        this.observers.add(obsv);
    }

    @Override
    public boolean notifyObservers() {
        if (observers == null)
            return false;
        for(Observer obs: observers) {
            obs.update(this);
        }
        return true;
    }

    //-----setter and getter-----
    public String getPosition() {
        return this.position;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getTimeBeforeArrival() {
        return this.timeBeforeArrival;
    }

    public void setData(String oPosition, String oDestination, int oTime) {
        this.position = oPosition;
        this.destination = oDestination;
        this.timeBeforeArrival = oTime;
        this.notifyObservers();
    }
}
