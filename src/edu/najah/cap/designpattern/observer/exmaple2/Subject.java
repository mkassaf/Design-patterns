package edu.najah.cap.designpattern.observer.exmaple2;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
