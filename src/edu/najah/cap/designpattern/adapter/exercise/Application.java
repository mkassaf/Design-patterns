package edu.najah.cap.designpattern.adapter.exercise;

public class Application {

    private final Database database;

    public Application(Database database) {
        this.database = database;
    }



    public void create() {
        System.out.println("Create operation in progress...");
        database.insert();
    }
}
