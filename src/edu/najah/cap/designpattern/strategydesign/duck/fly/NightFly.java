package edu.najah.cap.designpattern.strategydesign.duck.fly;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Flyable;

public class NightFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm flying");
        System.out.println("I'm flying very high");
    }
}
