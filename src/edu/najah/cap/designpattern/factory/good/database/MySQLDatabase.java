package edu.najah.cap.designpattern.factory.good.database;

public class MySQLDatabase implements Database {
    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
