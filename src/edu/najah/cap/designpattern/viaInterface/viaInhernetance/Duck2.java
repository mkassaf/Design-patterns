package edu.najah.cap.designpattern.viaInterface.viaInhernetance;

import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Flyable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Quackable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Swimable;

public class Duck2 extends Duck implements Swimable, Flyable, Quackable {

    @Override
    public void display(){
        super.display();
        System.out.println(" I am Duck 2 can do anything");
    }


    public void fly(){
        System.out.println("Normal Fly");
    }


    public void quack(){
        System.out.println("Quack");
    }
}
