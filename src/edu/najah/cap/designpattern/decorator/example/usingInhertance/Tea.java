package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class Tea implements Bevrage {

    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }
}
