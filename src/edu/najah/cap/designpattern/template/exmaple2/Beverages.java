package edu.najah.cap.designpattern.template.exmaple2;

public abstract class Beverages {
    protected abstract void perpareCup();
    protected abstract void addDrink();
    protected abstract void addCondiments();

    public final void makeBeverage(){
        perpareCup();
        addDrink();
        addCondiments();
        deliver();
    }

    private void deliver() {
        System.out.println("Deliver the beverage to the customer");
    }
}
