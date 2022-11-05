package edu.najah.cap.designpattern.observer.subject;

import edu.najah.cap.designpattern.observer.observer.Observer;

import java.util.ArrayList;

public class Subject implements ISubject {

    private ArrayList<Observer> observers = null;
    private int value;

    public Subject(){
        observers = new ArrayList<>();
    }

    /**
     * Observer can register/subscribe to this topic
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Observer can unregister/unsubscribe to this topic
     * @param observer
     */

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.value);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
