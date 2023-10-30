package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class Coffee implements Bevrage {

    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
