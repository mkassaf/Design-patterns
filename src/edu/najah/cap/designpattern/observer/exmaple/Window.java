package edu.najah.cap.designpattern.observer.exmaple;

public class Window implements Observable {

    private String name;

    public Window(String name){
        this.name = name;
    }
    public void display(String message){
        System.out.println( " Window:: " + name + " :: " + message);
    }

    @Override
    public void notify(String message) {
        display(message);
    }

    public void subscribe(Topic topic) {
        topic.subscribe(this);
    }

}
