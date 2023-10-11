package edu.najah.cap.designpattern.strategydesign.duck;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Flyable;
import edu.najah.cap.designpattern.strategydesign.duck.intf.Quacable;
import edu.najah.cap.designpattern.strategydesign.duck.intf.Swimable;

public class SwimableOnlyDuck extends GoodDuck {


    public SwimableOnlyDuck(Swimable swimable, Flyable flyable, Quacable quacable) {
        super(swimable, flyable, quacable);
    }

    public void display(){
        System.out.println("I'm a Swimable Duck");
    }
}
