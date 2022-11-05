package edu.najah.cap.designpattern.decorator.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;

public class Mocha extends  Decorator {
    public Mocha(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return baseDrink.getDescription() + " with Mocha. ";
    }

    @Override
    public double cost() {
        return baseDrink.cost() + 4;
    }
}
