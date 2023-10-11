package edu.najah.cap.designpattern.strategydesign.duck.swim;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Swimable;

public class NoSwim implements Swimable {

            public void swim() {
                System.out.println("I can't swim");
            }
}
