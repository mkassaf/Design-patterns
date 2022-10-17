package edu.najah.cap.designpattern.good.impl;

import edu.najah.cap.designpattern.good.intf.Quackable;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
