package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class CoffeeWithMilk extends Coffee {

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }
}
