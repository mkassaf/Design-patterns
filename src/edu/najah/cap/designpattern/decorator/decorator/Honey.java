package edu.najah.cap.designpattern.decorator.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;

public class Honey extends Decorator {

    public Honey(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return baseDrink.getDescription() + " with Honey. ";
    }

    @Override
    public double cost() {
        return baseDrink.cost() + 5;
    }
}
