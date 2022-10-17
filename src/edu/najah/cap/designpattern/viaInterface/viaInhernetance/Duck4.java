package edu.najah.cap.designpattern.viaInterface.viaInhernetance;

import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Flyable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Swimable;

public class Duck4 extends Duck implements Swimable, Flyable {

    @Override
    public void display(){
        super.display();
        System.out.println(" I am Duck 4 can do anything");
    }


    @Override
    public void fly(){
        System.out.println("Normal Fly");
    }

}
