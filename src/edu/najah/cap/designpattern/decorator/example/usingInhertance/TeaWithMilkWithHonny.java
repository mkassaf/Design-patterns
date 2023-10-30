package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class TeaWithMilkWithHonny extends TeaMilk {

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Honny";
    }
}
