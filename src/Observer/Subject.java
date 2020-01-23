package Observer;

import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void changeValue(int newValue) {
        for (Observer observer : observers) {
                observer.update(newValue);
        }
    }
}
