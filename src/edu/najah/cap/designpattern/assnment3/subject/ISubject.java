package edu.najah.cap.designpattern.assnment3.subject;

import edu.najah.cap.designpattern.assnment3.observer.Observer;

public  interface  ISubject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

    public void setValue(String value);
}
