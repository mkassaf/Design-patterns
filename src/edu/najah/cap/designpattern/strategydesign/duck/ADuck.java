package edu.najah.cap.designpattern.strategydesign.duck;

import edu.najah.cap.designpattern.strategydesign.duck.intf.*;

public class ADuck  extends  GoodDuck {

    public ADuck(Swimable swimable, Flyable flyable, Quacable quacable) {
        super(swimable, flyable, quacable);
    }
}
