package edu.najah.cap.designpattern.viaInterface.viaInhernetance;

import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Flyable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Quackable;
import edu.najah.cap.designpattern.viaInterface.viaInhernetance.intf.Swimable;

public class App {

    public static void main(String[] args) {



        Duck1 duck1 = new Duck1();
        Duck2 duck2 = new Duck2();
        Duck3 duck3 = new Duck3();
        Duck4 duck4 = new Duck4();

        callSwim(duck1);
        callSwim(duck2);
        callSwim(duck3);
        callSwim(duck4);

        doFly(duck1);
        doFly(duck2);
        //doFly(duck3); Does not support swim
        doFly(duck4);


        makeSound(duck1);
        makeSound(duck2);
        //makeSound(duck3);
        //makeSound(duck4);
    }


    public static void callSwim(Swimable swimable){
        swimable.swim();
    }

    public static void makeSound(Quackable quackable){
        quackable.quack();
    }

    public static void doFly(Flyable flyable){
        flyable.fly();
    }


}
