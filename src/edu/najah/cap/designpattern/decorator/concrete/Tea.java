package edu.najah.cap.designpattern.decorator.concrete;

import edu.najah.cap.designpattern.decorator.component.Drink;

public class Tea implements Drink {


    @Override
    public String getDescription() {
        return "This is tea.";
    }

    @Override
    public double cost() {
        return 10;
    }
}
