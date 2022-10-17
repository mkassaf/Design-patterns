package edu.najah.cap.designpattern.strategydesign.good.impl;

import edu.najah.cap.designpattern.strategydesign.good.intf.Quackable;

public class Mute implements Quackable {
    @Override
    public void quack() {
        System.out.println("I am mute");
    }
}
