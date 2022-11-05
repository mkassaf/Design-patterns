package edu.najah.cap.designpattern.observer.subject;

import edu.najah.cap.designpattern.observer.observer.Observer;

public  interface  ISubject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
