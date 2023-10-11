package edu.najah.cap.designpattern.strategydesign.duck;

import edu.najah.cap.designpattern.strategydesign.duck.fly.*;
import edu.najah.cap.designpattern.strategydesign.duck.intf.*;
import edu.najah.cap.designpattern.strategydesign.duck.quack.*;
import edu.najah.cap.designpattern.strategydesign.duck.swim.FastSwim;
import edu.najah.cap.designpattern.strategydesign.duck.swim.NoSwim;

public class Demo {
    public static void main(String[] args) {

        Flyable normalFly = new NormalFly();
        Flyable nightFly = new NightFly();
        Flyable noFly = new NoFly();
        Swimable noSwim = new NoSwim();
        Swimable fastSwim = new FastSwim();
        Quacable normalQuack = new NormalQuack();


        GoodDuck duck = new GoodDuck(noSwim, normalFly, normalQuack);

        callDuck(duck);


        GoodDuck swimOnly = new GoodDuck(fastSwim, noFly, null);

        callDuck(swimOnly);
    }

    public static void callDuck(GoodDuck duck){
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
    }
}
