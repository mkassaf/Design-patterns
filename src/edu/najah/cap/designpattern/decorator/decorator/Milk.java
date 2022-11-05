package edu.najah.cap.designpattern.decorator.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return baseDrink.getDescription() + " with milk. ";
    }

    @Override
    public double cost() {
        return baseDrink.cost() + 2;
    }
}
