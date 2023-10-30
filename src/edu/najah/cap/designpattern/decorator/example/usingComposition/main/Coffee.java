package edu.najah.cap.designpattern.decorator.example.usingComposition.main;

import edu.najah.cap.designpattern.decorator.example.usingComposition.Bevrage;

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
