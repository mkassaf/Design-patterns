package edu.najah.cap.designpattern.viaInterface.viaInhernetance;

import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Flyable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Quackable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Swimable;

public class Duck1 extends Duck implements Flyable, Quackable, Swimable {

    @Override
    public void display(){
        super.display();
        System.out.println(" I am Duck 1 can do anything");
    }


    public void fly(){
        System.out.println("Normal Fly");
    }



    @Override
    public void quack() {
        System.out.println("quack quack .. ");
    }
}
