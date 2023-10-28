package edu.najah.cap.designpattern.template.exmaple2;

public class Tea extends Beverages {
    @Override
    protected void perpareCup() {
        System.out.println("Prepare a cup for tea");
    }

    @Override
    protected void addDrink() {
        System.out.println("Add tea to the cup");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add lemon to the tea");
    }
}
