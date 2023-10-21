package edu.najah.cap.designpattern.factory.good.database;

public class SQLiteDatabase implements Database {
    @Override
    public void execute(String query) {
        System.out.println("Executing SQLite query: " + query);
    }
}
