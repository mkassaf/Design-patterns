package edu.najah.cap.designpattern.decorator.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;

public class Milk extends Decorator {
    private static final double COST_FOR_MILK = 10;

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return baseDrink.getDescription() + " with milk. ";
    }

    @Override
    public double cost() {

        return baseDrink.cost() + COST_FOR_MILK;
    }
}
