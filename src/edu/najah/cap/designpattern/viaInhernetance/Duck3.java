package edu.najah.cap.designpattern.viaInhernetance;

public class Duck3 extends Duck {

    @Override
    public void display(){
        super.display();
        System.out.println(" I am Duck 3 can do anything");
    }

    public void fly(){
        System.out.println("I can not fly");
        throw new UnsupportedOperationException("I can't fly");
    }

    public void quack(){
        System.out.println("I can't quack");
        throw new UnsupportedOperationException("I can't quack");
    }


}
