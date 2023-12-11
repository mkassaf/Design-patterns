package edu.najah.cap.designpattern.observer.exmaple2;

import java.util.ArrayList;
import java.util.List;

public class WeartherStation implements Subject {


    private final List<Observer> observers;
    private int temperature;

    public WeartherStation() {
        this.observers = new ArrayList<>();
    }


    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }



    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.removeIf(observer -> observer.equals(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
