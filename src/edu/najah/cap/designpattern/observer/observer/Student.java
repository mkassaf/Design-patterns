package edu.najah.cap.designpattern.observer.observer;

public class Student implements Observer {
    private int value;


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
