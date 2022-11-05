package edu.najah.cap.designpattern.observer.observer;

public class Book implements Observer{
    private int value;


    @Override
    public void update(int value) {
        System.out.println("Book is being updated by observer to change vale to "+ value);
        this.setValue(value);
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
