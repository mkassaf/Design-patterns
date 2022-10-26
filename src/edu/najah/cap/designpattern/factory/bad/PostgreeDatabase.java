package edu.najah.cap.designpattern.factory.bad;

public class PostgreeDatabase implements Database {
    @Override
    public void execute(String query) {
        System.out.println("PostgreeDatabase");
    }
}
