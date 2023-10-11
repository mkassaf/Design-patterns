package edu.najah.cap.designpattern.strategydesign.duck.fly;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Flyable;

public class NoFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
