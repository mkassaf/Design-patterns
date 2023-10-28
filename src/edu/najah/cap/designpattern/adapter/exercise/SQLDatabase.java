package edu.najah.cap.designpattern.adapter.exercise;

public class SQLDatabase implements Database {

    @Override
    public void insert() {
        System.out.println("Inserting record in SQL Database");
    }

    @Override
    public void update() {
        System.out.println("Update operation in progress...");
    }
}
