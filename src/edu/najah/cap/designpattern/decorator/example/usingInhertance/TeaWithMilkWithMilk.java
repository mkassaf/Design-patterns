package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class TeaWithMilkWithMilk extends TeaMilk {

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }
}
