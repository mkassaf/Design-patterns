package edu.najah.cap.designpattern.observer.observer;

import edu.najah.cap.designpattern.observer.subject.ISubject;

public class Student implements Observer {
    private int value;


    public Student(ISubject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        System.out.println("Student is being updated by observer to change vale to "+ value);
        this.setValue(value);
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
