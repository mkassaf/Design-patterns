package edu.najah.cap.designpattern.strategydesign.viaInhernetance;

public class Duck4 extends Duck {

    @Override
    public void display(){
        super.display();
        System.out.println(" I am Duck 4 can do anything");
    }

    public void quack(){
        System.out.println("I can't quack");
        throw new UnsupportedOperationException("I can't quack");//Later
    }


}
