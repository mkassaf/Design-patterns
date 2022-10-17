package edu.najah.cap.designpattern.strategydesign.viaInterface;

import edu.najah.cap.designpattern.strategydesign.viaInterface.intf.Swimable;

public class Duck3 extends Duck implements Swimable {

    @Override
    public void display(){
        super.display();
        System.out.println(" I am Duck 3 can do anything");
    }

}
