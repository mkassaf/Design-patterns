package edu.najah.cap.designpattern.observer.exmaple;

import java.util.ArrayList;

public class Email  implements  Topic {


    private ArrayList observables = new ArrayList<Observable>();

    public void send(String message){
        System.out.println("Email:: " + message);
    }


    public void subscribe(Observable observable) {
        observables.add(observable);
    }
}
