package edu.najah.cap.designpattern.good;

import edu.najah.cap.designpattern.good.intf.Flyable;
import edu.najah.cap.designpattern.good.intf.Quackable;

public class Duck {

    private Flyable fly;
    private Quackable quack;


    public void display(){
        System.out.println("I am duck");
    }

    public void swim(){
        System.out.println("Swim");
    }


    public void fly(){
        if (fly != null){
            quack.quack();
        }
    }

    public void quack(){
        if (quack != null){
            fly.fly();
        }
    }

    public Flyable getFly() {
        return fly;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public Quackable getQuack() {
        return quack;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }
}
