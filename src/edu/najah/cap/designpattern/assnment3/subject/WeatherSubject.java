package edu.najah.cap.designpattern.assnment3.subject;

import edu.najah.cap.designpattern.assnment3.observer.Observer;

import java.util.List;

public class WeatherSubject implements ISubject {
    private String value;
    private List<Observer> observers;
    public WeatherSubject(){
        observers = new java.util.ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(value);
        }
    }
}
