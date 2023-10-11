package edu.najah.cap.designpattern.strategydesign.duck;

import edu.najah.cap.designpattern.strategydesign.duck.intf.*;

public class GoodDuck {

    private  Swimable swimable;
    private  Flyable flyable;
    private  Quacable quacable;

    public GoodDuck(Swimable swimable, Flyable flyable, Quacable quacable) {
        this.swimable = swimable;
        this.flyable = flyable;
        this.quacable = quacable;
    }

    public void display(){
        System.out.println("I'm a Good Duck");
    }

    public final void swim() {
        if (swimable != null) {
            swimable.swim();
        }
    }

    public final void fly(){
        if (flyable != null) {
            flyable.fly();
        }
    }

    public final void quack(){
        if (quacable != null) {
            quacable.quack();
        }
    }

}
