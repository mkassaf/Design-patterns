package edu.najah.cap.designpattern.good.impl;

import edu.najah.cap.designpattern.good.intf.Quackable;

public class Mute implements Quackable {
    @Override
    public void quack() {
        System.out.println("I am mute");
    }
}
