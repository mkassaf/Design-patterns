package edu.najah.cap.designpattern.strategydesign.duck.quack;


import edu.najah.cap.designpattern.strategydesign.duck.intf.Quacable;

public class NormalQuack implements Quacable {
    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
