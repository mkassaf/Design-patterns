package edu.najah.cap.designpattern.strategydesign.duck.fly;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Flyable;

public class NormalFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
