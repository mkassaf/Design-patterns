package edu.najah.cap.designpattern.observer.exmaple;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Topic {

    private String status;
    private ArrayList<String> messages = new ArrayList<>();

    private List<Observable> observables = new ArrayList<>();


    public void addMessage(String message) {
        this.status = message;
        for (Observable observable : observables) {
            observable.notify(message);
        }
    }

    public void getMessages() {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    @Override
    public void subscribe(Observable observable) {
        observables.add(observable);
    }


}
