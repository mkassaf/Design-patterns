package edu.najah.cap.designpattern.strategydesign.duck.swim;

import edu.najah.cap.designpattern.strategydesign.duck.intf.Swimable;

public class FastSwim implements Swimable {

        @Override
        public void swim() {
            System.out.println("I'm swimming fast");
        }
}
