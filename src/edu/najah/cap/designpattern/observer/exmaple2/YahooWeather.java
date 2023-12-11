package edu.najah.cap.designpattern.observer.exmaple2;

import java.util.ArrayList;
import java.util.List;

public class YahooWeather implements Subject {
    private int temperature;

    private final List<Observer> observers;

    public YahooWeather() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    public int getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
