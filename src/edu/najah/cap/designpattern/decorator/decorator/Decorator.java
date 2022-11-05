package edu.najah.cap.designpattern.decorator.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;

public abstract class  Decorator implements Drink {
    protected Drink baseDrink;
    public Decorator(Drink drink){
        this.baseDrink = drink;
    }
}
