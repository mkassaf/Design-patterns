package edu.najah.cap.designpattern.assnment3.observer;

public class CurrentConditionsDisplay implements Observer {
    private String status;

    @Override
    public void update(String status) {
        this.status = status;
        display();
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay \n" + status);
    }
}
