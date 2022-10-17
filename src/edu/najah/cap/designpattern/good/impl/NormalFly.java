package edu.najah.cap.designpattern.good.impl;

import edu.najah.cap.designpattern.good.intf.Flyable;

public class NormalFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Normal Fly");
    }
}
