package trafficlight;

import java.util.ArrayList;

public class Subject {

    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

   public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update();
        }
    }
}
