package edu.najah.cap.designpattern.decorator.example.usingComposition.extra;

import edu.najah.cap.designpattern.decorator.example.usingComposition.BeverageDecortaor;
import edu.najah.cap.designpattern.decorator.example.usingComposition.Bevrage;

public class Milk extends BeverageDecortaor {

    public Milk(Bevrage bevrage) {
        super(bevrage);
    }


    @Override
        public double getCost() {
            return this.getBevrage().getCost() + 0.5;
        }

        @Override
        public String getDescription() {
            return this.getBevrage().getDescription() + " - Milk";
        }
}
