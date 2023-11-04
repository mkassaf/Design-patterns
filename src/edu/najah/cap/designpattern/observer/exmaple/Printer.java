package edu.najah.cap.designpattern.observer.exmaple;

public class Printer implements Observable {


    public void print(String message){
        System.out.println("Printer:: " + message);
    }

    @Override
    public void notify(String message) {
        print(message);
    }

    public void subscribe(Channel channel) {
        channel.subscribe(this);
    }
}
