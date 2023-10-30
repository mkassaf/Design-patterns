package edu.najah.cap.designpattern.decorator.example.usingComposition.main;

import edu.najah.cap.designpattern.decorator.example.usingComposition.Bevrage;

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
