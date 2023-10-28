package edu.najah.cap.designpattern.adapter.exercise;

public class Runner {

    public static void main(String[] args) {
        Application application = new Application(new SQLDatabase());
        application.create();
    }
}
