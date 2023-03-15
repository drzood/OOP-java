package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {
    private int id;
    private List<Observer> observers;

    public Button(int id) {
        this.id = id;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void onClick() {
        // do something
        notifyObservers(/*Event event*/);
    }

    public int getId() {
        return id;
    }
}
