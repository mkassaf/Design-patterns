package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class TeaMilk extends Tea {

    @Override
    public double getCost() {
        if (super.getCost() > 10) {
            return super.getCost();
        }
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }
}
