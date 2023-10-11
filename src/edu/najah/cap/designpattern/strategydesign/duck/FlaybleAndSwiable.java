package edu.najah.cap.designpattern.strategydesign.duck;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Flyable;
import edu.najah.cap.designpattern.strategydesign.duck.intf.Quacable;
import edu.najah.cap.designpattern.strategydesign.duck.intf.Swimable;

public class FlaybleAndSwiable extends GoodDuck {

        public FlaybleAndSwiable(Swimable swimable, Flyable flyable, Quacable quacable) {
                super(swimable, flyable, quacable);
        }

        public void display(){
                System.out.println("I'm a FlaybleAndSwiable Duck");
        }
}
