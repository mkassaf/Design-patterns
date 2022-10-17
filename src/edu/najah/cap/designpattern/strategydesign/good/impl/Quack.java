package edu.najah.cap.designpattern.strategydesign.good.impl;

import edu.najah.cap.designpattern.strategydesign.good.intf.Quackable;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
