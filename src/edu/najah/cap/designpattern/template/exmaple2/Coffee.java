package edu.najah.cap.designpattern.template.exmaple2;

public class Coffee extends Beverages {
    @Override
    protected void perpareCup() {
        System.out.println("Prepare a cup for coffee");
    }

    @Override
    protected void addDrink() {
        System.out.println("Add coffee to the cup");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add sugar to the coffee");
    }
}
