package edu.najah.cap.designpattern.factory.bad;

public class MySQLDatabase implements Database{
    @Override
    public void execute(String query) {
        System.out.println("MySQLDatabase");
    }
}
