package edu.najah.cap.designpattern.factory.bad;

public class SQLiteDatabase implements Database {
    @Override
    public void execute(String query) {
        System.out.println("SQLiteDatabase");
    }
}
