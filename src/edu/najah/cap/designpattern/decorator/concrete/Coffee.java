package edu.najah.cap.designpattern.decorator.concrete;

import edu.najah.cap.designpattern.decorator.component.Drink;

public class Coffee implements Drink {
    @Override
    public String getDescription() {
        return "This is coffee";
    }

    @Override
    public double cost() {
        return 15;
    }
}
