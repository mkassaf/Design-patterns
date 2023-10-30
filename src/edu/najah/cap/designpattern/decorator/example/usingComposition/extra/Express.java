package edu.najah.cap.designpattern.decorator.example.usingComposition.extra;

import edu.najah.cap.designpattern.decorator.example.usingComposition.BeverageDecortaor;
import edu.najah.cap.designpattern.decorator.example.usingComposition.Bevrage;

public class Express extends BeverageDecortaor {

    public Express(Bevrage bevrage) {
        super(bevrage);
    }

    @Override
    public double getCost() {
        return getBevrage().getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return getBevrage().getDescription() + " - Express";
    }
}
